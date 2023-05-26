import Button from '@mui/material/Button';
import React, { useState } from 'react';

function CookieClicker() {
    const [cookies, setCookies] = useState(0);

    const handleClick = () => {
        setCookies(cookies + 1);
    };

    const resestScore = () => {
        setCookies(0);
    }

    return (
        <div>
            <h1>Cookie Clicker</h1>
            <p>Cookies: {cookies}</p>
            <img
                src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT40ifL0yBHR74XesrmgfVU8H2_kudZtX1LyA&usqp=CAU"
                alt="Cookie"
                onClick={handleClick}
                style={{ cursor: 'pointer' }}
            />
            <br />
            <button onClick={resestScore}>Reset</button>

        </div>
    );
}

export default CookieClicker;
