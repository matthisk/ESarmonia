# Syntactic language extensions for ECMAScript
author: Matthisk Heimensen, supervisor: Tijs van der Storm

## Summary

Extending programming languages is an activity undertaken by many programmers, mostly through the use of syntax macros but there exist different manners through which to achieve extensible programming languages.  Extension enables any programmer to introduce new language constructs, not just the creators of a language. Language extensions are dedicated modular grammars including a transformation step to the base language. They enable programmers to create their own syntax on top of a base language and embed domain specific knowledge not just in semantics but also in syntax. For implementation of language extensions a tool called a language workbench can be used. Language workbenches promise to provide an environment which improves the efficiency of language oriented programming. To evaluate this promise of the language workbench we implement the latest JavaScript specification (ECMAScript 6) as a set of language extensions on top of current JavaScript and compare our implementation against tools created without the help of a language workbench.

## Rascal

RMonia is implemented in the Rascal metaprogramming language ([rascal-mpl.org](http://www.rascal-mpl.org)). API
documentation for standard Rascal functions and types is available online
([http://tutor.rascal-mpl.org/Rascal/Rascal.html](http://tutor.rascal-mpl.org/Rascal/Rascal.html)).
In this project, we particularly use Rascal's support for [syntax definitions
and
parsing](http://tutor.rascal-mpl.org/Rascal/Rascal.html#/Rascal/Declarations/SyntaxDefinition/SyntaxDefinition.html).


## Installation instructions

0.  Install JDK 1.8 from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).

1.  Install a fresh [Eclipse](http://www.eclipse.org), version Luna (RCP & RAP).

2.  The unzipped artifact contains a full clone of the following repository:
    [https://github.com/matthisk/RMonia/archive/master.zip](https://github.com/matthisk/RMonia/archive/master.zip).

3.  From within the new Eclipse, go to Help > Install New Software...; click
    on Add... and then Local...; browse to the `update-site` directory of the
    cloned repository and press OK. After giving a name to the update site
    (doesn't matter what name), you'll be able to select Rascal for
    installation.  Finish the process by clicking on Yes when asked to restart
    Eclipse.

4.  In the restarted Eclipse, go to the File menu, and select Import..., then
    General > Existing Projects into Workspace, as root directory, select the
    `RMonia` directory in the cloned repo. Import the project there.
    You're now set up to explore the code, write ECMAScript 6 JavaScript, transform to ECMAScript 5, and run the compatibility tests.
