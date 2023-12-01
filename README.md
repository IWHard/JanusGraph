# JanusGraph

JanusGraph es una BD NoSQL distribuida, open source, escalable, optimizado para almacenar y consultar gráficos que contienen cientos de miles de millones de vértices y aristas distribuidos en un clúster de varias máquinas.
Para el uso de JanusGraph se uso:
- VirtualBox: Como maquina virtual para perfil de Linux en Windows, con el objetivo de programar en su lenguaje nativo.
- Gremlin: Como para crear el servidor en donde estará ubicado JanusGraph.
- GremlinIDE: Como el editador y ambiente para usar JanusGraph.

Wikipedia es una enciclopedia libre escrita en colaboración por voluntarios de todo el mundo. Una pequeña parte de los contribuyentes de Wikipedia son administradores, que son usuarios con acceso a funciones técnicas adicionales que ayudan en el mantenimiento. Para que un usuario se convierta en administrador, se emite una Solicitud de administración y la comunidad de Wikipedia, a través de una discusión pública o una votación, decide a quién promover a la administración. Usando la copia del historial completo de páginas de Wikipedia (del 3 de enero de 2008), extrajimos todas las elecciones de administrador y los datos del historial de votos. Esto nos dio 2,794 elecciones con 103,663 votos totales y 7,066 usuarios participando en las elecciones (ya sea emitiendo su voto o siendo votados). De estas 1,235 elecciones resultaron en un ascenso exitoso, mientras que 1,559 elecciones no resultaron en el ascenso. Aproximadamente la mitad de los votos en el conjunto de datos provienen de administradores existentes, mientras que la otra mitad proviene de usuarios comunes de Wikipedia.

En la descripcion de agregar la direccion del archivo .gz

## Diccionario del dataset
| **Nombre del atributo**  | **Contenido** | **Tipo** | **Requerido (Not Null)** | **Descripcion** |
| ------------- | ------------- | ------------- | ------------- | ------------- | 
| FromNodeID  | ID del votador  | Integer  | Si  | Encontraras el numero del id del usuario quien ha votado hacia otro usuario para ser administrador  |
| ToNodeID  | ID del votado  | Integer  | Si  | Encontraras el numero del id del usuario quien ha recibido una votación para ser administrador |

El dataset es un grafo dirigido con arista A -> B en donde el usuario A ha realizado una votación hacia el usuario B en convertirse un administrador de Wikipedia
JanusGraph tomara todos los valores ingresados del archivo wiki-Vote.txt.gz y posteriormente con el código encontrado en _ le cobrara sentido, vinculando los datos.

## Importacion del dataset
Para la importacion del dataset "Wikipedia Vote Network" encontrado en wiki-Vote.txt.gz, sin tener que descargar el dataset en este Github
podemos escribir un script de Groovy el cual puede ser ejecutado en la consola de Gremlin, el script se llama _.

Una vez realizado la ejecucion del script, usando un segundo script para JanusGraph podemos generar el grado de la dataset de wiki-Vote, el script se llama _.

Nota: JanusGraph requiere explicitamente la definicion del schema antes que añadas vertices, nodos o propieades.

Ya importado el dataset, podemos realizar algunas sentencias CRUD, podemos ver la documentacion de las sentencias para nuestro dataset en [Sentencias_CRUD](https://github.com/IWHard/JanusGraph/blob/main/Sentencias_CRUD)

**Colaboradores**
- Alec Manuel Montes de Oca
- Jimena Nohemi Cruz Arreola
- Montserrat del Carmen Uribe Chavez


#### Descripcion del dataset 2.

Describir que sucede en el dataset, que es de donde proviene
