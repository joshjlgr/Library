import React, { useEffect, useState } from 'react';
import { render } from 'react-dom';
import ReactDOM from "react-dom";
import { BrowserRouter } from 'react-router-dom';
import { Routes, Navigate, withRouter } from 'react-router-dom';
import { Router, Route } from "react-router";
import Footer from './components/Footer';
import About from './components/About';
// import NoPage from './components/NoPage';
// import MySideNav from './pocketed/MySideNav';
// import Auth from './Auth';
import Header from './components/Header';
// import './stylings/App.css';
// import {createBrowserHistory} from 'history';
// import './stylings/Style.css';

const Main = () => {
  const [authenticated, setAuthenticated] = useState(null);

  useEffect(() => {
    const loggedInUser = localStorage.getItem('authenticated');
    if (loggedInUser) {
      setAuthenticated(loggedInUser);
    }
  }, []);

  if (!authenticated) {
    return <Navigate to="/LoginForm" />;
  }
  else
  render(
    <Header />,
    document.getElementById('Header')
  );
  
  render(
    <About />,
    document.getElementById('About')
  );

  render(
    <Footer />,
    document.getElementById('Footer')
  );
  

      // <Switch>
      //  <BrowserRouter>
      //  {/* <React.StrictMode> */}
      //  <Routes>
      //  <Router history={customHistory}>
      //  <Switch>
      //     <Route exact path="/" element={<Auth />} />
      //     <Route exact path="/Header" components={withRouter(Header)} />
      //     <Route exact path="/Logout" components={withRouter(Auth)} />
      //     <Route exact path="/About" components={withRouter(About)} />
      //     <Route exact path="/Footer" components={withRouter(Footer)} />
          {/* <Route path="/Header" element={<Header} />
          // <Route path="/Logout" element={<Auth /> */}
          {/* <Route path="/About" element={<About /> */}
          {/* <Route path="/Footer" element={<Footer /> */}
          {/* <Route path="/Header" components={Header} />
          <Route path="/Logout" components={Auth} />
          <Route path="/About" components={About} /> */}
         {/* </Switch>
         </Router>
        </Routes>
       </BrowserRouter> */}
       {/* </React.StrictMode> */}
//   );
// }
// }
      }
export default Main;

