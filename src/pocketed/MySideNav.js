import SideNav, {
    Toggle, 
    NavItem, 
    NavIcon, 
    NavText,
} from "@trendmicro/react-sidenav";
import "@trendmicro/react-sidenav/dist/react-sidenav.css";
import { useNavigate } from "react-router-dom";

function MySideNav() {
    const navigate = useNavigate();
    return ( 
    <SideNav
        onSelect={(selected) => {
            console.log(selected);
            navigate('/'+selected)
        }}
        className='MySideNav'
        > 
            <SideNav.Toggle />
            <SideNav.Nav defaultSelected="about">
                <NavItem eventKey="about">
                <NavIcon>
                <i className="fa fa-fw fa-home" style={{fontSize: "1.5em"}} />
                </NavIcon>
                <NavText>about</NavText>
            </NavItem>

            <NavItem eventKey="contact">
                <NavIcon>
                <i className="fa fa-fw fa-home" style={{fontSize: "1.5em"}} />
                </NavIcon>
                <NavText>Contact</NavText>
            </NavItem>

            <NavItem eventKey="schedule">
            <NavIcon>
                {/* <FontAwesomeIcon icon="fa-regular fa-calendar" /> */}
                <i className="fa-regular fa-calendar" style={{fontSize: "1.5em"}} />
            </NavIcon>
                <NavText>Schedule</NavText>
            </NavItem>

            <NavItem eventKey="logout"> 
            <NavIcon>
                <i className="fa fa-fw fa-message" style={{fontSize: "1.5em"}} />
            </NavIcon>
            <NavText>Logout</NavText>
            </NavItem>
        </SideNav.Nav>
        </SideNav>
        )};

export default MySideNav;
