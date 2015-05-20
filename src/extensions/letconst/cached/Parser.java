package extensions.letconst.cached;

import java.io.IOException;
import java.io.StringReader;

import org.eclipse.imp.pdb.facts.type.TypeFactory;
import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.ISourceLocation;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.IValueFactory;
import org.eclipse.imp.pdb.facts.exceptions.FactTypeUseException;
import org.eclipse.imp.pdb.facts.io.StandardTextReader;
import org.rascalmpl.parser.gtd.stack.*;
import org.rascalmpl.parser.gtd.stack.filter.*;
import org.rascalmpl.parser.gtd.stack.filter.follow.*;
import org.rascalmpl.parser.gtd.stack.filter.match.*;
import org.rascalmpl.parser.gtd.stack.filter.precede.*;
import org.rascalmpl.parser.gtd.preprocessing.ExpectBuilder;
import org.rascalmpl.parser.gtd.util.IntegerKeyedHashMap;
import org.rascalmpl.parser.gtd.util.IntegerList;
import org.rascalmpl.parser.gtd.util.IntegerMap;
import org.rascalmpl.values.ValueFactoryFactory;
import org.rascalmpl.values.uptr.Factory;

@SuppressWarnings("all")
public class Parser extends org.rascalmpl.parser.gtd.SGTDBF<IConstructor, IConstructor, ISourceLocation> {
  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();

  protected static IValue _read(java.lang.String s, org.eclipse.imp.pdb.facts.type.Type type) {
    try {
      return new StandardTextReader().read(VF, org.rascalmpl.values.uptr.Factory.uptr, type, new StringReader(s));
    }
    catch (FactTypeUseException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    } catch (IOException e) {
      throw new RuntimeException("unexpected exception in generated parser", e);  
    }
  }
	
  protected static java.lang.String _concat(java.lang.String ...args) {
    int length = 0;
    for (java.lang.String s :args) {
      length += s.length();
    }
    java.lang.StringBuilder b = new java.lang.StringBuilder(length);
    for (java.lang.String s : args) {
      b.append(s);
    }
    return b.toString();
  }
  protected static final TypeFactory _tf = TypeFactory.getInstance();
 
  private static final IntegerMap _resultStoreIdMappings;
  private static final IntegerKeyedHashMap<IntegerList> _dontNest;
	
  protected static void _putDontNest(IntegerKeyedHashMap<IntegerList> result, int parentId, int childId) {
    IntegerList donts = result.get(childId);
    if (donts == null) {
      donts = new IntegerList();
      result.put(childId, donts);
    }
    donts.add(parentId);
  }
    
  protected int getResultStoreId(int parentId) {
    return _resultStoreIdMappings.get(parentId);
  }
    
