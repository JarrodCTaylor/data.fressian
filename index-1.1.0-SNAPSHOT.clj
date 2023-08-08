{:namespaces
 ({:doc "Read/write fressian data. See http://www.edn-format.org/",
   :author "Stuart Halloway",
   :name "clojure.data.fressian",
   :wiki-url "https://clojure.github.io/data.fressian/index.html",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "associative-lookup",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L52",
   :line 52,
   :var-type "function",
   :arglists ([o]),
   :doc "Build an ILookup from an associative collection.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/associative-lookup"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "begin-closed-list",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L267",
   :line 267,
   :var-type "function",
   :arglists ([writer]),
   :doc
   "Begin writing a fressianed list.  To end the list, call end-list.\nUsed to write sequential data whose size is not known in advance.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/begin-closed-list"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "begin-open-list",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L278",
   :line 278,
   :var-type "function",
   :arglists ([writer]),
   :doc
   "Advanced.  Writes fressian code to begin an open list.  An\nopen list can be terminated either by a call to end-list,\nor by simply closing the stream.  Used to write sequential\ndata whose size is not known in advance, in contexts where\nstream failure can safely be interpreted as end of list.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/begin-open-list"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "clojure-read-handlers",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L152",
   :line 152,
   :var-type "var",
   :arglists nil,
   :doc "Standard set of read handlers for Clojure data.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/clojure-read-handlers"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "clojure-write-handlers",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L71",
   :line 71,
   :var-type "var",
   :arglists nil,
   :doc "Standard set of write handlers for Clojure data.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/clojure-write-handlers"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "create-reader",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L201",
   :line 201,
   :var-type "function",
   :arglists ([in & {:keys [handlers checksum?]}]),
   :doc
   "Create a fressian reader targeting in, which must be compatible\nwith clojure.java.io/input-stream.  Handlers must be a map of\ntag => ReadHandler wrapped in associative-lookup. See\nclojure-read-handlers for an example.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/create-reader"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "create-writer",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L193",
   :line 193,
   :var-type "function",
   :arglists ([out & {:keys [handlers]}]),
   :doc
   "Create a fressian writer targeting out. Handlers must be\na nested map of type => tag => WriteHandler wrapped with\nassociative-lookup and inheritance-lookup. See\nclojure-write-handlers for an example.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/create-writer"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "end-list",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L273",
   :line 273,
   :var-type "function",
   :arglists ([writer]),
   :doc "Ends a list begun with begin-closed-list.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/end-list"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "field-caching-writer",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L125",
   :line 125,
   :var-type "function",
   :arglists ([cache-pred]),
   :doc
   "Returns a record writer that caches values for keys\nmatching cache-pred, which is typically specified\nas a set, e.g. (field-caching-writer #{:color})",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/field-caching-writer"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "inheritance-lookup",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L58",
   :line 58,
   :var-type "function",
   :arglists ([lookup]),
   :doc
   "Returns an inheritance aware lookup based on lookup that will match\nsubclasses as well as exact matches.  Will walk inheritance hierarchy\nonce per new type encountered to find the best match, then cache\nresults.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/inheritance-lookup"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "read",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L221",
   :line 221,
   :var-type "function",
   :arglists ([readable & options]),
   :doc
   "Convenience method for reading a single fressian object.\nTakes same options as create-reader.  Readable can be\nany type supported by clojure.java.io/input-stream, or\na ByteBuffer.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/read"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "read-object",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L211",
   :line 211,
   :var-type "function",
   :arglists ([rdr]),
   :doc "Read a single object from a fressian reader.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/read-object"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "tag",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L250",
   :line 250,
   :var-type "function",
   :arglists ([obj]),
   :doc "Returns the tag if object is a tagged-object, else nil.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/tag"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "tagged-object?",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L243",
   :line 243,
   :var-type "function",
   :arglists ([o]),
   :doc
   "Returns true if o is a tagged object, which will occur when\nthe reader does not recognized a specific type.  Use tag\nand tagged-value to access the contents of a tagged-object.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/tagged-object?"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "tagged-value",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L256",
   :line 256,
   :var-type "function",
   :arglists ([obj]),
   :doc
   "Returns the value (an Object arrray) wrapped by obj, or nil\nif obj is not a tagged object.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/tagged-value"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "write",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L229",
   :line 229,
   :var-type "function",
   :arglists ([obj & options]),
   :doc
   "Convenience method for writing a single object.  Returns a\nbyte buffer.  Options are the same as for create-reader,\nwith one additional option.  If footer? is specified, will\nwrite a fressian footer after writing the object.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/write"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "write-object",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L216",
   :line 216,
   :var-type "function",
   :arglists ([writer obj]),
   :doc
   "Write a single object to a fressian reader. Returns the reader.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/write-object"}
  {:raw-source-url
   "https://github.com/clojure/data.fressian/raw/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj",
   :name "FressianReadable",
   :file "src/main/clojure/clojure/data/fressian.clj",
   :source-url
   "https://github.com/clojure/data.fressian/blob/e427eece8903dd471e829fb74da52a0fe7e20e70/src/main/clojure/clojure/data/fressian.clj#L38",
   :line 38,
   :var-type "protocol",
   :arglists nil,
   :doc nil,
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/FressianReadable"}
  {:raw-source-url nil,
   :name "to-input-stream",
   :file nil,
   :source-url nil,
   :var-type "function",
   :arglists ([obj]),
   :doc "Implementation detail.",
   :namespace "clojure.data.fressian",
   :wiki-url
   "https://clojure.github.io/data.fressian//index.html#clojure.data.fressian/to-input-stream"})}
