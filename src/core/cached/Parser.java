package core.cached;

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
    
    
    
    
    _putDontNest(result, 445, 684);
    
    _putDontNest(result, 691, 712);
    
    _putDontNest(result, 507, 719);
    
    _putDontNest(result, 445, 603);
    
    _putDontNest(result, 516, 596);
    
    _putDontNest(result, 535, 361);
    
    _putDontNest(result, 599, 719);
    
    _putDontNest(result, 544, 361);
    
    _putDontNest(result, 643, 789);
    
    _putDontNest(result, 525, 761);
    
    _putDontNest(result, 554, 747);
    
    _putDontNest(result, 560, 754);
    
    _putDontNest(result, 560, 775);
    
    _putDontNest(result, 582, 691);
    
    _putDontNest(result, 599, 610);
    
    _putDontNest(result, 535, 627);
    
    _putDontNest(result, 503, 684);
    
    _putDontNest(result, 599, 726);
    
    _putDontNest(result, 507, 775);
    
    _putDontNest(result, 454, 684);
    
    _putDontNest(result, 507, 754);
    
    _putDontNest(result, 574, 733);
    
    _putDontNest(result, 585, 789);
    
    _putDontNest(result, 430, 574);
    
    _putDontNest(result, 617, 704);
    
    _putDontNest(result, 589, 677);
    
    _putDontNest(result, 507, 610);
    
    _putDontNest(result, 531, 531);
    
    _putDontNest(result, 454, 603);
    
    _putDontNest(result, 708, 712);
    
    _putDontNest(result, 507, 726);
    
    _putDontNest(result, 599, 775);
    
    _putDontNest(result, 503, 603);
    
    _putDontNest(result, 599, 754);
    
    _putDontNest(result, 610, 650);
    
    _putDontNest(result, 617, 582);
    
    _putDontNest(result, 574, 668);
    
    _putDontNest(result, 560, 719);
    
    _putDontNest(result, 671, 768);
    
    _putDontNest(result, 430, 761);
    
    _putDontNest(result, 414, 589);
    
    _putDontNest(result, 574, 796);
    
    _putDontNest(result, 522, 659);
    
    _putDontNest(result, 449, 627);
    
    _putDontNest(result, 525, 574);
    
    _putDontNest(result, 684, 684);
    
    _putDontNest(result, 677, 789);
    
    _putDontNest(result, 662, 761);
    
    _putDontNest(result, 560, 726);
    
    _putDontNest(result, 560, 610);
    
    _putDontNest(result, 757, 712);
    
    _putDontNest(result, 606, 754);
    
    _putDontNest(result, 606, 775);
    
    _putDontNest(result, 643, 691);
    
    _putDontNest(result, 454, 462);
    
    _putDontNest(result, 449, 361);
    
    _putDontNest(result, 592, 355);
    
    _putDontNest(result, 531, 582);
    
    _putDontNest(result, 582, 789);
    
    _putDontNest(result, 516, 768);
    
    _putDontNest(result, 792, 361);
    
    _putDontNest(result, 522, 643);
    
    _putDontNest(result, 414, 567);
    
    _putDontNest(result, 585, 691);
    
    _putDontNest(result, 687, 761);
    
    _putDontNest(result, 491, 650);
    
    _putDontNest(result, 481, 513);
    
    _putDontNest(result, 474, 550);
    
    _putDontNest(result, 606, 719);
    
    _putDontNest(result, 764, 747);
    
    _putDontNest(result, 498, 677);
    
    _putDontNest(result, 606, 726);
    
    _putDontNest(result, 606, 610);
    
    _putDontNest(result, 449, 491);
    
    _putDontNest(result, 544, 627);
    
    _putDontNest(result, 677, 691);
    
    _putDontNest(result, 498, 541);
    
    _putDontNest(result, 516, 617);
    
    _putDontNest(result, 531, 704);
    
    _putDontNest(result, 596, 684);
    
    _putDontNest(result, 617, 733);
    
    _putDontNest(result, 606, 747);
    
    _putDontNest(result, 421, 636);
    
    _putDontNest(result, 779, 733);
    
    _putDontNest(result, 531, 796);
    
    _putDontNest(result, 498, 589);
    
    _putDontNest(result, 513, 550);
    
    _putDontNest(result, 531, 668);
    
    _putDontNest(result, 779, 377);
    
    _putDontNest(result, 578, 355);
    
    _putDontNest(result, 430, 650);
    
    _putDontNest(result, 764, 775);
    
    _putDontNest(result, 764, 754);
    
    _putDontNest(result, 617, 668);
    
    _putDontNest(result, 574, 582);
    
    _putDontNest(result, 610, 761);
    
    _putDontNest(result, 498, 567);
    
    _putDontNest(result, 639, 361);
    
    _putDontNest(result, 596, 603);
    
    _putDontNest(result, 589, 589);
    
    _putDontNest(result, 522, 560);
    
    _putDontNest(result, 764, 726);
    
    _putDontNest(result, 467, 627);
    
    _putDontNest(result, 574, 704);
    
    _putDontNest(result, 414, 677);
    
    _putDontNest(result, 414, 541);
    
    _putDontNest(result, 525, 650);
    
    _putDontNest(result, 621, 627);
    
    _putDontNest(result, 563, 361);
    
    _putDontNest(result, 764, 719);
    
    _putDontNest(result, 550, 684);
    
    _putDontNest(result, 531, 733);
    
    _putDontNest(result, 421, 712);
    
    _putDontNest(result, 621, 361);
    
    _putDontNest(result, 563, 627);
    
    _putDontNest(result, 554, 610);
    
    _putDontNest(result, 481, 691);
    
    _putDontNest(result, 554, 726);
    
    _putDontNest(result, 627, 677);
    
    _putDontNest(result, 630, 636);
    
    _putDontNest(result, 743, 712);
    
    _putDontNest(result, 639, 627);
    
    _putDontNest(result, 491, 574);
    
    _putDontNest(result, 599, 747);
    
    _putDontNest(result, 630, 712);
    
    _putDontNest(result, 554, 719);
    
    _putDontNest(result, 491, 761);
    
    _putDontNest(result, 507, 747);
    
    _putDontNest(result, 653, 768);
    
    _putDontNest(result, 779, 796);
    
    _putDontNest(result, 560, 747);
    
    _putDontNest(result, 430, 503);
    
    _putDontNest(result, 554, 775);
    
    _putDontNest(result, 449, 486);
    
    _putDontNest(result, 554, 754);
    
    _putDontNest(result, 736, 789);
    
    _putDontNest(result, 617, 796);
    
    _putDontNest(result, 481, 789);
    
    _putDontNest(result, 695, 768);
    
    _putDontNest(result, 680, 768);
    
    _putDontNest(result, 550, 603);
    
    _putDontNest(result, 792, 355);
    
    _putDontNest(result, 653, 659);
    
    _putDontNest(result, 687, 733);
    
    _putDontNest(result, 729, 768);
    
    _putDontNest(result, 662, 668);
    
    _putDontNest(result, 491, 531);
    
    _putDontNest(result, 491, 582);
    
    _putDontNest(result, 516, 560);
    
    _putDontNest(result, 687, 796);
    
    _putDontNest(result, 449, 355);
    
    _putDontNest(result, 491, 704);
    
    _putDontNest(result, 592, 361);
    
    _putDontNest(result, 462, 589);
    
    _putDontNest(result, 574, 574);
    
    _putDontNest(result, 610, 704);
    
    _putDontNest(result, 525, 796);
    
    _putDontNest(result, 507, 636);
    
    _putDontNest(result, 691, 775);
    
    _putDontNest(result, 691, 754);
    
    _putDontNest(result, 757, 719);
    
    _putDontNest(result, 541, 677);
    
    _putDontNest(result, 430, 733);
    
    _putDontNest(result, 708, 726);
    
    _putDontNest(result, 585, 740);
    
    _putDontNest(result, 507, 712);
    
    _putDontNest(result, 462, 567);
    
    _putDontNest(result, 659, 684);
    
    _putDontNest(result, 592, 627);
    
    _putDontNest(result, 757, 726);
    
    _putDontNest(result, 560, 712);
    
    _putDontNest(result, 643, 740);
    
    _putDontNest(result, 541, 541);
    
    _putDontNest(result, 662, 733);
    
    _putDontNest(result, 708, 719);
    
    _putDontNest(result, 525, 668);
    
    _putDontNest(result, 560, 636);
    
    _putDontNest(result, 421, 747);
    
    _putDontNest(result, 525, 733);
    
    _putDontNest(result, 636, 684);
    
    _putDontNest(result, 757, 775);
    
    _putDontNest(result, 757, 754);
    
    _putDontNest(result, 691, 719);
    
    _putDontNest(result, 677, 740);
    
    _putDontNest(result, 430, 796);
    
    _putDontNest(result, 691, 726);
    
    _putDontNest(result, 599, 636);
    
    _putDontNest(result, 574, 761);
    
    _putDontNest(result, 743, 747);
    
    _putDontNest(result, 617, 650);
    
    _putDontNest(result, 610, 582);
    
    _putDontNest(result, 430, 668);
    
    _putDontNest(result, 599, 712);
    
    _putDontNest(result, 544, 355);
    
    _putDontNest(result, 662, 796);
    
    _putDontNest(result, 708, 775);
    
    _putDontNest(result, 630, 747);
    
    _putDontNest(result, 708, 754);
    
    _putDontNest(result, 535, 355);
    
    _putDontNest(result, 606, 636);
    
    _putDontNest(result, 531, 650);
    
    _putDontNest(result, 582, 740);
    
    _putDontNest(result, 606, 712);
    
    _putDontNest(result, 541, 589);
    
    _putDontNest(result, 486, 550);
    
    _putDontNest(result, 662, 704);
    
    _putDontNest(result, 610, 733);
    
    _putDontNest(result, 687, 704);
    
    _putDontNest(result, 491, 668);
    
    _putDontNest(result, 541, 567);
    
    _putDontNest(result, 462, 677);
    
    _putDontNest(result, 630, 726);
    
    _putDontNest(result, 779, 761);
    
    _putDontNest(result, 421, 719);
    
    _putDontNest(result, 691, 747);
    
    _putDontNest(result, 743, 726);
    
    _putDontNest(result, 621, 355);
    
    _putDontNest(result, 503, 522);
    
    _putDontNest(result, 617, 761);
    
    _putDontNest(result, 563, 355);
    
    _putDontNest(result, 430, 582);
    
    _putDontNest(result, 454, 522);
    
    _putDontNest(result, 574, 650);
    
    _putDontNest(result, 764, 712);
    
    _putDontNest(result, 610, 668);
    
    _putDontNest(result, 650, 677);
    
    _putDontNest(result, 736, 740);
    
    _putDontNest(result, 610, 796);
    
    _putDontNest(result, 525, 704);
    
    _putDontNest(result, 639, 355);
    
    _putDontNest(result, 522, 617);
    
    _putDontNest(result, 445, 522);
    
    _putDontNest(result, 481, 740);
    
    _putDontNest(result, 522, 596);
    
    _putDontNest(result, 525, 582);
    
    _putDontNest(result, 430, 704);
    
    _putDontNest(result, 516, 643);
    
    _putDontNest(result, 522, 768);
    
    _putDontNest(result, 578, 361);
    
    _putDontNest(result, 630, 775);
    
    _putDontNest(result, 630, 754);
    
    _putDontNest(result, 708, 747);
    
    _putDontNest(result, 743, 775);
    
    _putDontNest(result, 743, 754);
    
    _putDontNest(result, 491, 733);
    
    _putDontNest(result, 578, 627);
    
    _putDontNest(result, 516, 659);
    
    _putDontNest(result, 715, 768);
    
    _putDontNest(result, 531, 574);
    
    _putDontNest(result, 668, 768);
    
    _putDontNest(result, 421, 754);
    
    _putDontNest(result, 757, 747);
    
    _putDontNest(result, 421, 775);
    
    _putDontNest(result, 630, 719);
    
    _putDontNest(result, 554, 712);
    
    _putDontNest(result, 531, 761);
    
    _putDontNest(result, 421, 610);
    
    _putDontNest(result, 421, 726);
    
    _putDontNest(result, 462, 541);
    
    _putDontNest(result, 430, 531);
    
    _putDontNest(result, 743, 719);
    
    _putDontNest(result, 554, 636);
    
    _putDontNest(result, 491, 796);
    
    _putDontNest(result, 563, 733);
    
    _putDontNest(result, 544, 582);
    
    _putDontNest(result, 560, 596);
    
    _putDontNest(result, 621, 668);
    
    _putDontNest(result, 630, 659);
    
    _putDontNest(result, 639, 733);
    
    _putDontNest(result, 481, 567);
    
    _putDontNest(result, 671, 754);
    
    _putDontNest(result, 671, 775);
    
    _putDontNest(result, 630, 643);
    
    _putDontNest(result, 560, 617);
    
    _putDontNest(result, 414, 513);
    
    _putDontNest(result, 599, 768);
    
    _putDontNest(result, 449, 531);
    
    _putDontNest(result, 421, 643);
    
    _putDontNest(result, 507, 617);
    
    _putDontNest(result, 599, 596);
    
    _putDontNest(result, 498, 789);
    
    _putDontNest(result, 589, 691);
    
    _putDontNest(result, 544, 704);
    
    _putDontNest(result, 550, 550);
    
    _putDontNest(result, 531, 627);
    
    _putDontNest(result, 560, 768);
    
    _putDontNest(result, 671, 719);
    
    _putDontNest(result, 563, 668);
    
    _putDontNest(result, 639, 796);
    
    _putDontNest(result, 729, 712);
    
    _putDontNest(result, 653, 747);
    
    _putDontNest(result, 507, 596);
    
    _putDontNest(result, 599, 617);
    
    _putDontNest(result, 578, 761);
    
    _putDontNest(result, 671, 726);
    
    _putDontNest(result, 582, 677);
    
    _putDontNest(result, 507, 768);
    
    _putDontNest(result, 750, 740);
    
    _putDontNest(result, 563, 796);
    
    _putDontNest(result, 639, 668);
    
    _putDontNest(result, 535, 582);
    
    _putDontNest(result, 606, 617);
    
    _putDontNest(result, 592, 650);
    
    _putDontNest(result, 621, 796);
    
    _putDontNest(result, 513, 684);
    
    _putDontNest(result, 467, 668);
    
    _putDontNest(result, 516, 610);
    
    _putDontNest(result, 516, 726);
    
    _putDontNest(result, 498, 691);
    
    _putDontNest(result, 603, 603);
    
    _putDontNest(result, 589, 789);
    
    _putDontNest(result, 449, 704);
    
    _putDontNest(result, 467, 796);
    
    _putDontNest(result, 516, 719);
    
    _putDontNest(result, 695, 747);
    
    _putDontNest(result, 680, 747);
    
    _putDontNest(result, 414, 467);
    
    _putDontNest(result, 449, 582);
    
    _putDontNest(result, 603, 684);
    
    _putDontNest(result, 621, 733);
    
    _putDontNest(result, 541, 740);
    
    _putDontNest(result, 585, 677);
    
    _putDontNest(result, 606, 768);
    
    _putDontNest(result, 643, 677);
    
    _putDontNest(result, 535, 704);
    
    _putDontNest(result, 421, 659);
    
    _putDontNest(result, 606, 596);
    
    _putDontNest(result, 467, 733);
    
    _putDontNest(result, 516, 754);
    
    _putDontNest(result, 516, 775);
    
    _putDontNest(result, 481, 589);
    
    _putDontNest(result, 617, 627);
    
    _putDontNest(result, 513, 603);
    
    _putDontNest(result, 544, 668);
    
    _putDontNest(result, 563, 704);
    
    _putDontNest(result, 445, 550);
    
    _putDontNest(result, 503, 550);
    
    _putDontNest(result, 498, 513);
    
    _putDontNest(result, 474, 684);
    
    _putDontNest(result, 668, 712);
    
    _putDontNest(result, 535, 796);
    
    _putDontNest(result, 653, 719);
    
    _putDontNest(result, 522, 636);
    
    _putDontNest(result, 430, 355);
    
    _putDontNest(result, 563, 582);
    
    _putDontNest(result, 462, 740);
    
    _putDontNest(result, 695, 726);
    
    _putDontNest(result, 467, 531);
    
    _putDontNest(result, 680, 726);
    
    _putDontNest(result, 414, 691);
    
    _putDontNest(result, 613, 603);
    
    _putDontNest(result, 680, 775);
    
    _putDontNest(result, 486, 522);
    
    _putDontNest(result, 695, 754);
    
    _putDontNest(result, 695, 775);
    
    _putDontNest(result, 544, 733);
    
    _putDontNest(result, 680, 754);
    
    _putDontNest(result, 704, 740);
    
    _putDontNest(result, 613, 684);
    
    _putDontNest(result, 454, 550);
    
    _putDontNest(result, 764, 768);
    
    _putDontNest(result, 639, 704);
    
    _putDontNest(result, 771, 789);
    
    _putDontNest(result, 525, 355);
    
    _putDontNest(result, 582, 589);
    
    _putDontNest(result, 627, 789);
    
    _putDontNest(result, 535, 733);
    
    _putDontNest(result, 554, 596);
    
    _putDontNest(result, 449, 796);
    
    _putDontNest(result, 574, 627);
    
    _putDontNest(result, 467, 704);
    
    _putDontNest(result, 792, 796);
    
    _putDontNest(result, 567, 603);
    
    _putDontNest(result, 554, 768);
    
    _putDontNest(result, 449, 668);
    
    _putDontNest(result, 653, 754);
    
    _putDontNest(result, 653, 775);
    
    _putDontNest(result, 414, 789);
    
    _putDontNest(result, 621, 704);
    
    _putDontNest(result, 481, 541);
    
    _putDontNest(result, 567, 684);
    
    _putDontNest(result, 687, 355);
    
    _putDontNest(result, 715, 712);
    
    _putDontNest(result, 585, 589);
    
    _putDontNest(result, 653, 726);
    
    _putDontNest(result, 421, 560);
    
    _putDontNest(result, 449, 733);
    
    _putDontNest(result, 646, 684);
    
    _putDontNest(result, 592, 761);
    
    _putDontNest(result, 474, 603);
    
    _putDontNest(result, 792, 733);
    
    _putDontNest(result, 535, 668);
    
    _putDontNest(result, 650, 740);
    
    _putDontNest(result, 481, 677);
    
    _putDontNest(result, 554, 617);
    
    _putDontNest(result, 627, 691);
    
    _putDontNest(result, 467, 582);
    
    _putDontNest(result, 671, 747);
    
    _putDontNest(result, 544, 796);
    
    _putDontNest(result, 522, 712);
    
    _putDontNest(result, 662, 355);
    
    _putDontNest(result, 695, 719);
    
    _putDontNest(result, 516, 747);
    
    _putDontNest(result, 578, 650);
    
    _putDontNest(result, 680, 719);
    
    _putDontNest(result, 516, 712);
    
    _putDontNest(result, 454, 481);
    
    _putDontNest(result, 541, 789);
    
    _putDontNest(result, 449, 650);
    
    _putDontNest(result, 757, 768);
    
    _putDontNest(result, 729, 726);
    
    _putDontNest(result, 449, 503);
    
    _putDontNest(result, 671, 712);
    
    _putDontNest(result, 691, 768);
    
    _putDontNest(result, 578, 796);
    
    _putDontNest(result, 541, 691);
    
    _putDontNest(result, 621, 761);
    
    _putDontNest(result, 589, 740);
    
    _putDontNest(result, 474, 522);
    
    _putDontNest(result, 467, 574);
    
    _putDontNest(result, 522, 747);
    
    _putDontNest(result, 610, 627);
    
    _putDontNest(result, 592, 704);
    
    _putDontNest(result, 516, 636);
    
    _putDontNest(result, 668, 747);
    
    _putDontNest(result, 498, 740);
    
    _putDontNest(result, 715, 747);
    
    _putDontNest(result, 486, 603);
    
    _putDontNest(result, 708, 768);
    
    _putDontNest(result, 491, 627);
    
    _putDontNest(result, 578, 733);
    
    _putDontNest(result, 729, 719);
    
    _putDontNest(result, 430, 486);
    
    _putDontNest(result, 570, 684);
    
    _putDontNest(result, 639, 761);
    
    _putDontNest(result, 507, 560);
    
    _putDontNest(result, 578, 668);
    
    _putDontNest(result, 570, 603);
    
    _putDontNest(result, 750, 789);
    
    _putDontNest(result, 486, 684);
    
    _putDontNest(result, 554, 643);
    
    _putDontNest(result, 544, 650);
    
    _putDontNest(result, 729, 754);
    
    _putDontNest(result, 729, 775);
    
    _putDontNest(result, 560, 560);
    
    _putDontNest(result, 563, 761);
    
    _putDontNest(result, 462, 513);
    
    _putDontNest(result, 554, 659);
    
    _putDontNest(result, 467, 761);
    
    _putDontNest(result, 535, 650);
    
    _putDontNest(result, 592, 582);
    
    _putDontNest(result, 525, 361);
    
    _putDontNest(result, 639, 650);
    
    _putDontNest(result, 430, 491);
    
    _putDontNest(result, 578, 582);
    
    _putDontNest(result, 560, 659);
    
    _putDontNest(result, 544, 574);
    
    _putDontNest(result, 715, 726);
    
    _putDontNest(result, 430, 627);
    
    _putDontNest(result, 467, 650);
    
    _putDontNest(result, 592, 796);
    
    _putDontNest(result, 621, 650);
    
    _putDontNest(result, 421, 768);
    
    _putDontNest(result, 715, 754);
    
    _putDontNest(result, 449, 574);
    
    _putDontNest(result, 715, 775);
    
    _putDontNest(result, 421, 474);
    
    _putDontNest(result, 525, 627);
    
    _putDontNest(result, 668, 775);
    
    _putDontNest(result, 668, 754);
    
    _putDontNest(result, 544, 761);
    
    _putDontNest(result, 462, 789);
    
    _putDontNest(result, 599, 659);
    
    _putDontNest(result, 606, 643);
    
    _putDontNest(result, 563, 650);
    
    _putDontNest(result, 522, 754);
    
    _putDontNest(result, 522, 775);
    
    _putDontNest(result, 650, 691);
    
    _putDontNest(result, 454, 498);
    
    _putDontNest(result, 430, 361);
    
    _putDontNest(result, 627, 740);
    
    _putDontNest(result, 522, 726);
    
    _putDontNest(result, 522, 610);
    
    _putDontNest(result, 578, 704);
    
    _putDontNest(result, 771, 740);
    
    _putDontNest(result, 662, 361);
    
    _putDontNest(result, 704, 789);
    
    _putDontNest(result, 522, 719);
    
    _putDontNest(result, 695, 712);
    
    _putDontNest(result, 507, 659);
    
    _putDontNest(result, 680, 712);
    
    _putDontNest(result, 560, 643);
    
    _putDontNest(result, 462, 691);
    
    _putDontNest(result, 729, 747);
    
    _putDontNest(result, 653, 712);
    
    _putDontNest(result, 449, 761);
    
    _putDontNest(result, 414, 740);
    
    _putDontNest(result, 668, 726);
    
    _putDontNest(result, 792, 761);
    
    _putDontNest(result, 592, 733);
    
    _putDontNest(result, 668, 719);
    
    _putDontNest(result, 513, 522);
    
    _putDontNest(result, 535, 574);
    
    _putDontNest(result, 715, 719);
    
    _putDontNest(result, 687, 361);
    
    _putDontNest(result, 421, 617);
    
    _putDontNest(result, 507, 643);
    
    _putDontNest(result, 650, 789);
    
    _putDontNest(result, 743, 768);
    
    _putDontNest(result, 592, 668);
    
    _putDontNest(result, 630, 768);
    
    _putDontNest(result, 535, 761);
    
    _putDontNest(result, 606, 659);
    
    _putDontNest(result, 421, 596);
    
    _putDontNest(result, 599, 643);
    
    _putDontNest(result, 445, 761);
    
    _putDontNest(result, 722, 761);
    
    _putDontNest(result, 430, 603);
    
    _putDontNest(result, 430, 684);
    
    _putDontNest(result, 636, 668);
    
    _putDontNest(result, 4581, 377);
    
    _putDontNest(result, 414, 659);
    
    _putDontNest(result, 541, 617);
    
    _putDontNest(result, 421, 467);
    
    _putDontNest(result, 646, 355);
    
    _putDontNest(result, 522, 589);
    
    _putDontNest(result, 582, 636);
    
    _putDontNest(result, 449, 498);
    
    _putDontNest(result, 599, 740);
    
    _putDontNest(result, 636, 733);
    
    _putDontNest(result, 525, 684);
    
    _putDontNest(result, 708, 789);
    
    _putDontNest(result, 659, 796);
    
    _putDontNest(result, 550, 650);
    
    _putDontNest(result, 677, 712);
    
    _putDontNest(result, 757, 789);
    
    _putDontNest(result, 454, 761);
    
    _putDontNest(result, 659, 668);
    
    _putDontNest(result, 503, 761);
    
    _putDontNest(result, 498, 560);
    
    _putDontNest(result, 613, 355);
    
    _putDontNest(result, 454, 574);
    
    _putDontNest(result, 636, 796);
    
    _putDontNest(result, 522, 567);
    
    _putDontNest(result, 627, 659);
    
    _putDontNest(result, 414, 643);
    
    _putDontNest(result, 596, 650);
    
    _putDontNest(result, 503, 574);
    
    _putDontNest(result, 643, 712);
    
    _putDontNest(result, 659, 733);
    
    _putDontNest(result, 560, 740);
    
    _putDontNest(result, 684, 761);
    
    _putDontNest(result, 750, 768);
    
    _putDontNest(result, 585, 712);
    
    _putDontNest(result, 507, 740);
    
    _putDontNest(result, 691, 789);
    
    _putDontNest(result, 525, 603);
    
    _putDontNest(result, 585, 636);
    
    _putDontNest(result, 421, 513);
    
    _putDontNest(result, 662, 684);
    
    _putDontNest(result, 445, 574);
    
    _putDontNest(result, 541, 768);
    
    _putDontNest(result, 582, 712);
    
    _putDontNest(result, 606, 740);
    
    _putDontNest(result, 691, 691);
    
    _putDontNest(result, 531, 522);
    
    _putDontNest(result, 430, 462);
    
    _putDontNest(result, 541, 596);
    
    _putDontNest(result, 596, 761);
    
    _putDontNest(result, 659, 704);
    
    _putDontNest(result, 610, 684);
    
    _putDontNest(result, 449, 481);
    
    _putDontNest(result, 522, 541);
    
    _putDontNest(result, 491, 603);
    
    _putDontNest(result, 570, 627);
    
    _putDontNest(result, 630, 789);
    
    _putDontNest(result, 445, 456);
    
    _putDontNest(result, 462, 596);
    
    _putDontNest(result, 550, 574);
    
    _putDontNest(result, 498, 659);
    
    _putDontNest(result, 430, 445);
    
    _putDontNest(result, 570, 361);
    
    _putDontNest(result, 462, 768);
    
    _putDontNest(result, 503, 650);
    
    _putDontNest(result, 704, 768);
    
    _putDontNest(result, 454, 650);
    
    _putDontNest(result, 481, 712);
    
    _putDontNest(result, 589, 643);
    
    _putDontNest(result, 421, 691);
    
    _putDontNest(result, 736, 712);
    
    _putDontNest(result, 481, 636);
    
    _putDontNest(result, 610, 603);
    
    _putDontNest(result, 630, 691);
    
    _putDontNest(result, 462, 617);
    
    _putDontNest(result, 636, 704);
    
    _putDontNest(result, 550, 761);
    
    _putDontNest(result, 445, 650);
    
    _putDontNest(result, 668, 677);
    
    _putDontNest(result, 764, 740);
    
    _putDontNest(result, 486, 627);
    
    _putDontNest(result, 589, 659);
    
    _putDontNest(result, 454, 503);
    
    _putDontNest(result, 414, 560);
    
    _putDontNest(result, 522, 677);
    
    _putDontNest(result, 554, 740);
    
    _putDontNest(result, 421, 789);
    
    _putDontNest(result, 491, 684);
    
    _putDontNest(result, 498, 643);
    
    _putDontNest(result, 650, 768);
    
    _putDontNest(result, 743, 789);
    
    _putDontNest(result, 449, 550);
    
    _putDontNest(result, 646, 361);
    
    _putDontNest(result, 606, 789);
    
    _putDontNest(result, 574, 603);
    
    _putDontNest(result, 691, 740);
    
    _putDontNest(result, 677, 719);
    
    _putDontNest(result, 613, 627);
    
    _putDontNest(result, 582, 719);
    
    _putDontNest(result, 507, 691);
    
    _putDontNest(result, 589, 617);
    
    _putDontNest(result, 650, 659);
    
    _putDontNest(result, 541, 560);
    
    _putDontNest(result, 582, 775);
    
    _putDontNest(result, 582, 754);
    
    _putDontNest(result, 462, 643);
    
    _putDontNest(result, 491, 522);
    
    _putDontNest(result, 560, 691);
    
    _putDontNest(result, 643, 726);
    
    _putDontNest(result, 757, 740);
    
    _putDontNest(result, 454, 668);
    
    _putDontNest(result, 659, 761);
    
    _putDontNest(result, 585, 719);
    
    _putDontNest(result, 498, 768);
    
    _putDontNest(result, 677, 754);
    
    _putDontNest(result, 596, 704);
    
    _putDontNest(result, 445, 796);
    
    _putDontNest(result, 677, 775);
    
    _putDontNest(result, 503, 668);
    
    _putDontNest(result, 550, 582);
    
    _putDontNest(result, 503, 796);
    
    _putDontNest(result, 445, 668);
    
    _putDontNest(result, 498, 596);
    
    _putDontNest(result, 599, 789);
    
    _putDontNest(result, 643, 719);
    
    _putDontNest(result, 454, 796);
    
    _putDontNest(result, 684, 733);
    
    _putDontNest(result, 646, 627);
    
    _putDontNest(result, 585, 726);
    
    _putDontNest(result, 708, 740);
    
    _putDontNest(result, 585, 610);
    
    _putDontNest(result, 722, 796);
    
    _putDontNest(result, 462, 659);
    
    _putDontNest(result, 567, 627);
    
    _putDontNest(result, 516, 541);
    
    _putDontNest(result, 498, 617);
    
    _putDontNest(result, 507, 789);
    
    _putDontNest(result, 636, 761);
    
    _putDontNest(result, 550, 704);
    
    _putDontNest(result, 445, 733);
    
    _putDontNest(result, 613, 361);
    
    _putDontNest(result, 585, 775);
    
    _putDontNest(result, 585, 754);
    
    _putDontNest(result, 643, 754);
    
    _putDontNest(result, 643, 775);
    
    _putDontNest(result, 503, 733);
    
    _putDontNest(result, 606, 691);
    
    _putDontNest(result, 684, 796);
    
    _putDontNest(result, 454, 733);
    
    _putDontNest(result, 574, 684);
    
    _putDontNest(result, 560, 789);
    
    _putDontNest(result, 516, 677);
    
    _putDontNest(result, 677, 726);
    
    _putDontNest(result, 596, 582);
    
    _putDontNest(result, 474, 627);
    
    _putDontNest(result, 722, 733);
    
    _putDontNest(result, 671, 677);
    
    _putDontNest(result, 481, 747);
    
    _putDontNest(result, 582, 610);
    
    _putDontNest(result, 589, 768);
    
    _putDontNest(result, 736, 747);
    
    _putDontNest(result, 582, 726);
    
    _putDontNest(result, 599, 691);
    
    _putDontNest(result, 589, 596);
    
    _putDontNest(result, 421, 740);
    
    _putDontNest(result, 736, 719);
    
    _putDontNest(result, 653, 677);
    
    _putDontNest(result, 764, 789);
    
    _putDontNest(result, 684, 704);
    
    _putDontNest(result, 516, 567);
    
    _putDontNest(result, 414, 768);
    
    _putDontNest(result, 414, 596);
    
    _putDontNest(result, 630, 740);
    
    _putDontNest(result, 677, 747);
    
    _putDontNest(result, 467, 550);
    
    _putDontNest(result, 736, 726);
    
    _putDontNest(result, 582, 747);
    
    _putDontNest(result, 541, 643);
    
    _putDontNest(result, 462, 560);
    
    _putDontNest(result, 617, 684);
    
    _putDontNest(result, 596, 668);
    
    _putDontNest(result, 503, 704);
    
    _putDontNest(result, 481, 610);
    
    _putDontNest(result, 454, 704);
    
    _putDontNest(result, 554, 691);
    
    _putDontNest(result, 481, 726);
    
    _putDontNest(result, 445, 704);
    
    _putDontNest(result, 596, 796);
    
    _putDontNest(result, 481, 719);
    
    _putDontNest(result, 550, 733);
    
    _putDontNest(result, 603, 627);
    
    _putDontNest(result, 550, 668);
    
    _putDontNest(result, 445, 582);
    
    _putDontNest(result, 771, 768);
    
    _putDontNest(result, 627, 768);
    
    _putDontNest(result, 570, 355);
    
    _putDontNest(result, 617, 603);
    
    _putDontNest(result, 513, 627);
    
    _putDontNest(result, 736, 754);
    
    _putDontNest(result, 736, 775);
    
    _putDontNest(result, 596, 733);
    
    _putDontNest(result, 481, 754);
    
    _putDontNest(result, 481, 775);
    
    _putDontNest(result, 430, 522);
    
    _putDontNest(result, 516, 589);
    
    _putDontNest(result, 454, 582);
    
    _putDontNest(result, 503, 582);
    
    _putDontNest(result, 550, 796);
    
    _putDontNest(result, 414, 474);
    
    _putDontNest(result, 554, 789);
    
    _putDontNest(result, 643, 747);
    
    _putDontNest(result, 445, 531);
    
    _putDontNest(result, 503, 531);
    
    _putDontNest(result, 585, 747);
    
    _putDontNest(result, 454, 531);
    
    _putDontNest(result, 531, 603);
    
    _putDontNest(result, 541, 659);
    
    _putDontNest(result, 531, 684);
    
    _putDontNest(result, 414, 617);
    
    _putDontNest(result, 743, 740);
    
    _putDontNest(result, 729, 789);
    
    _putDontNest(result, 671, 740);
    
    _putDontNest(result, 578, 684);
    
    _putDontNest(result, 498, 712);
    
    _putDontNest(result, 513, 761);
    
    _putDontNest(result, 567, 650);
    
    _putDontNest(result, 603, 761);
    
    _putDontNest(result, 421, 567);
    
    _putDontNest(result, 541, 719);
    
    _putDontNest(result, 481, 643);
    
    _putDontNest(result, 522, 513);
    
    _putDontNest(result, 570, 668);
    
    _putDontNest(result, 578, 603);
    
    _putDontNest(result, 481, 659);
    
    _putDontNest(result, 486, 733);
    
    _putDontNest(result, 750, 775);
    
    _putDontNest(result, 750, 754);
    
    _putDontNest(result, 570, 796);
    
    _putDontNest(result, 613, 650);
    
    _putDontNest(result, 421, 589);
    
    _putDontNest(result, 750, 726);
    
    _putDontNest(result, 650, 747);
    
    _putDontNest(result, 486, 668);
    
    _putDontNest(result, 486, 796);
    
    _putDontNest(result, 498, 636);
    
    _putDontNest(result, 750, 719);
    
    _putDontNest(result, 570, 733);
    
    _putDontNest(result, 541, 754);
    
    _putDontNest(result, 462, 747);
    
    _putDontNest(result, 541, 775);
    
    _putDontNest(result, 491, 550);
    
    _putDontNest(result, 449, 522);
    
    _putDontNest(result, 646, 650);
    
    _putDontNest(result, 516, 740);
    
    _putDontNest(result, 474, 650);
    
    _putDontNest(result, 589, 636);
    
    _putDontNest(result, 704, 747);
    
    _putDontNest(result, 541, 610);
    
    _putDontNest(result, 513, 574);
    
    _putDontNest(result, 541, 726);
    
    _putDontNest(result, 589, 712);
    
    _putDontNest(result, 771, 712);
    
    _putDontNest(result, 643, 659);
    
    _putDontNest(result, 525, 550);
    
    _putDontNest(result, 570, 582);
    
    _putDontNest(result, 704, 726);
    
    _putDontNest(result, 467, 522);
    
    _putDontNest(result, 715, 789);
    
    _putDontNest(result, 668, 789);
    
    _putDontNest(result, 567, 761);
    
    _putDontNest(result, 653, 740);
    
    _putDontNest(result, 430, 550);
    
    _putDontNest(result, 462, 719);
    
    _putDontNest(result, 627, 712);
    
    _putDontNest(result, 421, 677);
    
    _putDontNest(result, 486, 582);
    
    _putDontNest(result, 613, 761);
    
    _putDontNest(result, 486, 704);
    
    _putDontNest(result, 704, 719);
    
    _putDontNest(result, 522, 789);
    
    _putDontNest(result, 454, 355);
    
    _putDontNest(result, 462, 754);
    
    _putDontNest(result, 541, 747);
    
    _putDontNest(result, 462, 775);
    
    _putDontNest(result, 582, 643);
    
    _putDontNest(result, 592, 603);
    
    _putDontNest(result, 474, 761);
    
    _putDontNest(result, 650, 754);
    
    _putDontNest(result, 650, 775);
    
    _putDontNest(result, 567, 574);
    
    _putDontNest(result, 582, 659);
    
    _putDontNest(result, 603, 650);
    
    _putDontNest(result, 750, 747);
    
    _putDontNest(result, 650, 726);
    
    _putDontNest(result, 585, 643);
    
    _putDontNest(result, 646, 761);
    
    _putDontNest(result, 522, 691);
    
    _putDontNest(result, 474, 574);
    
    _putDontNest(result, 414, 712);
    
    _putDontNest(result, 486, 531);
    
    _putDontNest(result, 592, 684);
    
    _putDontNest(result, 650, 719);
    
    _putDontNest(result, 513, 650);
    
    _putDontNest(result, 414, 636);
    
    _putDontNest(result, 462, 726);
    
    _putDontNest(result, 462, 610);
    
    _putDontNest(result, 630, 677);
    
    _putDontNest(result, 421, 541);
    
    _putDontNest(result, 570, 704);
    
    _putDontNest(result, 695, 740);
    
    _putDontNest(result, 680, 740);
    
    _putDontNest(result, 585, 659);
    
    _putDontNest(result, 704, 775);
    
    _putDontNest(result, 704, 754);
    
    _putDontNest(result, 668, 691);
    
    _putDontNest(result, 481, 560);
    
    _putDontNest(result, 596, 627);
    
    _putDontNest(result, 603, 668);
    
    _putDontNest(result, 563, 603);
    
    _putDontNest(result, 516, 691);
    
    _putDontNest(result, 585, 617);
    
    _putDontNest(result, 554, 589);
    
    _putDontNest(result, 563, 684);
    
    _putDontNest(result, 582, 596);
    
    _putDontNest(result, 589, 754);
    
    _putDontNest(result, 467, 603);
    
    _putDontNest(result, 589, 775);
    
    _putDontNest(result, 603, 796);
    
    _putDontNest(result, 599, 677);
    
    _putDontNest(result, 513, 733);
    
    _putDontNest(result, 474, 582);
    
    _putDontNest(result, 627, 747);
    
    _putDontNest(result, 671, 691);
    
    _putDontNest(result, 646, 704);
    
    _putDontNest(result, 771, 747);
    
    _putDontNest(result, 567, 704);
    
    _putDontNest(result, 582, 617);
    
    _putDontNest(result, 613, 582);
    
    _putDontNest(result, 498, 719);
    
    _putDontNest(result, 474, 531);
    
    _putDontNest(result, 606, 677);
    
    _putDontNest(result, 585, 768);
    
    _putDontNest(result, 486, 574);
    
    _putDontNest(result, 750, 712);
    
    _putDontNest(result, 498, 610);
    
    _putDontNest(result, 498, 726);
    
    _putDontNest(result, 414, 747);
    
    _putDontNest(result, 643, 768);
    
    _putDontNest(result, 570, 761);
    
    _putDontNest(result, 585, 596);
    
    _putDontNest(result, 729, 740);
    
    _putDontNest(result, 639, 684);
    
    _putDontNest(result, 454, 486);
    
    _putDontNest(result, 677, 768);
    
    _putDontNest(result, 498, 754);
    
    _putDontNest(result, 498, 775);
    
    _putDontNest(result, 486, 761);
    
    _putDontNest(result, 671, 789);
    
    _putDontNest(result, 613, 704);
    
    _putDontNest(result, 531, 550);
    
    _putDontNest(result, 589, 719);
    
    _putDontNest(result, 603, 733);
    
    _putDontNest(result, 550, 627);
    
    _putDontNest(result, 621, 684);
    
    _putDontNest(result, 507, 541);
    
    _putDontNest(result, 516, 789);
    
    _putDontNest(result, 560, 677);
    
    _putDontNest(result, 567, 582);
    
    _putDontNest(result, 513, 796);
    
    _putDontNest(result, 589, 726);
    
    _putDontNest(result, 430, 481);
    
    _putDontNest(result, 513, 668);
    
    _putDontNest(result, 467, 684);
    
    _putDontNest(result, 507, 677);
    
    _putDontNest(result, 589, 610);
    
    _putDontNest(result, 582, 768);
    
    _putDontNest(result, 541, 712);
    
    _putDontNest(result, 474, 704);
    
    _putDontNest(result, 541, 636);
    
    _putDontNest(result, 646, 668);
    
    _putDontNest(result, 445, 627);
    
    _putDontNest(result, 603, 704);
    
    _putDontNest(result, 606, 589);
    
    _putDontNest(result, 430, 498);
    
    _putDontNest(result, 462, 636);
    
    _putDontNest(result, 544, 603);
    
    _putDontNest(result, 771, 726);
    
    _putDontNest(result, 513, 704);
    
    _putDontNest(result, 567, 668);
    
    _putDontNest(result, 449, 603);
    
    _putDontNest(result, 486, 650);
    
    _putDontNest(result, 544, 684);
    
    _putDontNest(result, 513, 531);
    
    _putDontNest(result, 771, 754);
    
    _putDontNest(result, 481, 596);
    
    _putDontNest(result, 771, 775);
    
    _putDontNest(result, 613, 733);
    
    _putDontNest(result, 627, 754);
    
    _putDontNest(result, 627, 775);
    
    _putDontNest(result, 680, 789);
    
    _putDontNest(result, 695, 789);
    
    _putDontNest(result, 481, 768);
    
    _putDontNest(result, 704, 712);
    
    _putDontNest(result, 454, 361);
    
    _putDontNest(result, 449, 462);
    
    _putDontNest(result, 589, 747);
    
    _putDontNest(result, 736, 768);
    
    _putDontNest(result, 454, 491);
    
    _putDontNest(result, 627, 719);
    
    _putDontNest(result, 462, 712);
    
    _putDontNest(result, 570, 650);
    
    _putDontNest(result, 4202, 380);
    
    _putDontNest(result, 507, 567);
    
    _putDontNest(result, 613, 796);
    
    _putDontNest(result, 771, 719);
    
    _putDontNest(result, 653, 691);
    
    _putDontNest(result, 560, 567);
    
    _putDontNest(result, 613, 668);
    
    _putDontNest(result, 522, 740);
    
    _putDontNest(result, 554, 677);
    
    _putDontNest(result, 627, 726);
    
    _putDontNest(result, 481, 617);
    
    _putDontNest(result, 474, 796);
    
    _putDontNest(result, 567, 733);
    
    _putDontNest(result, 414, 719);
    
    _putDontNest(result, 603, 582);
    
    _putDontNest(result, 560, 589);
    
    _putDontNest(result, 650, 712);
    
    _putDontNest(result, 646, 733);
    
    _putDontNest(result, 449, 684);
    
    _putDontNest(result, 680, 691);
    
    _putDontNest(result, 507, 589);
    
    _putDontNest(result, 414, 726);
    
    _putDontNest(result, 474, 668);
    
    _putDontNest(result, 414, 610);
    
    _putDontNest(result, 668, 740);
    
    _putDontNest(result, 498, 747);
    
    _putDontNest(result, 715, 740);
    
    _putDontNest(result, 535, 603);
    
    _putDontNest(result, 513, 582);
    
    _putDontNest(result, 567, 796);
    
    _putDontNest(result, 599, 589);
    
    _putDontNest(result, 474, 733);
    
    _putDontNest(result, 535, 684);
    
    _putDontNest(result, 503, 627);
    
    _putDontNest(result, 653, 789);
    
    _putDontNest(result, 454, 627);
    
    _putDontNest(result, 414, 775);
    
    _putDontNest(result, 414, 754);
    
    _putDontNest(result, 646, 796);
    
    _putDontNest(result, 643, 684);
    
    _putDontNest(result, 585, 603);
    
    _putDontNest(result, 574, 719);
    
    _putDontNest(result, 630, 650);
    
    _putDontNest(result, 606, 796);
    
    _putDontNest(result, 560, 733);
    
    _putDontNest(result, 659, 740);
    
    _putDontNest(result, 585, 684);
    
    _putDontNest(result, 722, 789);
    
    _putDontNest(result, 680, 361);
    
    _putDontNest(result, 503, 789);
    
    _putDontNest(result, 695, 361);
    
    _putDontNest(result, 757, 761);
    
    _putDontNest(result, 603, 677);
    
    _putDontNest(result, 662, 712);
    
    _putDontNest(result, 454, 789);
    
    _putDontNest(result, 567, 589);
    
    _putDontNest(result, 599, 796);
    
    _putDontNest(result, 708, 761);
    
    _putDontNest(result, 599, 668);
    
    _putDontNest(result, 430, 636);
    
    _putDontNest(result, 592, 643);
    
    _putDontNest(result, 563, 617);
    
    _putDontNest(result, 445, 789);
    
    _putDontNest(result, 574, 775);
    
    _putDontNest(result, 507, 733);
    
    _putDontNest(result, 430, 712);
    
    _putDontNest(result, 574, 754);
    
    _putDontNest(result, 560, 796);
    
    _putDontNest(result, 639, 768);
    
    _putDontNest(result, 513, 677);
    
    _putDontNest(result, 507, 668);
    
    _putDontNest(result, 563, 596);
    
    _putDontNest(result, 779, 747);
    
    _putDontNest(result, 677, 684);
    
    _putDontNest(result, 691, 761);
    
    _putDontNest(result, 574, 610);
    
    _putDontNest(result, 421, 503);
    
    _putDontNest(result, 574, 726);
    
    _putDontNest(result, 636, 740);
    
    _putDontNest(result, 599, 733);
    
    _putDontNest(result, 474, 589);
    
    _putDontNest(result, 684, 789);
    
    _putDontNest(result, 531, 747);
    
    _putDontNest(result, 525, 712);
    
    _putDontNest(result, 525, 636);
    
    _putDontNest(result, 513, 541);
    
    _putDontNest(result, 560, 668);
    
    _putDontNest(result, 507, 796);
    
    _putDontNest(result, 563, 768);
    
    _putDontNest(result, 613, 589);
    
    _putDontNest(result, 621, 768);
    
    _putDontNest(result, 421, 650);
    
    _putDontNest(result, 454, 691);
    
    _putDontNest(result, 554, 704);
    
    _putDontNest(result, 467, 596);
    
    _putDontNest(result, 606, 733);
    
    _putDontNest(result, 503, 691);
    
    _putDontNest(result, 445, 691);
    
    _putDontNest(result, 617, 747);
    
    _putDontNest(result, 582, 684);
    
    _putDontNest(result, 474, 567);
    
    _putDontNest(result, 467, 768);
    
    _putDontNest(result, 414, 550);
    
    _putDontNest(result, 582, 603);
    
    _putDontNest(result, 684, 691);
    
    _putDontNest(result, 687, 712);
    
    _putDontNest(result, 653, 361);
    
    _putDontNest(result, 606, 668);
    
    _putDontNest(result, 567, 567);
    
    _putDontNest(result, 592, 659);
    
    _putDontNest(result, 467, 617);
    
    _putDontNest(result, 554, 582);
    
    _putDontNest(result, 599, 704);
    
    _putDontNest(result, 578, 659);
    
    _putDontNest(result, 560, 704);
    
    _putDontNest(result, 613, 677);
    
    _putDontNest(result, 503, 513);
    
    _putDontNest(result, 535, 768);
    
    _putDontNest(result, 606, 704);
    
    _putDontNest(result, 544, 768);
    
    _putDontNest(result, 646, 677);
    
    _putDontNest(result, 617, 719);
    
    _putDontNest(result, 507, 582);
    
    _putDontNest(result, 481, 684);
    
    _putDontNest(result, 764, 733);
    
    _putDontNest(result, 544, 596);
    
    _putDontNest(result, 617, 610);
    
    _putDontNest(result, 617, 726);
    
    _putDontNest(result, 513, 589);
    
    _putDontNest(result, 599, 582);
    
    _putDontNest(result, 610, 636);
    
    _putDontNest(result, 481, 603);
    
    _putDontNest(result, 507, 704);
    
    _putDontNest(result, 550, 789);
    
    _putDontNest(result, 544, 617);
    
    _putDontNest(result, 498, 550);
    
    _putDontNest(result, 516, 627);
    
    _putDontNest(result, 474, 677);
    
    _putDontNest(result, 617, 775);
    
    _putDontNest(result, 617, 754);
    
    _putDontNest(result, 610, 712);
    
    _putDontNest(result, 671, 361);
    
    _putDontNest(result, 474, 541);
    
    _putDontNest(result, 764, 796);
    
    _putDontNest(result, 454, 467);
    
    _putDontNest(result, 445, 513);
    
    _putDontNest(result, 449, 474);
    
    _putDontNest(result, 535, 617);
    
    _putDontNest(result, 606, 582);
    
    _putDontNest(result, 421, 574);
    
    _putDontNest(result, 531, 754);
    
    _putDontNest(result, 531, 775);
    
    _putDontNest(result, 596, 691);
    
    _putDontNest(result, 449, 768);
    
    _putDontNest(result, 554, 668);
    
    _putDontNest(result, 516, 361);
    
    _putDontNest(result, 554, 796);
    
    _putDontNest(result, 491, 636);
    
    _putDontNest(result, 792, 768);
    
    _putDontNest(result, 449, 596);
    
    _putDontNest(result, 578, 643);
    
    _putDontNest(result, 513, 567);
    
    _putDontNest(result, 491, 712);
    
    _putDontNest(result, 779, 775);
    
    _putDontNest(result, 779, 754);
    
    _putDontNest(result, 454, 513);
    
    _putDontNest(result, 550, 691);
    
    _putDontNest(result, 574, 747);
    
    _putDontNest(result, 449, 617);
    
    _putDontNest(result, 743, 761);
    
    _putDontNest(result, 531, 719);
    
    _putDontNest(result, 779, 726);
    
    _putDontNest(result, 630, 761);
    
    _putDontNest(result, 421, 761);
    
    _putDontNest(result, 535, 596);
    
    _putDontNest(result, 554, 733);
    
    _putDontNest(result, 531, 610);
    
    _putDontNest(result, 779, 719);
    
    _putDontNest(result, 531, 726);
    
    _putDontNest(result, 567, 677);
    
    _putDontNest(result, 596, 789);
    
    _putDontNest(result, 603, 589);
    
    _putDontNest(result, 560, 582);
    
    _putDontNest(result, 421, 704);
    
    _putDontNest(result, 630, 704);
    
    _putDontNest(result, 636, 691);
    
    _putDontNest(result, 454, 740);
    
    _putDontNest(result, 687, 726);
    
    _putDontNest(result, 486, 541);
    
    _putDontNest(result, 653, 355);
    
    _putDontNest(result, 544, 643);
    
    _putDontNest(result, 554, 650);
    
    _putDontNest(result, 535, 659);
    
    _putDontNest(result, 606, 761);
    
    _putDontNest(result, 687, 775);
    
    _putDontNest(result, 570, 677);
    
    _putDontNest(result, 687, 754);
    
    _putDontNest(result, 414, 498);
    
    _putDontNest(result, 430, 754);
    
    _putDontNest(result, 574, 712);
    
    _putDontNest(result, 445, 740);
    
    _putDontNest(result, 544, 659);
    
    _putDontNest(result, 481, 522);
    
    _putDontNest(result, 430, 775);
    
    _putDontNest(result, 599, 761);
    
    _putDontNest(result, 535, 643);
    
    _putDontNest(result, 507, 574);
    
    _putDontNest(result, 757, 796);
    
    _putDontNest(result, 574, 636);
    
    _putDontNest(result, 691, 733);
    
    _putDontNest(result, 525, 719);
    
    _putDontNest(result, 722, 740);
    
    _putDontNest(result, 662, 754);
    
    _putDontNest(result, 662, 775);
    
    _putDontNest(result, 659, 789);
    
    _putDontNest(result, 560, 574);
    
    _putDontNest(result, 708, 796);
    
    _putDontNest(result, 525, 610);
    
    _putDontNest(result, 525, 726);
    
    _putDontNest(result, 578, 617);
    
    _putDontNest(result, 503, 740);
    
    _putDontNest(result, 560, 761);
    
    _putDontNest(result, 662, 726);
    
    _putDontNest(result, 430, 719);
    
    _putDontNest(result, 4581, 789);
    
    _putDontNest(result, 757, 733);
    
    _putDontNest(result, 525, 754);
    
    _putDontNest(result, 525, 775);
    
    _putDontNest(result, 449, 643);
    
    _putDontNest(result, 578, 596);
    
    _putDontNest(result, 691, 796);
    
    _putDontNest(result, 695, 355);
    
    _putDontNest(result, 680, 355);
    
    _putDontNest(result, 430, 726);
    
    _putDontNest(result, 708, 733);
    
    _putDontNest(result, 421, 531);
    
    _putDontNest(result, 430, 610);
    
    _putDontNest(result, 578, 768);
    
    _putDontNest(result, 662, 719);
    
    _putDontNest(result, 684, 740);
    
    _putDontNest(result, 507, 761);
    
    _putDontNest(result, 636, 789);
    
    _putDontNest(result, 491, 747);
    
    _putDontNest(result, 462, 550);
    
    _putDontNest(result, 610, 747);
    
    _putDontNest(result, 467, 560);
    
    _putDontNest(result, 449, 659);
    
    _putDontNest(result, 522, 627);
    
    _putDontNest(result, 687, 719);
    
    _putDontNest(result, 659, 691);
    
    _putDontNest(result, 486, 677);
    
    _putDontNest(result, 421, 582);
    
    _putDontNest(result, 430, 747);
    
    _putDontNest(result, 687, 747);
    
    _putDontNest(result, 507, 650);
    
    _putDontNest(result, 560, 650);
    
    _putDontNest(result, 621, 643);
    
    _putDontNest(result, 630, 733);
    
    _putDontNest(result, 486, 589);
    
    _putDontNest(result, 491, 610);
    
    _putDontNest(result, 491, 726);
    
    _putDontNest(result, 535, 560);
    
    _putDontNest(result, 421, 796);
    
    _putDontNest(result, 592, 768);
    
    _putDontNest(result, 630, 668);
    
    _putDontNest(result, 570, 589);
    
    _putDontNest(result, 610, 726);
    
    _putDontNest(result, 610, 610);
    
    _putDontNest(result, 610, 719);
    
    _putDontNest(result, 671, 355);
    
    _putDontNest(result, 544, 560);
    
    _putDontNest(result, 596, 740);
    
    _putDontNest(result, 486, 567);
    
    _putDontNest(result, 639, 659);
    
    _putDontNest(result, 550, 740);
    
    _putDontNest(result, 617, 712);
    
    _putDontNest(result, 610, 775);
    
    _putDontNest(result, 610, 754);
    
    _putDontNest(result, 691, 704);
    
    _putDontNest(result, 467, 643);
    
    _putDontNest(result, 764, 761);
    
    _putDontNest(result, 414, 481);
    
    _putDontNest(result, 617, 636);
    
    _putDontNest(result, 599, 650);
    
    _putDontNest(result, 563, 659);
    
    _putDontNest(result, 639, 643);
    
    _putDontNest(result, 743, 733);
    
    _putDontNest(result, 779, 712);
    
    _putDontNest(result, 621, 659);
    
    _putDontNest(result, 491, 754);
    
    _putDontNest(result, 541, 550);
    
    _putDontNest(result, 491, 775);
    
    _putDontNest(result, 525, 747);
    
    _putDontNest(result, 449, 560);
    
    _putDontNest(result, 421, 733);
    
    _putDontNest(result, 467, 659);
    
    _putDontNest(result, 531, 712);
    
    _putDontNest(result, 554, 761);
    
    _putDontNest(result, 563, 643);
    
    _putDontNest(result, 592, 617);
    
    _putDontNest(result, 606, 650);
    
    _putDontNest(result, 531, 636);
    
    _putDontNest(result, 743, 796);
    
    _putDontNest(result, 491, 719);
    
    _putDontNest(result, 421, 668);
    
    _putDontNest(result, 516, 355);
    
    _putDontNest(result, 630, 796);
    
    _putDontNest(result, 592, 596);
    
    _putDontNest(result, 662, 747);
    
    _putDontNest(result, 578, 712);
    
    _putDontNest(result, 574, 617);
    
    _putDontNest(result, 554, 627);
    
    _putDontNest(result, 454, 541);
    
    _putDontNest(result, 653, 704);
    
    _putDontNest(result, 522, 650);
    
    _putDontNest(result, 792, 747);
    
    _putDontNest(result, 578, 636);
    
    _putDontNest(result, 639, 775);
    
    _putDontNest(result, 639, 754);
    
    _putDontNest(result, 474, 513);
    
    _putDontNest(result, 462, 522);
    
    _putDontNest(result, 498, 684);
    
    _putDontNest(result, 671, 733);
    
    _putDontNest(result, 491, 643);
    
    _putDontNest(result, 695, 704);
    
    _putDontNest(result, 680, 704);
    
    _putDontNest(result, 570, 740);
    
    _putDontNest(result, 563, 754);
    
    _putDontNest(result, 563, 775);
    
    _putDontNest(result, 729, 761);
    
    _putDontNest(result, 513, 691);
    
    _putDontNest(result, 610, 659);
    
    _putDontNest(result, 525, 560);
    
    _putDontNest(result, 449, 747);
    
    _putDontNest(result, 563, 726);
    
    _putDontNest(result, 563, 610);
    
    _putDontNest(result, 671, 796);
    
    _putDontNest(result, 639, 719);
    
    _putDontNest(result, 574, 596);
    
    _putDontNest(result, 550, 567);
    
    _putDontNest(result, 430, 560);
    
    _putDontNest(result, 563, 719);
    
    _putDontNest(result, 481, 550);
    
    _putDontNest(result, 574, 768);
    
    _putDontNest(result, 498, 603);
    
    _putDontNest(result, 603, 691);
    
    _putDontNest(result, 535, 747);
    
    _putDontNest(result, 639, 726);
    
    _putDontNest(result, 486, 740);
    
    _putDontNest(result, 467, 610);
    
    _putDontNest(result, 589, 684);
    
    _putDontNest(result, 621, 719);
    
    _putDontNest(result, 467, 726);
    
    _putDontNest(result, 516, 668);
    
    _putDontNest(result, 421, 355);
    
    _putDontNest(result, 516, 796);
    
    _putDontNest(result, 630, 355);
    
    _putDontNest(result, 554, 361);
    
    _putDontNest(result, 513, 789);
    
    _putDontNest(result, 550, 589);
    
    _putDontNest(result, 544, 747);
    
    _putDontNest(result, 467, 719);
    
    _putDontNest(result, 621, 726);
    
    _putDontNest(result, 503, 541);
    
    _putDontNest(result, 445, 677);
    
    _putDontNest(result, 491, 659);
    
    _putDontNest(result, 621, 754);
    
    _putDontNest(result, 621, 775);
    
    _putDontNest(result, 414, 445);
    
    _putDontNest(result, 516, 733);
    
    _putDontNest(result, 610, 643);
    
    _putDontNest(result, 503, 677);
    
    _putDontNest(result, 445, 541);
    
    _putDontNest(result, 467, 775);
    
    _putDontNest(result, 589, 603);
    
    _putDontNest(result, 603, 789);
    
    _putDontNest(result, 596, 589);
    
    _putDontNest(result, 454, 677);
    
    _putDontNest(result, 467, 754);
    
    _putDontNest(result, 621, 747);
    
    _putDontNest(result, 474, 691);
    
    _putDontNest(result, 627, 684);
    
    _putDontNest(result, 617, 617);
    
    _putDontNest(result, 567, 691);
    
    _putDontNest(result, 507, 361);
    
    _putDontNest(result, 792, 726);
    
    _putDontNest(result, 560, 627);
    
    _putDontNest(result, 563, 747);
    
    _putDontNest(result, 414, 462);
    
    _putDontNest(result, 606, 627);
    
    _putDontNest(result, 617, 596);
    
    _putDontNest(result, 544, 726);
    
    _putDontNest(result, 445, 567);
    
    _putDontNest(result, 544, 610);
    
    _putDontNest(result, 430, 659);
    
    _putDontNest(result, 680, 733);
    
    _putDontNest(result, 544, 754);
    
    _putDontNest(result, 695, 733);
    
    _putDontNest(result, 544, 775);
    
    _putDontNest(result, 522, 761);
    
    _putDontNest(result, 646, 691);
    
    _putDontNest(result, 613, 789);
    
    _putDontNest(result, 671, 704);
    
    _putDontNest(result, 535, 754);
    
    _putDontNest(result, 535, 775);
    
    _putDontNest(result, 592, 712);
    
    _putDontNest(result, 449, 719);
    
    _putDontNest(result, 507, 627);
    
    _putDontNest(result, 414, 684);
    
    _putDontNest(result, 430, 643);
    
    _putDontNest(result, 550, 541);
    
    _putDontNest(result, 592, 636);
    
    _putDontNest(result, 531, 617);
    
    _putDontNest(result, 516, 704);
    
    _putDontNest(result, 449, 726);
    
    _putDontNest(result, 653, 733);
    
    _putDontNest(result, 449, 610);
    
    _putDontNest(result, 668, 761);
    
    _putDontNest(result, 550, 677);
    
    _putDontNest(result, 715, 761);
    
    _putDontNest(result, 474, 789);
    
    _putDontNest(result, 792, 719);
    
    _putDontNest(result, 525, 643);
    
    _putDontNest(result, 531, 768);
    
    _putDontNest(result, 445, 589);
    
    _putDontNest(result, 449, 775);
    
    _putDontNest(result, 535, 719);
    
    _putDontNest(result, 449, 754);
    
    _putDontNest(result, 653, 668);
    
    _putDontNest(result, 606, 361);
    
    _putDontNest(result, 414, 603);
    
    _putDontNest(result, 613, 691);
    
    _putDontNest(result, 779, 768);
    
    _putDontNest(result, 653, 796);
    
    _putDontNest(result, 599, 627);
    
    _putDontNest(result, 639, 747);
    
    _putDontNest(result, 646, 789);
    
    _putDontNest(result, 535, 610);
    
    _putDontNest(result, 491, 560);
    
    _putDontNest(result, 535, 726);
    
    _putDontNest(result, 792, 754);
    
    _putDontNest(result, 531, 596);
    
    _putDontNest(result, 503, 589);
    
    _putDontNest(result, 792, 775);
    
    _putDontNest(result, 596, 677);
    
    _putDontNest(result, 516, 582);
    
    _putDontNest(result, 454, 589);
    
    _putDontNest(result, 567, 789);
    
    _putDontNest(result, 503, 567);
    
    _putDontNest(result, 522, 574);
    
    _putDontNest(result, 467, 747);
    
    _putDontNest(result, 525, 659);
    
    _putDontNest(result, 617, 768);
    
    _putDontNest(result, 454, 567);
    
    _putDontNest(result, 513, 513);
    
    _putDontNest(result, 695, 796);
    
    _putDontNest(result, 680, 796);
    
    _putDontNest(result, 599, 361);
    
    _putDontNest(result, 544, 719);
    
    _putDontNest(result, 486, 691);
    
    _putDontNest(result, 621, 712);
    
    _putDontNest(result, 621, 636);
    
    _putDontNest(result, 563, 712);
    
    _putDontNest(result, 421, 627);
    
    _putDontNest(result, 639, 712);
    
    _putDontNest(result, 592, 747);
    
    _putDontNest(result, 430, 474);
    
    _putDontNest(result, 570, 691);
    
    _putDontNest(result, 513, 740);
    
    _putDontNest(result, 668, 704);
    
    _putDontNest(result, 687, 768);
    
    _putDontNest(result, 531, 659);
    
    _putDontNest(result, 467, 712);
    
    _putDontNest(result, 541, 684);
    
    _putDontNest(result, 617, 643);
    
    _putDontNest(result, 516, 574);
    
    _putDontNest(result, 659, 677);
    
    _putDontNest(result, 630, 361);
    
    _putDontNest(result, 554, 355);
    
    _putDontNest(result, 467, 636);
    
    _putDontNest(result, 603, 740);
    
    _putDontNest(result, 522, 531);
    
    _putDontNest(result, 421, 361);
    
    _putDontNest(result, 563, 636);
    
    _putDontNest(result, 430, 617);
    
    _putDontNest(result, 525, 768);
    
    _putDontNest(result, 531, 643);
    
    _putDontNest(result, 570, 789);
    
    _putDontNest(result, 617, 659);
    
    _putDontNest(result, 630, 627);
    
    _putDontNest(result, 729, 796);
    
    _putDontNest(result, 522, 582);
    
    _putDontNest(result, 525, 596);
    
    _putDontNest(result, 578, 775);
    
    _putDontNest(result, 578, 754);
    
    _putDontNest(result, 639, 636);
    
    _putDontNest(result, 486, 789);
    
    _putDontNest(result, 430, 768);
    
    _putDontNest(result, 671, 761);
    
    _putDontNest(result, 578, 726);
    
    _putDontNest(result, 525, 617);
    
    _putDontNest(result, 578, 610);
    
    _putDontNest(result, 522, 704);
    
    _putDontNest(result, 574, 560);
    
    _putDontNest(result, 430, 596);
    
    _putDontNest(result, 729, 733);
    
    _putDontNest(result, 578, 719);
    
    _putDontNest(result, 662, 768);
    
    _putDontNest(result, 421, 491);
    
    _putDontNest(result, 636, 677);
    
    _putDontNest(result, 541, 603);
    
    _putDontNest(result, 414, 522);
    
    _putDontNest(result, 516, 761);
    
    _putDontNest(result, 486, 513);
    
    _putDontNest(result, 610, 596);
    
    _putDontNest(result, 507, 355);
    
    _putDontNest(result, 5607, 610);
    
    _putDontNest(result, 522, 733);
    
    _putDontNest(result, 610, 768);
    
    _putDontNest(result, 613, 740);
    
    _putDontNest(result, 610, 617);
    
    _putDontNest(result, 544, 636);
    
    _putDontNest(result, 421, 486);
    
    _putDontNest(result, 491, 617);
    
    _putDontNest(result, 474, 740);
    
    _putDontNest(result, 715, 796);
    
    _putDontNest(result, 792, 712);
    
    _putDontNest(result, 491, 768);
    
    _putDontNest(result, 715, 733);
    
    _putDontNest(result, 449, 636);
    
    _putDontNest(result, 668, 733);
    
    _putDontNest(result, 491, 596);
    
    _putDontNest(result, 653, 761);
    
    _putDontNest(result, 650, 684);
    
    _putDontNest(result, 531, 560);
    
    _putDontNest(result, 592, 719);
    
    _putDontNest(result, 449, 712);
    
    _putDontNest(result, 695, 761);
    
    _putDontNest(result, 680, 761);
    
    _putDontNest(result, 462, 684);
    
    _putDontNest(result, 498, 522);
    
    _putDontNest(result, 462, 603);
    
    _putDontNest(result, 522, 668);
    
    _putDontNest(result, 544, 712);
    
    _putDontNest(result, 599, 355);
    
    _putDontNest(result, 522, 796);
    
    _putDontNest(result, 574, 659);
    
    _putDontNest(result, 668, 796);
    
    _putDontNest(result, 606, 355);
    
    _putDontNest(result, 535, 636);
    
    _putDontNest(result, 574, 643);
    
    _putDontNest(result, 592, 754);
    
    _putDontNest(result, 535, 712);
    
    _putDontNest(result, 592, 775);
    
    _putDontNest(result, 646, 740);
    
    _putDontNest(result, 578, 747);
    
    _putDontNest(result, 516, 650);
    
    _putDontNest(result, 592, 726);
    
    _putDontNest(result, 567, 740);
    
    _putDontNest(result, 592, 610);
    
    _putDontNest(result, 646, 643);
    
    _putDontNest(result, 570, 617);
    
    _putDontNest(result, 636, 726);
    
    _putDontNest(result, 421, 445);
    
    _putDontNest(result, 613, 643);
    
    _putDontNest(result, 646, 659);
    
    _putDontNest(result, 430, 691);
    
    _putDontNest(result, 414, 355);
    
    _putDontNest(result, 585, 761);
    
    _putDontNest(result, 684, 712);
    
    _putDontNest(result, 659, 719);
    
    _putDontNest(result, 570, 596);
    
    _putDontNest(result, 567, 643);
    
    _putDontNest(result, 636, 775);
    
    _putDontNest(result, 636, 754);
    
    _putDontNest(result, 659, 726);
    
    _putDontNest(result, 522, 550);
    
    _putDontNest(result, 486, 617);
    
    _putDontNest(result, 525, 789);
    
    _putDontNest(result, 643, 761);
    
    _putDontNest(result, 570, 768);
    
    _putDontNest(result, 592, 589);
    
    _putDontNest(result, 677, 761);
    
    _putDontNest(result, 662, 789);
    
    _putDontNest(result, 491, 513);
    
    _putDontNest(result, 454, 712);
    
    _putDontNest(result, 481, 650);
    
    _putDontNest(result, 659, 775);
    
    _putDontNest(result, 503, 712);
    
    _putDontNest(result, 474, 643);
    
    _putDontNest(result, 659, 754);
    
    _putDontNest(result, 486, 596);
    
    _putDontNest(result, 722, 712);
    
    _putDontNest(result, 454, 636);
    
    _putDontNest(result, 613, 659);
    
    _putDontNest(result, 503, 636);
    
    _putDontNest(result, 636, 719);
    
    _putDontNest(result, 445, 636);
    
    _putDontNest(result, 486, 768);
    
    _putDontNest(result, 430, 789);
    
    _putDontNest(result, 445, 712);
    
    _putDontNest(result, 574, 740);
    
    _putDontNest(result, 687, 789);
    
    _putDontNest(result, 474, 659);
    
    _putDontNest(result, 513, 560);
    
    _putDontNest(result, 582, 761);
    
    _putDontNest(result, 578, 677);
    
    _putDontNest(result, 525, 691);
    
    _putDontNest(result, 662, 691);
    
    _putDontNest(result, 567, 659);
    
    _putDontNest(result, 462, 627);
    
    _putDontNest(result, 481, 761);
    
    _putDontNest(result, 592, 677);
    
    _putDontNest(result, 596, 712);
    
    _putDontNest(result, 491, 691);
    
    _putDontNest(result, 585, 650);
    
    _putDontNest(result, 421, 603);
    
    _putDontNest(result, 610, 691);
    
    _putDontNest(result, 513, 659);
    
    _putDontNest(result, 659, 747);
    
    _putDontNest(result, 630, 684);
    
    _putDontNest(result, 531, 740);
    
    _putDontNest(result, 603, 643);
    
    _putDontNest(result, 430, 467);
    
    _putDontNest(result, 541, 627);
    
    _putDontNest(result, 736, 761);
    
    _putDontNest(result, 421, 462);
    
    _putDontNest(result, 481, 574);
    
    _putDontNest(result, 596, 636);
    
    _putDontNest(result, 513, 643);
    
    _putDontNest(result, 474, 560);
    
    _putDontNest(result, 578, 589);
    
    _putDontNest(result, 430, 513);
    
    _putDontNest(result, 582, 650);
    
    _putDontNest(result, 603, 659);
    
    _putDontNest(result, 491, 789);
    
    _putDontNest(result, 421, 684);
    
    _putDontNest(result, 636, 747);
    
    _putDontNest(result, 779, 740);
    
    _putDontNest(result, 567, 560);
    
    _putDontNest(result, 610, 789);
    
    _putDontNest(result, 550, 636);
    
    _putDontNest(result, 617, 740);
    
    _putDontNest(result, 550, 712);
    
    _putDontNest(result, 513, 617);
    
    _putDontNest(result, 606, 684);
    
    _putDontNest(result, 582, 733);
    
    _putDontNest(result, 603, 596);
    
    _putDontNest(result, 596, 747);
    
    _putDontNest(result, 414, 361);
    
    _putDontNest(result, 603, 617);
    
    _putDontNest(result, 606, 603);
    
    _putDontNest(result, 449, 567);
    
    _putDontNest(result, 603, 768);
    
    _putDontNest(result, 421, 522);
    
    _putDontNest(result, 550, 747);
    
    _putDontNest(result, 544, 589);
    
    _putDontNest(result, 574, 691);
    
    _putDontNest(result, 414, 491);
    
    _putDontNest(result, 535, 567);
    
    _putDontNest(result, 535, 589);
    
    _putDontNest(result, 445, 719);
    
    _putDontNest(result, 722, 726);
    
    _putDontNest(result, 643, 668);
    
    _putDontNest(result, 677, 733);
    
    _putDontNest(result, 585, 796);
    
    _putDontNest(result, 454, 610);
    
    _putDontNest(result, 507, 603);
    
    _putDontNest(result, 454, 726);
    
    _putDontNest(result, 481, 704);
    
    _putDontNest(result, 503, 726);
    
    _putDontNest(result, 599, 684);
    
    _putDontNest(result, 525, 740);
    
    _putDontNest(result, 503, 610);
    
    _putDontNest(result, 445, 726);
    
    _putDontNest(result, 722, 719);
    
    _putDontNest(result, 445, 610);
    
    _putDontNest(result, 544, 567);
    
    _putDontNest(result, 636, 712);
    
    _putDontNest(result, 560, 603);
    
    _putDontNest(result, 643, 796);
    
    _putDontNest(result, 454, 719);
    
    _putDontNest(result, 585, 668);
    
    _putDontNest(result, 684, 754);
    
    _putDontNest(result, 684, 775);
    
    _putDontNest(result, 503, 719);
    
    _putDontNest(result, 467, 541);
    
    _putDontNest(result, 560, 684);
    
    _putDontNest(result, 585, 733);
    
    _putDontNest(result, 430, 740);
    
    _putDontNest(result, 449, 589);
    
    _putDontNest(result, 445, 775);
    
    _putDontNest(result, 445, 754);
    
    _putDontNest(result, 677, 796);
    
    _putDontNest(result, 486, 560);
    
    _putDontNest(result, 684, 726);
    
    _putDontNest(result, 574, 789);
    
    _putDontNest(result, 621, 677);
    
    _putDontNest(result, 531, 513);
    
    _putDontNest(result, 722, 754);
    
    _putDontNest(result, 662, 740);
    
    _putDontNest(result, 722, 775);
    
    _putDontNest(result, 659, 712);
    
    _putDontNest(result, 503, 754);
    
    _putDontNest(result, 599, 603);
    
    _putDontNest(result, 643, 733);
    
    _putDontNest(result, 684, 719);
    
    _putDontNest(result, 503, 775);
    
    _putDontNest(result, 467, 677);
    
    _putDontNest(result, 414, 627);
    
    _putDontNest(result, 454, 775);
    
    _putDontNest(result, 481, 582);
    
    _putDontNest(result, 507, 684);
    
    _putDontNest(result, 454, 754);
    
    _putDontNest(result, 513, 768);
    
    _putDontNest(result, 639, 677);
    
    _putDontNest(result, 582, 668);
    
    _putDontNest(result, 687, 740);
    
    _putDontNest(result, 513, 596);
    
    _putDontNest(result, 481, 531);
    
    _putDontNest(result, 582, 796);
    
    _putDontNest(result, 563, 677);
    
    _putDontNest(result, 414, 486);
    
    _putDontNest(result, 613, 617);
    
    _putDontNest(result, 481, 668);
    
    _putDontNest(result, 481, 796);
    
    _putDontNest(result, 596, 719);
    
    _putDontNest(result, 449, 677);
    
    _putDontNest(result, 585, 582);
    
    _putDontNest(result, 613, 768);
    
    _putDontNest(result, 613, 596);
    
    _putDontNest(result, 449, 541);
    
    _putDontNest(result, 454, 747);
    
    _putDontNest(result, 722, 747);
    
    _putDontNest(result, 563, 589);
    
    _putDontNest(result, 474, 596);
    
    _putDontNest(result, 498, 627);
    
    _putDontNest(result, 516, 550);
    
    _putDontNest(result, 531, 789);
    
    _putDontNest(result, 582, 582);
    
    _putDontNest(result, 570, 643);
    
    _putDontNest(result, 567, 596);
    
    _putDontNest(result, 643, 704);
    
    _putDontNest(result, 535, 677);
    
    _putDontNest(result, 596, 610);
    
    _putDontNest(result, 596, 726);
    
    _putDontNest(result, 550, 775);
    
    _putDontNest(result, 550, 754);
    
    _putDontNest(result, 610, 740);
    
    _putDontNest(result, 736, 796);
    
    _putDontNest(result, 617, 789);
    
    _putDontNest(result, 570, 659);
    
    _putDontNest(result, 585, 704);
    
    _putDontNest(result, 550, 610);
    
    _putDontNest(result, 550, 726);
    
    _putDontNest(result, 481, 733);
    
    _putDontNest(result, 550, 719);
    
    _putDontNest(result, 589, 627);
    
    _putDontNest(result, 486, 659);
    
    _putDontNest(result, 677, 704);
    
    _putDontNest(result, 596, 754);
    
    _putDontNest(result, 531, 691);
    
    _putDontNest(result, 467, 589);
    
    _putDontNest(result, 736, 733);
    
    _putDontNest(result, 596, 775);
    
    _putDontNest(result, 503, 747);
    
    _putDontNest(result, 467, 567);
    
    _putDontNest(result, 474, 768);
    
    _putDontNest(result, 582, 704);
    
    _putDontNest(result, 567, 617);
    
    _putDontNest(result, 486, 643);
    
    _putDontNest(result, 554, 684);
    
    _putDontNest(result, 617, 691);
    
    _putDontNest(result, 445, 747);
    
    _putDontNest(result, 491, 740);
    
    _putDontNest(result, 684, 747);
    
    _putDontNest(result, 554, 603);
    
    _putDontNest(result, 567, 768);
    
    _putDontNest(result, 779, 789);
    
    _putDontNest(result, 544, 677);
    
    _putDontNest(result, 646, 768);
    
    _putDontNest(result, 474, 617);
    
    _putDontNest(result, 636, 768);
    
    _putDontNest(result, 498, 574);
    
    _putDontNest(result, 589, 761);
    
    _putDontNest(result, 610, 589);
    
    _putDontNest(result, 570, 610);
    
    _putDontNest(result, 570, 726);
    
    _putDontNest(result, 491, 589);
    
    _putDontNest(result, 462, 704);
    
    _putDontNest(result, 498, 761);
    
    _putDontNest(result, 503, 560);
    
    _putDontNest(result, 454, 560);
    
    _putDontNest(result, 659, 768);
    
    _putDontNest(result, 570, 719);
    
    _putDontNest(result, 750, 733);
    
    _putDontNest(result, 445, 560);
    
    _putDontNest(result, 596, 659);
    
    _putDontNest(result, 414, 503);
    
    _putDontNest(result, 486, 754);
    
    _putDontNest(result, 486, 775);
    
    _putDontNest(result, 639, 740);
    
    _putDontNest(result, 486, 726);
    
    _putDontNest(result, 486, 610);
    
    _putDontNest(result, 578, 789);
    
    _putDontNest(result, 750, 796);
    
    _putDontNest(result, 563, 740);
    
    _putDontNest(result, 462, 582);
    
    _putDontNest(result, 570, 775);
    
    _putDontNest(result, 570, 754);
    
    _putDontNest(result, 550, 659);
    
    _putDontNest(result, 486, 719);
    
    _putDontNest(result, 541, 733);
    
    _putDontNest(result, 430, 677);
    
    _putDontNest(result, 621, 740);
    
    _putDontNest(result, 445, 451);
    
    _putDontNest(result, 603, 712);
    
    _putDontNest(result, 662, 677);
    
    _putDontNest(result, 421, 550);
    
    _putDontNest(result, 603, 636);
    
    _putDontNest(result, 467, 740);
    
    _putDontNest(result, 550, 643);
    
    _putDontNest(result, 462, 531);
    
    _putDontNest(result, 430, 541);
    
    _putDontNest(result, 650, 704);
    
    _putDontNest(result, 541, 796);
    
    _putDontNest(result, 525, 677);
    
    _putDontNest(result, 578, 691);
    
    _putDontNest(result, 414, 650);
    
    _putDontNest(result, 513, 636);
    
    _putDontNest(result, 525, 541);
    
    _putDontNest(result, 596, 643);
    
    _putDontNest(result, 541, 668);
    
    _putDontNest(result, 513, 712);
    
    _putDontNest(result, 491, 567);
    
    _putDontNest(result, 454, 659);
    
    _putDontNest(result, 462, 796);
    
    _putDontNest(result, 592, 691);
    
    _putDontNest(result, 522, 684);
    
    _putDontNest(result, 430, 567);
    
    _putDontNest(result, 570, 747);
    
    _putDontNest(result, 541, 582);
    
    _putDontNest(result, 668, 684);
    
    _putDontNest(result, 792, 740);
    
    _putDontNest(result, 525, 589);
    
    _putDontNest(result, 454, 643);
    
    _putDontNest(result, 491, 677);
    
    _putDontNest(result, 525, 567);
    
    _putDontNest(result, 613, 636);
    
    _putDontNest(result, 503, 659);
    
    _putDontNest(result, 613, 712);
    
    _putDontNest(result, 491, 541);
    
    _putDontNest(result, 627, 761);
    
    _putDontNest(result, 704, 796);
    
    _putDontNest(result, 700, 704);
    
    _putDontNest(result, 771, 761);
    
    _putDontNest(result, 550, 560);
    
    _putDontNest(result, 498, 650);
    
    _putDontNest(result, 585, 355);
    
    _putDontNest(result, 462, 733);
    
    _putDontNest(result, 449, 740);
    
    _putDontNest(result, 414, 761);
    
    _putDontNest(result, 430, 589);
    
    _putDontNest(result, 646, 636);
    
    _putDontNest(result, 567, 712);
    
    _putDontNest(result, 567, 636);
    
    _putDontNest(result, 646, 712);
    
    _putDontNest(result, 650, 733);
    
    _putDontNest(result, 535, 740);
    
    _putDontNest(result, 650, 668);
    
    _putDontNest(result, 486, 747);
    
    _putDontNest(result, 445, 643);
    
    _putDontNest(result, 592, 789);
    
    _putDontNest(result, 503, 643);
    
    _putDontNest(result, 474, 712);
    
    _putDontNest(result, 414, 574);
    
    _putDontNest(result, 610, 677);
    
    _putDontNest(result, 589, 650);
    
    _putDontNest(result, 650, 796);
    
    _putDontNest(result, 474, 636);
    
    _putDontNest(result, 541, 704);
    
    _putDontNest(result, 462, 668);
    
    _putDontNest(result, 704, 733);
    
    _putDontNest(result, 522, 603);
    
    _putDontNest(result, 544, 740);
    
    _putDontNest(result, 445, 659);
    
    _putDontNest(result, 617, 589);
    
    _putDontNest(result, 531, 567);
    
    _putDontNest(result, 639, 691);
    
    _putDontNest(result, 449, 513);
    
    _putDontNest(result, 722, 768);
    
    _putDontNest(result, 570, 636);
    
    _putDontNest(result, 570, 712);
    
    _putDontNest(result, 567, 747);
    
    _putDontNest(result, 589, 796);
    
    _putDontNest(result, 516, 684);
    
    _putDontNest(result, 513, 775);
    
    _putDontNest(result, 563, 691);
    
    _putDontNest(result, 513, 754);
    
    _putDontNest(result, 516, 603);
    
    _putDontNest(result, 541, 761);
    
    _putDontNest(result, 589, 733);
    
    _putDontNest(result, 603, 719);
    
    _putDontNest(result, 449, 467);
    
    _putDontNest(result, 414, 582);
    
    _putDontNest(result, 481, 627);
    
    _putDontNest(result, 603, 726);
    
    _putDontNest(result, 613, 747);
    
    _putDontNest(result, 603, 610);
    
    _putDontNest(result, 486, 712);
    
    _putDontNest(result, 414, 531);
    
    _putDontNest(result, 467, 691);
    
    _putDontNest(result, 531, 589);
    
    _putDontNest(result, 503, 596);
    
    _putDontNest(result, 486, 636);
    
    _putDontNest(result, 454, 596);
    
    _putDontNest(result, 498, 796);
    
    _putDontNest(result, 445, 768);
    
    _putDontNest(result, 498, 668);
    
    _putDontNest(result, 474, 747);
    
    _putDontNest(result, 503, 768);
    
    _putDontNest(result, 445, 596);
    
    _putDontNest(result, 454, 768);
    
    _putDontNest(result, 454, 474);
    
    _putDontNest(result, 621, 691);
    
    _putDontNest(result, 522, 522);
    
    _putDontNest(result, 563, 789);
    
    _putDontNest(result, 445, 617);
    
    _putDontNest(result, 498, 733);
    
    _putDontNest(result, 671, 684);
    
    _putDontNest(result, 462, 650);
    
    _putDontNest(result, 684, 768);
    
    _putDontNest(result, 750, 761);
    
    _putDontNest(result, 646, 747);
    
    _putDontNest(result, 639, 789);
    
    _putDontNest(result, 578, 740);
    
    _putDontNest(result, 503, 617);
    
    _putDontNest(result, 627, 704);
    
    _putDontNest(result, 454, 617);
    
    _putDontNest(result, 4581, 400);
    
    _putDontNest(result, 513, 719);
    
    _putDontNest(result, 421, 498);
    
    _putDontNest(result, 603, 754);
    
    _putDontNest(result, 467, 789);
    
    _putDontNest(result, 603, 775);
    
    _putDontNest(result, 513, 610);
    
    _putDontNest(result, 589, 668);
    
    _putDontNest(result, 513, 726);
    
    _putDontNest(result, 541, 574);
    
    _putDontNest(result, 621, 789);
    
    _putDontNest(result, 414, 704);
    
    _putDontNest(result, 574, 677);
    
    _putDontNest(result, 771, 733);
    
    _putDontNest(result, 596, 596);
    
    _putDontNest(result, 449, 691);
    
    _putDontNest(result, 513, 747);
    
    _putDontNest(result, 462, 574);
    
    _putDontNest(result, 582, 627);
    
    _putDontNest(result, 535, 691);
    
    _putDontNest(result, 627, 668);
    
    _putDontNest(result, 449, 789);
    
    _putDontNest(result, 646, 719);
    
    _putDontNest(result, 567, 719);
    
    _putDontNest(result, 653, 684);
    
    _putDontNest(result, 535, 789);
    
    _putDontNest(result, 646, 726);
    
    _putDontNest(result, 567, 610);
    
    _putDontNest(result, 567, 726);
    
    _putDontNest(result, 592, 740);
    
    _putDontNest(result, 585, 627);
    
    _putDontNest(result, 650, 761);
    
    _putDontNest(result, 585, 361);
    
    _putDontNest(result, 627, 733);
    
    _putDontNest(result, 613, 754);
    
    _putDontNest(result, 613, 775);
    
    _putDontNest(result, 531, 677);
    
    _putDontNest(result, 421, 481);
    
    _putDontNest(result, 498, 704);
    
    _putDontNest(result, 596, 768);
    
    _putDontNest(result, 550, 617);
    
    _putDontNest(result, 531, 541);
    
    _putDontNest(result, 544, 789);
    
    _putDontNest(result, 507, 550);
    
    _putDontNest(result, 462, 761);
    
    _putDontNest(result, 467, 513);
    
    _putDontNest(result, 771, 796);
    
    _putDontNest(result, 498, 582);
    
    _putDontNest(result, 636, 659);
    
    _putDontNest(result, 613, 719);
    
    _putDontNest(result, 574, 567);
    
    _putDontNest(result, 627, 796);
    
    _putDontNest(result, 550, 596);
    
    _putDontNest(result, 704, 761);
    
    _putDontNest(result, 613, 610);
    
    _putDontNest(result, 603, 747);
    
    _putDontNest(result, 613, 726);
    
    _putDontNest(result, 550, 768);
    
    _putDontNest(result, 596, 617);
    
    _putDontNest(result, 646, 775);
    
    _putDontNest(result, 646, 754);
    
    _putDontNest(result, 414, 796);
    
    _putDontNest(result, 792, 789);
    
    _putDontNest(result, 474, 719);
    
    _putDontNest(result, 567, 754);
    
    _putDontNest(result, 498, 531);
    
    _putDontNest(result, 567, 775);
    
    _putDontNest(result, 541, 650);
    
    _putDontNest(result, 589, 704);
    
    _putDontNest(result, 474, 610);
    
    _putDontNest(result, 414, 668);
    
    _putDontNest(result, 474, 726);
    
    _putDontNest(result, 574, 589);
    
    _putDontNest(result, 544, 691);
    
    _putDontNest(result, 414, 733);
    
    _putDontNest(result, 589, 582);
    
    _putDontNest(result, 474, 775);
    
    _putDontNest(result, 617, 677);
    
    _putDontNest(result, 474, 754);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(653, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(525, resultStoreId);
    result.putUnsafe(516, resultStoreId);
    result.putUnsafe(507, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(5607, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4581, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(659, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(570, resultStoreId);
    result.putUnsafe(613, resultStoreId);
    result.putUnsafe(563, resultStoreId);
    result.putUnsafe(592, resultStoreId);
    result.putUnsafe(578, resultStoreId);
    result.putUnsafe(585, resultStoreId);
    result.putUnsafe(554, resultStoreId);
    result.putUnsafe(599, resultStoreId);
    result.putUnsafe(606, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(430, resultStoreId);
    result.putUnsafe(414, resultStoreId);
    result.putUnsafe(421, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(445, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(603, resultStoreId);
    result.putUnsafe(596, resultStoreId);
    result.putUnsafe(617, resultStoreId);
    result.putUnsafe(610, resultStoreId);
    result.putUnsafe(589, resultStoreId);
    result.putUnsafe(582, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(636, resultStoreId);
    result.putUnsafe(650, resultStoreId);
    result.putUnsafe(627, resultStoreId);
    result.putUnsafe(643, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(535, resultStoreId);
    result.putUnsafe(544, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(662, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(779, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(454, resultStoreId);
    result.putUnsafe(449, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(687, resultStoreId);
    result.putUnsafe(695, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(646, resultStoreId);
    result.putUnsafe(630, resultStoreId);
    result.putUnsafe(621, resultStoreId);
    result.putUnsafe(639, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(671, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(684, resultStoreId);
    result.putUnsafe(677, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(486, resultStoreId);
    result.putUnsafe(474, resultStoreId);
    result.putUnsafe(513, resultStoreId);
    result.putUnsafe(503, resultStoreId);
    result.putUnsafe(467, resultStoreId);
    result.putUnsafe(531, resultStoreId);
    result.putUnsafe(491, resultStoreId);
    result.putUnsafe(462, resultStoreId);
    result.putUnsafe(498, resultStoreId);
    result.putUnsafe(481, resultStoreId);
    result.putUnsafe(522, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(700, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(691, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(722, resultStoreId);
    result.putUnsafe(704, resultStoreId);
    result.putUnsafe(750, resultStoreId);
    result.putUnsafe(771, resultStoreId);
    result.putUnsafe(736, resultStoreId);
    result.putUnsafe(715, resultStoreId);
    result.putUnsafe(729, resultStoreId);
    result.putUnsafe(764, resultStoreId);
    result.putUnsafe(743, resultStoreId);
    result.putUnsafe(757, resultStoreId);
    result.putUnsafe(708, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(680, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(567, resultStoreId);
    result.putUnsafe(574, resultStoreId);
    result.putUnsafe(560, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(668, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(550, resultStoreId);
    result.putUnsafe(541, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(792, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4202, resultStoreId);
      
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
  private static final IConstructor prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Params\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__lit___33__char_class___range__33_33_ = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_export_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"export\")],{})", Factory.Production);
  private static final IConstructor prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"property\",sort(\"PropertyAssignment\")),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_import_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"import\")],{})", Factory.Production);
  private static final IConstructor prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_ = (IConstructor) _read("prod(lit(\"this\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", Factory.Production);
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
  private static final IConstructor prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CharacterEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CharacterEscapeSequence\")))})", Factory.Production);
  private static final IConstructor regular__iter_star__RegularExpressionClassChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionClassChar\")))", Factory.Production);
  private static final IConstructor prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"shr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\\>\"),{\\not-follow(\\char-class([range(62,62)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"short\"),[\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", Factory.Production);
  private static final IConstructor prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_ = (IConstructor) _read("prod(lit(\"var\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_ = (IConstructor) _read("prod(lit(\"=\\>\"),[\\char-class([range(61,61)]),\\char-class([range(62,62)])],{})", Factory.Production);
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
  private static final IConstructor prod__Reserved__lit_char_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"char\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexEscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Params\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"forDo\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBody\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBody\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBody\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(114,114)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_ = (IConstructor) _read("prod(lex(\"ExponentPart\"),[\\char-class([range(69,69),range(101,101)]),lex(\"SignedInteger\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_ = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", Factory.Production);
  private static final IConstructor prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"eq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"==\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_ = (IConstructor) _read("prod(lex(\"NonEscapeCharacter\"),[\\char-class([range(1,9),range(11,33),range(35,38),range(40,47),range(58,91),range(93,97),range(99,101),range(103,109),range(111,113),range(115,115),range(119,119),range(121,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Source\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Expression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Expression\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_catch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", Factory.Production);
  private static final IConstructor prod__ArgExpression__Expression_ = (IConstructor) _read("prod(sort(\"ArgExpression\"),[sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__literal_Expression__Literal_ = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Declarator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Declarator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Declarator\")))})", Factory.Production);
  private static final IConstructor prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Expression\"),[sort(\"Param\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124__char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57 = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Expression\"),[sort(\"Param\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", Factory.Production);
  private static final IConstructor prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"Expression\"),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Params\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"=\\>\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"const\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", Factory.Production);
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
    
    protected static final void _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(555, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(559, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(558, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(560, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(554, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(417, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(415, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(418, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(416, 2, prod__lit___46__char_class___range__46_46_, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(414, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_, tmp);
	}
    protected static final void _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(466, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(467, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(465, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(635, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(631, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(636, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(634, 2, prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(630, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(723, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(725, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(722, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(724, 2, prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(726, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(690, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(688, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(687, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(691, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(689, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new int[] {124,124}, null, null);
      builder.addAlternative(Parser.prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(732, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(730, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(729, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(733, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(731, 2, prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,61}, null, null);
      builder.addAlternative(Parser.prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(481, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(479, 0, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(480, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(585, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(587, 2, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(589, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(586, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(588, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(736, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(740, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(738, 2, prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(739, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(737, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(663, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(667, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(666, 2, prod__lit___94__char_class___range__94_94_, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(668, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(662, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(354, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(348, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(352, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(350, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(355, 8, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(353, 6, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(349, 2, "Params", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(351, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(347, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      builder.addAlternative(Parser.prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(622, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(626, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(625, 2, prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(627, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(621, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(497, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(498, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(496, 0, prod__lit___33__char_class___range__33_33_, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(Parser.prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(502, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(503, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(501, 0, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      builder.addAlternative(Parser.prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(367, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(376, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(373, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(372, 2, regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(368, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(369, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(370, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(371, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(377, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(375, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(374, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(366, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      builder.addAlternative(Parser.prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(461, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(462, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(460, 0, prod__lit___126__char_class___range__126_126_, new int[] {126}, null, null);
      builder.addAlternative(Parser.prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(711, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(709, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(712, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(710, 2, prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(708, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(450, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(451, 2, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(449, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_, tmp);
	}
    protected static final void _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(566, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(564, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(567, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(565, 2, prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(563, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__function_Expression__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(380, 0, "Function", null, null);
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
    protected static final void _init_prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(358, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(360, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(357, 0, "Param", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(359, 2, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(361, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__literal_Expression__Literal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(383, 0, "Literal", null, null);
      builder.addAlternative(Parser.prod__literal_Expression__Literal_, tmp);
	}
    protected static final void _init_prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new LiteralStackNode<IConstructor>(328, 8, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(327, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(323, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(319, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(321, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(318, 0, "Param", null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(326, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(324, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(325, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(320, 2, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(322, 4, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      builder.addAlternative(Parser.prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[8] = new LiteralStackNode<IConstructor>(338, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(337, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(331, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(335, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(333, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(343, 11, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(339, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(342, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(340, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(341, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(330, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(336, 6, prod__lit___61_62__char_class___range__61_61_char_class___range__62_62_, new int[] {61,62}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(332, 2, "Params", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(344, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(334, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(Parser.prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(640, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(642, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(639, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(641, 2, prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(643, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(716, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(718, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(715, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(717, 2, prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(719, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(517, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(521, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(516, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(520, 2, prod__lit___37__char_class___range__37_37_, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(522, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(526, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(530, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(525, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(529, 2, prod__lit___47__char_class___range__47_47_, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(531, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(536, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(540, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(535, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(539, 2, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(541, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(658, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(654, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(653, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(659, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(657, 2, prod__lit___38__char_class___range__38_38_, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(Parser.prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(473, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(472, 0, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(474, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__this_Expression__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(386, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__this_Expression__lit_this_, tmp);
	}
    protected static final void _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(424, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(426, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(422, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(421, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(425, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(423, 2, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(427, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(396, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(390, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(399, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(389, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(398, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(397, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(395, 2, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(391, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(392, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(393, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(394, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(400, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(745, 2, prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(747, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(743, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(744, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(746, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(752, 2, prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(754, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(750, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(751, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(753, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(702, 6, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(697, 2, prod__lit___63__char_class___range__63_63_, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(700, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(695, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(703, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(696, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(701, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(698, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(704, 8, "Expression", null, null);
      builder.addAlternative(Parser.prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(759, 2, prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(761, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(757, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(758, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(760, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(511, 2, prod__lit___42__char_class___range__42_42_, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(513, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(507, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(508, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(512, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(682, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(684, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(680, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(681, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(683, 3, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(445, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(443, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(444, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(766, 2, prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(768, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(764, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(765, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(767, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(773, 2, prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(775, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(771, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(772, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(774, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(456, 2, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(454, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(455, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____, tmp);
	}
    protected static final void _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(677, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(675, 2, prod__lit___124__char_class___range__124_124_, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(671, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(676, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(672, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(582, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(580, 2, prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(578, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(581, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(579, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[4] = new SeparatedListStackNode<IConstructor>(438, 4, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(434, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(435, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(436, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(437, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(440, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(432, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(430, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(433, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(431, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(439, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(646, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(648, 2, prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(650, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(647, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(649, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(592, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(594, 2, prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(596, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(593, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(595, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(570, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(572, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(574, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(571, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(573, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(544, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(548, 2, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(550, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(545, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(549, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(403, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(405, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(407, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(404, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(406, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__var_Expression__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(410, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__var_Expression__Id_, tmp);
	}
    protected static final void _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(484, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(486, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(485, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(599, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(601, 2, prod__lit___62__char_class___range__62_62_, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(603, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(600, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(602, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(779, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(789, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(787, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(788, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(780, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(606, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(610, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(608, 2, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(609, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(607, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(792, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(796, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(794, 2, prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(795, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(793, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(613, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(617, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(615, 2, prod__lit___60__char_class___range__60_60_, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(616, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(614, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(489, 0, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(491, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(490, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
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
      
        _init_prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
        _init_prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(builder);
      
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
      
        _init_prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_Expression_(builder);
      
        _init_prod__literal_Expression__Literal_(builder);
      
        _init_prod__Expression__Param_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
        _init_prod__Expression__lit___40_layouts_LAYOUTLIST_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___61_62_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(builder);
      
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
      
      tmp[0] = new EpsilonStackNode<IConstructor>(866, 0);
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
      
      tmp[0] = new ListStackNode<IConstructor>(885, 0, regular__iter_star__char_class___range__65_90_range__97_122, new CharStackNode<IConstructor>(882, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(Parser.prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(890, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(893, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(888, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(889, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(892, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(891, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(904, 1, prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(907, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(906, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(905, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(908, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(903, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source, tmp);
	}
    protected static final void _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(914, 0, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(912, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(913, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1070, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1069, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1067, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1071, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1068, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1066, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1074, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1076, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1078, 0, "RegularExpressionBackslashSequence", null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1186, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1185, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1183, 1, prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1187, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1184, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1182, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit, tmp);
	}
    protected static final void _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1190, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(1756, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(Parser.prod__CommentChar__char_class___range__42_42_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1760, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1759, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1764, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1763, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1762, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1761, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1768, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1773, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1769, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1770, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1772, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1771, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar, tmp);
	}
    protected static final void _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1777, 0, new int[][]{{1,41},{43,16777215}}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1847, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1846, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1844, 1, prod__lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__111_111_char_class___range__114_114_char_class___range__66_66_char_class___range__105_105_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,111,114,66,105,110,100,105,110,103,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1848, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1845, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1843, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding, tmp);
	}
    protected static final void _init_prod__ForBinding__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1851, 0, "Id", null, null);
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
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(1902, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(1899, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1900, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(1901, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1905, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1910, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1909, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1908, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1907, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1906, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1941, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1940, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1938, 1, prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1942, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1939, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1937, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence, tmp);
	}
    protected static final void _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(1945, 0, prod__lit_u__char_class___range__117_117_, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(1949, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(1951, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1947, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(1953, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1948, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(1952, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1950, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1946, 1, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(1998, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1997, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(2003, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2001, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2002, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2000, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1999, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2008, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2007, 1, prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2010, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2009, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2011, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2006, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause, tmp);
	}
    protected static final void _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(2023, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2021, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2022, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2015, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2017, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2019, 4, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2020, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2016, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2018, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2026, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2028, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2031, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2027, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2030, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2029, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(2117, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2116, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2114, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2113, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2115, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2118, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2126, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2125, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2123, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2122, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2127, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2124, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2138, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2139, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2140, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2135, 0, "Id", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2137, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclaration__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2144, 0, "Id", null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(2154, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2153, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2151, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2155, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2152, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2150, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody, tmp);
	}
    protected static final void _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2160, 1, regular__iter_star__RegularExpressionChar, new NonTerminalStackNode<IConstructor>(2159, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2158, 0, "RegularExpressionFirstChar", null, null);
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
    
    protected static final void _init_prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2242, 1, prod__lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,108,97,114,97,116,111,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2245, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2244, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2241, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2243, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2246, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator, tmp);
	}
    protected static final void _init_prod__Declarator__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2249, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.prod__Declarator__lit_var_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(2265, 1, prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2268, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2267, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2264, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2266, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2269, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl, tmp);
	}
    protected static final void _init_prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2273, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2280, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2272, 0, "Declarator", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2278, 2, regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2274, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2275, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2276, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2277, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2281, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2331, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2330, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(Parser.prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2336, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2339, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2334, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2335, 1, prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2338, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2337, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2343, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2348, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2345, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2347, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2346, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2344, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2352, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
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
      
      tmp[0] = new SequenceStackNode<IConstructor>(2432, 0, regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2425, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2429, 1, regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode<IConstructor>(2426, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(Parser.prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2435, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2440, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2437, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2439, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2438, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2436, 1, prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(2445, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(Parser.prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2448, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2450, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2453, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2449, 1, prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2452, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2451, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2466, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2468, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2473, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2476, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2471, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2472, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2475, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2474, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2480, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2485, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2482, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2481, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2484, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2483, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(2614, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(Parser.prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2622, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2619, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2617, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2621, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2620, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2618, 1, prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(2666, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2665, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2663, 1, prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2667, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2664, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2662, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence, tmp);
	}
    protected static final void _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2670, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2672, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2671, 1, "HexDigit", null, null);
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
      
      tmp[12] = new SeparatedListStackNode<IConstructor>(2889, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2887, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2888, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2879, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(2881, 6, "Param", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2877, 2, "PropertyName", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(2884, 9, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2882, 7, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(2890, 13, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2883, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(2891, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(2885, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2875, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new int[] {115,101,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2878, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2886, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2876, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2880, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(2902, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2897, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2895, 2, "PropertyName", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2901, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2900, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2893, 0, prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_, new int[] {103,101,116}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(2905, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2903, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2904, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(2907, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(2899, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2896, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2906, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2894, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2898, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2914, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2913, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2911, 1, prod__lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__77_77_char_class___range__101_101_char_class___range__116_116_char_class___range__104_104_char_class___range__111_111_char_class___range__100_100_char_class___range__68_68_char_class___range__101_101_char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,77,101,116,104,111,100,68,101,102,105,110,105,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2910, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2915, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2912, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
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
      
      tmp[0] = new ListStackNode<IConstructor>(2964, 0, regular__iter_star__LAYOUT, new NonTerminalStackNode<IConstructor>(2959, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
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
      
      tmp[1] = new ListStackNode<IConstructor>(3011, 1, regular__iter_star__char_class___range__1_9_range__11_16777215, new CharStackNode<IConstructor>(3009, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(3008, 0, prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_, new int[] {47,47}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3016, 2, prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(3015, 1, regular__iter_star__CommentChar, new NonTerminalStackNode<IConstructor>(3014, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3013, 0, prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_, new int[] {47,42}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3019, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3021, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3020, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3023, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3022, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3024, 4, new int[][]{{0,0}}, null, null);
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
      
      tmp[0] = new LiteralStackNode<IConstructor>(3341, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new int[] {105,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_int_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_char_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3343, 0, prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_char_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_catch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3345, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_catch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_continue_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3347, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_continue_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_break_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3349, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_break_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_for_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3351, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_for_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_native_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3353, 0, prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_native_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_short_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3355, 0, prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_short_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_package_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3357, 0, prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_package_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_export_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3359, 0, prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_export_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_protected_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3361, 0, prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_protected_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_import_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3363, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_import_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_implements_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3365, 0, prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_implements_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3367, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_function_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_double_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3369, 0, prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_double_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_switch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3371, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_switch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_case_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3373, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_case_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3375, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_var_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_while_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3377, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_while_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_const_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3379, 0, prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_const_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_super_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3381, 0, prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_super_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_transient_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3383, 0, prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_transient_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_typeof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3385, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_typeof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3387, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_this_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throw_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3389, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throw_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_with_lit_abstract_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3392, 1, prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3391, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_with_lit_abstract_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_public_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3394, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_public_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_long_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3396, 0, prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_long_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_static_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3398, 0, prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_static_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_float_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3400, 0, prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_float_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throws_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3402, 0, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throws_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_default_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3404, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_default_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_new_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3406, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_new_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_delete_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3408, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_delete_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_try_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3410, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_try_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_private_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3412, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_private_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3414, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_true_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_volatile_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3416, 0, prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_volatile_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3418, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_null_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_finally_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3420, 0, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_finally_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_void_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3422, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_void_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_return_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3424, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_return_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3426, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_false_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_interface_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3428, 0, prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_interface_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_instanceof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3430, 0, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_instanceof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_else_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3432, 0, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_else_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_in_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3434, 0, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_in_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_synchronized_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3436, 0, prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_synchronized_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_if_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3438, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_if_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_enum_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3440, 0, prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_enum_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_byte_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3442, 0, prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_byte_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_class_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3444, 0, prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_class_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_goto_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3446, 0, prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_goto_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_final_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3448, 0, prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_final_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_extends_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3450, 0, prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_extends_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_do_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3452, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_do_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3454, 0, prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_boolean_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_debugger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3456, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(3528, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3527, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3525, 1, prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3524, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3529, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3526, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean, tmp);
	}
    protected static final void _init_prod__Boolean__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3532, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Boolean__lit_true_, tmp);
	}
    protected static final void _init_prod__Boolean__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3534, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(3538, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(Parser.prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3543, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3546, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3541, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3542, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3545, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3544, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[1] = new CharStackNode<IConstructor>(3583, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3587, 2, regular__iter__char_class___range__48_57_range__65_70_range__97_102, new CharStackNode<IConstructor>(3584, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3582, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    protected static final void _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3590, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3592, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3595, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3591, 1, prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3594, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3593, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[2] = new LiteralStackNode<IConstructor>(3641, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3644, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3639, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3640, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3643, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3642, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence, tmp);
	}
    protected static final void _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3647, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3648, 1, new int[][]{{1,9},{11,16777215}}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(3748, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__EscapeSequence__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__UnicodeEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3750, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__UnicodeEscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3754, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3757, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3756, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3755, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3758, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3753, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence, tmp);
	}
    protected static final void _init_prod__EscapeSequence__HexEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3761, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__HexEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__CharacterEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3763, 0, "CharacterEscapeSequence", null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(3772, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3771, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3769, 1, prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3773, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3770, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3768, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart, tmp);
	}
    protected static final void _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(3777, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(3776, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(Parser.prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3784, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3783, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3781, 1, prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3780, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3785, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3782, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(3849, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3848, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3846, 1, prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3845, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3850, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3847, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger, tmp);
	}
    protected static final void _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(3854, 0, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode<IConstructor>(3853, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(3858, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3855, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3883, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.prod__Numeric__HexInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3890, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3889, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3886, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3891, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3888, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3887, 1, prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric, tmp);
	}
    protected static final void _init_prod__Numeric__Decimal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3896, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
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
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(3906, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(3903, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3904, 1, "Source", null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3910, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__Param__Id_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3914, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,97,114,97,109,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3918, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3915, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3917, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3916, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3913, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(3931, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3928, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3927, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3926, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3930, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3929, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[2] = new LiteralStackNode<IConstructor>(4061, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4064, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4059, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4060, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4063, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4062, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass, tmp);
	}
    protected static final void _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4067, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4070, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4069, 1, regular__iter_star__RegularExpressionClassChar, new NonTerminalStackNode<IConstructor>(4068, 0, "RegularExpressionClassChar", null, null), false, null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4203, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4204, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4202, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4208, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4213, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4215, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4210, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4222, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4216, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4214, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4209, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4223, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4211, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4217, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4220, 10, regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4218, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4219, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4207, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4227, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4228, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4226, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4234, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4243, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4245, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4238, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4232, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4236, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4239, 8, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4235, 4, "Declarator", null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4246, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4244, 12, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4233, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4237, 6, "ForBinding", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(4241, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4231, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4240, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4258, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4255, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4250, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4257, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4252, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4259, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4249, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4262, 10, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4251, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4256, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4253, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_, tmp);
	}
    protected static final void _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4266, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4265, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4267, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4272, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4270, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4271, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4280, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4277, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4275, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4279, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4278, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4276, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement, tmp);
	}
    protected static final void _init_prod__empty_Statement__lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4284, 0, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__empty_Statement__lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4303, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4296, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4297, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4287, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4293, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4289, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4301, 14, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4299, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4291, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4295, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4302, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4294, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4288, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4292, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4300, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4290, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4298, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4316, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4306, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4317, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4312, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4308, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4319, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4310, 4, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4314, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4311, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4307, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4313, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4309, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4318, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4340, 10, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4336, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4337, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4338, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4339, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4322, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4352, 16, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4335, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4326, 4, "Declarator", null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4349, 14, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4345, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4346, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4347, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4348, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4343, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4354, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4324, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4332, 6, regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4328, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4329, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4330, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4331, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4351, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4334, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4353, 17, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4325, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4342, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4344, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4333, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4327, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4323, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4358, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4359, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4357, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4363, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4364, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4362, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4374, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4372, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4368, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4378, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4370, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4375, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4369, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4373, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4371, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4379, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4376, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4377, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4367, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4385, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4402, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4409, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4383, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4391, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4393, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4411, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4398, 8, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4394, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4395, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4396, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4397, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4390, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4386, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4387, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4388, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4389, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4407, 12, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4403, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4404, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4405, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4406, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4410, 14, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4384, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4392, 6, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4401, 10, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4382, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4400, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4412, 16, "Statement", null, null);
      builder.addAlternative(Parser.prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4419, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4418, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4416, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4420, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4417, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4415, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4435, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4429, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4434, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4432, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4427, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4426, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4430, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4428, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4433, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(Parser.prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4442, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4439, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4438, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4443, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4440, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4449, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4447, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4446, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4450, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4448, 2, "Id", null, null);
      builder.addAlternative(Parser.prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__varDecl_Statement__VarDecl_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4453, 0, "VarDecl", null, null);
      builder.addAlternative(Parser.prod__varDecl_Statement__VarDecl_, tmp);
	}
    protected static final void _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4460, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4457, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4456, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4461, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4458, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4468, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4477, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4466, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4471, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4464, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4475, 10, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4474, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4476, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4467, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4465, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4470, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4472, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4473, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4484, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4482, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4487, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4480, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4483, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4486, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4481, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4488, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4489, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4492, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4494, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4496, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4493, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4495, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__function_Statement__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4499, 0, "Function", null, null);
      builder.addAlternative(Parser.prod__function_Statement__Function_, tmp);
	}
    protected static final void _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4502, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4508, 4, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4506, 2, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4504, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4505, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4507, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4503, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4523, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4511, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4522, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4525, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4515, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4518, 6, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4513, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4520, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4524, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4514, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4519, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4512, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4517, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4528, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4532, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4530, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4531, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4529, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4535, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4539, 4, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4537, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4541, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4538, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4540, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4536, 1, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(4572, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4574, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4577, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4573, 1, prod__lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__72_72_char_class___range__83_83_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,72,83,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4576, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4575, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression, tmp);
	}
    protected static final void _init_prod__LHSExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4581, 0, "Expression", null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4593, 0, "String", null, null);
      builder.addAlternative(Parser.prod__Literal__String_, tmp);
	}
    protected static final void _init_prod__Literal__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4595, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__Literal__Numeric_, tmp);
	}
    protected static final void _init_prod__Literal__RegularExpression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4597, 0, "RegularExpression", null, null);
      builder.addAlternative(Parser.prod__Literal__RegularExpression_, tmp);
	}
    protected static final void _init_prod__Literal__Boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4599, 0, "Boolean", null, null);
      builder.addAlternative(Parser.prod__Literal__Boolean_, tmp);
	}
    protected static final void _init_prod__Literal__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4601, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Literal__lit_null_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4609, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4606, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4608, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4607, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4605, 1, prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4604, 0, new int[][]{{0,0}}, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(4620, 1, prod__lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4624, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4621, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4623, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4622, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4619, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression, tmp);
	}
    protected static final void _init_prod__ArgExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4627, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__ArgExpression__Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4635, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4632, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4631, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4630, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4634, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4633, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4935, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__PropertyName__Numeric_, tmp);
	}
    protected static final void _init_prod__PropertyName__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4937, 0, "String", null, null);
      builder.addAlternative(Parser.prod__PropertyName__String_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4944, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4943, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4941, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4945, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4942, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4940, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName, tmp);
	}
    protected static final void _init_prod__PropertyName__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4948, 0, "Id", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(4952, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__char_class___range__117_117_range__120_120_, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4954, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__SingleEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4962, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4959, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4957, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4961, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4960, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4958, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4965, 0, new int[][]{{48,57}}, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(5083, 1, prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5086, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5085, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5084, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5087, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5082, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5090, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__CharacterEscapeSequence__NonEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5092, 0, "SingleEscapeCharacter", null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5196, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5198, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5200, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5204, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5207, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5206, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5205, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5208, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5203, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5214, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5217, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5216, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5215, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5218, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5213, 0, new int[][]{{0,0}}, null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5225, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5226, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5228, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5224, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5227, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5235, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5234, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5231, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5233, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5232, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5236, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment, tmp);
	}
    protected static final void _init_prod__PropertyAssignment__MethodDefinition_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5239, 0, "MethodDefinition", null, null);
      builder.addAlternative(Parser.prod__PropertyAssignment__MethodDefinition_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5242, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5244, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5246, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5245, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5247, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5243, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
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
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5336, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5334, 0, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5335, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5339, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5341, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5344, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5340, 1, prod__lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5343, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5342, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(5351, 1, prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5354, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5353, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5352, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5355, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5350, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Whitespace_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5358, 0, "Whitespace", null, null);
      builder.addAlternative(Parser.prod__LAYOUT__Whitespace_, tmp);
	}
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5366, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5363, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5361, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5365, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5364, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5362, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Comment_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5370, 0, "Comment", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(5415, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5417, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5421, 1, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(5418, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5429, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5426, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5428, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5427, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5424, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5425, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__DecimalInteger__char_class___range__48_48_(builder);
      
        _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(builder);
      
        _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(builder);
      
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
      
      tmp[2] = new LiteralStackNode<IConstructor>(5577, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5580, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5575, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5576, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5579, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5578, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5586, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5589, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5584, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5585, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5588, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5587, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5597, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__nonInit_VariableDeclarationNoIn__id_Id_, tmp);
	}
    protected static final void _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5601, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5607, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5604, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5605, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5603, 1, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(5726, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5729, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5734, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5731, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5733, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5732, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5730, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar, tmp);
	}
    protected static final void _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5737, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5738, 1, "EscapeSequence", null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5746, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5743, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5745, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5744, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5741, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5742, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
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
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(5990, 0, regular__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(5986, 0, "Param", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5987, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(5988, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(5989, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5999, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5996, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5994, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5998, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5997, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5995, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,115,34,41}, null, null);
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