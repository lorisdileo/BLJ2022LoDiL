const nameAgeMapping = new Map()

nameAgeMapping.set("Samuel", 99)
nameAgeMapping.set("Sairam", 35)
nameAgeMapping.set("Luis", 40)

console.log(nameAgeMapping.has("Samuel"))
console.log(nameAgeMapping.has("Yan"))

for (let [key, value] of nameAgeMapping) {
  console.log(key, value)
}

let numSet = new Set()

numSet.add(1)
numSet.add(2)
numSet.add(3)
numSet
  .add(4)
  .add(5)
  .add(6)

console.log(numSet.has(1))
console.log(numSet.has(10))

for (let currentNumber of numSet) {
  console.log(currentNumber)
}
