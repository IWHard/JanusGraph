# JanusGraph PD03
Universidad Autónoma de Yucatán

Proyecto Final

Base de Datos LCC

Integrantes:
- Alec Manuel Montes de Oca
- Jimena Nohemi Cruz Arreola
- Montserrat del Carmen Uribe Chavez

### Contenido
1. Archivo del dataset. [wiki-Vote](https://github.com/IWHard/JanusGraph/blob/main/wiki-Vote.txt.gz)
2. Descripción	del	dataset. [Dataset_Desc](https://github.com/IWHard/JanusGraph/blob/main/Dataset_Desc)
3. Descripción	del	diccionario	de datos del dataset. [Dataset_Dicc](https://github.com/IWHard/JanusGraph/blob/main/Dataset_Dicc)
4. Descripción del modelado del dataset. [Dataset_Desc_Janus](https://github.com/IWHard/JanusGraph/blob/main/Dataset_Desc_Janus)
5. Descripción de la BD JanusGraph y sus herramientas para la elaboración. [Desc_Janus](https://github.com/IWHard/JanusGraph/blob/main/Desc_Janus)
6. Descripción de la importación del dataset. [Data_Desc](https://github.com/IWHard/JanusGraph/blob/main/Data_Desc)
7. Definición y descripción de sentencias CRUD. [Sentencias_CRUD](https://github.com/IWHard/JanusGraph/blob/main/Sentencias_CRUD)

# Version 2

#### Descripción de la BD NoSQL y las herramientas que se utilizaron. 5.
JanusGraph es una BD NoSQL distribuida, open source, escalable, optimizado para almacenar y consultar gráficos que contienen cientos de miles de millones de vértices y aristas distribuidos en un clúster de varias máquinas.
Para el uso de JanusGraph se uso:
- VirtualBox: Como maquina virtual para perfil de Linux en Windows, con el objetivo de programar en su lenguaje nativo.
- Gremlin: Como para crear el servidor en donde estará ubicado JanusGraph.
- GremlinIDE: Como el editador y ambiente para usar JanusGraph.

#### Descripción del modelado del dataset según la BD NoSQL 4.
El dataset es un grafo dirigido con arista A -> B en donde el usuario A ha realizado una votación hacia el usuario B en convertirse un administrador de Wikipedia
JanusGraph tomara todos los valores ingresados del archivo wiki-Vote.txt.gz y posteriormente con el código encontrado en _ le cobrara sentido, vinculando los datos.

#### Descripcion del diccionario de datos del dataset 3.
| **Nombre del atributo**  | **Contenido** | **Tipo** | **Requerido (Not Null)** | **Descripcion** |
| ------------- | ------------- | ------------- | ------------- | ------------- | 
| FromNodeID  | ID del votador  | Integer  | Si  | Encontraras el numero del id del usuario quien ha votado hacia otro usuario para ser administrador  |
| ToNodeID  | ID del votado  | Integer  | Si  | Encontraras el numero del id del usuario quien ha recibido una votación para ser administrador |

#### Descripcion del dataset 2.

#### Descripción	de	la	importación	de	sus	datos 6.

#### Definir y describir al menos 5 sentencias para cada una de las operaciones CRUD (Create, Read, Update, Delete) en la BD. 7.

#### Archivo (No poner) 1.

Colaboradores
- Alec Manuel Montes de Oca
- Jimena Nohemi Cruz Arreola
- Montserrat del Carmen Uribe Chavez
