import { useState } from "react"
import ChildComponent from "./ChildComponent";


function ParentComponent() {
    const [userName, setUserName] = useState("Khyati");

    const changeUserName = () => {
        setUserName("Manvar");
    }
    
    return(
        <div>
            <h1>Welcome, {userName}</h1>
            <ChildComponent name={userName} />
            <button onClick={changeUserName}>Change User Name</button>
        </div>
    )
}

export default ParentComponent