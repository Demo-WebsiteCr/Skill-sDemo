let displayValue = '';

function appendNumber(number) {
    displayValue += number;
    document.getElementById('display').value = displayValue;
}

function appendOperator(operator) {
    if (displayValue !== '' && !isNaN(displayValue[displayValue.length - 1])) {
        displayValue += operator;
        document.getElementById('display').value = displayValue;
    }
}

function clearDisplay() {
    displayValue = '';
    document.getElementById('display').value = '';
}

function calculateResult() {
    if (displayValue !== '' && !isNaN(displayValue[displayValue.length - 1])) {
        let result = eval(displayValue);
        document.getElementById('display').value = result;
        displayValue = result.toString();
    }
}
