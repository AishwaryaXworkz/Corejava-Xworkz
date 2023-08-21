<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blinkitapp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" 
 rel="stylesheet" 
 integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
  crossorigin="anonymous">
  </head>

<body>
<form action="register" method="post">
<nav class="navbar navbar-expand-lg bg-secondary">
 <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIEAAACBCAMAAADQfiliAAAAulBMVEX/4UEAAAD///8Mgx//50P/5UL/40L/6kQAgR6aiyhdURdBOBB+cSH/4Dvr0T3/8Ubp1j0AeBv230FdVBi8rjL/4DIgGwhknSjlzjzj1j3/+N2BdiOyvTQAfBz/+uf/9Mb/8K3/6oj/5mn/76X/41P/53L//vj/87//3hnMtjV6oSq+wzadtjImIAk4MA5xoSpNRBStmy1zZR3YzjvYwDcYEwZWlCYtJgtnXhtBjiMviiK1pC8ODASRgya65evFAAAErElEQVR4nO2ca1eiTACAx5qLuqCGUSxmZVqppQmZq7n+/7+1c0VQoPA1h/eceT4sAwwzj3OFzsyCsxRu7+57DwNwTAYPvfu727TMwN4Vvz8ArmvbRxUAwLZdFwz6/pcG/qPtHjvzmIZrP+46gJ38hz+XvZQY7jjEDZ56P56/cOg9pRv4A/cE+TPcgZ9m8Hz0xpeNbT/vG/RPVQACt79r0B+eVACAYT9p8HzaEmC4z3ED/3RNYIvtbw2eBloMBk+RQe/0dcBwe8rAP3UrVAx9afCoow4Y9qMw0FYEohCAxiIQhQD09MRIwacGJx6Ok9DBGZxpGQsU9uAM3GrMn3EL7nRWAq2GO3Cv2eAe9HQ2A9oQeuBBs8EDOO6HSXF0528wGAwGg8FgMPwfwJys6zgWyHs+8/bX+TuCzBs4ChRKIH4593lArApnhHZSaInrM9SQAZKRwFTc9xI54PeLKqX7BgH+zYMXNygjgS8M6sqg3sxI4Be/fbVncE6pcoMuC3aNwREMZkUNupSL64IGsV4VGWBnfckYwUQOUcwMA+eF846LGCDoNLwWJjhpgJocAhDhIIAhankth6B9AxmHICyOkKYqDV4IQmkSkQGE83A2+Zi2aw5M1kLYYdTI3GJH65Kg9XL6MZl1PLhrAEWcjjVy3saMV/g2fqvyJrFgpymDgjKYO8uKIqDFkNISL+Vd74+KuGkmDdRDlSVqifHgmtB/zznsdJFjEETJUkKI9wzayiCMRbRI3ABDmcgvQg14rtfkXAqI0xyDv5U4HZJtkOASbg0wkmlNW/QHFDbYYQS/Z1DHWwMSyB8zp10wMojXQvU6pyWyJ0NrpsKzXIOlNVVBLzIgI1UuBMQMVquVaImfNDTOLYOAQEgaysHLNpg1CCRrebJuSoNG40NeISBmAKPeeAPzeyN9kHcnRyrUnEwDh6VDOjKeNJh44kibEEgYfHtEasv7cC7Ow0wDi2eBvB2DtowP8YEGgZz+sSyEemYt1PjwjFHSQDKVLyIHGETDPhL9feZlGWyEAU41EK3ghw1quQaTxqG1UCtaCxkGlbB5oEH92y3xCwNRmgcY8OmIjuyOTDAobLCsieNVC6cavNJgrgEdARBy5iq9RtFauMJYDiUWTDOorlrI+Z0/L0zCMBqV69mjcroBnQxUBbJ6SBiIiaH6Of4cw1yDOHNU0IDNzlCOk38dHDMAeFFVU9Mq5bslfXbe5MzO2QbqWiUkcQN0c6Gm5+57tkEQVQDFQvvvSN8wAGp+ZpP71gCgRVcZvO53iGhEctqRQADx/ldbPcsg/tUG5e+4ctRbGu+azqJb5aerlDKA6xpj46HmvEN/zke9hvn06mz4jQA3ZIDMRUB8WWAsz0jAjzU+FiIZeTNyXjliEMDwZfx5vhq/wLT+iCAHsxD74MUyFhbX4V5AlaM62yYQewphJFC5sKRTXw92+C9/BzAYDAaDwWAwGAzHQffauEEJ1ifqX6Opf52q/rW6+tcr61+zXYJ16/rX7uvfv1CCPRz697GUYC+P/v1MJdjTpX9fWwn29pVgf2MJ9niWYJ9rCfb6lmC/85n+Pd/CQe++d+6gee8/56T//8E/YIaHLPSGfREAAAAASUVORK5CYII=	" alt="Bootstrap" width="50" height="50">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="register.jsp">Registration</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Login</a>
        </li>
       
         
        
    
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<marquee><h2>WELCOME TO BLINKITAPP</h2></marquee>

<input type="Submit"   class="btn btn-info"></form>


</body>
</html>