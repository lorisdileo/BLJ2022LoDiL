import { Button } from "@mui/material";

type Prop = {
  name : string;
}

function Fruit({name} : Prop) {

  function logname() {
    console.log(name);
  }

  return (
    <>
    <div>Fruit {name}</div>
    <Button onClick={logname}>Log my Name</Button>
    </>
  )
}

export default Fruit;