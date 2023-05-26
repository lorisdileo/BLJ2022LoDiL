console.log("Hello World Wide Web");

let nr : number = 3;
console.log(nr)

/*if(nr < 4){
    console.log("Die Nummer ist kleiner als 4")
}

for(let i : number = 1; i <= nr; i++){
    console.log(i)
}

function sayHi(times : number) : void {
    for(let i : number = 1; i <= nr; i++){
        console.log("hi");
    }
}

const sayHello = (times : number) : void => {
    for(let i : number = 1; i <= nr; i++){
        console.log("Hello");
    }
}

//sind beide Funktionen
sayHi(3);
sayHello(3);*/

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

const container : HTMLElement | null = document.getElementById("container");

for(let i : number = 0; i < fruits.length; i++){
    const para = document.createElement("p");
    para.textContent = fruits[i].name;

    const bild = document.createElement("img");
    bild.src = fruits[i].image;

    const pric = document.createElement("p");
    pric.isContentEditable = fruits[i].price;

    container?.appendChild(para);
    container?.appendChild(bild);
    container?.appendChild(pric);
}


fruits.map(fruit => {
    //do this for evry fruit
    console.log(fruit);
})

