<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        .calculator {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            overflow: hidden;
            width: 320px;
        }

        .display {
            background-color: #6200ea;
            color: #fff;
            text-align: right;
            padding: 20px;
            font-size: 2em;
        }

        .buttons {
            display: grid;
            grid-template-columns: repeat(4, 1fr);
        }

        .button {
            padding: 20px;
            font-size: 1.5em;
            border: 1px solid #ddd;
            cursor: pointer;
            background-color: #f9f9f9;
            outline: none;
            border-radius: 0;
            transition: background-color 0.3s;
        }

        .button:hover {
            background-color: #e0e0e0;
        }

        .button:active {
            background-color: #ccc;
        }

        .zero {
            grid-column: span 2;
        }
    </style>
</head>
<body>
    <div class="calculator">
        <div class="display" id="display">0</div>
        <div class="buttons">
            <button class="button" onclick="clearDisplay()">C</button>
            <button class="button" onclick="appendNumber('/')">/</button>
            <button class="button" onclick="appendNumber('*')">*</button>
            <button class="button" onclick="deleteNumber()">DEL</button>
            <button class="button" onclick="appendNumber('7')">7</button>
            <button class="button" onclick="appendNumber('8')">8</button>
            <button class="button" onclick="appendNumber('9')">9</button>
            <button class="button" onclick="appendNumber('-')">-</button>
            <button class="button" onclick="appendNumber('4')">4</button>
            <button class="button" onclick="appendNumber('5')">5</button>
            <button class="button" onclick="appendNumber('6')">6</button>
            <button class="button" onclick="appendNumber('+')">+</button>
            <button class="button" onclick="appendNumber('1')">1</button>
            <button class="button" onclick="appendNumber('2')">2</button>
            <button class="button" onclick="appendNumber('3')">3</button>
            <button class="button" onclick="calculate()">=</button>
            <button class="button zero" onclick="appendNumber('0')">0</button>
            <button class="button" onclick="appendNumber('.')">.</button>
        </div>
    </div>
    <script>
        let display = document.getElementById('display');
        let currentInput = '';
        let operator = '';
        let previousInput = '';

        function appendNumber(number) {
            if (number === '.' && currentInput.includes('.')) return;
            currentInput += number;
            updateDisplay();
        }

        function updateDisplay() {
            display.innerText = currentInput;
        }

        function clearDisplay() {
            currentInput = '';
            previousInput = '';
            operator = '';
            updateDisplay();
        }

        function deleteNumber() {
            currentInput = currentInput.slice(0, -1);
            updateDisplay();
        }

        function setOperator(op) {
            if (currentInput === '') return;
            if (previousInput !== '') {
                calculate();
            }
            operator = op;
            previousInput = currentInput;
            currentInput = '';
        }

        function calculate() {
            let computation;
            const prev = parseFloat(previousInput);
            const current = parseFloat(currentInput);
            if (isNaN(prev) || isNaN(current)) return;
            switch (operator) {
                case '+':
                    computation = prev + current;
                    break;
                case '-':
                    computation = prev - current;
                    break;
                case '*':
                    computation = prev * current;
                    break;
                case '/':
                    computation = prev / current;
                    break;
                default:
                    return;
            }
            currentInput = computation.toString();
            operator = '';
            previousInput = '';
            updateDisplay();
        }
    </script>
</body>
</html>
