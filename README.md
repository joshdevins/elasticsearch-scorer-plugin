# ElasticSearch Scorer Plugin

A "hello world" scorer plugin for ElasticSearch. This has a few simple scorers:

* `constant-score`: A scorer that returns just a constant score of `1`
  (`double`).
* `random-score`: A scorer that returns a random score (`double`).
* `lucene-score`: A scorer that returns just the Lucene score directly
  (`float`).
* `lucene-downscaled-score`: A scorer that returns just the Lucene score
  directly but scaled down to a small double to see what effect this has
  (if any) (`double`).
