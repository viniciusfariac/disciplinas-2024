const data = [
    {
    min: 0,
    max: 18.4,
    classification: "Menor que 18.5",
    info: "magreza",
    obesity: 0
    },
    {
        min: 18.5,
        max: 24.9,
        classification: "Menor que 25.0",
        info: "normal",
        obesity: 0
    },
    {
            min: 25,
            max: 29.9,
            classification: "Menor que 30.0",
            info: "sobrepeso",
            obesity: 0
    },
    {
        min: 30,
        max: 34.9,
        classification: "Menor que 35.0",
        info: "obesidade",
        obesity: 1
    },
    {
        min: 35,
        max: 39.9,
        classification: "Menor que 40",
        info: "obesidade grande",
        obesity: 2
    },
    {
        min: 40,
        max: 99,
        classification: "Maior que 40",
        info: "obesidade mórbida",
        obesity: 3
    }
]
const imcTable = document.querySelector("#imc-table")
const height = document.querySelector ("#height")
const weightInput = document.querySelector ("#weight")
const calcBtn = document.querySelector ("calc-btn")
const clearBtn = document.querySelector ("clear-btn")
const resultContainer = document.querySelector ("result-container")
const imcNumber = document.querySelector ("imc-number span")
const imcInfo = document.querySelector ("imc-info span")
const backBtn = document.querySelector ("back-btn")

