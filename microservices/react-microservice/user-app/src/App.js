import Menu from "./shared/Menu";
import {Route, Routes} from "react-router-dom";
import Home from "./page/Home";
import About from "./page/About";
import User from "./page/User";
import UserAccessLog from "./page/UserAccessLog";

function App() {
    return (
        <div className="app">
            <Menu/>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/user" element={<User/>}/>
                <Route path="/user-access" element={<UserAccessLog/>}/>
                <Route path="/about" element={<About/>}/>
            </Routes>
        </div>
    );
}

export default App;
