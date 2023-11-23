import { Component } from "react";
import '../stylings/Style.css';

class NoPage extends Component{
    render(){
        return(
            <>
            <img className="img" src="./logo2.jpg" alt="Logo Here" width="40px"/>
            <div className="site-header">
            <h1>Error 404: Page Not Found</h1></div>
            </>
        )
    }
}
export default NoPage;