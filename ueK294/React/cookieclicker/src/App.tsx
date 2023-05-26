import React, { HTMLInputTypeAttribute, useState } from 'react';
import logo from './logo.svg';
import './App.css';
import { Button, TextField, Typography } from '@mui/material';
import CookieClicker from './component/clicker';

function App() {
  return (
    <div className="App">
      <CookieClicker />
    </div>
  );
}

export default App;
