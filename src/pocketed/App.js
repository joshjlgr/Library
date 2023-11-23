import "./stylings/App.css";
import Auth from './Auth';
import Home from '../components/Home';
import About from '../components/About';
import Contact from '../components/Contact';
import { BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom'

/**
 * 
 * 1. Create Home, About & Contact components
 * 2. Install the react-router-dom: npm install react-router-dom
 * 3. App.js write the following code
 */
function App() {
  return (
    <Router>
      <div>
          <nav>
                <ul>
                      <li> <Link to="/">Login</Link></li>
                      <li> <Link to="/Home">Home</Link></li>
                      <li> <Link to="/about">About Us</Link></li>
                      <li> <Link to="/contact">Contact Us</Link></li>
                </ul>
          </nav>
        <Routes>
            <Route path='/' element={<Auth />} />
            <Route path='/home' element={<Home />} />
            <Route path='/about' element={<About />} />
            <Route path='/contact' element={<Contact />} />
        </Routes>
    </div>
    </Router>    
  );
}

export default App;
