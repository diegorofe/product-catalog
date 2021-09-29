### Logs do Erro
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'productRepository': Invocation of init method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository]: Constructor threw exception; nested exception is org.springframework.data.elasticsearch.ElasticsearchException: Error while for indexExists request: org.elasticsearch.action.admin.indices.get.GetIndexRequest@5a1dddba
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository]: Constructor threw exception; nested exception is org.springframework.data.elasticsearch.ElasticsearchException: Error while for indexExists request: org.elasticsearch.action.admin.indices.get.GetIndexRequest@5a1dddba
Caused by: org.springframework.data.elasticsearch.ElasticsearchException: Error while for indexExists request: org.elasticsearch.action.admin.indices.get.GetIndexRequest@5a1dddba
Caused by: java.net.ConnectException: Connection refused: no further information


