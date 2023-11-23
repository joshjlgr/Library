import { useState } from "react";
import React, { Component } from 'react';
// import ReactDOM from "react-dom/client";
import App from './App';
import { Link } from 'react-router-dom'
import "./stylings/Loginstyle.css";
import {Routes, Route, useNavigate} from 'react-router-dom';
import Dashboard from './Dashboard';

//import { BrowserRouter, Routes, Route } from "react-router-dom";

//import { BrowserRouter, Routes, Route } from "react-router-dom";

function LoginPage() {
  // React States
  const [errorMessages, setErrorMessages] = useState({});
  const [isSubmitted, setIsSubmitted] = useState(false);

  // User Login info
  const database = [
    {
      username: "user1",
      password: "pass1"
    },
    {
      username: "user2",
      password: "pass2"
    }
  ];

  const errors = {
    uname: "invalid username",
    pass: "invalid password"
  };

  const handleSubmit = (event) => {
    //Prevent page reload
    event.preventDefault();

    var { uname, pass } = document.forms[0];

    // Find user login info
    const userData = database.find((user) => user.username === uname.value);

    // Compare user info
    if (userData) {
      if (userData.password !== pass.value) {
        // Invalid password
        setErrorMessages({ name: "pass", message: errors.pass });
      } else {
        setIsSubmitted(true);
      }
    } else {
      // Username not found
      setErrorMessages({ name: "uname", message: errors.uname });
    }
  };

  // Generate JSX code for error message
  const renderErrorMessage = (name) =>
    name === errorMessages.name && (
      <div className="error">{errorMessages.message}</div>
    );

  // JSX code for login form
  const renderForm = (
    <div className="form">
      <form onSubmit={handleSubmit}>
        <div className="input-container">
          <label>Username </label>
          <input type="text" name="uname" required />
          {renderErrorMessage("uname")}
        </div>
        <div className="input-container">
          <label>Password </label>
          <input type="password" name="pass" required />
          {renderErrorMessage("pass")}
        </div>
        <div className="button-container">
          <input type="submit" />
        </div>
      </form>
    </div>
  );

  return (
    <div className="app">
      <div className="login-form">
        <div className="title">Sign In</div>
        {isSubmitted ? <div>User is successfully logged in</div> : renderForm}
      </div>
    </div>
  );
}

//added

 function Proceeding() {
  const navigate = useNavigate();

  const navigateToDashboard = () => {
    // 👇️ navigate to /contacts
    navigate('/Dashboard');
  };

  // const navigateHome = () => {
  //   // 👇️ navigate to /
  //   navigate('/');
  // };

  return (
        <div className="button-container">
        <input type="click" />
      <div>
        <button onClick={navigateToDashboard}>Proceed</button>
        <hr />

        <Routes>
          <Route path="/Dashboard" element={<Dashboard />} />
          <Route path="/" element={<LoginPage />} />
        </Routes>
      </div>
    </div>
  );
}


export default LoginPage;