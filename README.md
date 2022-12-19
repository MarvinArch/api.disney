## INSTRUCCIONES

- Consultar Todos los Personajes

> | GET | https://apidisney-production.up.railway.app/characters

- Consultar por Nombre

> | GET | https://apidisney-production.up.railway.app/characters?name=name

- Consultar por Edad

> | GET | https://apidisney-production.up.railway.app/characters?age=12

##INGRESO DE NUEVO PERSONAJE
> | POST | https://apidisney-production.up.railway.app/characters



####JSON　

```javascript
{
	"name": "nombre personaje",
	"image": "link Image",
	"age":  integer,
	"history": "Texto de historia del personaje",
	"weight": integer
}
```

##INGRESO DE NUEVO GENERO
> | POST | https://apidisney-production.up.railway.app/genre


####JSON　

```javascript
{
	"name": "nombre genero",
	"image": "link Image"
}
```


##INGRESO DE NUEVO PELICULA/SERIE
> | POST | https://apidisney-production.up.railway.app/movies


####JSON　

```javascript
{
	"image": "link Image",
	"name": "nombre serie/pelicula",
	"title": "link Image",
	"creationDate": "AAAA",
	"qualification": 8.9,
	"genre": {
		"name": Genero
	}
}
```
