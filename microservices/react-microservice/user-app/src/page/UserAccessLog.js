import React from "react";
import ApiUserAccessLog from "../shared/ApiUserAccessLog";

function UserAccessLog() {
    return (
        <div className="user-access">
            <h1>UserAccess Logs</h1>

            <p>History access logs</p>
            <ApiUserAccessLog/>
        </div>
    );
}

export default UserAccessLog;
