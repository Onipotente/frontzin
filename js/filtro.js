let rows = document.querySelectorAll('.row')
let myCards = document.querySelectorAll('.card')
let all = document.getElementById('all-btn')
let front = document.getElementById('first-btn')
let back = document.getElementById('second-btn')
let variados = document.getElementById('third-btn')

all.addEventListener('click', function(){
    filter('todos')
})
front.addEventListener('click', function(){
    filter('front')
})
back.addEventListener('click', function(){
    filter('back')
})
variados.addEventListener('click', function(){
    filter('variados')
})

function filter(name) {
    rows.forEach(element => {
        element.innerHTML = ''
    })
    if(name === 'todos'){
        rows.forEach((element, index) => {
            if(index === 0){
                element.innerHTML += `<div class="card first">${myCards[0].innerHTML}</div>`
                element.innerHTML += `<div class="card second">${myCards[1].innerHTML}</div>`
                element.innerHTML += `<div class="card third">${myCards[2].innerHTML}</div>`
            }
            else if(index === 1){
                element.innerHTML += `<div class="card first">${myCards[3].innerHTML}</div>`
                element.innerHTML += `<div class="card second">${myCards[4].innerHTML}</div>`
                element.innerHTML += `<div class="card third">${myCards[5].innerHTML}</div>`
            }
            else{
                element.innerHTML += `<div class="card first">${myCards[6].innerHTML}</div>`
                element.innerHTML += `<div class="card second">${myCards[7].innerHTML}</div>`
                element.innerHTML += `<div class="card third">${myCards[8].innerHTML}</div>`
            }
        })
    }
    else if(name === 'front'){
        myCards.forEach(element => {
            if(element.classList.contains('first')){
                rows[0].innerHTML += `
                    <div class="card first">
                        ${element.innerHTML}
                    </div>
                `
            }
        })
    }
    else if(name === 'back'){
        myCards.forEach(element => {
            if(element.classList.contains('second')){
                rows[0].innerHTML += `
                    <div class="card second">
                        ${element.innerHTML}
                    </div>
                `
            }
        })
    }
    else{
        myCards.forEach(element => {
            if(element.classList.contains('third')){
                rows[0].innerHTML += `
                    <div class="card third">
                        ${element.innerHTML}
                    </div>
                `
            }
        })
    }

}

