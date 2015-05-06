module Desugar
extend desugar::Visitor;

extend extensions::arrow::Desugar;
extend extensions::class::Desugar;
extend extensions::object::Desugar;
extend extensions::parameters::Desugar;
extend extensions::spread::Desugar;
extend extensions::forof::Desugar;
extend extensions::destructuring::Desugar;