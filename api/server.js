const express = require("express");
const cors = require("cors");

// Endpoint
const url = "https://jsonplaceholder.typicode.com/posts";

// Create app
const app = express();
app.use(cors());
app.use(express.json());

// Test
let data = [
    { id: 1, name: "Ana" },
    { id: 2, name: "Maycol" }
];

// Get 
app.get("/posts", async (req, res) => {
    const response = await fetch(url);
    const data = await response.json();
    res.json(data);
})

// Running the api 
app.listen(3000, '0.0.0.0', () => { console.log('Running api...') })