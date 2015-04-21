module runtime::Base

import util::Maybe;
import core::Syntax;

default Maybe[Statement] runtime( Expression e ) = nothing();