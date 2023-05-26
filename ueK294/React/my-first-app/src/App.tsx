import React, { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import Fruit from './component/Fruit';
import { TextField, Typography } from '@mui/material';

function App() {

  interface FruitsType {
    name : string;
    image : string;
    price : number;
    weight ? : any;
}

  let fruits : FruitsType[] = [
    {
      "name" : "Apple",
      "image" : "https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/265px-Red_Apple.jpg",
      "price" : 35
    },
    {
      "name" : "Banana",
      "image" : "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/320px-Bananas_white_background_DS.jpg",
      "price" : 12
    },
    {
      "name" : "Grapes",
      "image" : "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Table_grapes_on_white.jpg/320px-Table_grapes_on_white.jpg",
      "weight": 0.1,
      "price" : 45
    },
    {
      "name" : "Pineapple",
      "image" : "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Pineapple_and_cross_section.jpg/286px-Pineapple_and_cross_section.jpg",
      "price" : 200
    }
  ];

  const [input, setInput] = useState<string>("");

    const handleChange = (e : React.ChangeEvent<HTMLInputElement>) : void => {
      console.log(e.target.value);
      setInput(e.target.value);
      //input = e.target.value;
      console.log(input)
    }

  return (


    <>
    <Typography>
      Hallo {input}
    </Typography>
    <TextField onChange={handleChange} label="name: "/>

    {/* <Fruit name='Apple'/>
    <Fruit name='Pinapple'/>*/}
    {
      fruits.map(fruit => {
      return <Fruit name={fruit.name}/>;
      })
    }
    </>
  );
}

export default App;
