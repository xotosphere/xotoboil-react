import React, {useEffect, useState} from "react";

function ApiUserAccessLog() {
    const [userAccess, setAccess] = useState(null);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);
        fetch('http://localhost:8080/api/user-access')
            .then((response) => response.json())
            .then(setAccess)
            .then(() => setLoading(false));
    }, [])

    if (loading) return <p>Loading...</p>;

    if(userAccess) {
        return (
            <div className="user-access">
                <table>
                    <thead>
                    <tr>
                        <th>Type</th>
                        <th>Host</th>
                        <th>Time</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        userAccess.map((ac, index) => (
                            <tr key={index}>
                                <td>{ac.type}</td>
                                <td>{ac.host}</td>
                                <td>{ac.time}</td>
                            </tr>
                        ))
                    }
                    </tbody>
                </table>
            </div>
        )
    }

    return <p>Cannot load data</p>
}

export default ApiUserAccessLog;
