// Import the necessary modules
import React, { useState } from "react";
import Button from 'react-bootstrap/Button';
import { useNavigate } from "react-router-dom"; // Import useNavigate for navigation
import App from "../App";
import "./stylings/App.css";

function Auth() {
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);

  // Use the useNavigate hook to get access to the navigate function
  const navigate = useNavigate();

  const database = [
    {
      username: "user1",
      password: "pass1",
    },
    {
      username: "user2",
      password: "pass2",
    },
  ];

  const errors = {
    uname: "Invalid username",
    pass: "Invalid password",
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const uname = event.target.uname.value;
    const pass = event.target.pass.value;

    const userData = database.find((user) => user.username === uname);

    if (userData) {
      if (userData.password !== pass) {
        setErrorMessages({ name: "pass", message: errors.pass });
      } else {
        setIsSubmitted(true);
      }
    } else {
      setErrorMessages({ name: "uname", message: errors.uname });
    }
  };

  const renderErrorMessage = (name) =>
    name === errorMessages.name && (
      <div className="error">{errorMessages.message}</div>
    );

  const renderForm = (
    <div className="form">
      <form onSubmit={handleSubmit}>
        <div className="input-container">
          <label>Username</label>
          <input type="text" name="uname" required />
          {renderErrorMessage("uname")}
        </div>
        <div className="input-container">
          <label>Password</label>
          <input type="password" name="pass" required />
          {renderErrorMessage("pass")}
        </div>
        <div className="button-container">
          <Button variant="success" type="submit" size="lg">
            Submit
          </Button>
        </div>
      </form>
    </div>
  );

  const handleClick = () => {
    // Handle the login logic, then navigate to the Dashboard
    // For example, after successful login, you can call:
    setIsSubmitted(true);
    navigate('/App'); // Use the navigate function for navigation
  };

  return (
    <div className="app">
      <div className="login-form">
        <div className="title">Sign In</div>
        {isSubmitted ? (
          <>
            <div>User is successfully logged in</div>
            <br />
            {/* Use a button for internal navigation */}
            <Button onClick={handleClick} variant="success" size="lg">
              Proceed
            </Button>
          </>
        ) : (
          // Render the login form if not submitted
          renderForm
        )}
      </div>
    </div>
  );
}

export default Auth;
