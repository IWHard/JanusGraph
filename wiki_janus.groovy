// Inicializar JanusGraph
graph = JanusGraphFactory.open('direccion/a/tu/configuracion.propiedades')
g = graph.traversal()

// Definir schema
mgmt = graph.openManagement()
if (!mgmt.containsVertexLabel('user')) {
    mgmt.makeVertexLabel('user').make()
}
if (!mgmt.containsPropertyKey('userId')) {
    mgmt.makePropertyKey('userId').dataType(String.class).make()
}
if (!mgmt.containsEdgeLabel('votesFor')) {
    mgmt.makeEdgeLabel('votesFor').make()
}
mgmt.commit()

// Definir getOrCreate function
getOrCreate = { id ->
  g.V().has('user','userId', id).
    fold().
    coalesce(unfold(),
             addV('user').property('userId', id)).next()
}

// Cargar datos
new File('wiki-Vote.txt').eachLine {
  if (!it.startsWith("#")){
    (fromVertex, toVertex) = it.split('\t').collect(getOrCreate)
    g.addE('votesFor').from(fromVertex).to(toVertex).iterate()
  }
}

// Confirmar la transacción para conservar todos los cambios en el disco.
graph.tx().commit()
