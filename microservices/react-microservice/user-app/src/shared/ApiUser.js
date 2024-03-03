import React, {useEffect, useState} from "react";

function ApiUser() {
    const [userList, setUserList] = useState(null);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        setLoading(true);
        fetch('http://localhost:8080/api/user-list')
            .then((response) => response.json())
            .then(setUserList)
            .then(() => setLoading(false));
    }, [])

    if (loading) return <p>Loading...</p>;

    if(userList) {
        return (
            <div className="user">
                <table>
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>First name</th>
                        <th>Last name</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        userList.map((user, index) => (
                            <tr key={index}>
                                <td>{user.id}</td>
                                <td>{user.firstname}</td>
                                <td>{user.lastname}</td>
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

export default ApiUser;
