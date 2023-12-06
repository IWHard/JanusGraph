# JanusGraph

JanusGraph es una BD NoSQL distribuida, open source, escalable, optimizado para almacenar y consultar gráficos que contienen cientos de miles de millones de vértices y aristas distribuidos en un clúster de varias máquinas.
Para el uso de JanusGraph se usó:
- Gremlin: Como para crear el servidor en donde estará ubicado JanusGraph.
- GremlinIDE: Como el editador y ambiente para usar JanusGraph.

Asi como herramientas para la visualizacion completa del resultado esperado:
- Gephi: Como visualizador del grafo resultante.

## Información del dataset
Wikipedia es una enciclopedia libre escrita en colaboración por voluntarios de todo el mundo. Una pequeña parte de los contribuyentes de Wikipedia son administradores, que son usuarios con acceso a funciones técnicas adicionales que ayudan en el mantenimiento. Para que un usuario se convierta en administrador, se emite una Solicitud de administración y la comunidad de Wikipedia, a través de una discusión pública o una votación, decide a quién promover a la administración. Usando la copia del historial completo de páginas de Wikipedia (del 3 de enero de 2008), extrajimos todas las elecciones de administrador y los datos del historial de votos. Esto nos dio 2,794 elecciones con 103,663 votos totales y 7,066 usuarios participando en las elecciones (ya sea emitiendo su voto o siendo votados). De estas 1,235 elecciones resultaron en un ascenso exitoso, mientras que 1,559 elecciones no resultaron en el ascenso. Aproximadamente la mitad de los votos en el conjunto de datos provienen de administradores existentes, mientras que la otra mitad proviene de usuarios comunes de Wikipedia.

## Estadísticas del dataset

| **Nombre del atributo**  | **Contenido** |
| ------------- | ------------- |
| Nodos | 7115 |
| Vértices | 103689 |
| Nodos en el mayor WCC	| 7066 (0.993) |
| Vértices en el mayor WCC	| 103663 (1.000) |
| Nodos en el mayor SCC |	1300 (0.183) |
| Vértices en el mayor SCC	| 39456 (0.381) |
| Coeficiente de agrupamiento promedio | 0.1409 |
| Número de triángulos | 608389 |
| Fracción de triángulos cerrados | 0.04564 |
| Diametro (El camino más corto) | 7 |
| Diámetro efectivo del percentil 90 | 3.8 |

WCC -> Weakly Connected Component

SCC -> Strongly Connected Component

Podemos encontrar la dataset en este repositorio, el archivo llamado [wiki-Vote.txt.gz](https://github.com/IWHard/JanusGraph/blob/main/wiki-Vote.txt.gz)

## Diccionario del dataset
| **Nombre del atributo**  | **Contenido** | **Tipo** | **Requerido (Not Null)** | **Descripcion** |
| ------------- | ------------- | ------------- | ------------- | ------------- | 
| FromNodeID  | ID del votador  | Integer  | Si  | Encontraras el número del id del usuario quien ha votado hacia otro usuario para ser administrador  |
| ToNodeID  | ID del votado  | Integer  | Si  | Encontraras el número del id del usuario quien ha recibido una votación para ser administrador |

El dataset es un grafo dirigido con vértices A -> B en donde el usuario A ha realizado una votación hacia el usuario B en convertirse un administrador de Wikipedia
JanusGraph tomara todos los valores ingresados del archivo wiki-Vote.txt.gz.

## Importación del dataset
Para la importación del dataset "Wikipedia Vote Network" encontrado en wiki-Vote.txt.gz, sin tener que descargar el dataset en este Github
podemos escribir un script de Groovy el cual puede ser ejecutado en la consola de Gremlin, el script se llama [import.groovy](https://github.com/IWHard/JanusGraph/blob/main/import.groovy).

Una vez realizado la ejecución del script, usando un segundo script para JanusGraph podemos generar el grado de la dataset de wiki-Vote, el script se llama [wiki_janus.groovy](https://github.com/IWHard/JanusGraph/blob/main/wiki_janus.groovy).

Nota: JanusGraph requiere explícitamente la definición del schema antes que añadas vértices, nodos o propiedades.

Ya importado el dataset, podemos realizar algunas sentencias CRUD, podemos ver la documentación de las sentencias para nuestro dataset en [Sentencias_CRUD](https://github.com/IWHard/JanusGraph/blob/main/Sentencias_CRUD)

**Grafo resultante del dataset**
![wiki](https://github.com/IWHard/JanusGraph/assets/97716802/62547db4-509f-47b2-a2ea-9d6e0e7ba94a)

**Colaboradores**
- Alec Manuel Montes de Oca
- Jimena Nohemí Cruz Arreola
- Montserrat del Carmen Uribe Chávez