  protected static IntegerKeyedHashMap<IntegerList> _initDontNest() {
    IntegerKeyedHashMap<IntegerList> result = new IntegerKeyedHashMap<IntegerList>(); 
    
    
    
    
    _putDontNest(result, 516, 700);
    
    _putDontNest(result, 633, 658);
    
    _putDontNest(result, 395, 459);
    
    _putDontNest(result, 563, 563);
    
    _putDontNest(result, 506, 637);
    
    _putDontNest(result, 462, 520);
    
    _putDontNest(result, 468, 513);
    
    _putDontNest(result, 608, 658);
    
    _putDontNest(result, 528, 614);
    
    _putDontNest(result, 549, 650);
    
    _putDontNest(result, 552, 650);
    
    _putDontNest(result, 449, 623);
    
    _putDontNest(result, 545, 721);
    
    _putDontNest(result, 408, 477);
    
    _putDontNest(result, 552, 735);
    
    _putDontNest(result, 367, 506);
    
    _putDontNest(result, 549, 735);
    
    _putDontNest(result, 617, 686);
    
    _putDontNest(result, 725, 700);
    
    _putDontNest(result, 630, 672);
    
    _putDontNest(result, 395, 623);
    
    _putDontNest(result, 444, 742);
    
    _putDontNest(result, 535, 623);
    
    _putDontNest(result, 459, 542);
    
    _putDontNest(result, 576, 596);
    
    _putDontNest(result, 481, 535);
    
    _putDontNest(result, 477, 549);
    
    _putDontNest(result, 413, 707);
    
    _putDontNest(result, 449, 459);
    
    _putDontNest(result, 367, 573);
    
    _putDontNest(result, 468, 535);
    
    _putDontNest(result, 506, 556);
    
    _putDontNest(result, 477, 513);
    
    _putDontNest(result, 459, 637);
    
    _putDontNest(result, 487, 520);
    
    _putDontNest(result, 516, 596);
    
    _putDontNest(result, 395, 630);
    
    _putDontNest(result, 437, 520);
    
    _putDontNest(result, 535, 630);
    
    _putDontNest(result, 459, 556);
    
    _putDontNest(result, 531, 582);
    
    _putDontNest(result, 413, 693);
    
    _putDontNest(result, 408, 686);
    
    _putDontNest(result, 468, 549);
    
    _putDontNest(result, 481, 549);
    
    _putDontNest(result, 506, 542);
    
    _putDontNest(result, 477, 535);
    
    _putDontNest(result, 549, 742);
    
    _putDontNest(result, 552, 742);
    
    _putDontNest(result, 545, 563);
    
    _putDontNest(result, 481, 513);
    
    _putDontNest(result, 509, 686);
    
    _putDontNest(result, 408, 582);
    
    _putDontNest(result, 576, 700);
    
    _putDontNest(result, 449, 630);
    
    _putDontNest(result, 444, 735);
    
    _putDontNest(result, 509, 582);
    
    _putDontNest(result, 589, 665);
    
    _putDontNest(result, 531, 686);
    
    _putDontNest(result, 444, 650);
    
    _putDontNest(result, 528, 714);
    
    _putDontNest(result, 563, 721);
    
    _putDontNest(result, 589, 679);
    
    _putDontNest(result, 689, 686);
    
    _putDontNest(result, 432, 582);
    
    _putDontNest(result, 605, 614);
    
    _putDontNest(result, 605, 714);
    
    _putDontNest(result, 490, 535);
    
    _putDontNest(result, 559, 714);
    
    _putDontNest(result, 449, 563);
    
    _putDontNest(result, 420, 549);
    
    _putDontNest(result, 471, 582);
    
    _putDontNest(result, 453, 686);
    
    _putDontNest(result, 596, 714);
    
    _putDontNest(result, 563, 630);
    
    _putDontNest(result, 538, 742);
    
    _putDontNest(result, 432, 686);
    
    _putDontNest(result, 400, 535);
    
    _putDontNest(result, 596, 614);
    
    _putDontNest(result, 633, 672);
    
    _putDontNest(result, 400, 432);
    
    _putDontNest(result, 453, 582);
    
    _putDontNest(result, 490, 549);
    
    _putDontNest(result, 535, 721);
    
    _putDontNest(result, 395, 721);
    
    _putDontNest(result, 376, 573);
    
    _putDontNest(result, 490, 513);
    
    _putDontNest(result, 471, 686);
    
    _putDontNest(result, 506, 528);
    
    _putDontNest(result, 710, 686);
    
    _putDontNest(result, 589, 605);
    
    _putDontNest(result, 538, 650);
    
    _putDontNest(result, 559, 614);
    
    _putDontNest(result, 432, 477);
    
    _putDontNest(result, 459, 528);
    
    _putDontNest(result, 4071, 326);
    
    _putDontNest(result, 556, 686);
    
    _putDontNest(result, 538, 735);
    
    _putDontNest(result, 545, 630);
    
    _putDontNest(result, 420, 513);
    
    _putDontNest(result, 524, 535);
    
    _putDontNest(result, 556, 582);
    
    _putDontNest(result, 360, 444);
    
    _putDontNest(result, 395, 563);
    
    _putDontNest(result, 535, 563);
    
    _putDontNest(result, 500, 573);
    
    _putDontNest(result, 563, 623);
    
    _putDontNest(result, 400, 513);
    
    _putDontNest(result, 717, 686);
    
    _putDontNest(result, 608, 672);
    
    _putDontNest(result, 400, 549);
    
    _putDontNest(result, 496, 520);
    
    _putDontNest(result, 524, 549);
    
    _putDontNest(result, 696, 686);
    
    _putDontNest(result, 400, 413);
    
    _putDontNest(result, 376, 506);
    
    _putDontNest(result, 420, 535);
    
    _putDontNest(result, 630, 658);
    
    _putDontNest(result, 449, 721);
    
    _putDontNest(result, 545, 623);
    
    _putDontNest(result, 437, 589);
    
    _putDontNest(result, 531, 742);
    
    _putDontNest(result, 391, 459);
    
    _putDontNest(result, 617, 735);
    
    _putDontNest(result, 513, 707);
    
    _putDontNest(result, 623, 700);
    
    _putDontNest(result, 360, 630);
    
    _putDontNest(result, 437, 605);
    
    _putDontNest(result, 626, 693);
    
    _putDontNest(result, 605, 637);
    
    _putDontNest(result, 559, 556);
    
    _putDontNest(result, 487, 605);
    
    _putDontNest(result, 444, 582);
    
    _putDontNest(result, 509, 735);
    
    _putDontNest(result, 675, 679);
    
    _putDontNest(result, 462, 605);
    
    _putDontNest(result, 599, 658);
    
    _putDontNest(result, 408, 735);
    
    _putDontNest(result, 5592, 556);
    
    _putDontNest(result, 617, 742);
    
    _putDontNest(result, 496, 665);
    
    _putDontNest(result, 462, 589);
    
    _putDontNest(result, 509, 650);
    
    _putDontNest(result, 408, 650);
    
    _putDontNest(result, 487, 589);
    
    _putDontNest(result, 559, 542);
    
    _putDontNest(result, 444, 477);
    
    _putDontNest(result, 360, 459);
    
    _putDontNest(result, 520, 563);
    
    _putDontNest(result, 459, 496);
    
    _putDontNest(result, 559, 637);
    
    _putDontNest(result, 637, 672);
    
    _putDontNest(result, 367, 658);
    
    _putDontNest(result, 552, 582);
    
    _putDontNest(result, 549, 582);
    
    _putDontNest(result, 376, 672);
    
    _putDontNest(result, 626, 707);
    
    _putDontNest(result, 408, 742);
    
    _putDontNest(result, 650, 679);
    
    _putDontNest(result, 549, 686);
    
    _putDontNest(result, 552, 686);
    
    _putDontNest(result, 509, 742);
    
    _putDontNest(result, 617, 650);
    
    _putDontNest(result, 360, 623);
    
    _putDontNest(result, 391, 623);
    
    _putDontNest(result, 592, 623);
    
    _putDontNest(result, 614, 665);
    
    _putDontNest(result, 531, 735);
    
    _putDontNest(result, 513, 693);
    
    _putDontNest(result, 462, 679);
    
    _putDontNest(result, 654, 700);
    
    _putDontNest(result, 500, 672);
    
    _putDontNest(result, 487, 679);
    
    _putDontNest(result, 520, 721);
    
    _putDontNest(result, 596, 637);
    
    _putDontNest(result, 437, 679);
    
    _putDontNest(result, 531, 650);
    
    _putDontNest(result, 528, 528);
    
    _putDontNest(result, 592, 630);
    
    _putDontNest(result, 391, 630);
    
    _putDontNest(result, 444, 686);
    
    _putDontNest(result, 395, 444);
    
    _putDontNest(result, 696, 742);
    
    _putDontNest(result, 459, 487);
    
    _putDontNest(result, 506, 614);
    
    _putDontNest(result, 567, 707);
    
    _putDontNest(result, 506, 714);
    
    _putDontNest(result, 520, 623);
    
    _putDontNest(result, 650, 665);
    
    _putDontNest(result, 710, 742);
    
    _putDontNest(result, 528, 556);
    
    _putDontNest(result, 459, 714);
    
    _putDontNest(result, 391, 563);
    
    _putDontNest(result, 556, 650);
    
    _putDontNest(result, 599, 672);
    
    _putDontNest(result, 682, 721);
    
    _putDontNest(result, 661, 714);
    
    _putDontNest(result, 637, 658);
    
    _putDontNest(result, 367, 672);
    
    _putDontNest(result, 668, 700);
    
    _putDontNest(result, 710, 735);
    
    _putDontNest(result, 496, 679);
    
    _putDontNest(result, 717, 742);
    
    _putDontNest(result, 471, 735);
    
    _putDontNest(result, 376, 658);
    
    _putDontNest(result, 675, 665);
    
    _putDontNest(result, 471, 650);
    
    _putDontNest(result, 689, 735);
    
    _putDontNest(result, 487, 665);
    
    _putDontNest(result, 556, 742);
    
    _putDontNest(result, 432, 735);
    
    _putDontNest(result, 528, 637);
    
    _putDontNest(result, 542, 693);
    
    _putDontNest(result, 703, 693);
    
    _putDontNest(result, 437, 665);
    
    _putDontNest(result, 496, 605);
    
    _putDontNest(result, 614, 679);
    
    _putDontNest(result, 453, 735);
    
    _putDontNest(result, 520, 630);
    
    _putDontNest(result, 462, 665);
    
    _putDontNest(result, 427, 535);
    
    _putDontNest(result, 528, 542);
    
    _putDontNest(result, 432, 650);
    
    _putDontNest(result, 391, 721);
    
    _putDontNest(result, 496, 589);
    
    _putDontNest(result, 592, 721);
    
    _putDontNest(result, 453, 650);
    
    _putDontNest(result, 360, 721);
    
    _putDontNest(result, 696, 735);
    
    _putDontNest(result, 471, 742);
    
    _putDontNest(result, 717, 735);
    
    _putDontNest(result, 689, 742);
    
    _putDontNest(result, 427, 549);
    
    _putDontNest(result, 500, 658);
    
    _putDontNest(result, 542, 707);
    
    _putDontNest(result, 703, 707);
    
    _putDontNest(result, 538, 582);
    
    _putDontNest(result, 427, 513);
    
    _putDontNest(result, 360, 563);
    
    _putDontNest(result, 559, 528);
    
    _putDontNest(result, 453, 742);
    
    _putDontNest(result, 538, 686);
    
    _putDontNest(result, 459, 614);
    
    _putDontNest(result, 567, 693);
    
    _putDontNest(result, 432, 742);
    
    _putDontNest(result, 556, 735);
    
    _putDontNest(result, 516, 573);
    
    _putDontNest(result, 432, 563);
    
    _putDontNest(result, 477, 679);
    
    _putDontNest(result, 408, 459);
    
    _putDontNest(result, 556, 563);
    
    _putDontNest(result, 576, 573);
    
    _putDontNest(result, 481, 589);
    
    _putDontNest(result, 360, 391);
    
    _putDontNest(result, 449, 477);
    
    _putDontNest(result, 477, 605);
    
    _putDontNest(result, 408, 623);
    
    _putDontNest(result, 400, 665);
    
    _putDontNest(result, 556, 721);
    
    _putDontNest(result, 367, 468);
    
    _putDontNest(result, 509, 623);
    
    _putDontNest(result, 360, 742);
    
    _putDontNest(result, 453, 563);
    
    _putDontNest(result, 420, 665);
    
    _putDontNest(result, 477, 589);
    
    _putDontNest(result, 391, 742);
    
    _putDontNest(result, 592, 742);
    
    _putDontNest(result, 617, 630);
    
    _putDontNest(result, 668, 672);
    
    _putDontNest(result, 367, 700);
    
    _putDontNest(result, 395, 477);
    
    _putDontNest(result, 717, 721);
    
    _putDontNest(result, 682, 742);
    
    _putDontNest(result, 531, 623);
    
    _putDontNest(result, 585, 665);
    
    _putDontNest(result, 400, 420);
    
    _putDontNest(result, 471, 563);
    
    _putDontNest(result, 432, 721);
    
    _putDontNest(result, 513, 614);
    
    _putDontNest(result, 531, 630);
    
    _putDontNest(result, 535, 582);
    
    _putDontNest(result, 391, 650);
    
    _putDontNest(result, 395, 582);
    
    _putDontNest(result, 592, 650);
    
    _putDontNest(result, 360, 427);
    
    _putDontNest(result, 513, 714);
    
    _putDontNest(result, 481, 679);
    
    _putDontNest(result, 360, 650);
    
    _putDontNest(result, 453, 721);
    
    _putDontNest(result, 468, 679);
    
    _putDontNest(result, 617, 623);
    
    _putDontNest(result, 592, 735);
    
    _putDontNest(result, 391, 735);
    
    _putDontNest(result, 490, 665);
    
    _putDontNest(result, 449, 686);
    
    _putDontNest(result, 573, 665);
    
    _putDontNest(result, 696, 721);
    
    _putDontNest(result, 599, 700);
    
    _putDontNest(result, 360, 735);
    
    _putDontNest(result, 623, 658);
    
    _putDontNest(result, 449, 582);
    
    _putDontNest(result, 468, 605);
    
    _putDontNest(result, 509, 630);
    
    _putDontNest(result, 682, 735);
    
    _putDontNest(result, 400, 437);
    
    _putDontNest(result, 481, 605);
    
    _putDontNest(result, 710, 721);
    
    _putDontNest(result, 582, 665);
    
    _putDontNest(result, 408, 630);
    
    _putDontNest(result, 471, 721);
    
    _putDontNest(result, 367, 596);
    
    _putDontNest(result, 413, 528);
    
    _putDontNest(result, 626, 714);
    
    _putDontNest(result, 535, 686);
    
    _putDontNest(result, 654, 658);
    
    _putDontNest(result, 524, 665);
    
    _putDontNest(result, 395, 686);
    
    _putDontNest(result, 689, 721);
    
    _putDontNest(result, 468, 589);
    
    _putDontNest(result, 506, 693);
    
    _putDontNest(result, 668, 658);
    
    _putDontNest(result, 490, 679);
    
    _putDontNest(result, 400, 605);
    
    _putDontNest(result, 420, 605);
    
    _putDontNest(result, 420, 679);
    
    _putDontNest(result, 556, 623);
    
    _putDontNest(result, 509, 721);
    
    _putDontNest(result, 459, 707);
    
    _putDontNest(result, 563, 582);
    
    _putDontNest(result, 376, 468);
    
    _putDontNest(result, 490, 605);
    
    _putDontNest(result, 524, 679);
    
    _putDontNest(result, 413, 637);
    
    _putDontNest(result, 573, 605);
    
    _putDontNest(result, 481, 665);
    
    _putDontNest(result, 582, 605);
    
    _putDontNest(result, 531, 721);
    
    _putDontNest(result, 542, 614);
    
    _putDontNest(result, 432, 630);
    
    _putDontNest(result, 468, 665);
    
    _putDontNest(result, 563, 686);
    
    _putDontNest(result, 500, 596);
    
    _putDontNest(result, 520, 735);
    
    _putDontNest(result, 703, 714);
    
    _putDontNest(result, 542, 714);
    
    _putDontNest(result, 524, 589);
    
    _putDontNest(result, 453, 630);
    
    _putDontNest(result, 573, 679);
    
    _putDontNest(result, 524, 605);
    
    _putDontNest(result, 637, 700);
    
    _putDontNest(result, 376, 700);
    
    _putDontNest(result, 520, 650);
    
    _putDontNest(result, 420, 589);
    
    _putDontNest(result, 453, 623);
    
    _putDontNest(result, 617, 721);
    
    _putDontNest(result, 477, 665);
    
    _putDontNest(result, 432, 623);
    
    _putDontNest(result, 427, 520);
    
    _putDontNest(result, 400, 589);
    
    _putDontNest(result, 408, 563);
    
    _putDontNest(result, 585, 679);
    
    _putDontNest(result, 545, 686);
    
    _putDontNest(result, 509, 563);
    
    _putDontNest(result, 400, 679);
    
    _putDontNest(result, 520, 742);
    
    _putDontNest(result, 654, 672);
    
    _putDontNest(result, 500, 700);
    
    _putDontNest(result, 471, 623);
    
    _putDontNest(result, 567, 714);
    
    _putDontNest(result, 506, 707);
    
    _putDontNest(result, 545, 582);
    
    _putDontNest(result, 585, 589);
    
    _putDontNest(result, 413, 556);
    
    _putDontNest(result, 556, 630);
    
    _putDontNest(result, 459, 693);
    
    _putDontNest(result, 567, 614);
    
    _putDontNest(result, 623, 672);
    
    _putDontNest(result, 376, 596);
    
    _putDontNest(result, 585, 605);
    
    _putDontNest(result, 661, 707);
    
    _putDontNest(result, 432, 459);
    
    _putDontNest(result, 531, 563);
    
    _putDontNest(result, 408, 721);
    
    _putDontNest(result, 471, 630);
    
    _putDontNest(result, 582, 679);
    
    _putDontNest(result, 413, 542);
    
    _putDontNest(result, 490, 589);
    
    _putDontNest(result, 661, 693);
    
    _putDontNest(result, 538, 563);
    
    _putDontNest(result, 542, 556);
    
    _putDontNest(result, 528, 707);
    
    _putDontNest(result, 427, 665);
    
    _putDontNest(result, 449, 742);
    
    _putDontNest(result, 725, 658);
    
    _putDontNest(result, 477, 520);
    
    _putDontNest(result, 413, 714);
    
    _putDontNest(result, 468, 520);
    
    _putDontNest(result, 360, 686);
    
    _putDontNest(result, 542, 542);
    
    _putDontNest(result, 513, 528);
    
    _putDontNest(result, 449, 735);
    
    _putDontNest(result, 592, 686);
    
    _putDontNest(result, 444, 630);
    
    _putDontNest(result, 391, 686);
    
    _putDontNest(result, 542, 637);
    
    _putDontNest(result, 528, 693);
    
    _putDontNest(result, 552, 623);
    
    _putDontNest(result, 549, 623);
    
    _putDontNest(result, 449, 650);
    
    _putDontNest(result, 395, 742);
    
    _putDontNest(result, 535, 742);
    
    _putDontNest(result, 444, 623);
    
    _putDontNest(result, 552, 630);
    
    _putDontNest(result, 549, 630);
    
    _putDontNest(result, 360, 477);
    
    _putDontNest(result, 444, 459);
    
    _putDontNest(result, 487, 535);
    
    _putDontNest(result, 538, 721);
    
    _putDontNest(result, 437, 535);
    
    _putDontNest(result, 738, 679);
    
    _putDontNest(result, 516, 658);
    
    _putDontNest(result, 391, 477);
    
    _putDontNest(result, 633, 700);
    
    _putDontNest(result, 462, 535);
    
    _putDontNest(result, 567, 637);
    
    _putDontNest(result, 535, 735);
    
    _putDontNest(result, 400, 449);
    
    _putDontNest(result, 395, 735);
    
    _putDontNest(result, 481, 520);
    
    _putDontNest(result, 413, 614);
    
    _putDontNest(result, 462, 513);
    
    _putDontNest(result, 360, 582);
    
    _putDontNest(result, 437, 549);
    
    _putDontNest(result, 576, 658);
    
    _putDontNest(result, 395, 427);
    
    _putDontNest(result, 487, 549);
    
    _putDontNest(result, 641, 665);
    
    _putDontNest(result, 462, 549);
    
    _putDontNest(result, 391, 582);
    
    _putDontNest(result, 535, 650);
    
    _putDontNest(result, 437, 513);
    
    _putDontNest(result, 608, 700);
    
    _putDontNest(result, 592, 582);
    
    _putDontNest(result, 682, 686);
    
    _putDontNest(result, 395, 650);
    
    _putDontNest(result, 413, 487);
    
    _putDontNest(result, 487, 513);
    
    _putDontNest(result, 427, 589);
    
    _putDontNest(result, 496, 535);
    
    _putDontNest(result, 444, 721);
    
    _putDontNest(result, 563, 650);
    
    _putDontNest(result, 563, 735);
    
    _putDontNest(result, 413, 496);
    
    _putDontNest(result, 576, 672);
    
    _putDontNest(result, 559, 693);
    
    _putDontNest(result, 444, 563);
    
    _putDontNest(result, 738, 665);
    
    _putDontNest(result, 400, 520);
    
    _putDontNest(result, 420, 520);
    
    _putDontNest(result, 552, 721);
    
    _putDontNest(result, 549, 721);
    
    _putDontNest(result, 545, 650);
    
    _putDontNest(result, 513, 542);
    
    _putDontNest(result, 542, 528);
    
    _putDontNest(result, 496, 513);
    
    _putDontNest(result, 520, 686);
    
    _putDontNest(result, 513, 637);
    
    _putDontNest(result, 496, 549);
    
    _putDontNest(result, 596, 693);
    
    _putDontNest(result, 516, 672);
    
    _putDontNest(result, 520, 582);
    
    _putDontNest(result, 545, 742);
    
    _putDontNest(result, 549, 563);
    
    _putDontNest(result, 552, 563);
    
    _putDontNest(result, 605, 693);
    
    _putDontNest(result, 626, 637);
    
    _putDontNest(result, 559, 707);
    
    _putDontNest(result, 538, 623);
    
    _putDontNest(result, 630, 700);
    
    _putDontNest(result, 725, 672);
    
    _putDontNest(result, 641, 679);
    
    _putDontNest(result, 490, 520);
    
    _putDontNest(result, 427, 679);
    
    _putDontNest(result, 605, 707);
    
    _putDontNest(result, 538, 630);
    
    _putDontNest(result, 563, 742);
    
    _putDontNest(result, 545, 735);
    
    _putDontNest(result, 427, 605);
    
    _putDontNest(result, 513, 556);
    
    _putDontNest(result, 596, 707);
    
    _putDontNest(result, 408, 542);
    
    _putDontNest(result, 408, 637);
    
    _putDontNest(result, 509, 637);
    
    _putDontNest(result, 496, 596);
    
    _putDontNest(result, 413, 563);
    
    _putDontNest(result, 596, 742);
    
    _putDontNest(result, 471, 528);
    
    _putDontNest(result, 477, 672);
    
    _putDontNest(result, 506, 686);
    
    _putDontNest(result, 490, 658);
    
    _putDontNest(result, 413, 721);
    
    _putDontNest(result, 573, 658);
    
    _putDontNest(result, 509, 542);
    
    _putDontNest(result, 605, 650);
    
    _putDontNest(result, 496, 700);
    
    _putDontNest(result, 668, 679);
    
    _putDontNest(result, 661, 686);
    
    _putDontNest(result, 605, 735);
    
    _putDontNest(result, 559, 742);
    
    _putDontNest(result, 453, 528);
    
    _putDontNest(result, 614, 700);
    
    _putDontNest(result, 654, 665);
    
    _putDontNest(result, 524, 658);
    
    _putDontNest(result, 596, 650);
    
    _putDontNest(result, 432, 528);
    
    _putDontNest(result, 459, 477);
    
    _putDontNest(result, 531, 542);
    
    _putDontNest(result, 563, 693);
    
    _putDontNest(result, 582, 658);
    
    _putDontNest(result, 596, 735);
    
    _putDontNest(result, 623, 665);
    
    _putDontNest(result, 506, 582);
    
    _putDontNest(result, 545, 707);
    
    _putDontNest(result, 444, 496);
    
    _putDontNest(result, 531, 637);
    
    _putDontNest(result, 545, 693);
    
    _putDontNest(result, 420, 658);
    
    _putDontNest(result, 563, 707);
    
    _putDontNest(result, 531, 556);
    
    _putDontNest(result, 459, 582);
    
    _putDontNest(result, 427, 573);
    
    _putDontNest(result, 605, 742);
    
    _putDontNest(result, 400, 658);
    
    _putDontNest(result, 617, 637);
    
    _putDontNest(result, 585, 658);
    
    _putDontNest(result, 468, 672);
    
    _putDontNest(result, 481, 672);
    
    _putDontNest(result, 556, 528);
    
    _putDontNest(result, 408, 556);
    
    _putDontNest(result, 509, 556);
    
    _putDontNest(result, 559, 735);
    
    _putDontNest(result, 538, 714);
    
    _putDontNest(result, 427, 506);
    
    _putDontNest(result, 459, 686);
    
    _putDontNest(result, 559, 650);
    
    _putDontNest(result, 538, 614);
    
    _putDontNest(result, 528, 742);
    
    _putDontNest(result, 432, 556);
    
    _putDontNest(result, 413, 459);
    
    _putDontNest(result, 437, 700);
    
    _putDontNest(result, 444, 714);
    
    _putDontNest(result, 509, 528);
    
    _putDontNest(result, 471, 556);
    
    _putDontNest(result, 437, 596);
    
    _putDontNest(result, 490, 672);
    
    _putDontNest(result, 556, 637);
    
    _putDontNest(result, 477, 658);
    
    _putDontNest(result, 535, 707);
    
    _putDontNest(result, 395, 707);
    
    _putDontNest(result, 573, 672);
    
    _putDontNest(result, 582, 672);
    
    _putDontNest(result, 453, 556);
    
    _putDontNest(result, 391, 397);
    
    _putDontNest(result, 650, 700);
    
    _putDontNest(result, 552, 714);
    
    _putDontNest(result, 524, 672);
    
    _putDontNest(result, 549, 714);
    
    _putDontNest(result, 552, 614);
    
    _putDontNest(result, 449, 707);
    
    _putDontNest(result, 549, 614);
    
    _putDontNest(result, 453, 542);
    
    _putDontNest(result, 449, 693);
    
    _putDontNest(result, 487, 700);
    
    _putDontNest(result, 444, 614);
    
    _putDontNest(result, 528, 650);
    
    _putDontNest(result, 654, 679);
    
    _putDontNest(result, 462, 700);
    
    _putDontNest(result, 432, 542);
    
    _putDontNest(result, 400, 672);
    
    _putDontNest(result, 531, 528);
    
    _putDontNest(result, 453, 637);
    
    _putDontNest(result, 444, 487);
    
    _putDontNest(result, 432, 637);
    
    _putDontNest(result, 420, 672);
    
    _putDontNest(result, 528, 735);
    
    _putDontNest(result, 623, 679);
    
    _putDontNest(result, 471, 542);
    
    _putDontNest(result, 360, 408);
    
    _putDontNest(result, 535, 693);
    
    _putDontNest(result, 395, 693);
    
    _putDontNest(result, 668, 665);
    
    _putDontNest(result, 408, 528);
    
    _putDontNest(result, 556, 556);
    
    _putDontNest(result, 413, 630);
    
    _putDontNest(result, 675, 700);
    
    _putDontNest(result, 437, 468);
    
    _putDontNest(result, 468, 658);
    
    _putDontNest(result, 585, 672);
    
    _putDontNest(result, 471, 637);
    
    _putDontNest(result, 481, 658);
    
    _putDontNest(result, 556, 542);
    
    _putDontNest(result, 462, 596);
    
    _putDontNest(result, 487, 596);
    
    _putDontNest(result, 413, 623);
    
    _putDontNest(result, 661, 742);
    
    _putDontNest(result, 725, 665);
    
    _putDontNest(result, 506, 650);
    
    _putDontNest(result, 471, 487);
    
    _putDontNest(result, 689, 714);
    
    _putDontNest(result, 420, 506);
    
    _putDontNest(result, 538, 528);
    
    _putDontNest(result, 542, 623);
    
    _putDontNest(result, 516, 665);
    
    _putDontNest(result, 717, 714);
    
    _putDontNest(result, 559, 582);
    
    _putDontNest(result, 444, 556);
    
    _putDontNest(result, 552, 637);
    
    _putDontNest(result, 420, 573);
    
    _putDontNest(result, 549, 637);
    
    _putDontNest(result, 506, 742);
    
    _putDontNest(result, 376, 432);
    
    _putDontNest(result, 427, 658);
    
    _putDontNest(result, 500, 549);
    
    _putDontNest(result, 549, 542);
    
    _putDontNest(result, 520, 707);
    
    _putDontNest(result, 552, 542);
    
    _putDontNest(result, 400, 573);
    
    _putDontNest(result, 432, 714);
    
    _putDontNest(result, 641, 658);
    
    _putDontNest(result, 524, 573);
    
    _putDontNest(result, 444, 542);
    
    _putDontNest(result, 576, 665);
    
    _putDontNest(result, 453, 614);
    
    _putDontNest(result, 490, 506);
    
    _putDontNest(result, 520, 693);
    
    _putDontNest(result, 459, 742);
    
    _putDontNest(result, 432, 614);
    
    _putDontNest(result, 513, 721);
    
    _putDontNest(result, 453, 714);
    
    _putDontNest(result, 542, 630);
    
    _putDontNest(result, 596, 686);
    
    _putDontNest(result, 444, 637);
    
    _putDontNest(result, 453, 487);
    
    _putDontNest(result, 500, 535);
    
    _putDontNest(result, 738, 672);
    
    _putDontNest(result, 552, 556);
    
    _putDontNest(result, 589, 700);
    
    _putDontNest(result, 549, 556);
    
    _putDontNest(result, 432, 487);
    
    _putDontNest(result, 696, 714);
    
    _putDontNest(result, 661, 735);
    
    _putDontNest(result, 605, 686);
    
    _putDontNest(result, 710, 714);
    
    _putDontNest(result, 490, 573);
    
    _putDontNest(result, 376, 513);
    
    _putDontNest(result, 471, 614);
    
    _putDontNest(result, 376, 549);
    
    _putDontNest(result, 626, 721);
    
    _putDontNest(result, 567, 623);
    
    _putDontNest(result, 471, 714);
    
    _putDontNest(result, 408, 496);
    
    _putDontNest(result, 506, 735);
    
    _putDontNest(result, 556, 614);
    
    _putDontNest(result, 459, 735);
    
    _putDontNest(result, 567, 630);
    
    _putDontNest(result, 585, 573);
    
    _putDontNest(result, 391, 402);
    
    _putDontNest(result, 376, 535);
    
    _putDontNest(result, 556, 714);
    
    _putDontNest(result, 559, 686);
    
    _putDontNest(result, 513, 563);
    
    _putDontNest(result, 459, 650);
    
    _putDontNest(result, 400, 506);
    
    _putDontNest(result, 376, 413);
    
    _putDontNest(result, 453, 496);
    
    _putDontNest(result, 513, 623);
    
    _putDontNest(result, 360, 707);
    
    _putDontNest(result, 725, 323);
    
    _putDontNest(result, 538, 637);
    
    _putDontNest(result, 477, 573);
    
    _putDontNest(result, 538, 542);
    
    _putDontNest(result, 408, 714);
    
    _putDontNest(result, 531, 714);
    
    _putDontNest(result, 481, 506);
    
    _putDontNest(result, 432, 496);
    
    _putDontNest(result, 360, 693);
    
    _putDontNest(result, 468, 506);
    
    _putDontNest(result, 395, 408);
    
    _putDontNest(result, 391, 693);
    
    _putDontNest(result, 592, 693);
    
    _putDontNest(result, 617, 714);
    
    _putDontNest(result, 391, 707);
    
    _putDontNest(result, 592, 707);
    
    _putDontNest(result, 516, 679);
    
    _putDontNest(result, 738, 658);
    
    _putDontNest(result, 4450, 735);
    
    _putDontNest(result, 641, 672);
    
    _putDontNest(result, 725, 679);
    
    _putDontNest(result, 477, 506);
    
    _putDontNest(result, 552, 528);
    
    _putDontNest(result, 549, 528);
    
    _putDontNest(result, 516, 605);
    
    _putDontNest(result, 567, 721);
    
    _putDontNest(result, 542, 563);
    
    _putDontNest(result, 682, 707);
    
    _putDontNest(result, 367, 549);
    
    _putDontNest(result, 516, 589);
    
    _putDontNest(result, 367, 513);
    
    _putDontNest(result, 408, 614);
    
    _putDontNest(result, 576, 605);
    
    _putDontNest(result, 367, 413);
    
    _putDontNest(result, 509, 714);
    
    _putDontNest(result, 682, 693);
    
    _putDontNest(result, 509, 614);
    
    _putDontNest(result, 481, 573);
    
    _putDontNest(result, 528, 582);
    
    _putDontNest(result, 408, 487);
    
    _putDontNest(result, 468, 573);
    
    _putDontNest(result, 367, 535);
    
    _putDontNest(result, 576, 589);
    
    _putDontNest(result, 471, 496);
    
    _putDontNest(result, 538, 556);
    
    _putDontNest(result, 528, 686);
    
    _putDontNest(result, 427, 672);
    
    _putDontNest(result, 444, 528);
    
    _putDontNest(result, 703, 721);
    
    _putDontNest(result, 531, 614);
    
    _putDontNest(result, 542, 721);
    
    _putDontNest(result, 367, 432);
    
    _putDontNest(result, 513, 630);
    
    _putDontNest(result, 576, 679);
    
    _putDontNest(result, 496, 573);
    
    _putDontNest(result, 471, 693);
    
    _putDontNest(result, 589, 658);
    
    _putDontNest(result, 641, 700);
    
    _putDontNest(result, 689, 707);
    
    _putDontNest(result, 506, 623);
    
    _putDontNest(result, 633, 665);
    
    _putDontNest(result, 449, 556);
    
    _putDontNest(result, 696, 707);
    
    _putDontNest(result, 432, 707);
    
    _putDontNest(result, 453, 707);
    
    _putDontNest(result, 449, 542);
    
    _putDontNest(result, 453, 693);
    
    _putDontNest(result, 520, 614);
    
    _putDontNest(result, 367, 449);
    
    _putDontNest(result, 391, 496);
    
    _putDontNest(result, 427, 596);
    
    _putDontNest(result, 703, 735);
    
    _putDontNest(result, 542, 735);
    
    _putDontNest(result, 520, 714);
    
    _putDontNest(result, 360, 496);
    
    _putDontNest(result, 432, 693);
    
    _putDontNest(result, 567, 742);
    
    _putDontNest(result, 563, 528);
    
    _putDontNest(result, 696, 693);
    
    _putDontNest(result, 449, 637);
    
    _putDontNest(result, 717, 707);
    
    _putDontNest(result, 459, 459);
    
    _putDontNest(result, 542, 650);
    
    _putDontNest(result, 535, 542);
    
    _putDontNest(result, 395, 542);
    
    _putDontNest(result, 710, 693);
    
    _putDontNest(result, 459, 623);
    
    _putDontNest(result, 395, 637);
    
    _putDontNest(result, 689, 693);
    
    _putDontNest(result, 535, 637);
    
    _putDontNest(result, 376, 520);
    
    _putDontNest(result, 630, 679);
    
    _putDontNest(result, 608, 665);
    
    _putDontNest(result, 556, 707);
    
    _putDontNest(result, 506, 630);
    
    _putDontNest(result, 496, 506);
    
    _putDontNest(result, 542, 742);
    
    _putDontNest(result, 703, 742);
    
    _putDontNest(result, 427, 700);
    
    _putDontNest(result, 556, 693);
    
    _putDontNest(result, 535, 556);
    
    _putDontNest(result, 395, 556);
    
    _putDontNest(result, 459, 630);
    
    _putDontNest(result, 567, 735);
    
    _putDontNest(result, 710, 707);
    
    _putDontNest(result, 567, 650);
    
    _putDontNest(result, 646, 650);
    
    _putDontNest(result, 471, 707);
    
    _putDontNest(result, 717, 693);
    
    _putDontNest(result, 545, 528);
    
    _putDontNest(result, 427, 468);
    
    _putDontNest(result, 376, 449);
    
    _putDontNest(result, 545, 637);
    
    _putDontNest(result, 367, 520);
    
    _putDontNest(result, 633, 679);
    
    _putDontNest(result, 509, 707);
    
    _putDontNest(result, 408, 707);
    
    _putDontNest(result, 509, 693);
    
    _putDontNest(result, 626, 735);
    
    _putDontNest(result, 437, 573);
    
    _putDontNest(result, 563, 637);
    
    _putDontNest(result, 506, 563);
    
    _putDontNest(result, 626, 742);
    
    _putDontNest(result, 413, 477);
    
    _putDontNest(result, 563, 556);
    
    _putDontNest(result, 531, 707);
    
    _putDontNest(result, 459, 721);
    
    _putDontNest(result, 513, 742);
    
    _putDontNest(result, 738, 700);
    
    _putDontNest(result, 589, 672);
    
    _putDontNest(result, 661, 721);
    
    _putDontNest(result, 682, 714);
    
    _putDontNest(result, 408, 693);
    
    _putDontNest(result, 395, 528);
    
    _putDontNest(result, 535, 528);
    
    _putDontNest(result, 487, 573);
    
    _putDontNest(result, 608, 679);
    
    _putDontNest(result, 630, 665);
    
    _putDontNest(result, 413, 686);
    
    _putDontNest(result, 506, 721);
    
    _putDontNest(result, 626, 650);
    
    _putDontNest(result, 462, 573);
    
    _putDontNest(result, 449, 528);
    
    _putDontNest(result, 360, 487);
    
    _putDontNest(result, 545, 556);
    
    _putDontNest(result, 391, 487);
    
    _putDontNest(result, 513, 735);
    
    _putDontNest(result, 413, 582);
    
    _putDontNest(result, 531, 693);
    
    _putDontNest(result, 563, 542);
    
    _putDontNest(result, 487, 506);
    
    _putDontNest(result, 437, 506);
    
    _putDontNest(result, 360, 614);
    
    _putDontNest(result, 617, 707);
    
    _putDontNest(result, 391, 714);
    
    _putDontNest(result, 592, 714);
    
    _putDontNest(result, 513, 650);
    
    _putDontNest(result, 459, 563);
    
    _putDontNest(result, 360, 714);
    
    _putDontNest(result, 462, 506);
    
    _putDontNest(result, 592, 614);
    
    _putDontNest(result, 391, 614);
    
    _putDontNest(result, 545, 542);
    
    _putDontNest(result, 617, 693);
    
    _putDontNest(result, 437, 672);
    
    _putDontNest(result, 559, 630);
    
    _putDontNest(result, 605, 623);
    
    _putDontNest(result, 367, 420);
    
    _putDontNest(result, 650, 672);
    
    _putDontNest(result, 524, 700);
    
    _putDontNest(result, 614, 658);
    
    _putDontNest(result, 395, 496);
    
    _putDontNest(result, 400, 596);
    
    _putDontNest(result, 400, 468);
    
    _putDontNest(result, 545, 614);
    
    _putDontNest(result, 360, 556);
    
    _putDontNest(result, 596, 623);
    
    _putDontNest(result, 528, 563);
    
    _putDontNest(result, 487, 672);
    
    _putDontNest(result, 500, 679);
    
    _putDontNest(result, 462, 672);
    
    _putDontNest(result, 400, 700);
    
    _putDontNest(result, 538, 693);
    
    _putDontNest(result, 490, 596);
    
    _putDontNest(result, 420, 700);
    
    _putDontNest(result, 567, 686);
    
    _putDontNest(result, 376, 589);
    
    _putDontNest(result, 559, 623);
    
    _putDontNest(result, 538, 707);
    
    _putDontNest(result, 582, 700);
    
    _putDontNest(result, 542, 582);
    
    _putDontNest(result, 585, 596);
    
    _putDontNest(result, 376, 605);
    
    _putDontNest(result, 605, 630);
    
    _putDontNest(result, 360, 637);
    
    _putDontNest(result, 520, 528);
    
    _putDontNest(result, 391, 637);
    
    _putDontNest(result, 367, 437);
    
    _putDontNest(result, 592, 637);
    
    _putDontNest(result, 542, 686);
    
    _putDontNest(result, 703, 686);
    
    _putDontNest(result, 376, 679);
    
    _putDontNest(result, 596, 630);
    
    _putDontNest(result, 360, 542);
    
    _putDontNest(result, 490, 700);
    
    _putDontNest(result, 563, 614);
    
    _putDontNest(result, 420, 596);
    
    _putDontNest(result, 391, 542);
    
    _putDontNest(result, 496, 658);
    
    _putDontNest(result, 599, 665);
    
    _putDontNest(result, 528, 721);
    
    _putDontNest(result, 449, 496);
    
    _putDontNest(result, 573, 700);
    
    _putDontNest(result, 637, 679);
    
    _putDontNest(result, 563, 714);
    
    _putDontNest(result, 367, 665);
    
    _putDontNest(result, 500, 605);
    
    _putDontNest(result, 545, 714);
    
    _putDontNest(result, 675, 672);
    
    _putDontNest(result, 567, 582);
    
    _putDontNest(result, 420, 468);
    
    _putDontNest(result, 585, 700);
    
    _putDontNest(result, 524, 596);
    
    _putDontNest(result, 500, 589);
    
    _putDontNest(result, 391, 556);
    
    _putDontNest(result, 614, 672);
    
    _putDontNest(result, 516, 549);
    
    _putDontNest(result, 367, 679);
    
    _putDontNest(result, 376, 437);
    
    _putDontNest(result, 528, 623);
    
    _putDontNest(result, 481, 700);
    
    _putDontNest(result, 449, 714);
    
    _putDontNest(result, 413, 650);
    
    _putDontNest(result, 437, 658);
    
    _putDontNest(result, 516, 535);
    
    _putDontNest(result, 626, 686);
    
    _putDontNest(result, 395, 487);
    
    _putDontNest(result, 487, 658);
    
    _putDontNest(result, 599, 605);
    
    _putDontNest(result, 462, 658);
    
    _putDontNest(result, 605, 721);
    
    _putDontNest(result, 500, 665);
    
    _putDontNest(result, 367, 605);
    
    _putDontNest(result, 559, 721);
    
    _putDontNest(result, 481, 596);
    
    _putDontNest(result, 477, 468);
    
    _putDontNest(result, 468, 596);
    
    _putDontNest(result, 367, 589);
    
    _putDontNest(result, 650, 658);
    
    _putDontNest(result, 477, 700);
    
    _putDontNest(result, 520, 556);
    
    _putDontNest(result, 496, 672);
    
    _putDontNest(result, 413, 742);
    
    _putDontNest(result, 552, 693);
    
    _putDontNest(result, 549, 693);
    
    _putDontNest(result, 444, 707);
    
    _putDontNest(result, 520, 542);
    
    _putDontNest(result, 468, 700);
    
    _putDontNest(result, 449, 614);
    
    _putDontNest(result, 552, 707);
    
    _putDontNest(result, 549, 707);
    
    _putDontNest(result, 444, 693);
    
    _putDontNest(result, 520, 637);
    
    _putDontNest(result, 513, 686);
    
    _putDontNest(result, 559, 563);
    
    _putDontNest(result, 360, 528);
    
    _putDontNest(result, 449, 487);
    
    _putDontNest(result, 599, 679);
    
    _putDontNest(result, 637, 665);
    
    _putDontNest(result, 596, 721);
    
    _putDontNest(result, 528, 630);
    
    _putDontNest(result, 391, 528);
    
    _putDontNest(result, 376, 665);
    
    _putDontNest(result, 675, 658);
    
    _putDontNest(result, 535, 614);
    
    _putDontNest(result, 395, 614);
    
    _putDontNest(result, 413, 735);
    
    _putDontNest(result, 513, 582);
    
    _putDontNest(result, 376, 420);
    
    _putDontNest(result, 535, 714);
    
    _putDontNest(result, 395, 714);
    
    _putDontNest(result, 468, 468);
    
    _putDontNest(result, 477, 596);
    
    _putDontNest(result, 556, 573);
    
    _putDontNest(result, 500, 582);
    
    _putDontNest(result, 500, 686);
    
    _putDontNest(result, 400, 714);
    
    _putDontNest(result, 376, 582);
    
    _putDontNest(result, 496, 693);
    
    _putDontNest(result, 582, 714);
    
    _putDontNest(result, 630, 650);
    
    _putDontNest(result, 432, 506);
    
    _putDontNest(result, 559, 535);
    
    _putDontNest(result, 576, 721);
    
    _putDontNest(result, 513, 665);
    
    _putDontNest(result, 614, 707);
    
    _putDontNest(result, 630, 742);
    
    _putDontNest(result, 585, 714);
    
    _putDontNest(result, 477, 496);
    
    _putDontNest(result, 725, 721);
    
    _putDontNest(result, 585, 614);
    
    _putDontNest(result, 559, 549);
    
    _putDontNest(result, 567, 589);
    
    _putDontNest(result, 567, 605);
    
    _putDontNest(result, 516, 721);
    
    _putDontNest(result, 545, 700);
    
    _putDontNest(result, 538, 658);
    
    _putDontNest(result, 376, 477);
    
    _putDontNest(result, 563, 596);
    
    _putDontNest(result, 400, 487);
    
    _putDontNest(result, 420, 614);
    
    _putDontNest(result, 496, 707);
    
    _putDontNest(result, 420, 714);
    
    _putDontNest(result, 420, 487);
    
    _putDontNest(result, 400, 614);
    
    _putDontNest(result, 444, 672);
    
    _putDontNest(result, 567, 679);
    
    _putDontNest(result, 427, 528);
    
    _putDontNest(result, 552, 672);
    
    _putDontNest(result, 549, 672);
    
    _putDontNest(result, 524, 714);
    
    _putDontNest(result, 542, 589);
    
    _putDontNest(result, 432, 573);
    
    _putDontNest(result, 524, 614);
    
    _putDontNest(result, 630, 735);
    
    _putDontNest(result, 516, 563);
    
    _putDontNest(result, 471, 506);
    
    _putDontNest(result, 453, 573);
    
    _putDontNest(result, 545, 596);
    
    _putDontNest(result, 626, 665);
    
    _putDontNest(result, 582, 614);
    
    _putDontNest(result, 542, 605);
    
    _putDontNest(result, 468, 496);
    
    _putDontNest(result, 573, 614);
    
    _putDontNest(result, 490, 714);
    
    _putDontNest(result, 453, 506);
    
    _putDontNest(result, 563, 700);
    
    _putDontNest(result, 490, 614);
    
    _putDontNest(result, 471, 573);
    
    _putDontNest(result, 573, 714);
    
    _putDontNest(result, 376, 686);
    
    _putDontNest(result, 542, 679);
    
    _putDontNest(result, 703, 679);
    
    _putDontNest(result, 614, 693);
    
    _putDontNest(result, 637, 686);
    
    _putDontNest(result, 444, 658);
    
    _putDontNest(result, 675, 693);
    
    _putDontNest(result, 675, 707);
    
    _putDontNest(result, 437, 707);
    
    _putDontNest(result, 477, 487);
    
    _putDontNest(result, 633, 742);
    
    _putDontNest(result, 513, 679);
    
    _putDontNest(result, 576, 630);
    
    _putDontNest(result, 462, 693);
    
    _putDontNest(result, 395, 468);
    
    _putDontNest(result, 481, 714);
    
    _putDontNest(result, 468, 714);
    
    _putDontNest(result, 599, 686);
    
    _putDontNest(result, 413, 520);
    
    _putDontNest(result, 481, 614);
    
    _putDontNest(result, 437, 693);
    
    _putDontNest(result, 542, 665);
    
    _putDontNest(result, 516, 623);
    
    _putDontNest(result, 703, 665);
    
    _putDontNest(result, 487, 693);
    
    _putDontNest(result, 449, 700);
    
    _putDontNest(result, 468, 614);
    
    _putDontNest(result, 513, 589);
    
    _putDontNest(result, 531, 573);
    
    _putDontNest(result, 608, 735);
    
    _putDontNest(result, 408, 506);
    
    _putDontNest(result, 626, 679);
    
    _putDontNest(result, 449, 468);
    
    _putDontNest(result, 608, 650);
    
    _putDontNest(result, 395, 700);
    
    _putDontNest(result, 367, 477);
    
    _putDontNest(result, 528, 549);
    
    _putDontNest(result, 535, 700);
    
    _putDontNest(result, 513, 605);
    
    _putDontNest(result, 427, 556);
    
    _putDontNest(result, 400, 496);
    
    _putDontNest(result, 633, 735);
    
    _putDontNest(result, 427, 637);
    
    _putDontNest(result, 549, 658);
    
    _putDontNest(result, 552, 658);
    
    _putDontNest(result, 449, 596);
    
    _putDontNest(result, 567, 665);
    
    _putDontNest(result, 367, 582);
    
    _putDontNest(result, 633, 650);
    
    _putDontNest(result, 528, 535);
    
    _putDontNest(result, 427, 542);
    
    _putDontNest(result, 420, 496);
    
    _putDontNest(result, 608, 742);
    
    _putDontNest(result, 487, 707);
    
    _putDontNest(result, 462, 707);
    
    _putDontNest(result, 367, 686);
    
    _putDontNest(result, 535, 596);
    
    _putDontNest(result, 395, 596);
    
    _putDontNest(result, 650, 693);
    
    _putDontNest(result, 477, 714);
    
    _putDontNest(result, 516, 630);
    
    _putDontNest(result, 576, 623);
    
    _putDontNest(result, 477, 614);
    
    _putDontNest(result, 538, 672);
    
    _putDontNest(result, 509, 573);
    
    _putDontNest(result, 408, 573);
    
    _putDontNest(result, 650, 707);
    
    _putDontNest(result, 468, 487);
    
    _putDontNest(result, 453, 658);
    
    _putDontNest(result, 524, 528);
    
    _putDontNest(result, 696, 658);
    
    _putDontNest(result, 427, 614);
    
    _putDontNest(result, 459, 549);
    
    _putDontNest(result, 468, 637);
    
    _putDontNest(result, 376, 427);
    
    _putDontNest(result, 432, 658);
    
    _putDontNest(result, 641, 714);
    
    _putDontNest(result, 413, 665);
    
    _putDontNest(result, 630, 686);
    
    _putDontNest(result, 617, 672);
    
    _putDontNest(result, 717, 658);
    
    _putDontNest(result, 376, 742);
    
    _putDontNest(result, 500, 650);
    
    _putDontNest(result, 420, 528);
    
    _putDontNest(result, 427, 487);
    
    _putDontNest(result, 637, 742);
    
    _putDontNest(result, 500, 735);
    
    _putDontNest(result, 427, 714);
    
    _putDontNest(result, 520, 596);
    
    _putDontNest(result, 531, 672);
    
    _putDontNest(result, 400, 528);
    
    _putDontNest(result, 376, 391);
    
    _putDontNest(result, 477, 637);
    
    _putDontNest(result, 556, 658);
    
    _putDontNest(result, 459, 513);
    
    _putDontNest(result, 538, 573);
    
    _putDontNest(result, 509, 672);
    
    _putDontNest(result, 506, 535);
    
    _putDontNest(result, 589, 707);
    
    _putDontNest(result, 477, 542);
    
    _putDontNest(result, 468, 556);
    
    _putDontNest(result, 408, 672);
    
    _putDontNest(result, 481, 556);
    
    _putDontNest(result, 710, 658);
    
    _putDontNest(result, 459, 535);
    
    _putDontNest(result, 623, 721);
    
    _putDontNest(result, 637, 735);
    
    _putDontNest(result, 589, 693);
    
    _putDontNest(result, 490, 528);
    
    _putDontNest(result, 471, 658);
    
    _putDontNest(result, 376, 735);
    
    _putDontNest(result, 481, 637);
    
    _putDontNest(result, 506, 513);
    
    _putDontNest(result, 654, 721);
    
    _putDontNest(result, 637, 650);
    
    _putDontNest(result, 520, 700);
    
    _putDontNest(result, 376, 650);
    
    _putDontNest(result, 500, 742);
    
    _putDontNest(result, 477, 556);
    
    _putDontNest(result, 468, 542);
    
    _putDontNest(result, 689, 658);
    
    _putDontNest(result, 506, 549);
    
    _putDontNest(result, 481, 542);
    
    _putDontNest(result, 633, 686);
    
    _putDontNest(result, 453, 672);
    
    _putDontNest(result, 420, 556);
    
    _putDontNest(result, 367, 742);
    
    _putDontNest(result, 468, 528);
    
    _putDontNest(result, 367, 650);
    
    _putDontNest(result, 367, 427);
    
    _putDontNest(result, 710, 672);
    
    _putDontNest(result, 367, 735);
    
    _putDontNest(result, 585, 637);
    
    _putDontNest(result, 696, 672);
    
    _putDontNest(result, 549, 573);
    
    _putDontNest(result, 432, 672);
    
    _putDontNest(result, 420, 637);
    
    _putDontNest(result, 400, 542);
    
    _putDontNest(result, 552, 573);
    
    _putDontNest(result, 360, 468);
    
    _putDontNest(result, 531, 658);
    
    _putDontNest(result, 367, 391);
    
    _putDontNest(result, 444, 573);
    
    _putDontNest(result, 582, 637);
    
    _putDontNest(result, 391, 468);
    
    _putDontNest(result, 524, 542);
    
    _putDontNest(result, 608, 686);
    
    _putDontNest(result, 682, 700);
    
    _putDontNest(result, 717, 672);
    
    _putDontNest(result, 513, 520);
    
    _putDontNest(result, 400, 556);
    
    _putDontNest(result, 668, 721);
    
    _putDontNest(result, 524, 637);
    
    _putDontNest(result, 413, 679);
    
    _putDontNest(result, 623, 630);
    
    _putDontNest(result, 509, 658);
    
    _putDontNest(result, 391, 700);
    
    _putDontNest(result, 592, 700);
    
    _putDontNest(result, 490, 542);
    
    _putDontNest(result, 413, 589);
    
    _putDontNest(result, 444, 506);
    
    _putDontNest(result, 408, 658);
    
    _putDontNest(result, 360, 700);
    
    _putDontNest(result, 599, 735);
    
    _putDontNest(result, 573, 637);
    
    _putDontNest(result, 413, 605);
    
    _putDontNest(result, 490, 637);
    
    _putDontNest(result, 481, 528);
    
    _putDontNest(result, 556, 672);
    
    _putDontNest(result, 599, 650);
    
    _putDontNest(result, 689, 672);
    
    _putDontNest(result, 490, 556);
    
    _putDontNest(result, 471, 672);
    
    _putDontNest(result, 477, 528);
    
    _putDontNest(result, 420, 542);
    
    _putDontNest(result, 427, 496);
    
    _putDontNest(result, 400, 637);
    
    _putDontNest(result, 617, 658);
    
    _putDontNest(result, 360, 596);
    
    _putDontNest(result, 599, 742);
    
    _putDontNest(result, 391, 596);
    
    _putDontNest(result, 738, 714);
    
    _putDontNest(result, 592, 596);
    
    _putDontNest(result, 524, 556);
    
    _putDontNest(result, 545, 573);
    
    _putDontNest(result, 427, 693);
    
    _putDontNest(result, 400, 408);
    
    _putDontNest(result, 462, 556);
    
    _putDontNest(result, 462, 637);
    
    _putDontNest(result, 437, 542);
    
    _putDontNest(result, 641, 693);
    
    _putDontNest(result, 496, 528);
    
    _putDontNest(result, 592, 672);
    
    _putDontNest(result, 391, 672);
    
    _putDontNest(result, 542, 535);
    
    _putDontNest(result, 360, 672);
    
    _putDontNest(result, 559, 679);
    
    _putDontNest(result, 376, 459);
    
    _putDontNest(result, 641, 707);
    
    _putDontNest(result, 453, 596);
    
    _putDontNest(result, 500, 630);
    
    _putDontNest(result, 556, 700);
    
    _putDontNest(result, 432, 596);
    
    _putDontNest(result, 559, 589);
    
    _putDontNest(result, 376, 623);
    
    _putDontNest(result, 717, 700);
    
    _putDontNest(result, 682, 672);
    
    _putDontNest(result, 471, 596);
    
    _putDontNest(result, 367, 721);
    
    _putDontNest(result, 459, 520);
    
    _putDontNest(result, 437, 556);
    
    _putDontNest(result, 487, 556);
    
    _putDontNest(result, 559, 605);
    
    _putDontNest(result, 668, 742);
    
    _putDontNest(result, 506, 520);
    
    _putDontNest(result, 589, 614);
    
    _putDontNest(result, 589, 714);
    
    _putDontNest(result, 487, 637);
    
    _putDontNest(result, 376, 630);
    
    _putDontNest(result, 696, 700);
    
    _putDontNest(result, 596, 679);
    
    _putDontNest(result, 437, 637);
    
    _putDontNest(result, 599, 721);
    
    _putDontNest(result, 528, 665);
    
    _putDontNest(result, 556, 596);
    
    _putDontNest(result, 462, 542);
    
    _putDontNest(result, 432, 700);
    
    _putDontNest(result, 453, 700);
    
    _putDontNest(result, 487, 542);
    
    _putDontNest(result, 605, 679);
    
    _putDontNest(result, 427, 707);
    
    _putDontNest(result, 596, 605);
    
    _putDontNest(result, 367, 563);
    
    _putDontNest(result, 520, 658);
    
    _putDontNest(result, 689, 700);
    
    _putDontNest(result, 542, 549);
    
    _putDontNest(result, 668, 735);
    
    _putDontNest(result, 710, 700);
    
    _putDontNest(result, 500, 623);
    
    _putDontNest(result, 432, 468);
    
    _putDontNest(result, 471, 700);
    
    _putDontNest(result, 563, 573);
    
    _putDontNest(result, 738, 707);
    
    _putDontNest(result, 437, 528);
    
    _putDontNest(result, 599, 623);
    
    _putDontNest(result, 516, 686);
    
    _putDontNest(result, 509, 596);
    
    _putDontNest(result, 738, 693);
    
    _putDontNest(result, 513, 535);
    
    _putDontNest(result, 623, 742);
    
    _putDontNest(result, 496, 542);
    
    _putDontNest(result, 391, 658);
    
    _putDontNest(result, 592, 658);
    
    _putDontNest(result, 509, 700);
    
    _putDontNest(result, 528, 589);
    
    _putDontNest(result, 576, 582);
    
    _putDontNest(result, 408, 700);
    
    _putDontNest(result, 360, 658);
    
    _putDontNest(result, 637, 721);
    
    _putDontNest(result, 623, 735);
    
    _putDontNest(result, 682, 658);
    
    _putDontNest(result, 528, 679);
    
    _putDontNest(result, 596, 665);
    
    _putDontNest(result, 614, 637);
    
    _putDontNest(result, 535, 573);
    
    _putDontNest(result, 376, 721);
    
    _putDontNest(result, 395, 573);
    
    _putDontNest(result, 599, 630);
    
    _putDontNest(result, 500, 563);
    
    _putDontNest(result, 576, 686);
    
    _putDontNest(result, 449, 506);
    
    _putDontNest(result, 462, 528);
    
    _putDontNest(result, 408, 468);
    
    _putDontNest(result, 531, 700);
    
    _putDontNest(result, 654, 735);
    
    _putDontNest(result, 623, 650);
    
    _putDontNest(result, 367, 623);
    
    _putDontNest(result, 487, 528);
    
    _putDontNest(result, 408, 596);
    
    _putDontNest(result, 367, 630);
    
    _putDontNest(result, 725, 686);
    
    _putDontNest(result, 617, 700);
    
    _putDontNest(result, 500, 721);
    
    _putDontNest(result, 496, 556);
    
    _putDontNest(result, 376, 563);
    
    _putDontNest(result, 559, 665);
    
    _putDontNest(result, 531, 596);
    
    _putDontNest(result, 520, 672);
    
    _putDontNest(result, 654, 742);
    
    _putDontNest(result, 516, 582);
    
    _putDontNest(result, 513, 513);
    
    _putDontNest(result, 496, 637);
    
    _putDontNest(result, 395, 506);
    
    _putDontNest(result, 605, 665);
    
    _putDontNest(result, 528, 605);
    
    _putDontNest(result, 513, 549);
    
    _putDontNest(result, 367, 459);
    
    _putDontNest(result, 449, 573);
    
    _putDontNest(result, 437, 496);
    
    _putDontNest(result, 585, 707);
    
    _putDontNest(result, 582, 707);
    
    _putDontNest(result, 633, 721);
    
    _putDontNest(result, 524, 707);
    
    _putDontNest(result, 400, 693);
    
    _putDontNest(result, 496, 614);
    
    _putDontNest(result, 487, 496);
    
    _putDontNest(result, 573, 693);
    
    _putDontNest(result, 538, 596);
    
    _putDontNest(result, 520, 506);
    
    _putDontNest(result, 490, 693);
    
    _putDontNest(result, 367, 444);
    
    _putDontNest(result, 462, 496);
    
    _putDontNest(result, 506, 605);
    
    _putDontNest(result, 614, 714);
    
    _putDontNest(result, 506, 589);
    
    _putDontNest(result, 585, 693);
    
    _putDontNest(result, 459, 589);
    
    _putDontNest(result, 459, 605);
    
    _putDontNest(result, 490, 707);
    
    _putDontNest(result, 573, 707);
    
    _putDontNest(result, 535, 672);
    
    _putDontNest(result, 395, 672);
    
    _putDontNest(result, 545, 658);
    
    _putDontNest(result, 538, 700);
    
    _putDontNest(result, 420, 693);
    
    _putDontNest(result, 459, 679);
    
    _putDontNest(result, 449, 672);
    
    _putDontNest(result, 496, 487);
    
    _putDontNest(result, 506, 679);
    
    _putDontNest(result, 608, 721);
    
    _putDontNest(result, 400, 707);
    
    _putDontNest(result, 520, 573);
    
    _putDontNest(result, 524, 693);
    
    _putDontNest(result, 630, 630);
    
    _putDontNest(result, 668, 686);
    
    _putDontNest(result, 661, 679);
    
    _putDontNest(result, 582, 693);
    
    _putDontNest(result, 563, 658);
    
    _putDontNest(result, 496, 714);
    
    _putDontNest(result, 420, 707);
    
    _putDontNest(result, 462, 487);
    
    _putDontNest(result, 437, 487);
    
    _putDontNest(result, 725, 742);
    
    _putDontNest(result, 516, 742);
    
    _putDontNest(result, 608, 623);
    
    _putDontNest(result, 563, 672);
    
    _putDontNest(result, 725, 735);
    
    _putDontNest(result, 376, 444);
    
    _putDontNest(result, 516, 735);
    
    _putDontNest(result, 650, 714);
    
    _putDontNest(result, 477, 693);
    
    _putDontNest(result, 413, 549);
    
    _putDontNest(result, 576, 650);
    
    _putDontNest(result, 477, 707);
    
    _putDontNest(result, 654, 686);
    
    _putDontNest(result, 413, 513);
    
    _putDontNest(result, 395, 658);
    
    _putDontNest(result, 535, 658);
    
    _putDontNest(result, 487, 487);
    
    _putDontNest(result, 487, 714);
    
    _putDontNest(result, 589, 637);
    
    _putDontNest(result, 576, 735);
    
    _putDontNest(result, 391, 506);
    
    _putDontNest(result, 462, 614);
    
    _putDontNest(result, 437, 714);
    
    _putDontNest(result, 444, 700);
    
    _putDontNest(result, 487, 614);
    
    _putDontNest(result, 468, 693);
    
    _putDontNest(result, 360, 506);
    
    _putDontNest(result, 481, 693);
    
    _putDontNest(result, 437, 614);
    
    _putDontNest(result, 623, 686);
    
    _putDontNest(result, 462, 714);
    
    _putDontNest(result, 449, 658);
    
    _putDontNest(result, 506, 665);
    
    _putDontNest(result, 630, 721);
    
    _putDontNest(result, 496, 496);
    
    _putDontNest(result, 608, 630);
    
    _putDontNest(result, 552, 596);
    
    _putDontNest(result, 549, 596);
    
    _putDontNest(result, 444, 468);
    
    _putDontNest(result, 545, 672);
    
    _putDontNest(result, 661, 665);
    
    _putDontNest(result, 592, 573);
    
    _putDontNest(result, 391, 573);
    
    _putDontNest(result, 360, 573);
    
    _putDontNest(result, 675, 714);
    
    _putDontNest(result, 459, 665);
    
    _putDontNest(result, 444, 596);
    
    _putDontNest(result, 4450, 323);
    
    _putDontNest(result, 576, 742);
    
    _putDontNest(result, 413, 535);
    
    _putDontNest(result, 481, 707);
    
    _putDontNest(result, 516, 650);
    
    _putDontNest(result, 549, 700);
    
    _putDontNest(result, 552, 700);
    
    _putDontNest(result, 468, 707);
    
    _putDontNest(result, 444, 513);
    
    _putDontNest(result, 444, 549);
    
    _putDontNest(result, 413, 700);
    
    _putDontNest(result, 725, 693);
    
    _putDontNest(result, 605, 672);
    
    _putDontNest(result, 596, 672);
    
    _putDontNest(result, 437, 459);
    
    _putDontNest(result, 738, 686);
    
    _putDontNest(result, 481, 742);
    
    _putDontNest(result, 608, 614);
    
    _putDontNest(result, 592, 605);
    
    _putDontNest(result, 391, 605);
    
    _putDontNest(result, 608, 714);
    
    _putDontNest(result, 360, 605);
    
    _putDontNest(result, 360, 589);
    
    _putDontNest(result, 549, 535);
    
    _putDontNest(result, 449, 520);
    
    _putDontNest(result, 552, 535);
    
    _putDontNest(result, 682, 679);
    
    _putDontNest(result, 528, 658);
    
    _putDontNest(result, 496, 721);
    
    _putDontNest(result, 592, 589);
    
    _putDontNest(result, 477, 742);
    
    _putDontNest(result, 500, 556);
    
    _putDontNest(result, 391, 589);
    
    _putDontNest(result, 516, 707);
    
    _putDontNest(result, 481, 650);
    
    _putDontNest(result, 360, 679);
    
    _putDontNest(result, 376, 542);
    
    _putDontNest(result, 468, 650);
    
    _putDontNest(result, 592, 679);
    
    _putDontNest(result, 391, 679);
    
    _putDontNest(result, 614, 721);
    
    _putDontNest(result, 376, 637);
    
    _putDontNest(result, 481, 735);
    
    _putDontNest(result, 395, 520);
    
    _putDontNest(result, 437, 630);
    
    _putDontNest(result, 487, 630);
    
    _putDontNest(result, 468, 735);
    
    _putDontNest(result, 576, 693);
    
    _putDontNest(result, 413, 468);
    
    _putDontNest(result, 520, 665);
    
    _putDontNest(result, 462, 630);
    
    _putDontNest(result, 559, 672);
    
    _putDontNest(result, 725, 707);
    
    _putDontNest(result, 637, 637);
    
    _putDontNest(result, 576, 707);
    
    _putDontNest(result, 477, 650);
    
    _putDontNest(result, 496, 563);
    
    _putDontNest(result, 376, 556);
    
    _putDontNest(result, 477, 735);
    
    _putDontNest(result, 462, 623);
    
    _putDontNest(result, 413, 596);
    
    _putDontNest(result, 367, 528);
    
    _putDontNest(result, 487, 623);
    
    _putDontNest(result, 516, 693);
    
    _putDontNest(result, 437, 623);
    
    _putDontNest(result, 444, 535);
    
    _putDontNest(result, 500, 637);
    
    _putDontNest(result, 633, 714);
    
    _putDontNest(result, 549, 549);
    
    _putDontNest(result, 552, 549);
    
    _putDontNest(result, 500, 542);
    
    _putDontNest(result, 468, 742);
    
    _putDontNest(result, 496, 623);
    
    _putDontNest(result, 459, 573);
    
    _putDontNest(result, 524, 742);
    
    _putDontNest(result, 582, 650);
    
    _putDontNest(result, 630, 714);
    
    _putDontNest(result, 585, 742);
    
    _putDontNest(result, 582, 735);
    
    _putDontNest(result, 395, 449);
    
    _putDontNest(result, 400, 735);
    
    _putDontNest(result, 500, 528);
    
    _putDontNest(result, 420, 650);
    
    _putDontNest(result, 360, 437);
    
    _putDontNest(result, 585, 735);
    
    _putDontNest(result, 559, 658);
    
    _putDontNest(result, 367, 637);
    
    _putDontNest(result, 538, 549);
    
    _putDontNest(result, 585, 650);
    
    _putDontNest(result, 614, 623);
    
    _putDontNest(result, 367, 542);
    
    _putDontNest(result, 650, 721);
    
    _putDontNest(result, 427, 582);
    
    _putDontNest(result, 582, 742);
    
    _putDontNest(result, 420, 742);
    
    _putDontNest(result, 391, 665);
    
    _putDontNest(result, 490, 735);
    
    _putDontNest(result, 592, 665);
    
    _putDontNest(result, 376, 528);
    
    _putDontNest(result, 573, 735);
    
    _putDontNest(result, 360, 665);
    
    _putDontNest(result, 538, 535);
    
    _putDontNest(result, 400, 742);
    
    _putDontNest(result, 520, 679);
    
    _putDontNest(result, 487, 721);
    
    _putDontNest(result, 614, 630);
    
    _putDontNest(result, 599, 637);
    
    _putDontNest(result, 437, 721);
    
    _putDontNest(result, 490, 650);
    
    _putDontNest(result, 506, 573);
    
    _putDontNest(result, 367, 556);
    
    _putDontNest(result, 427, 477);
    
    _putDontNest(result, 605, 658);
    
    _putDontNest(result, 462, 721);
    
    _putDontNest(result, 573, 650);
    
    _putDontNest(result, 524, 735);
    
    _putDontNest(result, 520, 589);
    
    _putDontNest(result, 524, 650);
    
    _putDontNest(result, 682, 665);
    
    _putDontNest(result, 360, 420);
    
    _putDontNest(result, 596, 658);
    
    _putDontNest(result, 496, 630);
    
    _putDontNest(result, 506, 506);
    
    _putDontNest(result, 641, 686);
    
    _putDontNest(result, 675, 721);
    
    _putDontNest(result, 520, 605);
    
    _putDontNest(result, 400, 427);
    
    _putDontNest(result, 459, 506);
    
    _putDontNest(result, 573, 742);
    
    _putDontNest(result, 462, 563);
    
    _putDontNest(result, 427, 686);
    
    _putDontNest(result, 400, 650);
    
    _putDontNest(result, 528, 672);
    
    _putDontNest(result, 487, 563);
    
    _putDontNest(result, 437, 563);
    
    _putDontNest(result, 420, 735);
    
    _putDontNest(result, 490, 742);
    
    _putDontNest(result, 367, 614);
    
    _putDontNest(result, 391, 520);
    
    _putDontNest(result, 531, 535);
    
    _putDontNest(result, 738, 735);
    
    _putDontNest(result, 513, 596);
    
    _putDontNest(result, 509, 535);
    
    _putDontNest(result, 654, 707);
    
    _putDontNest(result, 408, 535);
    
    _putDontNest(result, 367, 487);
    
    _putDontNest(result, 506, 672);
    
    _putDontNest(result, 477, 686);
    
    _putDontNest(result, 545, 665);
    
    _putDontNest(result, 623, 707);
    
    _putDontNest(result, 661, 672);
    
    _putDontNest(result, 367, 714);
    
    _putDontNest(result, 535, 589);
    
    _putDontNest(result, 395, 589);
    
    _putDontNest(result, 509, 549);
    
    _putDontNest(result, 599, 614);
    
    _putDontNest(result, 738, 742);
    
    _putDontNest(result, 408, 513);
    
    _putDontNest(result, 623, 693);
    
    _putDontNest(result, 589, 721);
    
    _putDontNest(result, 481, 686);
    
    _putDontNest(result, 408, 549);
    
    _putDontNest(result, 599, 714);
    
    _putDontNest(result, 468, 686);
    
    _putDontNest(result, 563, 665);
    
    _putDontNest(result, 459, 672);
    
    _putDontNest(result, 449, 679);
    
    _putDontNest(result, 654, 693);
    
    _putDontNest(result, 513, 700);
    
    _putDontNest(result, 376, 496);
    
    _putDontNest(result, 535, 605);
    
    _putDontNest(result, 395, 605);
    
    _putDontNest(result, 531, 549);
    
    _putDontNest(result, 449, 589);
    
    _putDontNest(result, 360, 520);
    
    _putDontNest(result, 535, 679);
    
    _putDontNest(result, 630, 637);
    
    _putDontNest(result, 395, 679);
    
    _putDontNest(result, 468, 582);
    
    _putDontNest(result, 449, 605);
    
    _putDontNest(result, 477, 477);
    
    _putDontNest(result, 626, 700);
    
    _putDontNest(result, 481, 582);
    
    _putDontNest(result, 528, 573);
    
    _putDontNest(result, 477, 582);
    
    _putDontNest(result, 468, 477);
    
    _putDontNest(result, 559, 573);
    
    _putDontNest(result, 400, 582);
    
    _putDontNest(result, 668, 707);
    
    _putDontNest(result, 585, 582);
    
    _putDontNest(result, 500, 614);
    
    _putDontNest(result, 453, 513);
    
    _putDontNest(result, 376, 487);
    
    _putDontNest(result, 400, 477);
    
    _putDontNest(result, 573, 686);
    
    _putDontNest(result, 542, 700);
    
    _putDontNest(result, 703, 700);
    
    _putDontNest(result, 427, 742);
    
    _putDontNest(result, 449, 665);
    
    _putDontNest(result, 567, 596);
    
    _putDontNest(result, 506, 658);
    
    _putDontNest(result, 490, 686);
    
    _putDontNest(result, 589, 623);
    
    _putDontNest(result, 420, 582);
    
    _putDontNest(result, 367, 496);
    
    _putDontNest(result, 459, 658);
    
    _putDontNest(result, 641, 742);
    
    _putDontNest(result, 471, 535);
    
    _putDontNest(result, 360, 449);
    
    _putDontNest(result, 556, 549);
    
    _putDontNest(result, 585, 686);
    
    _putDontNest(result, 545, 679);
    
    _putDontNest(result, 427, 650);
    
    _putDontNest(result, 432, 535);
    
    _putDontNest(result, 400, 686);
    
    _putDontNest(result, 545, 589);
    
    _putDontNest(result, 453, 535);
    
    _putDontNest(result, 395, 437);
    
    _putDontNest(result, 545, 605);
    
    _putDontNest(result, 500, 714);
    
    _putDontNest(result, 427, 735);
    
    _putDontNest(result, 542, 596);
    
    _putDontNest(result, 420, 686);
    
    _putDontNest(result, 567, 700);
    
    _putDontNest(result, 641, 735);
    
    _putDontNest(result, 432, 549);
    
    _putDontNest(result, 490, 582);
    
    _putDontNest(result, 453, 549);
    
    _putDontNest(result, 563, 605);
    
    _putDontNest(result, 432, 513);
    
    _putDontNest(result, 582, 686);
    
    _putDontNest(result, 608, 637);
    
    _putDontNest(result, 520, 520);
    
    _putDontNest(result, 563, 589);
    
    _putDontNest(result, 641, 650);
    
    _putDontNest(result, 395, 665);
    
    _putDontNest(result, 535, 665);
    
    _putDontNest(result, 668, 693);
    
    _putDontNest(result, 524, 686);
    
    _putDontNest(result, 420, 477);
    
    _putDontNest(result, 471, 513);
    
    _putDontNest(result, 376, 614);
    
    _putDontNest(result, 395, 420);
    
    _putDontNest(result, 563, 679);
    
    _putDontNest(result, 637, 714);
    
    _putDontNest(result, 661, 658);
    
    _putDontNest(result, 556, 535);
    
    _putDontNest(result, 376, 714);
    
    _putDontNest(result, 471, 549);
    
    _putDontNest(result, 589, 630);
    
    _putDontNest(result, 524, 582);
    
    _putDontNest(result, 437, 686);
    
    _putDontNest(result, 654, 714);
    
    _putDontNest(result, 513, 658);
    
    _putDontNest(result, 360, 413);
    
    _putDontNest(result, 427, 721);
    
    _putDontNest(result, 391, 535);
    
    _putDontNest(result, 437, 477);
    
    _putDontNest(result, 650, 686);
    
    _putDontNest(result, 360, 432);
    
    _putDontNest(result, 367, 693);
    
    _putDontNest(result, 413, 573);
    
    _putDontNest(result, 599, 693);
    
    _putDontNest(result, 623, 714);
    
    _putDontNest(result, 462, 686);
    
    _putDontNest(result, 367, 707);
    
    _putDontNest(result, 427, 563);
    
    _putDontNest(result, 487, 686);
    
    _putDontNest(result, 626, 658);
    
    _putDontNest(result, 408, 520);
    
    _putDontNest(result, 567, 672);
    
    _putDontNest(result, 444, 679);
    
    _putDontNest(result, 444, 589);
    
    _putDontNest(result, 400, 444);
    
    _putDontNest(result, 413, 506);
    
    _putDontNest(result, 641, 721);
    
    _putDontNest(result, 675, 686);
    
    _putDontNest(result, 360, 513);
    
    _putDontNest(result, 391, 549);
    
    _putDontNest(result, 462, 582);
    
    _putDontNest(result, 391, 513);
    
    _putDontNest(result, 437, 582);
    
    _putDontNest(result, 360, 549);
    
    _putDontNest(result, 487, 582);
    
    _putDontNest(result, 444, 605);
    
    _putDontNest(result, 549, 605);
    
    _putDontNest(result, 552, 605);
    
    _putDontNest(result, 538, 665);
    
    _putDontNest(result, 552, 589);
    
    _putDontNest(result, 549, 589);
    
    _putDontNest(result, 360, 535);
    
    _putDontNest(result, 542, 672);
    
    _putDontNest(result, 703, 672);
    
    _putDontNest(result, 552, 679);
    
    _putDontNest(result, 549, 679);
    
    _putDontNest(result, 516, 528);
    
    _putDontNest(result, 599, 707);
    
    _putDontNest(result, 637, 707);
    
    _putDontNest(result, 516, 542);
    
    _putDontNest(result, 589, 742);
    
    _putDontNest(result, 738, 721);
    
    _putDontNest(result, 459, 700);
    
    _putDontNest(result, 427, 630);
    
    _putDontNest(result, 500, 707);
    
    _putDontNest(result, 506, 700);
    
    _putDontNest(result, 661, 700);
    
    _putDontNest(result, 376, 693);
    
    _putDontNest(result, 576, 637);
    
    _putDontNest(result, 496, 582);
    
    _putDontNest(result, 471, 520);
    
    _putDontNest(result, 516, 556);
    
    _putDontNest(result, 516, 637);
    
    _putDontNest(result, 459, 468);
    
    _putDontNest(result, 538, 589);
    
    _putDontNest(result, 376, 707);
    
    _putDontNest(result, 626, 672);
    
    _putDontNest(result, 520, 535);
    
    _putDontNest(result, 538, 679);
    
    _putDontNest(result, 513, 672);
    
    _putDontNest(result, 500, 693);
    
    _putDontNest(result, 496, 686);
    
    _putDontNest(result, 520, 513);
    
    _putDontNest(result, 703, 658);
    
    _putDontNest(result, 542, 658);
    
    _putDontNest(result, 520, 549);
    
    _putDontNest(result, 453, 520);
    
    _putDontNest(result, 668, 714);
    
    _putDontNest(result, 432, 520);
    
    _putDontNest(result, 427, 623);
    
    _putDontNest(result, 589, 735);
    
    _putDontNest(result, 614, 686);
    
    _putDontNest(result, 427, 459);
    
    _putDontNest(result, 637, 693);
    
    _putDontNest(result, 589, 650);
    
    _putDontNest(result, 459, 596);
    
    _putDontNest(result, 444, 665);
    
    _putDontNest(result, 567, 658);
    
    _putDontNest(result, 506, 596);
    
    _putDontNest(result, 549, 665);
    
    _putDontNest(result, 552, 665);
    
    _putDontNest(result, 538, 605);
    
    _putDontNest(result, 367, 408);
    
    _putDontNest(result, 395, 432);
    
    _putDontNest(result, 462, 742);
    
    _putDontNest(result, 608, 693);
    
    _putDontNest(result, 633, 707);
    
    _putDontNest(result, 513, 506);
    
    _putDontNest(result, 531, 679);
    
    _putDontNest(result, 585, 721);
    
    _putDontNest(result, 725, 714);
    
    _putDontNest(result, 528, 596);
    
    _putDontNest(result, 633, 693);
    
    _putDontNest(result, 468, 459);
    
    _putDontNest(result, 420, 721);
    
    _putDontNest(result, 449, 535);
    
    _putDontNest(result, 608, 707);
    
    _putDontNest(result, 400, 721);
    
    _putDontNest(result, 487, 742);
    
    _putDontNest(result, 556, 665);
    
    _putDontNest(result, 437, 742);
    
    _putDontNest(result, 490, 563);
    
    _putDontNest(result, 524, 721);
    
    _putDontNest(result, 449, 513);
    
    _putDontNest(result, 513, 573);
    
    _putDontNest(result, 531, 589);
    
    _putDontNest(result, 449, 549);
    
    _putDontNest(result, 477, 459);
    
    _putDontNest(result, 689, 665);
    
    _putDontNest(result, 408, 679);
    
    _putDontNest(result, 444, 520);
    
    _putDontNest(result, 650, 742);
    
    _putDontNest(result, 531, 605);
    
    _putDontNest(result, 710, 665);
    
    _putDontNest(result, 582, 721);
    
    _putDontNest(result, 471, 665);
    
    _putDontNest(result, 675, 735);
    
    _putDontNest(result, 509, 679);
    
    _putDontNest(result, 400, 563);
    
    _putDontNest(result, 408, 589);
    
    _putDontNest(result, 487, 650);
    
    _putDontNest(result, 395, 513);
    
    _putDontNest(result, 413, 658);
    
    _putDontNest(result, 437, 650);
    
    _putDontNest(result, 490, 721);
    
    _putDontNest(result, 573, 721);
    
    _putDontNest(result, 535, 549);
    
    _putDontNest(result, 528, 700);
    
    _putDontNest(result, 462, 650);
    
    _putDontNest(result, 395, 549);
    
    _putDontNest(result, 509, 589);
    
    _putDontNest(result, 696, 665);
    
    _putDontNest(result, 509, 605);
    
    _putDontNest(result, 432, 665);
    
    _putDontNest(result, 487, 735);
    
    _putDontNest(result, 468, 630);
    
    _putDontNest(result, 576, 714);
    
    _putDontNest(result, 437, 735);
    
    _putDontNest(result, 420, 563);
    
    _putDontNest(result, 481, 630);
    
    _putDontNest(result, 408, 605);
    
    _putDontNest(result, 477, 623);
    
    _putDontNest(result, 462, 735);
    
    _putDontNest(result, 453, 665);
    
    _putDontNest(result, 576, 614);
    
    _putDontNest(result, 535, 535);
    
    _putDontNest(result, 395, 535);
    
    _putDontNest(result, 477, 630);
    
    _putDontNest(result, 516, 714);
    
    _putDontNest(result, 675, 742);
    
    _putDontNest(result, 717, 665);
    
    _putDontNest(result, 524, 563);
    
    _putDontNest(result, 650, 735);
    
    _putDontNest(result, 516, 614);
    
    _putDontNest(result, 395, 413);
    
    _putDontNest(result, 481, 623);
    
    _putDontNest(result, 617, 679);
    
    _putDontNest(result, 468, 623);
    
    _putDontNest(result, 545, 549);
    
    _putDontNest(result, 468, 563);
    
    _putDontNest(result, 556, 679);
    
    _putDontNest(result, 490, 623);
    
    _putDontNest(result, 573, 630);
    
    _putDontNest(result, 585, 623);
    
    _putDontNest(result, 623, 637);
    
    _putDontNest(result, 400, 623);
    
    _putDontNest(result, 582, 630);
    
    _putDontNest(result, 376, 408);
    
    _putDontNest(result, 509, 665);
    
    _putDontNest(result, 432, 605);
    
    _putDontNest(result, 471, 679);
    
    _putDontNest(result, 408, 665);
    
    _putDontNest(result, 563, 549);
    
    _putDontNest(result, 453, 605);
    
    _putDontNest(result, 710, 679);
    
    _putDontNest(result, 496, 735);
    
    _putDontNest(result, 524, 623);
    
    _putDontNest(result, 420, 630);
    
    _putDontNest(result, 481, 563);
    
    _putDontNest(result, 614, 742);
    
    _putDontNest(result, 559, 700);
    
    _putDontNest(result, 630, 707);
    
    _putDontNest(result, 582, 623);
    
    _putDontNest(result, 4450, 346);
    
    _putDontNest(result, 563, 535);
    
    _putDontNest(result, 400, 630);
    
    _putDontNest(result, 585, 630);
    
    _putDontNest(result, 556, 589);
    
    _putDontNest(result, 573, 623);
    
    _putDontNest(result, 567, 573);
    
    _putDontNest(result, 617, 665);
    
    _putDontNest(result, 413, 672);
    
    _putDontNest(result, 496, 742);
    
    _putDontNest(result, 477, 721);
    
    _putDontNest(result, 556, 605);
    
    _putDontNest(result, 717, 679);
    
    _putDontNest(result, 400, 459);
    
    _putDontNest(result, 614, 650);
    
    _putDontNest(result, 490, 630);
    
    _putDontNest(result, 596, 700);
    
    _putDontNest(result, 696, 679);
    
    _putDontNest(result, 471, 589);
    
    _putDontNest(result, 531, 665);
    
    _putDontNest(result, 559, 596);
    
    _putDontNest(result, 614, 735);
    
    _putDontNest(result, 589, 686);
    
    _putDontNest(result, 481, 721);
    
    _putDontNest(result, 468, 721);
    
    _putDontNest(result, 420, 459);
    
    _putDontNest(result, 453, 679);
    
    _putDontNest(result, 471, 605);
    
    _putDontNest(result, 432, 679);
    
    _putDontNest(result, 630, 693);
    
    _putDontNest(result, 689, 679);
    
    _putDontNest(result, 545, 535);
    
    _putDontNest(result, 420, 623);
    
    _putDontNest(result, 524, 630);
    
    _putDontNest(result, 453, 589);
    
    _putDontNest(result, 432, 589);
    
    _putDontNest(result, 605, 700);
    
    _putDontNest(result, 542, 573);
    
    _putDontNest(result, 477, 563);
    
    _putDontNest(result, 496, 650);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(4450, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(641, resultStoreId);
    result.putUnsafe(633, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(567, resultStoreId);
    result.putUnsafe(592, resultStoreId);
    result.putUnsafe(585, resultStoreId);
    result.putUnsafe(576, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4071, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(646, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(623, resultStoreId);
    result.putUnsafe(630, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(360, resultStoreId);
    result.putUnsafe(376, resultStoreId);
    result.putUnsafe(367, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(496, resultStoreId);
    result.putUnsafe(453, resultStoreId);
    result.putUnsafe(471, resultStoreId);
    result.putUnsafe(487, resultStoreId);
    result.putUnsafe(462, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5592, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(513, resultStoreId);
    result.putUnsafe(506, resultStoreId);
    result.putUnsafe(520, resultStoreId);
    result.putUnsafe(481, resultStoreId);
    result.putUnsafe(490, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(596, resultStoreId);
    result.putUnsafe(589, resultStoreId);
    result.putUnsafe(599, resultStoreId);
    result.putUnsafe(582, resultStoreId);
    result.putUnsafe(573, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(605, resultStoreId);
    result.putUnsafe(608, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(617, resultStoreId);
    result.putUnsafe(614, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(395, resultStoreId);
    result.putUnsafe(400, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(626, resultStoreId);
    result.putUnsafe(637, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(725, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(542, resultStoreId);
    result.putUnsafe(559, resultStoreId);
    result.putUnsafe(528, resultStoreId);
    result.putUnsafe(535, resultStoreId);
    result.putUnsafe(556, resultStoreId);
    result.putUnsafe(538, resultStoreId);
    result.putUnsafe(524, resultStoreId);
    result.putUnsafe(516, resultStoreId);
    result.putUnsafe(500, resultStoreId);
    result.putUnsafe(545, resultStoreId);
    result.putUnsafe(563, resultStoreId);
    result.putUnsafe(509, resultStoreId);
    result.putUnsafe(531, resultStoreId);
    result.putUnsafe(549, resultStoreId);
    result.putUnsafe(552, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(413, resultStoreId);
    result.putUnsafe(459, resultStoreId);
    result.putUnsafe(449, resultStoreId);
    result.putUnsafe(408, resultStoreId);
    result.putUnsafe(432, resultStoreId);
    result.putUnsafe(444, resultStoreId);
    result.putUnsafe(437, resultStoreId);
    result.putUnsafe(427, resultStoreId);
    result.putUnsafe(420, resultStoreId);
    result.putUnsafe(477, resultStoreId);
    result.putUnsafe(468, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(703, resultStoreId);
    result.putUnsafe(661, resultStoreId);
    result.putUnsafe(682, resultStoreId);
    result.putUnsafe(738, resultStoreId);
    result.putUnsafe(668, resultStoreId);
    result.putUnsafe(654, resultStoreId);
    result.putUnsafe(696, resultStoreId);
    result.putUnsafe(710, resultStoreId);
    result.putUnsafe(689, resultStoreId);
    result.putUnsafe(717, resultStoreId);
    result.putUnsafe(650, resultStoreId);
    result.putUnsafe(675, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(391, resultStoreId);
      
    return result;
  }
  
  protected boolean hasNestingRestrictions(java.lang.String name){
		return (_dontNest.size() != 0); // TODO Make more specific.
  }
    
  protected IntegerList getFilteredParents(int childId) {
		return _dontNest.get(childId);
  }
    
  // initialize priorities     
  static {
    _dontNest = _initDontNest();
    _resultStoreIdMappings = _initDontNestGroups();
  }
    
  // Production declarations
	
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_97_114_97_109_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Param\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"^\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit___33__char_class___range__33_33_ = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_export_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"export\")],{})", Factory.Production);
  private static final IConstructor prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"property\",sort(\"PropertyAssignment\")),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_import_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"import\")],{})", Factory.Production);
  private static final IConstructor prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"this\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__LetOrConst__lit_let_ = (IConstructor) _read("prod(sort(\"LetOrConst\"),[lit(\"let\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_implements_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"implements\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_ = (IConstructor) _read("prod(lex(\"RegularExpressionFlags\"),[conditional(\\iter-star(\\char-class([range(65,90),range(97,122)])),{\\not-follow(\\char-class([range(65,90),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_protected_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"protected\")],{})", Factory.Production);
  private static final IConstructor prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"expression\",sort(\"Statement\")),[conditional(sort(\"Expression\"),{except(\"class\"),except(\"function\")}),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Param__Id_ = (IConstructor) _read("prod(sort(\"Param\"),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor regular__opt__ExponentPart = (IConstructor) _read("regular(opt(lex(\"ExponentPart\")))", Factory.Production);
  private static final IConstructor prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_ = (IConstructor) _read("prod(lex(\"SingleEscapeCharacter\"),[\\char-class([range(34,34),range(39,39),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116),range(118,118)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42__char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"*\"),[\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_ = (IConstructor) _read("prod(lex(\"HexInteger\"),[\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),conditional(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),{\\not-follow(\\char-class([range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"new\"),[\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"interface\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__char_class___range__48_48_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[conditional(\\char-class([range(48,48)]),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyName\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(78,78)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Source\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Source\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Source\")))})", Factory.Production);
  private static final IConstructor prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"extends\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"switchCase\",sort(\"Statement\")),[lit(\"switch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"clauses\",\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_let__char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"let\"),[\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CharacterEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CharacterEscapeSequence\")))})", Factory.Production);
  private static final IConstructor regular__iter_star__RegularExpressionClassChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionClassChar\")))", Factory.Production);
  private static final IConstructor prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\\>\"),{\\not-follow(\\char-class([range(62,62)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"short\"),[\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"var\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"neq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"!=\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"not\",sort(\"Expression\")),[conditional(lit(\"!\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_int_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"int\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CommentChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Statement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"synchronized\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"throwNoExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"preDecr\",sort(\"Expression\")),[lit(\"--\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryCatch\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit___126__char_class___range__126_126_ = (IConstructor) _read("prod(lit(\"~\"),[\\char-class([range(126,126)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__UnicodeEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[sort(\"UnicodeEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnNoExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"NonEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LAYOUT\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"LAYOUT\")))})", Factory.Production);
  private static final IConstructor prod__CommentChar__char_class___range__42_42_ = (IConstructor) _read("prod(lex(\"CommentChar\"),[conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))})],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionChar\"))))})", Factory.Production);
  private static final IConstructor prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"binNeg\",sort(\"Expression\")),[lit(\"~\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__DoubleStringChar = (IConstructor) _read("regular(\\iter-star(lex(\"DoubleStringChar\")))", Factory.Production);
  private static final IConstructor prod__Reserved__lit_function_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"function\")],{})", Factory.Production);
  private static final IConstructor prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"abstract\"),[\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"objectDefinition\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"protected\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Decimal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalInteger__char_class___range__48_48_ = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(48,48)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_double_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"double\")],{})", Factory.Production);
  private static final IConstructor prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakNoLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionChar\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ExponentPart\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"ExponentPart\")))})", Factory.Production);
  private static final IConstructor prod__lit_in__char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_switch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"switch\")],{})", Factory.Production);
  private static final IConstructor prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"with\"),[\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61__char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"String\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"String\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"String\")))})", Factory.Production);
  private static final IConstructor prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFirstChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFirstChar\")))})", Factory.Production);
  private static final IConstructor prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit___91__char_class___range__91_91_ = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", Factory.Production);
  private static final IConstructor prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_ = (IConstructor) _read("prod(label(\"postIncr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"++\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_while_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"while\")],{})", Factory.Production);
  private static final IConstructor prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"*=\"),[\\char-class([range(42,42)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_case_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"case\")],{})", Factory.Production);
  private static final IConstructor prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__function_Expression__Function_ = (IConstructor) _read("prod(label(\"function\",sort(\"Expression\")),[sort(\"Function\")],{})", Factory.Production);
  private static final IConstructor prod__Declarator__LetOrConst_ = (IConstructor) _read("prod(sort(\"Declarator\"),[sort(\"LetOrConst\")],{})", Factory.Production);
  private static final IConstructor prod__PropertyName__Numeric_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[sort(\"Numeric\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_var_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"var\")],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_49_44_57_41_44_114_97_110_103_101_40_49_49_44_49_54_55_55_55_50_49_53_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__49_49_char_class___range__44_44_char_class___range__57_57_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__49_49_char_class___range__49_49_char_class___range__44_44_char_class___range__49_49_char_class___range__54_54_char_class___range__55_55_char_class___range__55_55_char_class___range__55_55_char_class___range__50_50_char_class___range__49_49_char_class___range__53_53_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(54,54)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(50,50)]),\\char-class([range(49,49)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_ = (IConstructor) _read("prod(label(\"property\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(61,61)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__PropertyName__String_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"String\")],{})", Factory.Production);
  private static final IConstructor prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"transient\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"UnicodeEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"UnicodeEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"try\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ForBinding\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ForBinding\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ForBinding\")))})", Factory.Production);
  private static final IConstructor prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"delete\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexDigit\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexDigit\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexDigit\")))})", Factory.Production);
  private static final IConstructor prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!==\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[\\char-class([range(1,9),range(11,41),range(43,46),range(48,90),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyName\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyName\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyName\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_const_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"const\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ArgExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ArgExpression\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57__char_class___range__0_0_lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter__char_class___range__48_57 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57)]))))})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_super_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"super\")],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(sort(\"Params\"),[label(\"lst\",\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", Factory.Production);
  private static final IConstructor prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"typeof\",sort(\"Expression\")),[lit(\"typeof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forInDeclaration\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),sort(\"ForBinding\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__48_57 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_ = (IConstructor) _read("prod(lit(\"++\"),[\\char-class([range(43,43)]),\\char-class([range(43,43)])],{})", Factory.Production);
  private static final IConstructor prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&&\"),[\\char-class([range(38,38)]),\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__Numeric__HexInteger_ = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"HexInteger\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"default\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Params\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forDo\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBody\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBody\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBody\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(114,114)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_ = (IConstructor) _read("prod(lex(\"ExponentPart\"),[\\char-class([range(69,69),range(101,101)]),lex(\"SignedInteger\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_char_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"char\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__101_101_char_class___range__116_116_char_class___range__79_79_char_class___range__114_114_char_class___range__67_67_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"LetOrConst\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(79,79)]),\\char-class([range(114,114)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"eq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"==\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_ = (IConstructor) _read("prod(lex(\"NonEscapeCharacter\"),[\\char-class([range(1,9),range(11,33),range(35,38),range(40,47),range(58,91),range(93,97),range(99,101),range(103,109),range(111,113),range(115,115),range(119,119),range(121,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Source\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Expression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Expression\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_catch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", Factory.Production);
  private static final IConstructor prod__ArgExpression__Expression_ = (IConstructor) _read("prod(sort(\"ArgExpression\"),[sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__literal_Expression__Literal_ = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Declarator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Declarator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Declarator\")))})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"const\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124__char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57 = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", Factory.Production);
  private static final IConstructor prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"neqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"!==\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"debugger\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(98,98)]),\\char-class([range(117,117)]),\\char-class([range(103,103)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignSub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"-=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_transient_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"transient\")],{})", Factory.Production);
  private static final IConstructor prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"null\"),[\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_typeof_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"typeof\")],{})", Factory.Production);
  private static final IConstructor prod__lit_u__char_class___range__117_117_ = (IConstructor) _read("prod(lit(\"u\"),[\\char-class([range(117,117)])],{})", Factory.Production);
  private static final IConstructor prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"switch\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_ = (IConstructor) _read("prod(lex(\"RegularExpressionBody\"),[lex(\"RegularExpressionFirstChar\"),\\iter-star(lex(\"RegularExpressionChar\"))],{})", Factory.Production);
  private static final IConstructor prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"rem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"%\"),{\\not-follow(\\char-class([range(37,37),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"div\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"/\"),{\\not-follow(\\char-class([range(47,47),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"sub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_this_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"this\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__43_43_range__45_45__char_class___range__0_0_lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_51_44_52_51_41_44_114_97_110_103_101_40_52_53_44_52_53_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__char_class___range__43_43_range__45_45 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(43,43),range(45,45)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(43,43),range(45,45)]))))})", Factory.Production);
  private static final IConstructor prod__layouts_LAYOUTLIST__iter_star__LAYOUT_ = (IConstructor) _read("prod(layouts(\"LAYOUTLIST\"),[conditional(\\iter-star(lex(\"LAYOUT\")),{\\not-follow(\\char-class([range(9,10),range(32,32)])),\\not-follow(lit(\"//\")),\\not-follow(lit(\"/*\"))})],{})", Factory.Production);
  private static final IConstructor prod__Literal__String_ = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"String\")],{})", Factory.Production);
  private static final IConstructor prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"class\"),[\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_with_lit_abstract_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"with\"),lit(\"abstract\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclaration\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclaration\")))})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__65_90_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(65,90),range(97,122)])))", Factory.Production);
  private static final IConstructor prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_throw_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throw\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CaseClause\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57_range__65_70_range__97_102 = (IConstructor) _read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])))", Factory.Production);
  private static final IConstructor prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(sort(\"VarDecl\"),[sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),label(\"declarations\",\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__Numeric_ = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Numeric\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VarDecl\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_ = (IConstructor) _read("prod(lex(\"Whitespace\"),[\\char-class([range(9,10),range(13,13),range(32,32)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__char_class___range__117_117_range__120_120_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(117,117),range(120,120)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClass\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_ = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyAssignment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyAssignment\")))})", Factory.Production);
  private static final IConstructor prod__LetOrConst__lit_const_ = (IConstructor) _read("prod(sort(\"LetOrConst\"),[lit(\"const\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__RegularExpressionClass_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionClass\")],{})", Factory.Production);
  private static final IConstructor prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_ = (IConstructor) _read("prod(label(\"ifThen\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"else\"))})],{})", Factory.Production);
  private static final IConstructor prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"catch\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])))", Factory.Production);
  private static final IConstructor prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"implements\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"defaultCase\",sort(\"CaseClause\")),[lit(\"default\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"&\"),{\\not-follow(\\char-class([range(38,38),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"false\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"//\"),conditional(\\iter-star(\\char-class([range(1,9),range(11,16777215)])),{\\end-of-line()})],{tag(\"category\"(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__lit___38__char_class___range__38_38_ = (IConstructor) _read("prod(lit(\"&\"),[\\char-class([range(38,38)])],{})", Factory.Production);
  private static final IConstructor prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_ = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(1,9),range(11,38),range(40,91),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SignedInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"typeof\"),[\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"native\"),[\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"prefixPlus\",sort(\"Expression\")),[conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57_range__65_70_range__97_102__char_class___range__0_0_lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_55_48_41_44_114_97_110_103_101_40_57_55_44_49_48_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter__char_class___range__48_57_range__65_70_range__97_102 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57),range(65,70),range(97,102)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57),range(65,70),range(97,102)]))))})", Factory.Production);
  private static final IConstructor prod__PropertyName__Id_ = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"DoubleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"while\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"or\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SignedInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SignedInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SignedInteger\")))})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit___59__char_class___range__59_59_ = (IConstructor) _read("prod(lit(\";\"),[\\char-class([range(59,59)])],{})", Factory.Production);
  private static final IConstructor prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"debugger\",sort(\"Statement\")),[lit(\"debugger\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_51_44_52_51_41_44_114_97_110_103_101_40_52_53_44_52_53_41_93_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__51_51_char_class___range__44_44_char_class___range__52_52_char_class___range__51_51_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__53_53_char_class___range__44_44_char_class___range__52_52_char_class___range__53_53_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"-=\"),[\\char-class([range(45,45)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_ = (IConstructor) _read("prod(lex(\"Id\"),[conditional(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]),{delete(keywords(\"Reserved\"))})],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor regular__empty = (IConstructor) _read("regular(empty())", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__61_61__char_class___range__0_0_lit___111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__char_class___range__61_61 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(61,61)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(61,61)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(61,61)]))))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"LAYOUT\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__CommentChar = (IConstructor) _read("regular(\\iter-star(lex(\"CommentChar\")))", Factory.Production);
  private static final IConstructor prod__Reserved__lit_long_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"long\")],{})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),\\char-class([range(46,46)]),\\iter-star(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_static_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"static\")],{})", Factory.Production);
  private static final IConstructor prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"throwExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_public_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"public\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_ = (IConstructor) _read("prod(lex(\"RegularExpression\"),[\\char-class([range(47,47)]),lex(\"RegularExpressionBody\"),\\char-class([range(47,47)]),lex(\"RegularExpressionFlags\")],{})", Factory.Production);
  private static final IConstructor prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"true\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"whileDo\",sort(\"Statement\")),[lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__CharacterEscapeSequence__NonEscapeCharacter_ = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"NonEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_float_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"float\")],{})", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__61_61 = (IConstructor) _read("regular(opt(\\char-class([range(61,61)])))", Factory.Production);
  private static final IConstructor prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"opt(sort(\\\"ExponentPart\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lex(\"ExponentPart\"))))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBody\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_throws_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throws\")],{})", Factory.Production);
  private static final IConstructor prod__this_Expression__lit_this_ = (IConstructor) _read("prod(label(\"this\",sort(\"Expression\")),[lit(\"this\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Id\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))))})", Factory.Production);
  private static final IConstructor prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"array\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Numeric\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Numeric\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Numeric\")))})", Factory.Production);
  private static final IConstructor prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Boolean\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Boolean\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Boolean\")))})", Factory.Production);
  private static final IConstructor prod__lit___123__char_class___range__123_123_ = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"member\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__varDecl_Statement__VarDecl_ = (IConstructor) _read("prod(label(\"varDecl\",sort(\"Statement\")),[sort(\"VarDecl\")],{})", Factory.Production);
  private static final IConstructor prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Numeric\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(117,117)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61 = (IConstructor) _read("regular(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CommentChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CommentChar\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Boolean\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"continue\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_default_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"default\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_new_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"new\")],{})", Factory.Production);
  private static final IConstructor prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"for\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__layouts_$default$__ = (IConstructor) _read("prod(layouts(\"$default$\"),[],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_delete_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"delete\")],{})", Factory.Production);
  private static final IConstructor prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"cond\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Initializer\"),[lit(\"=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(115,115)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_try_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"try\")],{})", Factory.Production);
  private static final IConstructor prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"mul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"*\"),{\\not-follow(\\char-class([range(42,42),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignDiv\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"/=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Numeric__Decimal_ = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"Decimal\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", Factory.Production);
  private static final IConstructor prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"continueNoLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"/*\"),\\iter-star(lex(\"CommentChar\")),lit(\"*/\")],{tag(\"category\"(\"Comment\"))})", Factory.Production);
  private static final IConstructor prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignMul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"*=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__77_77_char_class___range__101_101_char_class___range__116_116_char_class___range__104_104_char_class___range__111_111_char_class___range__100_100_char_class___range__68_68_char_class___range__101_101_char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"MethodDefinition\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(77,77)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClass\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClass\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClass\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CaseClause\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"CaseClause\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_private_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"private\")],{})", Factory.Production);
  private static final IConstructor prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__RegularExpressionChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionChar\")))", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyAssignment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DoubleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DoubleStringChar\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_true_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"and\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_volatile_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"volatile\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBackslashSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBackslashSequence\")))})", Factory.Production);
  private static final IConstructor prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclarationNoIn\")))})", Factory.Production);
  private static final IConstructor prod__Boolean__lit_true_ = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleEscapeCharacter\")))})", Factory.Production);
  private static final IConstructor regular__iter_star__char_class___range__1_9_range__11_16777215 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(1,9),range(11,16777215)])))", Factory.Production);
  private static final IConstructor regular__iter_star__LAYOUT = (IConstructor) _read("regular(\\iter-star(lex(\"LAYOUT\")))", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__48_57__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__48_57 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(48,57)]))))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"char\"),[\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexDigit\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(68,68)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_null_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"null\")],{})", Factory.Production);
  private static final IConstructor prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"new\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_finally_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"finally\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"DecimalInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClassChar\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_void_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"void\")],{})", Factory.Production);
  private static final IConstructor prod__ForBinding__Id_ = (IConstructor) _read("prod(sort(\"ForBinding\"),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor prod__lit___58__char_class___range__58_58_ = (IConstructor) _read("prod(lit(\":\"),[\\char-class([range(58,58)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"//\"),[\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__Literal__RegularExpression_ = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"RegularExpression\")],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__Whitespace_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Whitespace\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_ = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(39,39)]),\\iter-star(lex(\"SingleStringChar\")),\\char-class([range(39,39)])],{})", Factory.Production);
  private static final IConstructor prod__lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"*/\"),[\\char-class([range(42,42)]),\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor regular__opt__lit___44 = (IConstructor) _read("regular(opt(lit(\",\")))", Factory.Production);
  private static final IConstructor prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"prefixMin\",sort(\"Expression\")),[conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"==\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignAdd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"+=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Whitespace\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(87,87)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"export\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"case\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__RegularExpressionClass_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionClass\")],{})", Factory.Production);
  private static final IConstructor prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"static\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFlags\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFlags\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFlags\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LetOrConst__char_class___range__0_0_lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LetOrConst = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"LetOrConst\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LetOrConst\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"LetOrConst\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignRem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"%=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"throws\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],{})", Factory.Production);
  private static final IConstructor prod__empty__ = (IConstructor) _read("prod(empty(),[],{})", Factory.Production);
  private static final IConstructor prod__lit____char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"-\"),[\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"set\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_ = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(34,34)]),\\iter-star(lex(\"DoubleStringChar\")),\\char-class([range(34,34)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_101_113_40_91_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_44_108_97_121_111_117_116_115_40_34_76_65_89_79_85_84_76_73_83_84_34_41_44_111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_93_41__char_class___range__115_115_char_class___range__101_101_char_class___range__113_113_char_class___range__40_40_char_class___range__91_91_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__44_44_char_class___range__108_108_char_class___range__97_97_char_class___range__121_121_char_class___range__111_111_char_class___range__117_117_char_class___range__116_116_char_class___range__115_115_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__76_76_char_class___range__73_73_char_class___range__83_83_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__49_49_char_class___range__44_44_char_class___range__54_54_char_class___range__49_49_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(76,76)]),\\char-class([range(73,73)]),\\char-class([range(83,83)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SingleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star__SingleStringChar = (IConstructor) _read("regular(\\iter-star(lex(\"SingleStringChar\")))", Factory.Production);
  private static final IConstructor prod__Reserved__lit_return_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"return\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Initializer\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____ = (IConstructor) _read("prod(label(\"postDec\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"--\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_false_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__Boolean__lit_false_ = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"false\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__72_72_char_class___range__83_83_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"LHSExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(72,72)]),\\char-class([range(83,83)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_instanceof_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"instanceof\")],{})", Factory.Production);
  private static final IConstructor prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"package\"),[\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Statement\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Statement\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_else_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"else\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_in_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"in\")],{})", Factory.Production);
  private static final IConstructor prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"int\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_interface_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"interface\")],{})", Factory.Production);
  private static final IConstructor prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"set\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Param\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__111_111_char_class___range__114_114_char_class___range__66_66_char_class___range__105_105_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ForBinding\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(66,66)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ExponentPart\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"binOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"|\"),{\\not-follow(\\char-class([range(61,61),range(124,124)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_ = (IConstructor) _read("prod(lex(\"HexDigit\"),[\\char-class([range(48,57),range(65,70),range(97,102)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_lit___44__char_class___range__0_0_lit___111_112_116_40_108_105_116_40_34_44_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__lit___44 = (IConstructor) _read("prod(label(\"$MetaHole\",lit(\",\")),[\\char-class([range(0,0)]),lit(\"opt(lit(\\\",\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lit(\",\"))))})", Factory.Production);
  private static final IConstructor prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Whitespace\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Whitespace\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Whitespace\")))})", Factory.Production);
  private static final IConstructor prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"geq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__SingleEscapeCharacter_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[lex(\"SingleEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_if_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"if\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_enum_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"enum\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"LAYOUT\"))))})", Factory.Production);
  private static final IConstructor prod__lit___46__char_class___range__46_46_ = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionBackslashSequence\"),[\\char-class([range(92,92)]),\\char-class([range(1,9),range(11,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"byte\"),[\\char-class([range(98,98)]),\\char-class([range(121,121)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___37__char_class___range__37_37_ = (IConstructor) _read("prod(lit(\"%\"),[\\char-class([range(37,37)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_synchronized_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"synchronized\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_byte_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"byte\")],{})", Factory.Production);
  private static final IConstructor prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_ = (IConstructor) _read("prod(label(\"call\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", Factory.Production);
  private static final IConstructor prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"super\"),[\\char-class([range(115,115)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor regular__opt__char_class___range__43_43_range__45_45 = (IConstructor) _read("regular(opt(\\char-class([range(43,43),range(45,45)])))", Factory.Production);
  private static final IConstructor prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_ = (IConstructor) _read("prod(lit(\"final\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_goto_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"goto\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Function\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Params\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Params\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Params\")))})", Factory.Production);
  private static final IConstructor prod__lit___62__char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\"),[\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_final_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"final\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_class_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"class\")],{})", Factory.Production);
  private static final IConstructor prod__CharacterEscapeSequence__SingleEscapeCharacter_ = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"SingleEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__Literal__lit_null_ = (IConstructor) _read("prod(sort(\"Literal\"),[lit(\"null\")],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_ = (IConstructor) _read("prod(lit(\"enum\"),[\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],{})", Factory.Production);
  private static final IConstructor prod__lit___60__char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\"),[\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(49,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Literal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Literal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Literal\")))})", Factory.Production);
  private static final IConstructor prod__lit_if__char_class___range__105_105_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"if\"),[\\char-class([range(105,105)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__RegularExpressionBackslashSequence_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", Factory.Production);
  private static final IConstructor prod__lit___47__char_class___range__47_47_ = (IConstructor) _read("prod(lit(\"/\"),[\\char-class([range(47,47)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DecimalInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DecimalInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DecimalInteger\")))})", Factory.Production);
  private static final IConstructor prod__empty_Statement__lit___59_ = (IConstructor) _read("prod(label(\"empty\",sort(\"Statement\")),[lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"import\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"ifThenElse\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__lit___41__char_class___range__41_41_ = (IConstructor) _read("prod(lit(\")\"),[\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__HexEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"HexEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"with\",sort(\"Statement\")),[lit(\"with\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"scope\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ArgExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"SignedInteger\"),[opt(\\char-class([range(43,43),range(45,45)])),conditional(iter(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
  private static final IConstructor prod__LAYOUT__Comment_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", Factory.Production);
  private static final IConstructor prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_ = (IConstructor) _read("prod(start(sort(\"Source\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Source\")),layouts(\"LAYOUTLIST\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_continue_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"continue\")],{})", Factory.Production);
  private static final IConstructor prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryCatchFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"function\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_ = (IConstructor) _read("prod(lit(\"finally\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],{})", Factory.Production);
  private static final IConstructor prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"caseOf\",sort(\"CaseClause\")),[lit(\"case\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"^=\"),[\\char-class([range(94,94)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__65_90_range__97_122__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__65_90_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(65,90),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(65,90),range(97,122)]))))})", Factory.Production);
  private static final IConstructor prod__lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_55_48_41_44_114_97_110_103_101_40_57_55_44_49_48_50_41_93_41_41__char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__55_55_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__48_48_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(55,55)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(48,48)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"get\"),[\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Comment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__PropertyAssignment__MethodDefinition_ = (IConstructor) _read("prod(sort(\"PropertyAssignment\"),[sort(\"MethodDefinition\")],{})", Factory.Production);
  private static final IConstructor prod__lit___125__char_class___range__125_125_ = (IConstructor) _read("prod(lit(\"}\"),[\\char-class([range(125,125)])],{})", Factory.Production);
  private static final IConstructor prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"instanceof\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"instanceof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__CharacterEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"CharacterEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_ = (IConstructor) _read("prod(label(\"source\",sort(\"Source\")),[\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", Factory.Production);
  private static final IConstructor prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"+=\"),[\\char-class([range(43,43)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"===\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"doWhile\",sort(\"Statement\")),[lit(\"do\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_extends_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"extends\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"NonEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"NonEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"NonEscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Comment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Comment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Comment\")))})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_108_105_116_40_34_44_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(lit(\\\",\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Decimal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Decimal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Decimal\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"String\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"double\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_ = (IConstructor) _read("prod(lit(\"break\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", Factory.Production);
  private static final IConstructor prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"%=\"),[\\char-class([range(37,37)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"eqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"===\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_do_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"do\")],{})", Factory.Production);
  private static final IConstructor prod__lit___40__char_class___range__40_40_ = (IConstructor) _read("prod(lit(\"(\"),[\\char-class([range(40,40)])],{})", Factory.Production);
  private static final IConstructor prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"leq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"add\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit_____char_class___range__45_45_char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"--\"),[\\char-class([range(45,45)]),\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"float\"),[\\char-class([range(102,102)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"volatile\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_break_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"break\")],{})", Factory.Production);
  private static final IConstructor prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"long\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Initializer\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Initializer\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Initializer\")))})", Factory.Production);
  private static final IConstructor prod__var_Expression__Id_ = (IConstructor) _read("prod(label(\"var\",sort(\"Expression\")),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"continueLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_ = (IConstructor) _read("prod(lex(\"RegularExpressionClass\"),[\\char-class([range(91,91)]),\\iter-star(lex(\"RegularExpressionClassChar\")),\\char-class([range(93,93)])],{})", Factory.Production);
  private static final IConstructor prod__lit___63__char_class___range__63_63_ = (IConstructor) _read("prod(lit(\"?\"),[\\char-class([range(63,63)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_for_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"for\")],{})", Factory.Production);
  private static final IConstructor prod__lit_do__char_class___range__100_100_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"do\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"LHSExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LHSExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"LHSExpression\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122__char_class___range__0_0_lit___115_101_113_40_91_99_111_110_100_105_116_105_111_110_97_108_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_44_123_92_110_111_116_45_112_114_101_99_101_100_101_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_44_99_111_110_100_105_116_105_111_110_97_108_40_92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_44_123_92_110_111_116_45_102_111_108_108_111_119_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])),[\\char-class([range(0,0)]),lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])))})", Factory.Production);
  private static final IConstructor prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"delete\",sort(\"Expression\")),[lit(\"delete\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexInteger\")))})", Factory.Production);
  private static final IConstructor prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"gt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__function_Statement__Function_ = (IConstructor) _read("prod(label(\"function\",sort(\"Statement\")),[sort(\"Function\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"CommentChar\"))))})", Factory.Production);
  private static final IConstructor prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_ = (IConstructor) _read("prod(lit(\"/*\"),[\\char-class([range(47,47)]),\\char-class([range(42,42)])],{})", Factory.Production);
  private static final IConstructor prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"objectDefinition\")}),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"inn\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__lit___115_101_113_40_91_99_111_110_100_105_116_105_111_110_97_108_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_44_123_92_110_111_116_45_112_114_101_99_101_100_101_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_44_99_111_110_100_105_116_105_111_110_97_108_40_92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_44_123_92_110_111_116_45_102_111_108_108_111_119_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_125_41_93_41__char_class___range__115_115_char_class___range__101_101_char_class___range__113_113_char_class___range__40_40_char_class___range__91_91_char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__44_44_char_class___range__123_123_char_class___range__92_92_char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__45_45_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__99_99_char_class___range__101_101_char_class___range__100_100_char_class___range__101_101_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__125_125_char_class___range__41_41_char_class___range__44_44_char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__40_40_char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__44_44_char_class___range__123_123_char_class___range__92_92_char_class___range__110_110_char_class___range__111_111_char_class___range__116_116_char_class___range__45_45_char_class___range__102_102_char_class___range__111_111_char_class___range__108_108_char_class___range__108_108_char_class___range__111_111_char_class___range__119_119_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__51_51_char_class___range__54_54_char_class___range__44_44_char_class___range__51_51_char_class___range__54_54_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__53_53_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_char_class___range__125_125_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_ = (IConstructor) _read("prod(sort(\"UnicodeEscapeSequence\"),[lit(\"u\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Function\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Function\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Function\")))})", Factory.Production);
  private static final IConstructor prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"|=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__nonInit_VariableDeclarationNoIn__id_Id_ = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\"))],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_boolean_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"boolean\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_debugger_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"debugger\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__1_9_range__11_16777215__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_49_44_57_41_44_114_97_110_103_101_40_49_49_44_49_54_55_55_55_50_49_53_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__1_9_range__11_16777215 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(1,9),range(11,16777215)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(1,9),range(11,16777215)]))))})", Factory.Production);
  private static final IConstructor prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"private\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"SingleStringChar\"))))})", Factory.Production);
  private static final IConstructor regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__Literal__Boolean_ = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Boolean\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(85,85)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"/=\"),[\\char-class([range(47,47)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"block\",sort(\"Statement\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"DoubleStringChar\"))))})", Factory.Production);
  private static final IConstructor prod__nonInit_VariableDeclaration__id_Id_ = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\"))],{})", Factory.Production);
  private static final IConstructor prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"get\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__CommentChar__char_class___range__1_41_range__43_16777215_ = (IConstructor) _read("prod(lex(\"CommentChar\"),[\\char-class([range(1,41),range(43,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"boolean\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forIn\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"var\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclaration\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__SingleStringChar__char_class___range__92_92_EscapeSequence_ = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleStringChar\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Expression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_ = (IConstructor) _read("prod(lex(\"HexEscapeSequence\"),[\\char-class([range(120,120)]),lex(\"HexDigit\"),lex(\"HexDigit\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__Declarator__lit_var_ = (IConstructor) _read("prod(sort(\"Declarator\"),[lit(\"var\")],{})", Factory.Production);
  private static final IConstructor prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_ = (IConstructor) _read("prod(lit(\"instanceof\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", Factory.Production);
  private static final IConstructor prod__lit___44__char_class___range__44_44_ = (IConstructor) _read("prod(lit(\",\"),[\\char-class([range(44,44)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_native_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"native\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Param\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Param\")))})", Factory.Production);
  private static final IConstructor prod__lit___94__char_class___range__94_94_ = (IConstructor) _read("prod(lit(\"^\"),[\\char-class([range(94,94)])],{})", Factory.Production);
  private static final IConstructor prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[\\char-class([range(46,46)]),iter(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpression\")))})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(sort(\\\"ExponentPart\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_ = (IConstructor) _read("prod(lit(\"goto\"),[\\char-class([range(103,103)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(111,111)])],{})", Factory.Production);
  private static final IConstructor prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_ = (IConstructor) _read("prod(lit(\"public\"),[\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_short_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"short\")],{})", Factory.Production);
  private static final IConstructor prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forDoDeclarations\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"MethodDefinition\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"MethodDefinition\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"MethodDefinition\")))})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"lt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"preIncr\",sort(\"Expression\")),[lit(\"++\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionClassChar\"))))})", Factory.Production);
  private static final IConstructor prod__lit___43__char_class___range__43_43_ = (IConstructor) _read("prod(lit(\"+\"),[\\char-class([range(43,43)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"HexInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_package_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"package\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61__char_class___range__0_0_lit___115_101_113_40_91_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_44_108_97_121_111_117_116_115_40_34_76_65_89_79_85_84_76_73_83_84_34_41_44_111_112_116_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_49_44_54_49_41_93_41_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__seq___char_class___range__61_61_layouts_LAYOUTLIST_opt__char_class___range__61_61 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])),[\\char-class([range(0,0)]),lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])))})", Factory.Production);
  private static final IConstructor prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Literal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Id\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Id\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Id\")))})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(48,57)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_ = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(1,9),range(11,33),range(35,91),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",conditional(sort(\"Expression\"),{except(\"inn\")}))],{})", Factory.Production);
  private static final IConstructor prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"labeled\",sort(\"Statement\")),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"!=\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFlags\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__LHSExpression__Expression_ = (IConstructor) _read("prod(sort(\"LHSExpression\"),[conditional(sort(\"Expression\"),{except(\"array\"),except(\"objectDefinition\"),except(\"assign\")})],{})", Factory.Production);
  private static final IConstructor prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"return\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Declarator\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignBinXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"^=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[\\char-class([range(1,9),range(11,46),range(48,90),range(93,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit___93__char_class___range__93_93_ = (IConstructor) _read("prod(lit(\"]\"),[\\char-class([range(93,93)])],{})", Factory.Production);
    
  // Item declarations
	
	
  protected static class String {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(24, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(23, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(21, 1, prod__lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,114,105,110,103,34,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(22, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(20, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(25, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String, tmp);
	}
    protected static final void _init_prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(31, 2, new int[][]{{39,39}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(28, 0, new int[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(30, 1, regular__iter_star__SingleStringChar, new NonTerminalStackNode<IConstructor>(29, 0, "SingleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_, tmp);
	}
    protected static final void _init_prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(36, 2, new int[][]{{34,34}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(33, 0, new int[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(35, 1, regular__iter_star__DoubleStringChar, new NonTerminalStackNode<IConstructor>(34, 0, "DoubleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String(builder);
      
        _init_prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_(builder);
      
        _init_prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_(builder);
      
    }
  }
	
  protected static class Decimal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Decimal__DecimalInteger_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new OptionalStackNode<IConstructor>(81, 1, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(80, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(79, 0, "DecimalInteger", null, null);
      builder.addAlternative(Parser.prod__Decimal__DecimalInteger_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode<IConstructor>(88, 3, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(87, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(83, 0, "DecimalInteger", null, null);
      tmp[1] = new CharStackNode<IConstructor>(84, 1, new int[][]{{46,46}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(86, 2, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(85, 0, new int[][]{{48,57}}, null, null), false, null, null);
      builder.addAlternative(Parser.prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(91, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(93, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(96, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(92, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(95, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(94, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal, tmp);
	}
    protected static final void _init_prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(99, 0, new int[][]{{46,46}}, null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(103, 2, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(102, 0, "ExponentPart", null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(101, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(100, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Decimal__DecimalInteger_opt__ExponentPart_(builder);
      
        _init_prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_(builder);
      
        _init_prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal(builder);
      
        _init_prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_(builder);
      
    }
  }
	
  protected static class Function {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(210, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(212, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(214, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(213, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(211, 1, prod__lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,117,110,99,116,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(215, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[0] = new LiteralStackNode<IConstructor>(218, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(231, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(229, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(230, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(228, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(222, 4, "Params", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(234, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(220, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(225, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(227, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(221, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(233, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(219, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(224, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(226, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[13] = new NonTerminalStackNode<IConstructor>(254, 13, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(248, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(236, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(247, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(241, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(252, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(250, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(251, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(255, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(238, 2, "Id", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(243, 6, "Params", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(246, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(240, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(249, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(237, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(242, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(245, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function(builder);
      
        _init_prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
    }
  }
	
  protected static class Expression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(609, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(613, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(612, 2, prod__lit___94__char_class___range__94_94_, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(614, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(608, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(501, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(505, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(504, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(506, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(500, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(363, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(361, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(364, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(362, 2, prod__lit___46__char_class___range__46_46_, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(360, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_, tmp);
	}
    protected static final void _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(412, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(413, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(411, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(581, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(577, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(582, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(580, 2, prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(576, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(669, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(671, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(668, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(670, 2, prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(672, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(636, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(634, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(633, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(637, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(635, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new int[] {124,124}, null, null);
      builder.addAlternative(Parser.prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(678, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(676, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(675, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(679, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(677, 2, prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,61}, null, null);
      builder.addAlternative(Parser.prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(427, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(425, 0, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(426, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(531, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(533, 2, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(535, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(532, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(534, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(682, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(686, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(684, 2, prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(685, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(683, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(568, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(572, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(571, 2, prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(573, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(567, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(443, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(444, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(442, 0, prod__lit___33__char_class___range__33_33_, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(Parser.prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(448, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(449, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(447, 0, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      builder.addAlternative(Parser.prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(313, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(322, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(319, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(318, 2, regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(314, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(315, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(316, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(317, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(323, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(321, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(320, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(312, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      builder.addAlternative(Parser.prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(407, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(408, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(406, 0, prod__lit___126__char_class___range__126_126_, new int[] {126}, null, null);
      builder.addAlternative(Parser.prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(657, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(655, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(658, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(656, 2, prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(654, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(396, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(397, 2, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(395, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_, tmp);
	}
    protected static final void _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(512, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(510, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(513, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(511, 2, prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(509, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__function_Expression__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(326, 0, "Function", null, null);
      builder.addAlternative(Parser.prod__function_Expression__Function_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(289, 1, prod__lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(292, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(291, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(288, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(290, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(293, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression, tmp);
	}
    protected static final void _init_prod__literal_Expression__Literal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(329, 0, "Literal", null, null);
      builder.addAlternative(Parser.prod__literal_Expression__Literal_, tmp);
	}
    protected static final void _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(586, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(588, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(585, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(587, 2, prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(589, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(662, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(664, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(661, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(663, 2, prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(665, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(463, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(467, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(462, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(466, 2, prod__lit___37__char_class___range__37_37_, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(468, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(472, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(476, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(471, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(475, 2, prod__lit___47__char_class___range__47_47_, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(477, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(482, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(486, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(481, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(485, 2, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(487, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(604, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(600, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(599, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(605, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(603, 2, prod__lit___38__char_class___range__38_38_, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(Parser.prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(419, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(418, 0, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(420, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__this_Expression__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(332, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__this_Expression__lit_this_, tmp);
	}
    protected static final void _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(370, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(372, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(368, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(367, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(371, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(369, 2, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(373, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(342, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(336, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(345, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(335, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(344, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(343, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(341, 2, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(337, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(338, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(339, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(340, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(346, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(691, 2, prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(693, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(689, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(690, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(692, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(698, 2, prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(700, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(696, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(697, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(699, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(648, 6, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(643, 2, prod__lit___63__char_class___range__63_63_, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(646, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(641, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(649, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(642, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(647, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(644, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(650, 8, "Expression", null, null);
      builder.addAlternative(Parser.prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(705, 2, prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(707, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(703, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(704, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(706, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(457, 2, prod__lit___42__char_class___range__42_42_, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(459, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(453, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(454, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(458, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(628, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(630, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(626, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(627, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(629, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(299, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(302, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(297, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(298, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(301, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(300, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(391, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(389, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(390, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(712, 2, prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(714, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(710, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(711, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(713, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(719, 2, prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(721, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(717, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(718, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(720, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(402, 2, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(400, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(401, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____, tmp);
	}
    protected static final void _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(623, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(621, 2, prod__lit___124__char_class___range__124_124_, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(617, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(622, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(618, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(528, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(526, 2, prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(524, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(527, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(525, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[4] = new SeparatedListStackNode<IConstructor>(384, 4, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(380, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(381, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(382, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(383, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(386, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(378, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(376, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(379, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(377, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(385, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(592, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(594, 2, prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(596, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(593, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(595, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(538, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(540, 2, prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(542, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(539, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(541, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(516, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(518, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(520, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(517, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(519, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(490, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(494, 2, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(496, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(491, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(495, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(349, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(351, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(353, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(350, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(352, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__var_Expression__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(356, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__var_Expression__Id_, tmp);
	}
    protected static final void _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(430, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(432, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(431, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(545, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(547, 2, prod__lit___62__char_class___range__62_62_, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(549, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(546, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(548, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(725, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(735, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(733, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(734, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(726, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(552, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(556, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(554, 2, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(555, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(553, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(738, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(742, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(740, 2, prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(741, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(739, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(559, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(563, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(561, 2, prod__lit___60__char_class___range__60_60_, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(562, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(560, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(435, 0, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(437, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(436, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(builder);
      
        _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(builder);
      
        _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__function_Expression__Function_(builder);
      
        _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression(builder);
      
        _init_prod__literal_Expression__Literal_(builder);
      
        _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__this_Expression__lit_this_(builder);
      
        _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(builder);
      
        _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(builder);
      
        _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(builder);
      
        _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(builder);
      
        _init_prod__var_Expression__Id_(builder);
      
        _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(builder);
      
        _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(builder);
      
    }
  }
	
  protected static class layouts_$default$ {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_$default$__(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode<IConstructor>(812, 0);
      builder.addAlternative(Parser.prod__layouts_$default$__, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__layouts_$default$__(builder);
      
    }
  }
	
  protected static class RegularExpressionFlags {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(831, 0, regular__iter_star__char_class___range__65_90_range__97_122, new CharStackNode<IConstructor>(828, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(Parser.prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(836, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(839, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(834, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(835, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(838, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(837, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_(builder);
      
        _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(builder);
      
    }
  }
	
  protected static class Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(850, 1, prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(853, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(852, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(851, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(854, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(849, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source, tmp);
	}
    protected static final void _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(860, 0, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(858, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(859, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source(builder);
      
        _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class RegularExpressionFirstChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1016, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1015, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1013, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1017, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1014, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1012, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1020, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1022, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1024, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar(builder);
      
        _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(builder);
      
        _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(builder);
      
        _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(builder);
      
    }
  }
	
  protected static class HexDigit {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1132, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1131, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1129, 1, prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1133, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1130, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1128, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit, tmp);
	}
    protected static final void _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1136, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
      builder.addAlternative(Parser.prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit(builder);
      
        _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(builder);
      
    }
  }
	
  protected static class CommentChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__CommentChar__char_class___range__42_42_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1702, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(Parser.prod__CommentChar__char_class___range__42_42_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1706, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1705, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1710, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1709, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1708, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1707, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1714, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1719, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1715, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1716, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1718, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1717, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar, tmp);
	}
    protected static final void _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1723, 0, new int[][]{{1,41},{43,16777215}}, null, null);
      builder.addAlternative(Parser.prod__CommentChar__char_class___range__1_41_range__43_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__CommentChar__char_class___range__42_42_(builder);
      
        _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(builder);
      
        _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(builder);
      
        _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(builder);
      
    }
  }
	
  protected static class ForBinding {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1793, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1792, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1790, 1, prod__lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__111_111_char_class___range__114_114_char_class___range__66_66_char_class___range__105_105_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,111,114,66,105,110,100,105,110,103,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1794, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1791, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1789, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding, tmp);
	}
    protected static final void _init_prod__ForBinding__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1797, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__ForBinding__Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding(builder);
      
        _init_prod__ForBinding__Id_(builder);
      
    }
  }
	
  protected static class RegularExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(1848, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(1845, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1846, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(1847, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1851, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1856, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1855, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1854, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1853, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1852, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_(builder);
      
        _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(builder);
      
    }
  }
	
  protected static class UnicodeEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1887, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1886, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1884, 1, prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1888, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1885, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1883, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence, tmp);
	}
    protected static final void _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(1891, 0, prod__lit_u__char_class___range__117_117_, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(1895, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(1897, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1893, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(1899, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1894, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(1898, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1896, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1892, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence(builder);
      
        _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(builder);
      
    }
  }
	
  protected static class CaseClause {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(1944, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1943, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(1949, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(1947, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1948, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1946, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1945, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(1954, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1953, 1, prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1956, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1955, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1957, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1952, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause, tmp);
	}
    protected static final void _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(1969, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(1967, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1968, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1961, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1963, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(1965, 4, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1966, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1962, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1964, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1972, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1974, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1977, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1973, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1976, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1975, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
        _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(builder);
      
        _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(builder);
      
        _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(builder);
      
    }
  }
	
  protected static class VariableDeclaration {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2063, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2062, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2060, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2059, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2061, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2064, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2072, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2071, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2069, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2068, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2073, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2070, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2084, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2085, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2086, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2081, 0, "Id", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2083, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclaration__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2090, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__nonInit_VariableDeclaration__id_Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration(builder);
      
        _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
        _init_prod__nonInit_VariableDeclaration__id_Id_(builder);
      
    }
  }
	
  protected static class RegularExpressionBody {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2100, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2099, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2097, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2101, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2098, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2096, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody, tmp);
	}
    protected static final void _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2106, 1, regular__iter_star__RegularExpressionChar, new NonTerminalStackNode<IConstructor>(2105, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2104, 0, "RegularExpressionFirstChar", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody(builder);
      
        _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(builder);
      
    }
  }
	
  protected static class Declarator {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Declarator__LetOrConst_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2186, 0, "LetOrConst", null, null);
      builder.addAlternative(Parser.prod__Declarator__LetOrConst_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2190, 1, prod__lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,108,97,114,97,116,111,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2193, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2192, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2189, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2194, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2191, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator, tmp);
	}
    protected static final void _init_prod__Declarator__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2197, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.prod__Declarator__lit_var_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Declarator__LetOrConst_(builder);
      
        _init_prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator(builder);
      
        _init_prod__Declarator__lit_var_(builder);
      
    }
  }
	
  protected static class VarDecl {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2213, 1, prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2216, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2215, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2212, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2214, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2217, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl, tmp);
	}
    protected static final void _init_prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2221, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2228, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2220, 0, "Declarator", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2226, 2, regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2222, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2223, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2224, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2225, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2229, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl(builder);
      
        _init_prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(builder);
      
    }
  }
	
  protected static class DoubleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2279, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2278, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(Parser.prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2284, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2287, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2282, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2283, 1, prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2286, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2285, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2291, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2296, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2293, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2295, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2294, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2292, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2300, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_(builder);
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(builder);
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(builder);
      
        _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(builder);
      
    }
  }
	
  protected static class Id {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SequenceStackNode<IConstructor>(2401, 0, regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2394, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2398, 1, regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode<IConstructor>(2395, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(Parser.prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2404, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2409, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2406, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2408, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2407, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2405, 1, prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_(builder);
      
        _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(builder);
      
    }
  }
	
  protected static class NonEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2414, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(Parser.prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2417, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2419, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2422, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2418, 1, prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2421, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2420, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_(builder);
      
        _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(builder);
      
    }
  }
	
  protected static class RegularExpressionClassChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2435, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2437, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2442, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2445, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2440, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2441, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2444, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2443, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2449, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2454, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2451, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2450, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2453, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2452, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_(builder);
      
        _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(builder);
      
        _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(builder);
      
        _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(builder);
      
    }
  }
	
  protected static class Whitespace {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2578, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(Parser.prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2586, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2583, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2581, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2585, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2584, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2582, 1, prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_(builder);
      
        _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(builder);
      
    }
  }
	
  protected static class HexEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2630, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2629, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2627, 1, prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2631, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2628, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2626, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence, tmp);
	}
    protected static final void _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2634, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2636, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2635, 1, "HexDigit", null, null);
      builder.addAlternative(Parser.prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence(builder);
      
        _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(builder);
      
    }
  }
	
  protected static class MethodDefinition {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[12] = new SeparatedListStackNode<IConstructor>(2853, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2851, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2852, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2843, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(2845, 6, "Param", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2841, 2, "PropertyName", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(2848, 9, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2846, 7, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(2854, 13, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2847, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(2855, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(2849, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2839, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new int[] {115,101,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2842, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2850, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2840, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2844, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(2866, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2861, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2859, 2, "PropertyName", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2865, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2864, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2857, 0, prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_, new int[] {103,101,116}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(2869, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2867, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2868, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(2871, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(2863, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2860, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2870, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2858, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2862, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2878, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2877, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2875, 1, prod__lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__77_77_char_class___range__101_101_char_class___range__116_116_char_class___range__104_104_char_class___range__111_111_char_class___range__100_100_char_class___range__68_68_char_class___range__101_101_char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,77,101,116,104,111,100,68,101,102,105,110,105,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2874, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2879, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2876, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition(builder);
      
    }
  }
	
  protected static class layouts_LAYOUTLIST {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__layouts_LAYOUTLIST__iter_star__LAYOUT_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(2928, 0, regular__iter_star__LAYOUT, new NonTerminalStackNode<IConstructor>(2923, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
      builder.addAlternative(Parser.prod__layouts_LAYOUTLIST__iter_star__LAYOUT_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__layouts_LAYOUTLIST__iter_star__LAYOUT_(builder);
      
    }
  }
	
  protected static class Comment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2975, 1, regular__iter_star__char_class___range__1_9_range__11_16777215, new CharStackNode<IConstructor>(2973, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(2972, 0, prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_, new int[] {47,47}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2980, 2, prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(2979, 1, regular__iter_star__CommentChar, new NonTerminalStackNode<IConstructor>(2978, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2977, 0, prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_, new int[] {47,42}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2983, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2985, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2984, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2987, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2986, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2988, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(builder);
      
        _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(builder);
      
    }
  }
	
  protected static class Reserved {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Reserved__lit_int_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3305, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new int[] {105,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_int_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_char_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3307, 0, prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_char_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_catch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3309, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_catch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_continue_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3311, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_continue_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_break_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3313, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_break_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_for_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3315, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_for_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_native_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3317, 0, prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_native_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_short_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3319, 0, prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_short_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_package_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3321, 0, prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_package_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_export_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3323, 0, prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_export_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_protected_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3325, 0, prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_protected_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_import_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3327, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_import_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_implements_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3329, 0, prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_implements_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3331, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_function_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_double_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3333, 0, prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_double_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_switch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3335, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_switch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_case_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3337, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_case_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3339, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_var_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_while_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3341, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_while_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_const_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3343, 0, prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_const_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_super_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3345, 0, prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_super_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_transient_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3347, 0, prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_transient_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_typeof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3349, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_typeof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3351, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_this_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throw_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3353, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throw_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_with_lit_abstract_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3356, 1, prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3355, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_with_lit_abstract_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_public_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3358, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_public_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_long_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3360, 0, prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_long_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_static_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3362, 0, prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_static_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_float_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3364, 0, prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_float_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throws_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3366, 0, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throws_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_default_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3368, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_default_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_new_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3370, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_new_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_delete_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3372, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_delete_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_try_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3374, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_try_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_private_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3376, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_private_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3378, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_true_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_volatile_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3380, 0, prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_volatile_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3382, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_null_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_finally_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3384, 0, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_finally_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_void_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3386, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_void_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_return_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3388, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_return_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3390, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_false_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_interface_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3392, 0, prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_interface_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_instanceof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3394, 0, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_instanceof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_else_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3396, 0, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_else_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_in_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3398, 0, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_in_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_synchronized_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3400, 0, prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_synchronized_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_if_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3402, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_if_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_enum_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3404, 0, prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_enum_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_byte_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3406, 0, prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_byte_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_class_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3408, 0, prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_class_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_goto_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3410, 0, prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_goto_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_final_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3412, 0, prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_final_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_extends_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3414, 0, prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_extends_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_do_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3416, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_do_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3418, 0, prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_boolean_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_debugger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3420, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_debugger_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Reserved__lit_int_(builder);
      
        _init_prod__Reserved__lit_char_(builder);
      
        _init_prod__Reserved__lit_catch_(builder);
      
        _init_prod__Reserved__lit_continue_(builder);
      
        _init_prod__Reserved__lit_break_(builder);
      
        _init_prod__Reserved__lit_for_(builder);
      
        _init_prod__Reserved__lit_native_(builder);
      
        _init_prod__Reserved__lit_short_(builder);
      
        _init_prod__Reserved__lit_package_(builder);
      
        _init_prod__Reserved__lit_export_(builder);
      
        _init_prod__Reserved__lit_protected_(builder);
      
        _init_prod__Reserved__lit_import_(builder);
      
        _init_prod__Reserved__lit_implements_(builder);
      
        _init_prod__Reserved__lit_function_(builder);
      
        _init_prod__Reserved__lit_double_(builder);
      
        _init_prod__Reserved__lit_switch_(builder);
      
        _init_prod__Reserved__lit_case_(builder);
      
        _init_prod__Reserved__lit_var_(builder);
      
        _init_prod__Reserved__lit_while_(builder);
      
        _init_prod__Reserved__lit_const_(builder);
      
        _init_prod__Reserved__lit_super_(builder);
      
        _init_prod__Reserved__lit_transient_(builder);
      
        _init_prod__Reserved__lit_typeof_(builder);
      
        _init_prod__Reserved__lit_this_(builder);
      
        _init_prod__Reserved__lit_throw_(builder);
      
        _init_prod__Reserved__lit_with_lit_abstract_(builder);
      
        _init_prod__Reserved__lit_public_(builder);
      
        _init_prod__Reserved__lit_long_(builder);
      
        _init_prod__Reserved__lit_static_(builder);
      
        _init_prod__Reserved__lit_float_(builder);
      
        _init_prod__Reserved__lit_throws_(builder);
      
        _init_prod__Reserved__lit_default_(builder);
      
        _init_prod__Reserved__lit_new_(builder);
      
        _init_prod__Reserved__lit_delete_(builder);
      
        _init_prod__Reserved__lit_try_(builder);
      
        _init_prod__Reserved__lit_private_(builder);
      
        _init_prod__Reserved__lit_true_(builder);
      
        _init_prod__Reserved__lit_volatile_(builder);
      
        _init_prod__Reserved__lit_null_(builder);
      
        _init_prod__Reserved__lit_finally_(builder);
      
        _init_prod__Reserved__lit_void_(builder);
      
        _init_prod__Reserved__lit_return_(builder);
      
        _init_prod__Reserved__lit_false_(builder);
      
        _init_prod__Reserved__lit_interface_(builder);
      
        _init_prod__Reserved__lit_instanceof_(builder);
      
        _init_prod__Reserved__lit_else_(builder);
      
        _init_prod__Reserved__lit_in_(builder);
      
        _init_prod__Reserved__lit_synchronized_(builder);
      
        _init_prod__Reserved__lit_if_(builder);
      
        _init_prod__Reserved__lit_enum_(builder);
      
        _init_prod__Reserved__lit_byte_(builder);
      
        _init_prod__Reserved__lit_class_(builder);
      
        _init_prod__Reserved__lit_goto_(builder);
      
        _init_prod__Reserved__lit_final_(builder);
      
        _init_prod__Reserved__lit_extends_(builder);
      
        _init_prod__Reserved__lit_do_(builder);
      
        _init_prod__Reserved__lit_boolean_(builder);
      
        _init_prod__Reserved__lit_debugger_(builder);
      
    }
  }
	
  protected static class Boolean {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3492, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3491, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3489, 1, prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3488, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3493, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3490, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean, tmp);
	}
    protected static final void _init_prod__Boolean__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3496, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Boolean__lit_true_, tmp);
	}
    protected static final void _init_prod__Boolean__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3498, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Boolean__lit_false_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean(builder);
      
        _init_prod__Boolean__lit_true_(builder);
      
        _init_prod__Boolean__lit_false_(builder);
      
    }
  }
	
  protected static class SingleEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3502, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(Parser.prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3507, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3510, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3505, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3506, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3509, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3508, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_(builder);
      
        _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(builder);
      
    }
  }
	
  protected static class HexInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new CharStackNode<IConstructor>(3547, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3551, 2, regular__iter__char_class___range__48_57_range__65_70_range__97_102, new CharStackNode<IConstructor>(3548, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3546, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    protected static final void _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3554, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3556, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3559, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3555, 1, prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3558, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3557, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_(builder);
      
        _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(builder);
      
    }
  }
	
  protected static class RegularExpressionBackslashSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3605, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3608, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3603, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3604, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3607, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3606, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence, tmp);
	}
    protected static final void _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3611, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3612, 1, new int[][]{{1,9},{11,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence(builder);
      
        _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(builder);
      
    }
  }
	
  protected static class EscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__EscapeSequence__char_class___range__48_48_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3712, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__EscapeSequence__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__UnicodeEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3714, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__UnicodeEscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3718, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3721, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3720, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3719, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3722, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3717, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence, tmp);
	}
    protected static final void _init_prod__EscapeSequence__HexEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3725, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__HexEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__CharacterEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3727, 0, "CharacterEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__CharacterEscapeSequence_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__EscapeSequence__char_class___range__48_48_(builder);
      
        _init_prod__EscapeSequence__UnicodeEscapeSequence_(builder);
      
        _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(builder);
      
        _init_prod__EscapeSequence__HexEscapeSequence_(builder);
      
        _init_prod__EscapeSequence__CharacterEscapeSequence_(builder);
      
    }
  }
	
  protected static class ExponentPart {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3736, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3735, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3733, 1, prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3737, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3734, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3732, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart, tmp);
	}
    protected static final void _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(3741, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(3740, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(Parser.prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3748, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3747, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3745, 1, prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3744, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3749, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3746, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart(builder);
      
        _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(builder);
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(builder);
      
    }
  }
	
  protected static class SignedInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3813, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3812, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3810, 1, prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3809, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3814, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3811, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger, tmp);
	}
    protected static final void _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(3818, 0, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode<IConstructor>(3817, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(3822, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3819, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger(builder);
      
        _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class Numeric {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Numeric__HexInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3847, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.prod__Numeric__HexInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3854, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3853, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3850, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3855, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3852, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3851, 1, prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric, tmp);
	}
    protected static final void _init_prod__Numeric__Decimal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3860, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.prod__Numeric__Decimal_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Numeric__HexInteger_(builder);
      
        _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(builder);
      
        _init_prod__Numeric__Decimal_(builder);
      
    }
  }
	
  protected static class start__Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(3870, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(3867, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3868, 1, "Source", null, null);
      builder.addAlternative(Parser.prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__start__Source__layouts_LAYOUTLIST_top_Source_layouts_LAYOUTLIST_(builder);
      
    }
  }
	
  protected static class Param {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Param__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3874, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__Param__Id_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3878, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,97,114,97,109,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3882, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3879, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3881, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3880, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3877, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(3895, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3892, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3891, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3890, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3894, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3893, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Param__Id_(builder);
      
        _init_prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param(builder);
      
    }
  }
	
  protected static class RegularExpressionClass {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4025, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4028, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4023, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4024, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4027, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4026, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass, tmp);
	}
    protected static final void _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4031, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4034, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4033, 1, regular__iter_star__RegularExpressionClassChar, new NonTerminalStackNode<IConstructor>(4032, 0, "RegularExpressionClassChar", null, null), false, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass(builder);
      
        _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(builder);
      
    }
  }
	
  protected static class Statement {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4072, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4073, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4071, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4077, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4082, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4084, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4079, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4091, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4085, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4083, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4078, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4092, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4080, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4086, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4089, 10, regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4087, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4088, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4076, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4096, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4097, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4095, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4103, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4112, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4114, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4107, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4101, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4105, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4108, 8, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4104, 4, "Declarator", null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4115, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4113, 12, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4102, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4106, 6, "ForBinding", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(4110, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4100, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4109, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4127, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4124, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4119, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4126, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4121, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4128, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4118, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4131, 10, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4120, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4125, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4122, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_, tmp);
	}
    protected static final void _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4135, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4134, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4136, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4141, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4139, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4140, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4149, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4146, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4144, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4148, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4147, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4145, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement, tmp);
	}
    protected static final void _init_prod__empty_Statement__lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4153, 0, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__empty_Statement__lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4172, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4165, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4166, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4156, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4162, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4158, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4170, 14, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4168, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4160, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4164, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4171, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4163, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4157, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4161, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4169, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4159, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4167, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4185, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4175, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4186, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4181, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4177, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4188, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4179, 4, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4183, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4180, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4176, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4182, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4178, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4187, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4209, 10, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4205, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4206, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4207, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4208, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4191, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4221, 16, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4204, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4195, 4, "Declarator", null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4218, 14, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4214, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4215, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4216, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4217, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4212, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4223, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4193, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4201, 6, regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4197, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4198, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4199, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4200, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4220, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4203, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4222, 17, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4194, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4211, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4213, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4202, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4196, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4192, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4227, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4228, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4226, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4232, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4233, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4231, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4243, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4241, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4237, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4247, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4239, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4244, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4238, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4242, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4240, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4248, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4245, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4246, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4236, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4254, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4271, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4278, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4252, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4260, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4262, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4280, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4267, 8, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4263, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4264, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4265, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4266, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4259, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4255, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4256, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4257, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4258, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4276, 12, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4272, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4273, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4274, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4275, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4279, 14, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4253, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4261, 6, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4270, 10, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4251, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4269, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4281, 16, "Statement", null, null);
      builder.addAlternative(Parser.prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4288, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4287, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4285, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4289, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4286, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4284, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4304, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4298, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4303, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4301, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4296, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4295, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4299, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4297, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4302, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(Parser.prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4311, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4308, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4307, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4312, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4309, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4318, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4316, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4315, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4319, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4317, 2, "Id", null, null);
      builder.addAlternative(Parser.prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__varDecl_Statement__VarDecl_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4322, 0, "VarDecl", null, null);
      builder.addAlternative(Parser.prod__varDecl_Statement__VarDecl_, tmp);
	}
    protected static final void _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4329, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4326, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4325, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4330, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4327, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4337, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4346, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4335, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4340, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4333, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4344, 10, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4343, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4345, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4336, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4334, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4339, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4341, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4342, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4353, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4351, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4356, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4349, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4352, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4355, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4350, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4357, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4358, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4361, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4363, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4365, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4362, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4364, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__function_Statement__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4368, 0, "Function", null, null);
      builder.addAlternative(Parser.prod__function_Statement__Function_, tmp);
	}
    protected static final void _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4371, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4377, 4, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4375, 2, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4373, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4374, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4376, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4372, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4392, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4380, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4391, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4394, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4384, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4387, 6, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4382, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4389, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4393, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4383, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4388, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4381, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4386, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4397, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4401, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4399, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4400, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4398, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4404, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4408, 4, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4406, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4410, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4407, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4409, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4405, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(builder);
      
        _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(builder);
      
        _init_prod__empty_Statement__lit___59_(builder);
      
        _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(builder);
      
        _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__varDecl_Statement__VarDecl_(builder);
      
        _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(builder);
      
        _init_prod__function_Statement__Function_(builder);
      
        _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(builder);
      
        _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(builder);
      
    }
  }
	
  protected static class LHSExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(4441, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4443, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4446, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4442, 1, prod__lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__72_72_char_class___range__83_83_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,72,83,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4445, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4444, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression, tmp);
	}
    protected static final void _init_prod__LHSExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4450, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__LHSExpression__Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression(builder);
      
        _init_prod__LHSExpression__Expression_(builder);
      
    }
  }
	
  protected static class Literal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Literal__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4563, 0, "String", null, null);
      builder.addAlternative(Parser.prod__Literal__String_, tmp);
	}
    protected static final void _init_prod__Literal__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4565, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__Literal__Numeric_, tmp);
	}
    protected static final void _init_prod__Literal__RegularExpression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4567, 0, "RegularExpression", null, null);
      builder.addAlternative(Parser.prod__Literal__RegularExpression_, tmp);
	}
    protected static final void _init_prod__Literal__Boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4569, 0, "Boolean", null, null);
      builder.addAlternative(Parser.prod__Literal__Boolean_, tmp);
	}
    protected static final void _init_prod__Literal__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4571, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Literal__lit_null_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4579, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4576, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4578, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4577, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4575, 1, prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4574, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Literal__String_(builder);
      
        _init_prod__Literal__Numeric_(builder);
      
        _init_prod__Literal__RegularExpression_(builder);
      
        _init_prod__Literal__Boolean_(builder);
      
        _init_prod__Literal__lit_null_(builder);
      
        _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(builder);
      
    }
  }
	
  protected static class ArgExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4590, 1, prod__lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4594, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4591, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4593, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4592, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4589, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression, tmp);
	}
    protected static final void _init_prod__ArgExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4597, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__ArgExpression__Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4605, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4602, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4601, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4600, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4604, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4603, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression(builder);
      
        _init_prod__ArgExpression__Expression_(builder);
      
        _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
    }
  }
	
  protected static class PropertyName {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__PropertyName__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4905, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__PropertyName__Numeric_, tmp);
	}
    protected static final void _init_prod__PropertyName__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4907, 0, "String", null, null);
      builder.addAlternative(Parser.prod__PropertyName__String_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4914, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4913, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4911, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4915, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4912, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4910, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName, tmp);
	}
    protected static final void _init_prod__PropertyName__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4918, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__PropertyName__Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__PropertyName__Numeric_(builder);
      
        _init_prod__PropertyName__String_(builder);
      
        _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(builder);
      
        _init_prod__PropertyName__Id_(builder);
      
    }
  }
	
  protected static class EscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__EscapeCharacter__char_class___range__117_117_range__120_120_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4922, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__char_class___range__117_117_range__120_120_, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4924, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__SingleEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4932, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4929, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4927, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4931, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4930, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4928, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4935, 0, new int[][]{{48,57}}, null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__EscapeCharacter__char_class___range__117_117_range__120_120_(builder);
      
        _init_prod__EscapeCharacter__SingleEscapeCharacter_(builder);
      
        _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(builder);
      
        _init_prod__EscapeCharacter__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class CharacterEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5053, 1, prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5056, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5055, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5054, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5057, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5052, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5060, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__CharacterEscapeSequence__NonEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5062, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__CharacterEscapeSequence__SingleEscapeCharacter_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence(builder);
      
        _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(builder);
      
        _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(builder);
      
    }
  }
	
  protected static class RegularExpressionChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5166, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5168, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5170, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5174, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5177, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5176, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5175, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5178, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5173, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5184, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5187, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5186, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5185, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5188, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5183, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__RegularExpressionChar__RegularExpressionClass_(builder);
      
        _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(builder);
      
        _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(builder);
      
        _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(builder);
      
        _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(builder);
      
    }
  }
	
  protected static class PropertyAssignment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5195, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5196, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5198, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5194, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5197, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5205, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5204, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5201, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5203, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5202, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5206, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment, tmp);
	}
    protected static final void _init_prod__PropertyAssignment__MethodDefinition_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5209, 0, "MethodDefinition", null, null);
      builder.addAlternative(Parser.prod__PropertyAssignment__MethodDefinition_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5212, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5214, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5216, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5215, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5217, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5213, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(builder);
      
        _init_prod__PropertyAssignment__MethodDefinition_(builder);
      
        _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
    }
  }
	
  protected static class Initializer {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5306, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5304, 0, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5305, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5309, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5311, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5314, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5310, 1, prod__lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5313, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5312, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer(builder);
      
    }
  }
	
  protected static class LAYOUT {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5321, 1, prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5324, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5323, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5322, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5325, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5320, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Whitespace_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5328, 0, "Whitespace", null, null);
      builder.addAlternative(Parser.prod__LAYOUT__Whitespace_, tmp);
	}
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5336, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5333, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5331, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5335, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5334, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5332, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Comment_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5340, 0, "Comment", null, null);
      builder.addAlternative(Parser.prod__LAYOUT__Comment_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT(builder);
      
        _init_prod__LAYOUT__Whitespace_(builder);
      
        _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(builder);
      
        _init_prod__LAYOUT__Comment_(builder);
      
    }
  }
	
  protected static class DecimalInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__DecimalInteger__char_class___range__48_48_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5385, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5387, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5391, 1, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(5388, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5399, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5396, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5398, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5397, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5394, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5395, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__DecimalInteger__char_class___range__48_48_(builder);
      
        _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(builder);
      
        _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(builder);
      
    }
  }
	
  protected static class LetOrConst {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__LetOrConst__lit_let_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(5491, 0, prod__lit_let__char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_, new int[] {108,101,116}, null, null);
      builder.addAlternative(Parser.prod__LetOrConst__lit_let_, tmp);
	}
    protected static final void _init_prod__LetOrConst__lit_const_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(5493, 0, prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.prod__LetOrConst__lit_const_, tmp);
	}
    protected static final void _init_prod__$MetaHole_LetOrConst__char_class___range__0_0_lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LetOrConst(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5498, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5501, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5496, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5497, 1, prod__lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__101_101_char_class___range__116_116_char_class___range__79_79_char_class___range__114_114_char_class___range__67_67_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,101,116,79,114,67,111,110,115,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5500, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5499, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LetOrConst__char_class___range__0_0_lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LetOrConst, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__LetOrConst__lit_let_(builder);
      
        _init_prod__LetOrConst__lit_const_(builder);
      
        _init_prod__$MetaHole_LetOrConst__char_class___range__0_0_lit___115_111_114_116_40_34_76_101_116_79_114_67_111_110_115_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LetOrConst(builder);
      
    }
  }
	
  protected static class VariableDeclarationNoIn {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5562, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5565, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5560, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5561, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5564, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5563, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5571, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5574, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5569, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5570, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5573, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5572, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5582, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__nonInit_VariableDeclarationNoIn__id_Id_, tmp);
	}
    protected static final void _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5586, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5592, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5589, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5590, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5588, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn(builder);
      
        _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(builder);
      
        _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
    }
  }
	
  protected static class SingleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5711, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5714, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5719, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5716, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5718, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5717, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5715, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar, tmp);
	}
    protected static final void _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5722, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5723, 1, "EscapeSequence", null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5731, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5728, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5730, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5729, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5726, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5727, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_(builder);
      
        _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(builder);
      
        _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(builder);
      
        _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(builder);
      
    }
  }
	
  protected static class Params {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(5975, 0, regular__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(5971, 0, "Param", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5972, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(5973, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(5974, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5984, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5981, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5979, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5983, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5982, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5980, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,115,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
        _init_prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params(builder);
      
    }
  }
	
  // Parse methods    
  
  public AbstractStackNode<IConstructor>[] String() {
    return String.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Decimal() {
    return Decimal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Function() {
    return Function.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Expression() {
    return Expression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_$default$() {
    return layouts_$default$.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFlags() {
    return RegularExpressionFlags.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Source() {
    return Source.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionFirstChar() {
    return RegularExpressionFirstChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexDigit() {
    return HexDigit.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CommentChar() {
    return CommentChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ForBinding() {
    return ForBinding.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpression() {
    return RegularExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] UnicodeEscapeSequence() {
    return UnicodeEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CaseClause() {
    return CaseClause.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclaration() {
    return VariableDeclaration.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBody() {
    return RegularExpressionBody.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Declarator() {
    return Declarator.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VarDecl() {
    return VarDecl.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DoubleStringChar() {
    return DoubleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Id() {
    return Id.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] NonEscapeCharacter() {
    return NonEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClassChar() {
    return RegularExpressionClassChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Whitespace() {
    return Whitespace.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexEscapeSequence() {
    return HexEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] MethodDefinition() {
    return MethodDefinition.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] layouts_LAYOUTLIST() {
    return layouts_LAYOUTLIST.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Comment() {
    return Comment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Reserved() {
    return Reserved.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Boolean() {
    return Boolean.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleEscapeCharacter() {
    return SingleEscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] HexInteger() {
    return HexInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionBackslashSequence() {
    return RegularExpressionBackslashSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeSequence() {
    return EscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ExponentPart() {
    return ExponentPart.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SignedInteger() {
    return SignedInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Numeric() {
    return Numeric.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] start__Source() {
    return start__Source.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Param() {
    return Param.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionClass() {
    return RegularExpressionClass.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Statement() {
    return Statement.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LHSExpression() {
    return LHSExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Literal() {
    return Literal.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] ArgExpression() {
    return ArgExpression.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyName() {
    return PropertyName.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeCharacter() {
    return EscapeCharacter.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CharacterEscapeSequence() {
    return CharacterEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] RegularExpressionChar() {
    return RegularExpressionChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] PropertyAssignment() {
    return PropertyAssignment.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Initializer() {
    return Initializer.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LAYOUT() {
    return LAYOUT.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] DecimalInteger() {
    return DecimalInteger.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] LetOrConst() {
    return LetOrConst.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] VariableDeclarationNoIn() {
    return VariableDeclarationNoIn.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] SingleStringChar() {
    return SingleStringChar.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] Params() {
    return Params.EXPECTS;
  }
}