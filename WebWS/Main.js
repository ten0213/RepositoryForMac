// Get DOM elements
const counterElement = document.getElementById('counter');
const increaseButton = document.getElementById('increase');
const decreaseButton = document.getElementById('decrease');

// Initialize counter value
let count = 0;

// Update the counter display
function updateCounter() {
  counterElement.textContent = count;
}

// Event handler for increase button
increaseButton.addEventListener('click', () => {
  count++;
  updateCounter();
});

// Event handler for decrease button
decreaseButton.addEventListener('click', () => {
  count--;
  updateCounter();
});

// Initialize counter display on page load
document.addEventListener('DOMContentLoaded', () => {
  updateCounter();
});
