const songs1 = [3, 1, 2, 3, 4, 2, 5]
const playlist1 = prepareSongs(songs1)
console.log(playlist1) // [1, 2, 3, 4, 5]

const songs2 = [6, 5, 5, 5, 5]
const playlist2 = prepareSongs(songs2)
console.log(playlist2) // [5, 6]

const songs3 = []
const playlist3 = prepareSongs(songs3)
console.log(playlist3) // []
// Nadie anotó nada, la lista queda vacía