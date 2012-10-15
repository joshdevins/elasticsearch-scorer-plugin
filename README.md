# ElasticSearch Scorer Plugin

A "hello world" scorer plugin for ElasticSearch. This has two simple scorers:

* `constant-score`: A scorer that returns just a constant score of `1`.
* `lucene-score`: A scorer that returns just the Lucene score directly.
