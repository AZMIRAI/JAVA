const express = require('express')
const app = express()

app.use(
  express.urlencoded({
    extended: true
  })
)

app.use(express.json())
// http://localhost:9090/todos 요청이오면

app.post('/todos', (req, res) => {
  console.log(req.body.id)
  console.log(req.body.pw)
  console.log(req.body.todo)
  res.end("uhihi!")
})


app.get('/todos', (req,res) => {
	res.end("Get call ...")
})
// http://localhost:9090
app.listen(9090, function(){
	console.log("Server is running on port 9090")
})