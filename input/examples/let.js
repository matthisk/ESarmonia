/*
 * Test: temporal dead zone
 */
function() {
    var passed = (function(){ try { qux; } catch(e) { return true; }}());
    var qux = 456;
    return passed;
}
