![](./img/dbbrowser.png)

## DBBrowser para SQLite

DB Browser para SQLite es un software open source que nos permite crear, diseñar y editar archivos .db de SQLite.

Así que a continuación iremos a desarollar una guia de como utilizar este software para explorar la base de datos que creamos anteriormente.

## ¿Que necesitamos para trabajar?

 - [**DBBrowser:**](http://sqlitebrowser.org)

Para descargar esta herramienta simplemente basta hacer clic encima del titulo, en la pagina oficial del desarollador se encuentran todas las versiones tanto para Windows, Mac OS X, como Linux o en caso contrario hacer [click aquí](./download) para ver todos las descargas.

> **Aclaración:** Todas estas herramientas ya se encuentran instaladas en las maquinas del laboratorio que iremos a desarrollar esta guía.

## Comienzo de la guía de trabajo

Antes que nada debemos ejecutar la aplicacion, y nos encontraremos con una interfaz similar a la siguiente:

![](./img/dbbrowser.jpg)

Ahora debemos abrir el archivo que contiene nuestra base de datos, para ellos debemos:
1. Irnos a <kbd>File->Open Database</kbd>.
2. Seleccionar el archivo en nuestro file system y clickear <kbd>Open</kbd>.

Ahora desde la pestaña superior <kbd>Database Structure</kbd> podemos explorar la estructura de nuestra base de datos, es decir ver que tipo de datos almacena cada columna de nuestra tabla y que columnas existen.

Pero nos interesa editar la información que guarda nuestra base de datos para luego ver si esta se ve reflejada en la aplicación que creamos anteriormente.
Para ello debemos dirigirnos a la pestaña <kbd>Browse Data</kbd>.

![](./img/dbbrowser-browse-data.jpg)

Deberiamos ver una ventana similar a la anterior, ahora iremos 

## Autoría
**Autor:** Matias Crizul

**E-mail:** crizulm@gmail.com

Si tienes preguntas sobre éste tema, no dudes en mandarme un correo electrónico.

### Referencias

1. http://github.com/crizulm/sqlite3
2. http://sqlitebrowser.org
