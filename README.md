# ElasticSearch Scorer Plugin

A "hello world" scorer plugin for ElasticSearch. This has a few simple scorers:

* `constant-score`: A scorer that returns just a constant score of `1`.
* `lucene-score`: A scorer that returns just the Lucene score directly.
* `lucene-downscaled-score`: A scorer that returns just the Lucene score
  directly but scaled down to a small double to see what effect this has
  (if any).
* `extra-lucene-score`: A scorer that returns just the Lucene score directly
  but also throws in some other compute time stuff.
