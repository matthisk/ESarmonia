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
import org.rascalmpl.values.uptr.RascalValueFactory;
import org.rascalmpl.values.uptr.ITree;

@SuppressWarnings("all")
public class Parser extends org.rascalmpl.parser.gtd.SGTDBF<IConstructor, ITree, ISourceLocation> {
  protected final static IValueFactory VF = ValueFactoryFactory.getValueFactory();

  protected static IValue _read(java.lang.String s, org.eclipse.imp.pdb.facts.type.Type type) {
    try {
      return new StandardTextReader().read(VF, org.rascalmpl.values.uptr.RascalValueFactory.uptr, type, new StringReader(s));
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
    
    
    
    
    _putDontNest(result, 399, 582);
    
    _putDontNest(result, 535, 678);
    
    _putDontNest(result, 562, 678);
    
    _putDontNest(result, 354, 473);
    
    _putDontNest(result, 413, 671);
    
    _putDontNest(result, 531, 582);
    
    _putDontNest(result, 492, 623);
    
    _putDontNest(result, 517, 678);
    
    _putDontNest(result, 559, 600);
    
    _putDontNest(result, 535, 699);
    
    _putDontNest(result, 514, 706);
    
    _putDontNest(result, 5564, 542);
    
    _putDontNest(result, 517, 699);
    
    _putDontNest(result, 430, 559);
    
    _putDontNest(result, 423, 559);
    
    _putDontNest(result, 510, 623);
    
    _putDontNest(result, 674, 671);
    
    _putDontNest(result, 623, 713);
    
    _putDontNest(result, 476, 636);
    
    _putDontNest(result, 535, 623);
    
    _putDontNest(result, 623, 685);
    
    _putDontNest(result, 386, 727);
    
    _putDontNest(result, 354, 430);
    
    _putDontNest(result, 386, 616);
    
    _putDontNest(result, 562, 623);
    
    _putDontNest(result, 571, 706);
    
    _putDontNest(result, 338, 454);
    
    _putDontNest(result, 370, 528);
    
    _putDontNest(result, 486, 671);
    
    _putDontNest(result, 538, 609);
    
    _putDontNest(result, 506, 521);
    
    _putDontNest(result, 510, 678);
    
    _putDontNest(result, 463, 671);
    
    _putDontNest(result, 667, 720);
    
    _putDontNest(result, 600, 706);
    
    _putDontNest(result, 492, 699);
    
    _putDontNest(result, 506, 514);
    
    _putDontNest(result, 510, 699);
    
    _putDontNest(result, 538, 559);
    
    _putDontNest(result, 506, 542);
    
    _putDontNest(result, 492, 678);
    
    _putDontNest(result, 506, 692);
    
    _putDontNest(result, 517, 623);
    
    _putDontNest(result, 476, 664);
    
    _putDontNest(result, 430, 609);
    
    _putDontNest(result, 492, 492);
    
    _putDontNest(result, 423, 609);
    
    _putDontNest(result, 562, 699);
    
    _putDontNest(result, 591, 657);
    
    _putDontNest(result, 467, 623);
    
    _putDontNest(result, 454, 445);
    
    _putDontNest(result, 406, 492);
    
    _putDontNest(result, 370, 542);
    
    _putDontNest(result, 660, 720);
    
    _putDontNest(result, 553, 600);
    
    _putDontNest(result, 619, 636);
    
    _putDontNest(result, 386, 671);
    
    _putDontNest(result, 571, 657);
    
    _putDontNest(result, 354, 568);
    
    _putDontNest(result, 524, 549);
    
    _putDontNest(result, 413, 727);
    
    _putDontNest(result, 413, 616);
    
    _putDontNest(result, 467, 492);
    
    _putDontNest(result, 549, 559);
    
    _putDontNest(result, 482, 664);
    
    _putDontNest(result, 406, 699);
    
    _putDontNest(result, 354, 413);
    
    _putDontNest(result, 467, 678);
    
    _putDontNest(result, 454, 600);
    
    _putDontNest(result, 514, 657);
    
    _putDontNest(result, 448, 492);
    
    _putDontNest(result, 445, 600);
    
    _putDontNest(result, 506, 528);
    
    _putDontNest(result, 381, 591);
    
    _putDontNest(result, 445, 445);
    
    _putDontNest(result, 623, 644);
    
    _putDontNest(result, 591, 706);
    
    _putDontNest(result, 448, 623);
    
    _putDontNest(result, 473, 482);
    
    _putDontNest(result, 545, 678);
    
    _putDontNest(result, 370, 521);
    
    _putDontNest(result, 406, 623);
    
    _putDontNest(result, 674, 727);
    
    _putDontNest(result, 467, 699);
    
    _putDontNest(result, 528, 600);
    
    _putDontNest(result, 545, 699);
    
    _putDontNest(result, 370, 514);
    
    _putDontNest(result, 439, 591);
    
    _putDontNest(result, 370, 692);
    
    _putDontNest(result, 457, 600);
    
    _putDontNest(result, 486, 616);
    
    _putDontNest(result, 636, 692);
    
    _putDontNest(result, 482, 636);
    
    _putDontNest(result, 439, 482);
    
    _putDontNest(result, 448, 699);
    
    _putDontNest(result, 486, 727);
    
    _putDontNest(result, 524, 535);
    
    _putDontNest(result, 524, 568);
    
    _putDontNest(result, 463, 616);
    
    _putDontNest(result, 463, 727);
    
    _putDontNest(result, 423, 499);
    
    _putDontNest(result, 354, 549);
    
    _putDontNest(result, 430, 499);
    
    _putDontNest(result, 502, 559);
    
    _putDontNest(result, 600, 657);
    
    _putDontNest(result, 406, 678);
    
    _putDontNest(result, 549, 609);
    
    _putDontNest(result, 354, 370);
    
    _putDontNest(result, 354, 535);
    
    _putDontNest(result, 448, 678);
    
    _putDontNest(result, 502, 609);
    
    _putDontNest(result, 619, 664);
    
    _putDontNest(result, 616, 692);
    
    _putDontNest(result, 381, 482);
    
    _putDontNest(result, 545, 623);
    
    _putDontNest(result, 473, 591);
    
    _putDontNest(result, 435, 713);
    
    _putDontNest(result, 381, 706);
    
    _putDontNest(result, 476, 506);
    
    _putDontNest(result, 702, 657);
    
    _putDontNest(result, 528, 528);
    
    _putDontNest(result, 681, 713);
    
    _putDontNest(result, 619, 720);
    
    _putDontNest(result, 502, 582);
    
    _putDontNest(result, 603, 671);
    
    _putDontNest(result, 681, 685);
    
    _putDontNest(result, 399, 499);
    
    _putDontNest(result, 627, 706);
    
    _putDontNest(result, 394, 699);
    
    _putDontNest(result, 354, 418);
    
    _putDontNest(result, 521, 623);
    
    _putDontNest(result, 542, 727);
    
    _putDontNest(result, 612, 657);
    
    _putDontNest(result, 542, 616);
    
    _putDontNest(result, 594, 713);
    
    _putDontNest(result, 660, 664);
    
    _putDontNest(result, 559, 692);
    
    _putDontNest(result, 394, 678);
    
    _putDontNest(result, 609, 692);
    
    _putDontNest(result, 439, 706);
    
    _putDontNest(result, 549, 582);
    
    _putDontNest(result, 445, 528);
    
    _putDontNest(result, 506, 600);
    
    _putDontNest(result, 499, 616);
    
    _putDontNest(result, 499, 727);
    
    _putDontNest(result, 647, 657);
    
    _putDontNest(result, 338, 616);
    
    _putDontNest(result, 338, 727);
    
    _putDontNest(result, 521, 699);
    
    _putDontNest(result, 695, 644);
    
    _putDontNest(result, 394, 492);
    
    _putDontNest(result, 386, 454);
    
    _putDontNest(result, 345, 575);
    
    _putDontNest(result, 454, 528);
    
    _putDontNest(result, 394, 623);
    
    _putDontNest(result, 709, 692);
    
    _putDontNest(result, 473, 706);
    
    _putDontNest(result, 594, 685);
    
    _putDontNest(result, 521, 678);
    
    _putDontNest(result, 482, 720);
    
    _putDontNest(result, 457, 528);
    
    _putDontNest(result, 345, 644);
    
    _putDontNest(result, 568, 671);
    
    _putDontNest(result, 435, 685);
    
    _putDontNest(result, 463, 454);
    
    _putDontNest(result, 473, 657);
    
    _putDontNest(result, 695, 713);
    
    _putDontNest(result, 695, 685);
    
    _putDontNest(result, 381, 657);
    
    _putDontNest(result, 418, 492);
    
    _putDontNest(result, 667, 664);
    
    _putDontNest(result, 681, 644);
    
    _putDontNest(result, 495, 699);
    
    _putDontNest(result, 578, 623);
    
    _putDontNest(result, 499, 671);
    
    _putDontNest(result, 571, 591);
    
    _putDontNest(result, 338, 671);
    
    _putDontNest(result, 568, 727);
    
    _putDontNest(result, 568, 616);
    
    _putDontNest(result, 399, 559);
    
    _putDontNest(result, 423, 582);
    
    _putDontNest(result, 430, 582);
    
    _putDontNest(result, 413, 454);
    
    _putDontNest(result, 476, 720);
    
    _putDontNest(result, 553, 692);
    
    _putDontNest(result, 495, 678);
    
    _putDontNest(result, 457, 692);
    
    _putDontNest(result, 578, 699);
    
    _putDontNest(result, 370, 600);
    
    _putDontNest(result, 531, 609);
    
    _putDontNest(result, 457, 542);
    
    _putDontNest(result, 370, 445);
    
    _putDontNest(result, 627, 657);
    
    _putDontNest(result, 445, 521);
    
    _putDontNest(result, 542, 671);
    
    _putDontNest(result, 457, 514);
    
    _putDontNest(result, 495, 623);
    
    _putDontNest(result, 528, 542);
    
    _putDontNest(result, 435, 575);
    
    _putDontNest(result, 514, 591);
    
    _putDontNest(result, 418, 699);
    
    _putDontNest(result, 603, 616);
    
    _putDontNest(result, 528, 514);
    
    _putDontNest(result, 603, 727);
    
    _putDontNest(result, 612, 706);
    
    _putDontNest(result, 454, 521);
    
    _putDontNest(result, 528, 692);
    
    _putDontNest(result, 482, 506);
    
    _putDontNest(result, 445, 542);
    
    _putDontNest(result, 435, 644);
    
    _putDontNest(result, 531, 559);
    
    _putDontNest(result, 445, 514);
    
    _putDontNest(result, 457, 521);
    
    _putDontNest(result, 445, 692);
    
    _putDontNest(result, 578, 678);
    
    _putDontNest(result, 454, 692);
    
    _putDontNest(result, 439, 657);
    
    _putDontNest(result, 594, 644);
    
    _putDontNest(result, 454, 542);
    
    _putDontNest(result, 418, 678);
    
    _putDontNest(result, 528, 521);
    
    _putDontNest(result, 538, 582);
    
    _putDontNest(result, 454, 514);
    
    _putDontNest(result, 345, 685);
    
    _putDontNest(result, 399, 609);
    
    _putDontNest(result, 345, 713);
    
    _putDontNest(result, 647, 706);
    
    _putDontNest(result, 381, 463);
    
    _putDontNest(result, 418, 623);
    
    _putDontNest(result, 702, 706);
    
    _putDontNest(result, 381, 413);
    
    _putDontNest(result, 585, 591);
    
    _putDontNest(result, 476, 713);
    
    _putDontNest(result, 623, 636);
    
    _putDontNest(result, 688, 706);
    
    _putDontNest(result, 399, 623);
    
    _putDontNest(result, 619, 644);
    
    _putDontNest(result, 439, 535);
    
    _putDontNest(result, 418, 559);
    
    _putDontNest(result, 492, 582);
    
    _putDontNest(result, 542, 600);
    
    _putDontNest(result, 482, 575);
    
    _putDontNest(result, 354, 482);
    
    _putDontNest(result, 575, 657);
    
    _putDontNest(result, 578, 559);
    
    _putDontNest(result, 463, 528);
    
    _putDontNest(result, 338, 394);
    
    _putDontNest(result, 381, 535);
    
    _putDontNest(result, 531, 678);
    
    _putDontNest(result, 370, 671);
    
    _putDontNest(result, 439, 549);
    
    _putDontNest(result, 486, 528);
    
    _putDontNest(result, 381, 568);
    
    _putDontNest(result, 435, 506);
    
    _putDontNest(result, 695, 720);
    
    _putDontNest(result, 473, 535);
    
    _putDontNest(result, 495, 609);
    
    _putDontNest(result, 636, 671);
    
    _putDontNest(result, 354, 591);
    
    _putDontNest(result, 473, 568);
    
    _putDontNest(result, 640, 699);
    
    _putDontNest(result, 531, 623);
    
    _putDontNest(result, 399, 699);
    
    _putDontNest(result, 394, 499);
    
    _putDontNest(result, 386, 542);
    
    _putDontNest(result, 386, 514);
    
    _putDontNest(result, 476, 685);
    
    _putDontNest(result, 386, 692);
    
    _putDontNest(result, 517, 582);
    
    _putDontNest(result, 499, 600);
    
    _putDontNest(result, 338, 600);
    
    _putDontNest(result, 623, 664);
    
    _putDontNest(result, 640, 678);
    
    _putDontNest(result, 473, 549);
    
    _putDontNest(result, 535, 582);
    
    _putDontNest(result, 495, 559);
    
    _putDontNest(result, 506, 727);
    
    _putDontNest(result, 616, 671);
    
    _putDontNest(result, 506, 616);
    
    _putDontNest(result, 562, 582);
    
    _putDontNest(result, 338, 445);
    
    _putDontNest(result, 524, 591);
    
    _putDontNest(result, 399, 678);
    
    _putDontNest(result, 582, 591);
    
    _putDontNest(result, 716, 706);
    
    _putDontNest(result, 386, 521);
    
    _putDontNest(result, 482, 644);
    
    _putDontNest(result, 345, 720);
    
    _putDontNest(result, 399, 492);
    
    _putDontNest(result, 418, 609);
    
    _putDontNest(result, 386, 406);
    
    _putDontNest(result, 510, 582);
    
    _putDontNest(result, 413, 528);
    
    _putDontNest(result, 578, 609);
    
    _putDontNest(result, 381, 549);
    
    _putDontNest(result, 531, 699);
    
    _putDontNest(result, 439, 568);
    
    _putDontNest(result, 345, 506);
    
    _putDontNest(result, 476, 644);
    
    _putDontNest(result, 381, 473);
    
    _putDontNest(result, 445, 454);
    
    _putDontNest(result, 394, 559);
    
    _putDontNest(result, 418, 499);
    
    _putDontNest(result, 413, 514);
    
    _putDontNest(result, 413, 542);
    
    _putDontNest(result, 486, 521);
    
    _putDontNest(result, 716, 657);
    
    _putDontNest(result, 521, 559);
    
    _putDontNest(result, 463, 521);
    
    _putDontNest(result, 688, 657);
    
    _putDontNest(result, 616, 727);
    
    _putDontNest(result, 506, 671);
    
    _putDontNest(result, 616, 616);
    
    _putDontNest(result, 406, 582);
    
    _putDontNest(result, 370, 388);
    
    _putDontNest(result, 394, 609);
    
    _putDontNest(result, 381, 430);
    
    _putDontNest(result, 370, 727);
    
    _putDontNest(result, 482, 713);
    
    _putDontNest(result, 370, 616);
    
    _putDontNest(result, 674, 692);
    
    _putDontNest(result, 386, 528);
    
    _putDontNest(result, 476, 575);
    
    _putDontNest(result, 619, 713);
    
    _putDontNest(result, 439, 473);
    
    _putDontNest(result, 454, 454);
    
    _putDontNest(result, 681, 720);
    
    _putDontNest(result, 575, 706);
    
    _putDontNest(result, 448, 582);
    
    _putDontNest(result, 619, 685);
    
    _putDontNest(result, 413, 521);
    
    _putDontNest(result, 435, 720);
    
    _putDontNest(result, 568, 600);
    
    _putDontNest(result, 545, 582);
    
    _putDontNest(result, 636, 727);
    
    _putDontNest(result, 463, 514);
    
    _putDontNest(result, 486, 692);
    
    _putDontNest(result, 482, 685);
    
    _putDontNest(result, 463, 542);
    
    _putDontNest(result, 486, 514);
    
    _putDontNest(result, 467, 582);
    
    _putDontNest(result, 463, 692);
    
    _putDontNest(result, 521, 609);
    
    _putDontNest(result, 486, 542);
    
    _putDontNest(result, 594, 720);
    
    _putDontNest(result, 413, 692);
    
    _putDontNest(result, 473, 473);
    
    _putDontNest(result, 549, 623);
    
    _putDontNest(result, 545, 609);
    
    _putDontNest(result, 502, 623);
    
    _putDontNest(result, 681, 664);
    
    _putDontNest(result, 723, 678);
    
    _putDontNest(result, 435, 636);
    
    _putDontNest(result, 386, 600);
    
    _putDontNest(result, 386, 445);
    
    _putDontNest(result, 448, 559);
    
    _putDontNest(result, 542, 514);
    
    _putDontNest(result, 457, 671);
    
    _putDontNest(result, 338, 406);
    
    _putDontNest(result, 660, 685);
    
    _putDontNest(result, 542, 542);
    
    _putDontNest(result, 545, 559);
    
    _putDontNest(result, 542, 692);
    
    _putDontNest(result, 492, 499);
    
    _putDontNest(result, 354, 463);
    
    _putDontNest(result, 467, 559);
    
    _putDontNest(result, 528, 671);
    
    _putDontNest(result, 514, 549);
    
    _putDontNest(result, 445, 671);
    
    _putDontNest(result, 585, 657);
    
    _putDontNest(result, 542, 521);
    
    _putDontNest(result, 454, 671);
    
    _putDontNest(result, 575, 591);
    
    _putDontNest(result, 386, 394);
    
    _putDontNest(result, 467, 609);
    
    _putDontNest(result, 667, 644);
    
    _putDontNest(result, 514, 568);
    
    _putDontNest(result, 521, 582);
    
    _putDontNest(result, 559, 727);
    
    _putDontNest(result, 559, 616);
    
    _putDontNest(result, 609, 616);
    
    _putDontNest(result, 514, 535);
    
    _putDontNest(result, 609, 727);
    
    _putDontNest(result, 354, 657);
    
    _putDontNest(result, 549, 699);
    
    _putDontNest(result, 345, 399);
    
    _putDontNest(result, 406, 559);
    
    _putDontNest(result, 709, 727);
    
    _putDontNest(result, 594, 664);
    
    _putDontNest(result, 338, 514);
    
    _putDontNest(result, 499, 514);
    
    _putDontNest(result, 499, 542);
    
    _putDontNest(result, 502, 678);
    
    _putDontNest(result, 338, 542);
    
    _putDontNest(result, 448, 609);
    
    _putDontNest(result, 499, 692);
    
    _putDontNest(result, 338, 692);
    
    _putDontNest(result, 435, 664);
    
    _putDontNest(result, 406, 609);
    
    _putDontNest(result, 549, 678);
    
    _putDontNest(result, 524, 657);
    
    _putDontNest(result, 723, 699);
    
    _putDontNest(result, 594, 636);
    
    _putDontNest(result, 394, 582);
    
    _putDontNest(result, 338, 521);
    
    _putDontNest(result, 571, 568);
    
    _putDontNest(result, 553, 671);
    
    _putDontNest(result, 499, 521);
    
    _putDontNest(result, 582, 657);
    
    _putDontNest(result, 502, 699);
    
    _putDontNest(result, 660, 713);
    
    _putDontNest(result, 660, 644);
    
    _putDontNest(result, 413, 445);
    
    _putDontNest(result, 582, 706);
    
    _putDontNest(result, 578, 582);
    
    _putDontNest(result, 562, 609);
    
    _putDontNest(result, 603, 692);
    
    _putDontNest(result, 381, 418);
    
    _putDontNest(result, 413, 600);
    
    _putDontNest(result, 709, 671);
    
    _putDontNest(result, 463, 600);
    
    _putDontNest(result, 667, 685);
    
    _putDontNest(result, 524, 706);
    
    _putDontNest(result, 510, 609);
    
    _putDontNest(result, 542, 528);
    
    _putDontNest(result, 486, 600);
    
    _putDontNest(result, 538, 678);
    
    _putDontNest(result, 418, 582);
    
    _putDontNest(result, 492, 559);
    
    _putDontNest(result, 553, 727);
    
    _putDontNest(result, 553, 616);
    
    _putDontNest(result, 463, 445);
    
    _putDontNest(result, 623, 720);
    
    _putDontNest(result, 568, 692);
    
    _putDontNest(result, 467, 499);
    
    _putDontNest(result, 528, 616);
    
    _putDontNest(result, 528, 727);
    
    _putDontNest(result, 535, 609);
    
    _putDontNest(result, 517, 559);
    
    _putDontNest(result, 345, 664);
    
    _putDontNest(result, 457, 727);
    
    _putDontNest(result, 457, 616);
    
    _putDontNest(result, 448, 499);
    
    _putDontNest(result, 423, 699);
    
    _putDontNest(result, 667, 713);
    
    _putDontNest(result, 430, 699);
    
    _putDontNest(result, 538, 623);
    
    _putDontNest(result, 454, 727);
    
    _putDontNest(result, 454, 616);
    
    _putDontNest(result, 562, 559);
    
    _putDontNest(result, 585, 706);
    
    _putDontNest(result, 535, 559);
    
    _putDontNest(result, 345, 636);
    
    _putDontNest(result, 495, 582);
    
    _putDontNest(result, 609, 671);
    
    _putDontNest(result, 695, 664);
    
    _putDontNest(result, 559, 671);
    
    _putDontNest(result, 406, 499);
    
    _putDontNest(result, 423, 678);
    
    _putDontNest(result, 430, 678);
    
    _putDontNest(result, 338, 528);
    
    _putDontNest(result, 517, 609);
    
    _putDontNest(result, 370, 454);
    
    _putDontNest(result, 499, 528);
    
    _putDontNest(result, 445, 616);
    
    _putDontNest(result, 445, 727);
    
    _putDontNest(result, 430, 623);
    
    _putDontNest(result, 538, 699);
    
    _putDontNest(result, 510, 559);
    
    _putDontNest(result, 423, 623);
    
    _putDontNest(result, 423, 492);
    
    _putDontNest(result, 492, 609);
    
    _putDontNest(result, 430, 492);
    
    _putDontNest(result, 354, 706);
    
    _putDontNest(result, 531, 514);
    
    _putDontNest(result, 473, 575);
    
    _putDontNest(result, 399, 692);
    
    _putDontNest(result, 435, 657);
    
    _putDontNest(result, 702, 685);
    
    _putDontNest(result, 399, 521);
    
    _putDontNest(result, 688, 720);
    
    _putDontNest(result, 386, 678);
    
    _putDontNest(result, 524, 664);
    
    _putDontNest(result, 381, 644);
    
    _putDontNest(result, 716, 720);
    
    _putDontNest(result, 549, 600);
    
    _putDontNest(result, 406, 671);
    
    _putDontNest(result, 647, 685);
    
    _putDontNest(result, 582, 664);
    
    _putDontNest(result, 510, 727);
    
    _putDontNest(result, 510, 616);
    
    _putDontNest(result, 354, 636);
    
    _putDontNest(result, 439, 575);
    
    _putDontNest(result, 627, 644);
    
    _putDontNest(result, 482, 549);
    
    _putDontNest(result, 553, 609);
    
    _putDontNest(result, 531, 692);
    
    _putDontNest(result, 435, 463);
    
    _putDontNest(result, 457, 609);
    
    _putDontNest(result, 445, 559);
    
    _putDontNest(result, 531, 542);
    
    _putDontNest(result, 562, 727);
    
    _putDontNest(result, 386, 623);
    
    _putDontNest(result, 562, 616);
    
    _putDontNest(result, 506, 582);
    
    _putDontNest(result, 647, 713);
    
    _putDontNest(result, 454, 559);
    
    _putDontNest(result, 345, 706);
    
    _putDontNest(result, 585, 636);
    
    _putDontNest(result, 528, 609);
    
    _putDontNest(result, 535, 616);
    
    _putDontNest(result, 535, 727);
    
    _putDontNest(result, 702, 713);
    
    _putDontNest(result, 394, 454);
    
    _putDontNest(result, 386, 492);
    
    _putDontNest(result, 473, 644);
    
    _putDontNest(result, 517, 616);
    
    _putDontNest(result, 545, 671);
    
    _putDontNest(result, 517, 727);
    
    _putDontNest(result, 585, 664);
    
    _putDontNest(result, 531, 521);
    
    _putDontNest(result, 681, 657);
    
    _putDontNest(result, 457, 559);
    
    _putDontNest(result, 695, 706);
    
    _putDontNest(result, 445, 609);
    
    _putDontNest(result, 467, 671);
    
    _putDontNest(result, 454, 609);
    
    _putDontNest(result, 528, 559);
    
    _putDontNest(result, 612, 685);
    
    _putDontNest(result, 612, 713);
    
    _putDontNest(result, 439, 644);
    
    _putDontNest(result, 594, 657);
    
    _putDontNest(result, 399, 514);
    
    _putDontNest(result, 582, 636);
    
    _putDontNest(result, 386, 699);
    
    _putDontNest(result, 354, 664);
    
    _putDontNest(result, 399, 542);
    
    _putDontNest(result, 448, 671);
    
    _putDontNest(result, 482, 568);
    
    _putDontNest(result, 502, 600);
    
    _putDontNest(result, 381, 575);
    
    _putDontNest(result, 640, 692);
    
    _putDontNest(result, 524, 636);
    
    _putDontNest(result, 492, 616);
    
    _putDontNest(result, 492, 727);
    
    _putDontNest(result, 482, 535);
    
    _putDontNest(result, 553, 559);
    
    _putDontNest(result, 647, 644);
    
    _putDontNest(result, 370, 582);
    
    _putDontNest(result, 413, 678);
    
    _putDontNest(result, 510, 671);
    
    _putDontNest(result, 531, 528);
    
    _putDontNest(result, 482, 473);
    
    _putDontNest(result, 562, 671);
    
    _putDontNest(result, 535, 671);
    
    _putDontNest(result, 354, 399);
    
    _putDontNest(result, 423, 600);
    
    _putDontNest(result, 473, 713);
    
    _putDontNest(result, 430, 600);
    
    _putDontNest(result, 702, 644);
    
    _putDontNest(result, 545, 727);
    
    _putDontNest(result, 517, 671);
    
    _putDontNest(result, 545, 616);
    
    _putDontNest(result, 430, 445);
    
    _putDontNest(result, 423, 445);
    
    _putDontNest(result, 381, 685);
    
    _putDontNest(result, 448, 616);
    
    _putDontNest(result, 457, 499);
    
    _putDontNest(result, 448, 727);
    
    _putDontNest(result, 486, 699);
    
    _putDontNest(result, 338, 423);
    
    _putDontNest(result, 381, 713);
    
    _putDontNest(result, 632, 636);
    
    _putDontNest(result, 473, 685);
    
    _putDontNest(result, 492, 671);
    
    _putDontNest(result, 345, 463);
    
    _putDontNest(result, 594, 706);
    
    _putDontNest(result, 463, 699);
    
    _putDontNest(result, 476, 568);
    
    _putDontNest(result, 627, 713);
    
    _putDontNest(result, 435, 706);
    
    _putDontNest(result, 476, 535);
    
    _putDontNest(result, 338, 435);
    
    _putDontNest(result, 463, 678);
    
    _putDontNest(result, 486, 678);
    
    _putDontNest(result, 538, 600);
    
    _putDontNest(result, 439, 713);
    
    _putDontNest(result, 612, 644);
    
    _putDontNest(result, 445, 499);
    
    _putDontNest(result, 454, 499);
    
    _putDontNest(result, 413, 699);
    
    _putDontNest(result, 476, 549);
    
    _putDontNest(result, 406, 616);
    
    _putDontNest(result, 406, 727);
    
    _putDontNest(result, 418, 454);
    
    _putDontNest(result, 674, 678);
    
    _putDontNest(result, 439, 685);
    
    _putDontNest(result, 463, 623);
    
    _putDontNest(result, 486, 623);
    
    _putDontNest(result, 345, 657);
    
    _putDontNest(result, 463, 492);
    
    _putDontNest(result, 674, 699);
    
    _putDontNest(result, 413, 492);
    
    _putDontNest(result, 467, 727);
    
    _putDontNest(result, 695, 657);
    
    _putDontNest(result, 467, 616);
    
    _putDontNest(result, 575, 720);
    
    _putDontNest(result, 681, 706);
    
    _putDontNest(result, 413, 623);
    
    _putDontNest(result, 627, 685);
    
    _putDontNest(result, 399, 528);
    
    _putDontNest(result, 559, 609);
    
    _putDontNest(result, 502, 521);
    
    _putDontNest(result, 549, 692);
    
    _putDontNest(result, 549, 542);
    
    _putDontNest(result, 549, 514);
    
    _putDontNest(result, 623, 657);
    
    _putDontNest(result, 502, 692);
    
    _putDontNest(result, 399, 600);
    
    _putDontNest(result, 575, 636);
    
    _putDontNest(result, 600, 644);
    
    _putDontNest(result, 435, 482);
    
    _putDontNest(result, 354, 506);
    
    _putDontNest(result, 571, 644);
    
    _putDontNest(result, 542, 623);
    
    _putDontNest(result, 495, 671);
    
    _putDontNest(result, 499, 699);
    
    _putDontNest(result, 521, 616);
    
    _putDontNest(result, 338, 699);
    
    _putDontNest(result, 521, 727);
    
    _putDontNest(result, 591, 713);
    
    _putDontNest(result, 514, 575);
    
    _putDontNest(result, 435, 591);
    
    _putDontNest(result, 499, 678);
    
    _putDontNest(result, 338, 678);
    
    _putDontNest(result, 514, 644);
    
    _putDontNest(result, 502, 542);
    
    _putDontNest(result, 370, 383);
    
    _putDontNest(result, 502, 514);
    
    _putDontNest(result, 423, 528);
    
    _putDontNest(result, 430, 528);
    
    _putDontNest(result, 723, 692);
    
    _putDontNest(result, 399, 445);
    
    _putDontNest(result, 549, 521);
    
    _putDontNest(result, 394, 616);
    
    _putDontNest(result, 418, 671);
    
    _putDontNest(result, 394, 727);
    
    _putDontNest(result, 338, 623);
    
    _putDontNest(result, 578, 671);
    
    _putDontNest(result, 499, 623);
    
    _putDontNest(result, 542, 699);
    
    _putDontNest(result, 499, 492);
    
    _putDontNest(result, 338, 492);
    
    _putDontNest(result, 571, 575);
    
    _putDontNest(result, 370, 559);
    
    _putDontNest(result, 591, 685);
    
    _putDontNest(result, 542, 678);
    
    _putDontNest(result, 4529, 301);
    
    _putDontNest(result, 531, 600);
    
    _putDontNest(result, 575, 664);
    
    _putDontNest(result, 370, 609);
    
    _putDontNest(result, 538, 528);
    
    _putDontNest(result, 506, 499);
    
    _putDontNest(result, 603, 699);
    
    _putDontNest(result, 345, 591);
    
    _putDontNest(result, 585, 720);
    
    _putDontNest(result, 514, 685);
    
    _putDontNest(result, 603, 678);
    
    _putDontNest(result, 568, 678);
    
    _putDontNest(result, 538, 692);
    
    _putDontNest(result, 457, 582);
    
    _putDontNest(result, 345, 482);
    
    _putDontNest(result, 506, 609);
    
    _putDontNest(result, 600, 713);
    
    _putDontNest(result, 553, 582);
    
    _putDontNest(result, 418, 616);
    
    _putDontNest(result, 394, 671);
    
    _putDontNest(result, 418, 727);
    
    _putDontNest(result, 430, 521);
    
    _putDontNest(result, 423, 521);
    
    _putDontNest(result, 549, 528);
    
    _putDontNest(result, 568, 623);
    
    _putDontNest(result, 386, 423);
    
    _putDontNest(result, 445, 582);
    
    _putDontNest(result, 603, 623);
    
    _putDontNest(result, 514, 713);
    
    _putDontNest(result, 495, 616);
    
    _putDontNest(result, 495, 727);
    
    _putDontNest(result, 454, 582);
    
    _putDontNest(result, 506, 559);
    
    _putDontNest(result, 538, 514);
    
    _putDontNest(result, 538, 542);
    
    _putDontNest(result, 521, 671);
    
    _putDontNest(result, 354, 720);
    
    _putDontNest(result, 582, 720);
    
    _putDontNest(result, 406, 454);
    
    _putDontNest(result, 568, 699);
    
    _putDontNest(result, 386, 435);
    
    _putDontNest(result, 591, 644);
    
    _putDontNest(result, 623, 706);
    
    _putDontNest(result, 528, 582);
    
    _putDontNest(result, 688, 664);
    
    _putDontNest(result, 538, 521);
    
    _putDontNest(result, 524, 720);
    
    _putDontNest(result, 600, 685);
    
    _putDontNest(result, 716, 664);
    
    _putDontNest(result, 370, 499);
    
    _putDontNest(result, 571, 685);
    
    _putDontNest(result, 430, 514);
    
    _putDontNest(result, 502, 528);
    
    _putDontNest(result, 571, 713);
    
    _putDontNest(result, 423, 514);
    
    _putDontNest(result, 578, 616);
    
    _putDontNest(result, 430, 542);
    
    _putDontNest(result, 423, 542);
    
    _putDontNest(result, 578, 727);
    
    _putDontNest(result, 423, 692);
    
    _putDontNest(result, 430, 692);
    
    _putDontNest(result, 476, 591);
    
    _putDontNest(result, 585, 685);
    
    _putDontNest(result, 354, 713);
    
    _putDontNest(result, 582, 713);
    
    _putDontNest(result, 394, 600);
    
    _putDontNest(result, 467, 528);
    
    _putDontNest(result, 582, 685);
    
    _putDontNest(result, 521, 600);
    
    _putDontNest(result, 510, 692);
    
    _putDontNest(result, 354, 685);
    
    _putDontNest(result, 4150, 304);
    
    _putDontNest(result, 506, 699);
    
    _putDontNest(result, 510, 514);
    
    _putDontNest(result, 492, 521);
    
    _putDontNest(result, 510, 542);
    
    _putDontNest(result, 568, 609);
    
    _putDontNest(result, 585, 713);
    
    _putDontNest(result, 603, 609);
    
    _putDontNest(result, 535, 514);
    
    _putDontNest(result, 406, 528);
    
    _putDontNest(result, 562, 692);
    
    _putDontNest(result, 535, 542);
    
    _putDontNest(result, 514, 720);
    
    _putDontNest(result, 535, 692);
    
    _putDontNest(result, 517, 521);
    
    _putDontNest(result, 612, 664);
    
    _putDontNest(result, 531, 727);
    
    _putDontNest(result, 531, 616);
    
    _putDontNest(result, 499, 499);
    
    _putDontNest(result, 338, 499);
    
    _putDontNest(result, 394, 445);
    
    _putDontNest(result, 660, 657);
    
    _putDontNest(result, 535, 521);
    
    _putDontNest(result, 612, 636);
    
    _putDontNest(result, 524, 713);
    
    _putDontNest(result, 386, 582);
    
    _putDontNest(result, 517, 692);
    
    _putDontNest(result, 506, 623);
    
    _putDontNest(result, 506, 492);
    
    _putDontNest(result, 517, 514);
    
    _putDontNest(result, 448, 528);
    
    _putDontNest(result, 517, 542);
    
    _putDontNest(result, 506, 678);
    
    _putDontNest(result, 510, 521);
    
    _putDontNest(result, 647, 664);
    
    _putDontNest(result, 492, 542);
    
    _putDontNest(result, 492, 514);
    
    _putDontNest(result, 571, 720);
    
    _putDontNest(result, 381, 399);
    
    _putDontNest(result, 600, 720);
    
    _putDontNest(result, 524, 685);
    
    _putDontNest(result, 640, 727);
    
    _putDontNest(result, 667, 706);
    
    _putDontNest(result, 545, 528);
    
    _putDontNest(result, 702, 664);
    
    _putDontNest(result, 492, 692);
    
    _putDontNest(result, 399, 727);
    
    _putDontNest(result, 399, 616);
    
    _putDontNest(result, 406, 521);
    
    _putDontNest(result, 345, 418);
    
    _putDontNest(result, 616, 678);
    
    _putDontNest(result, 406, 514);
    
    _putDontNest(result, 406, 692);
    
    _putDontNest(result, 370, 623);
    
    _putDontNest(result, 582, 644);
    
    _putDontNest(result, 381, 664);
    
    _putDontNest(result, 467, 521);
    
    _putDontNest(result, 524, 644);
    
    _putDontNest(result, 492, 528);
    
    _putDontNest(result, 467, 692);
    
    _putDontNest(result, 418, 445);
    
    _putDontNest(result, 463, 582);
    
    _putDontNest(result, 354, 644);
    
    _putDontNest(result, 467, 542);
    
    _putDontNest(result, 627, 636);
    
    _putDontNest(result, 418, 600);
    
    _putDontNest(result, 439, 664);
    
    _putDontNest(result, 467, 514);
    
    _putDontNest(result, 486, 582);
    
    _putDontNest(result, 399, 671);
    
    _putDontNest(result, 667, 657);
    
    _putDontNest(result, 636, 699);
    
    _putDontNest(result, 448, 692);
    
    _putDontNest(result, 448, 514);
    
    _putDontNest(result, 585, 644);
    
    _putDontNest(result, 473, 636);
    
    _putDontNest(result, 517, 528);
    
    _putDontNest(result, 640, 671);
    
    _putDontNest(result, 499, 609);
    
    _putDontNest(result, 448, 542);
    
    _putDontNest(result, 338, 609);
    
    _putDontNest(result, 406, 542);
    
    _putDontNest(result, 535, 528);
    
    _putDontNest(result, 473, 664);
    
    _putDontNest(result, 482, 591);
    
    _putDontNest(result, 448, 521);
    
    _putDontNest(result, 636, 678);
    
    _putDontNest(result, 338, 559);
    
    _putDontNest(result, 499, 559);
    
    _putDontNest(result, 616, 699);
    
    _putDontNest(result, 495, 600);
    
    _putDontNest(result, 370, 492);
    
    _putDontNest(result, 627, 664);
    
    _putDontNest(result, 430, 454);
    
    _putDontNest(result, 423, 454);
    
    _putDontNest(result, 354, 575);
    
    _putDontNest(result, 545, 521);
    
    _putDontNest(result, 482, 482);
    
    _putDontNest(result, 370, 678);
    
    _putDontNest(result, 531, 671);
    
    _putDontNest(result, 439, 636);
    
    _putDontNest(result, 413, 582);
    
    _putDontNest(result, 542, 609);
    
    _putDontNest(result, 510, 528);
    
    _putDontNest(result, 591, 720);
    
    _putDontNest(result, 545, 692);
    
    _putDontNest(result, 616, 623);
    
    _putDontNest(result, 545, 542);
    
    _putDontNest(result, 381, 636);
    
    _putDontNest(result, 542, 559);
    
    _putDontNest(result, 524, 575);
    
    _putDontNest(result, 578, 600);
    
    _putDontNest(result, 370, 699);
    
    _putDontNest(result, 545, 514);
    
    _putDontNest(result, 660, 706);
    
    _putDontNest(result, 413, 559);
    
    _putDontNest(result, 399, 454);
    
    _putDontNest(result, 709, 699);
    
    _putDontNest(result, 521, 514);
    
    _putDontNest(result, 559, 623);
    
    _putDontNest(result, 619, 706);
    
    _putDontNest(result, 495, 528);
    
    _putDontNest(result, 439, 720);
    
    _putDontNest(result, 535, 600);
    
    _putDontNest(result, 559, 699);
    
    _putDontNest(result, 549, 727);
    
    _putDontNest(result, 549, 616);
    
    _putDontNest(result, 521, 542);
    
    _putDontNest(result, 538, 671);
    
    _putDontNest(result, 486, 609);
    
    _putDontNest(result, 510, 600);
    
    _putDontNest(result, 521, 692);
    
    _putDontNest(result, 463, 609);
    
    _putDontNest(result, 435, 473);
    
    _putDontNest(result, 709, 678);
    
    _putDontNest(result, 542, 582);
    
    _putDontNest(result, 413, 609);
    
    _putDontNest(result, 609, 623);
    
    _putDontNest(result, 418, 528);
    
    _putDontNest(result, 575, 713);
    
    _putDontNest(result, 486, 559);
    
    _putDontNest(result, 476, 657);
    
    _putDontNest(result, 723, 727);
    
    _putDontNest(result, 473, 720);
    
    _putDontNest(result, 492, 600);
    
    _putDontNest(result, 521, 521);
    
    _putDontNest(result, 463, 559);
    
    _putDontNest(result, 502, 727);
    
    _putDontNest(result, 482, 706);
    
    _putDontNest(result, 502, 616);
    
    _putDontNest(result, 381, 720);
    
    _putDontNest(result, 716, 644);
    
    _putDontNest(result, 688, 644);
    
    _putDontNest(result, 517, 600);
    
    _putDontNest(result, 423, 671);
    
    _putDontNest(result, 430, 671);
    
    _putDontNest(result, 345, 549);
    
    _putDontNest(result, 627, 720);
    
    _putDontNest(result, 559, 678);
    
    _putDontNest(result, 575, 685);
    
    _putDontNest(result, 609, 678);
    
    _putDontNest(result, 394, 692);
    
    _putDontNest(result, 386, 499);
    
    _putDontNest(result, 394, 542);
    
    _putDontNest(result, 394, 514);
    
    _putDontNest(result, 591, 664);
    
    _putDontNest(result, 591, 636);
    
    _putDontNest(result, 345, 413);
    
    _putDontNest(result, 345, 370);
    
    _putDontNest(result, 394, 521);
    
    _putDontNest(result, 338, 582);
    
    _putDontNest(result, 345, 535);
    
    _putDontNest(result, 499, 582);
    
    _putDontNest(result, 609, 699);
    
    _putDontNest(result, 345, 568);
    
    _putDontNest(result, 562, 600);
    
    _putDontNest(result, 345, 430);
    
    _putDontNest(result, 716, 713);
    
    _putDontNest(result, 495, 542);
    
    _putDontNest(result, 482, 657);
    
    _putDontNest(result, 394, 528);
    
    _putDontNest(result, 418, 514);
    
    _putDontNest(result, 457, 699);
    
    _putDontNest(result, 578, 692);
    
    _putDontNest(result, 445, 678);
    
    _putDontNest(result, 345, 473);
    
    _putDontNest(result, 423, 616);
    
    _putDontNest(result, 423, 727);
    
    _putDontNest(result, 430, 616);
    
    _putDontNest(result, 430, 727);
    
    _putDontNest(result, 514, 664);
    
    _putDontNest(result, 545, 600);
    
    _putDontNest(result, 463, 499);
    
    _putDontNest(result, 418, 521);
    
    _putDontNest(result, 514, 636);
    
    _putDontNest(result, 454, 699);
    
    _putDontNest(result, 413, 499);
    
    _putDontNest(result, 528, 678);
    
    _putDontNest(result, 688, 713);
    
    _putDontNest(result, 521, 528);
    
    _putDontNest(result, 553, 623);
    
    _putDontNest(result, 457, 678);
    
    _putDontNest(result, 445, 699);
    
    _putDontNest(result, 575, 644);
    
    _putDontNest(result, 538, 727);
    
    _putDontNest(result, 538, 616);
    
    _putDontNest(result, 457, 492);
    
    _putDontNest(result, 495, 692);
    
    _putDontNest(result, 553, 678);
    
    _putDontNest(result, 457, 623);
    
    _putDontNest(result, 495, 514);
    
    _putDontNest(result, 406, 600);
    
    _putDontNest(result, 647, 720);
    
    _putDontNest(result, 549, 671);
    
    _putDontNest(result, 528, 623);
    
    _putDontNest(result, 571, 664);
    
    _putDontNest(result, 716, 685);
    
    _putDontNest(result, 386, 609);
    
    _putDontNest(result, 435, 549);
    
    _putDontNest(result, 600, 664);
    
    _putDontNest(result, 439, 506);
    
    _putDontNest(result, 702, 720);
    
    _putDontNest(result, 406, 445);
    
    _putDontNest(result, 688, 685);
    
    _putDontNest(result, 600, 636);
    
    _putDontNest(result, 723, 671);
    
    _putDontNest(result, 445, 623);
    
    _putDontNest(result, 495, 521);
    
    _putDontNest(result, 619, 657);
    
    _putDontNest(result, 448, 600);
    
    _putDontNest(result, 502, 671);
    
    _putDontNest(result, 571, 636);
    
    _putDontNest(result, 553, 699);
    
    _putDontNest(result, 445, 492);
    
    _putDontNest(result, 381, 506);
    
    _putDontNest(result, 435, 568);
    
    _putDontNest(result, 454, 492);
    
    _putDontNest(result, 435, 535);
    
    _putDontNest(result, 454, 623);
    
    _putDontNest(result, 476, 706);
    
    _putDontNest(result, 386, 559);
    
    _putDontNest(result, 612, 720);
    
    _putDontNest(result, 473, 506);
    
    _putDontNest(result, 418, 692);
    
    _putDontNest(result, 467, 600);
    
    _putDontNest(result, 528, 699);
    
    _putDontNest(result, 418, 542);
    
    _putDontNest(result, 454, 678);
    
    _putDontNest(result, 521, 644);
    
    _putDontNest(result, 418, 685);
    
    _putDontNest(result, 578, 713);
    
    _putDontNest(result, 418, 713);
    
    _putDontNest(result, 394, 575);
    
    _putDontNest(result, 394, 644);
    
    _putDontNest(result, 688, 692);
    
    _putDontNest(result, 476, 609);
    
    _putDontNest(result, 695, 678);
    
    _putDontNest(result, 345, 678);
    
    _putDontNest(result, 445, 473);
    
    _putDontNest(result, 430, 636);
    
    _putDontNest(result, 454, 473);
    
    _putDontNest(result, 423, 636);
    
    _putDontNest(result, 695, 699);
    
    _putDontNest(result, 482, 499);
    
    _putDontNest(result, 674, 657);
    
    _putDontNest(result, 578, 685);
    
    _putDontNest(result, 413, 463);
    
    _putDontNest(result, 571, 616);
    
    _putDontNest(result, 571, 727);
    
    _putDontNest(result, 600, 727);
    
    _putDontNest(result, 640, 720);
    
    _putDontNest(result, 600, 616);
    
    _putDontNest(result, 399, 720);
    
    _putDontNest(result, 538, 664);
    
    _putDontNest(result, 345, 492);
    
    _putDontNest(result, 463, 657);
    
    _putDontNest(result, 386, 706);
    
    _putDontNest(result, 476, 559);
    
    _putDontNest(result, 486, 657);
    
    _putDontNest(result, 345, 623);
    
    _putDontNest(result, 413, 657);
    
    _putDontNest(result, 538, 636);
    
    _putDontNest(result, 495, 685);
    
    _putDontNest(result, 568, 591);
    
    _putDontNest(result, 716, 692);
    
    _putDontNest(result, 463, 463);
    
    _putDontNest(result, 457, 473);
    
    _putDontNest(result, 345, 699);
    
    _putDontNest(result, 4529, 324);
    
    _putDontNest(result, 514, 727);
    
    _putDontNest(result, 430, 664);
    
    _putDontNest(result, 514, 616);
    
    _putDontNest(result, 423, 664);
    
    _putDontNest(result, 521, 575);
    
    _putDontNest(result, 495, 713);
    
    _putDontNest(result, 531, 720);
    
    _putDontNest(result, 591, 671);
    
    _putDontNest(result, 381, 454);
    
    _putDontNest(result, 482, 609);
    
    _putDontNest(result, 445, 535);
    
    _putDontNest(result, 681, 678);
    
    _putDontNest(result, 445, 549);
    
    _putDontNest(result, 457, 568);
    
    _putDontNest(result, 528, 568);
    
    _putDontNest(result, 394, 713);
    
    _putDontNest(result, 482, 559);
    
    _putDontNest(result, 435, 678);
    
    _putDontNest(result, 594, 678);
    
    _putDontNest(result, 521, 685);
    
    _putDontNest(result, 354, 600);
    
    _putDontNest(result, 354, 445);
    
    _putDontNest(result, 418, 644);
    
    _putDontNest(result, 457, 549);
    
    _putDontNest(result, 386, 463);
    
    _putDontNest(result, 594, 623);
    
    _putDontNest(result, 445, 568);
    
    _putDontNest(result, 542, 591);
    
    _putDontNest(result, 495, 575);
    
    _putDontNest(result, 591, 616);
    
    _putDontNest(result, 591, 727);
    
    _putDontNest(result, 521, 713);
    
    _putDontNest(result, 454, 535);
    
    _putDontNest(result, 435, 623);
    
    _putDontNest(result, 514, 671);
    
    _putDontNest(result, 528, 549);
    
    _putDontNest(result, 454, 568);
    
    _putDontNest(result, 585, 600);
    
    _putDontNest(result, 435, 492);
    
    _putDontNest(result, 338, 482);
    
    _putDontNest(result, 399, 506);
    
    _putDontNest(result, 354, 394);
    
    _putDontNest(result, 457, 535);
    
    _putDontNest(result, 454, 549);
    
    _putDontNest(result, 674, 706);
    
    _putDontNest(result, 495, 644);
    
    _putDontNest(result, 681, 699);
    
    _putDontNest(result, 476, 499);
    
    _putDontNest(result, 394, 685);
    
    _putDontNest(result, 575, 692);
    
    _putDontNest(result, 528, 535);
    
    _putDontNest(result, 582, 600);
    
    _putDontNest(result, 435, 699);
    
    _putDontNest(result, 418, 575);
    
    _putDontNest(result, 549, 664);
    
    _putDontNest(result, 486, 706);
    
    _putDontNest(result, 502, 636);
    
    _putDontNest(result, 386, 657);
    
    _putDontNest(result, 338, 591);
    
    _putDontNest(result, 571, 671);
    
    _putDontNest(result, 499, 591);
    
    _putDontNest(result, 553, 568);
    
    _putDontNest(result, 600, 671);
    
    _putDontNest(result, 594, 699);
    
    _putDontNest(result, 524, 600);
    
    _putDontNest(result, 578, 575);
    
    _putDontNest(result, 463, 706);
    
    _putDontNest(result, 413, 706);
    
    _putDontNest(result, 723, 664);
    
    _putDontNest(result, 502, 664);
    
    _putDontNest(result, 578, 644);
    
    _putDontNest(result, 549, 636);
    
    _putDontNest(result, 627, 727);
    
    _putDontNest(result, 413, 482);
    
    _putDontNest(result, 463, 482);
    
    _putDontNest(result, 354, 528);
    
    _putDontNest(result, 510, 575);
    
    _putDontNest(result, 492, 644);
    
    _putDontNest(result, 406, 713);
    
    _putDontNest(result, 370, 473);
    
    _putDontNest(result, 535, 575);
    
    _putDontNest(result, 562, 575);
    
    _putDontNest(result, 506, 568);
    
    _putDontNest(result, 463, 591);
    
    _putDontNest(result, 486, 591);
    
    _putDontNest(result, 467, 713);
    
    _putDontNest(result, 413, 591);
    
    _putDontNest(result, 448, 713);
    
    _putDontNest(result, 492, 575);
    
    _putDontNest(result, 381, 616);
    
    _putDontNest(result, 381, 727);
    
    _putDontNest(result, 603, 657);
    
    _putDontNest(result, 542, 706);
    
    _putDontNest(result, 524, 528);
    
    _putDontNest(result, 545, 685);
    
    _putDontNest(result, 482, 582);
    
    _putDontNest(result, 612, 671);
    
    _putDontNest(result, 510, 644);
    
    _putDontNest(result, 467, 685);
    
    _putDontNest(result, 439, 616);
    
    _putDontNest(result, 439, 727);
    
    _putDontNest(result, 549, 720);
    
    _putDontNest(result, 647, 671);
    
    _putDontNest(result, 406, 685);
    
    _putDontNest(result, 517, 644);
    
    _putDontNest(result, 702, 671);
    
    _putDontNest(result, 506, 535);
    
    _putDontNest(result, 499, 706);
    
    _putDontNest(result, 338, 706);
    
    _putDontNest(result, 430, 506);
    
    _putDontNest(result, 423, 506);
    
    _putDontNest(result, 473, 727);
    
    _putDontNest(result, 473, 616);
    
    _putDontNest(result, 723, 720);
    
    _putDontNest(result, 545, 713);
    
    _putDontNest(result, 535, 644);
    
    _putDontNest(result, 448, 685);
    
    _putDontNest(result, 502, 720);
    
    _putDontNest(result, 562, 644);
    
    _putDontNest(result, 506, 549);
    
    _putDontNest(result, 568, 657);
    
    _putDontNest(result, 517, 575);
    
    _putDontNest(result, 386, 591);
    
    _putDontNest(result, 524, 542);
    
    _putDontNest(result, 568, 706);
    
    _putDontNest(result, 467, 575);
    
    _putDontNest(result, 399, 636);
    
    _putDontNest(result, 627, 671);
    
    _putDontNest(result, 345, 423);
    
    _putDontNest(result, 517, 685);
    
    _putDontNest(result, 535, 685);
    
    _putDontNest(result, 510, 713);
    
    _putDontNest(result, 370, 549);
    
    _putDontNest(result, 499, 657);
    
    _putDontNest(result, 562, 713);
    
    _putDontNest(result, 338, 657);
    
    _putDontNest(result, 647, 727);
    
    _putDontNest(result, 545, 644);
    
    _putDontNest(result, 702, 727);
    
    _putDontNest(result, 535, 713);
    
    _putDontNest(result, 623, 678);
    
    _putDontNest(result, 640, 664);
    
    _putDontNest(result, 524, 692);
    
    _putDontNest(result, 517, 713);
    
    _putDontNest(result, 473, 671);
    
    _putDontNest(result, 492, 685);
    
    _putDontNest(result, 354, 521);
    
    _putDontNest(result, 524, 514);
    
    _putDontNest(result, 545, 575);
    
    _putDontNest(result, 582, 692);
    
    _putDontNest(result, 623, 699);
    
    _putDontNest(result, 542, 657);
    
    _putDontNest(result, 531, 664);
    
    _putDontNest(result, 603, 706);
    
    _putDontNest(result, 612, 727);
    
    _putDontNest(result, 338, 463);
    
    _putDontNest(result, 575, 600);
    
    _putDontNest(result, 354, 406);
    
    _putDontNest(result, 381, 671);
    
    _putDontNest(result, 476, 582);
    
    _putDontNest(result, 406, 644);
    
    _putDontNest(result, 370, 568);
    
    _putDontNest(result, 430, 720);
    
    _putDontNest(result, 370, 535);
    
    _putDontNest(result, 492, 713);
    
    _putDontNest(result, 448, 575);
    
    _putDontNest(result, 423, 720);
    
    _putDontNest(result, 406, 575);
    
    _putDontNest(result, 386, 482);
    
    _putDontNest(result, 585, 692);
    
    _putDontNest(result, 623, 623);
    
    _putDontNest(result, 345, 435);
    
    _putDontNest(result, 448, 644);
    
    _putDontNest(result, 562, 685);
    
    _putDontNest(result, 531, 636);
    
    _putDontNest(result, 439, 671);
    
    _putDontNest(result, 524, 521);
    
    _putDontNest(result, 354, 514);
    
    _putDontNest(result, 354, 542);
    
    _putDontNest(result, 538, 720);
    
    _putDontNest(result, 399, 664);
    
    _putDontNest(result, 354, 692);
    
    _putDontNest(result, 510, 685);
    
    _putDontNest(result, 467, 644);
    
    _putDontNest(result, 517, 720);
    
    _putDontNest(result, 381, 600);
    
    _putDontNest(result, 495, 664);
    
    _putDontNest(result, 571, 692);
    
    _putDontNest(result, 688, 727);
    
    _putDontNest(result, 338, 413);
    
    _putDontNest(result, 716, 727);
    
    _putDontNest(result, 510, 720);
    
    _putDontNest(result, 457, 482);
    
    _putDontNest(result, 418, 664);
    
    _putDontNest(result, 542, 549);
    
    _putDontNest(result, 514, 514);
    
    _putDontNest(result, 430, 685);
    
    _putDontNest(result, 445, 591);
    
    _putDontNest(result, 381, 445);
    
    _putDontNest(result, 502, 575);
    
    _putDontNest(result, 542, 568);
    
    _putDontNest(result, 423, 685);
    
    _putDontNest(result, 542, 535);
    
    _putDontNest(result, 578, 636);
    
    _putDontNest(result, 549, 644);
    
    _putDontNest(result, 370, 657);
    
    _putDontNest(result, 448, 506);
    
    _putDontNest(result, 575, 671);
    
    _putDontNest(result, 454, 591);
    
    _putDontNest(result, 514, 521);
    
    _putDontNest(result, 418, 636);
    
    _putDontNest(result, 636, 657);
    
    _putDontNest(result, 454, 482);
    
    _putDontNest(result, 467, 506);
    
    _putDontNest(result, 445, 482);
    
    _putDontNest(result, 423, 713);
    
    _putDontNest(result, 492, 720);
    
    _putDontNest(result, 430, 713);
    
    _putDontNest(result, 667, 699);
    
    _putDontNest(result, 473, 600);
    
    _putDontNest(result, 499, 549);
    
    _putDontNest(result, 600, 692);
    
    _putDontNest(result, 338, 549);
    
    _putDontNest(result, 370, 463);
    
    _putDontNest(result, 616, 657);
    
    _putDontNest(result, 499, 568);
    
    _putDontNest(result, 667, 678);
    
    _putDontNest(result, 338, 568);
    
    _putDontNest(result, 553, 591);
    
    _putDontNest(result, 338, 370);
    
    _putDontNest(result, 495, 636);
    
    _putDontNest(result, 345, 582);
    
    _putDontNest(result, 381, 394);
    
    _putDontNest(result, 499, 535);
    
    _putDontNest(result, 338, 535);
    
    _putDontNest(result, 538, 685);
    
    _putDontNest(result, 506, 706);
    
    _putDontNest(result, 439, 600);
    
    _putDontNest(result, 538, 713);
    
    _putDontNest(result, 406, 506);
    
    _putDontNest(result, 457, 591);
    
    _putDontNest(result, 528, 591);
    
    _putDontNest(result, 578, 664);
    
    _putDontNest(result, 514, 542);
    
    _putDontNest(result, 502, 644);
    
    _putDontNest(result, 562, 720);
    
    _putDontNest(result, 549, 575);
    
    _putDontNest(result, 723, 644);
    
    _putDontNest(result, 514, 692);
    
    _putDontNest(result, 535, 720);
    
    _putDontNest(result, 716, 671);
    
    _putDontNest(result, 394, 664);
    
    _putDontNest(result, 660, 678);
    
    _putDontNest(result, 591, 692);
    
    _putDontNest(result, 538, 575);
    
    _putDontNest(result, 467, 720);
    
    _putDontNest(result, 559, 591);
    
    _putDontNest(result, 394, 636);
    
    _putDontNest(result, 723, 713);
    
    _putDontNest(result, 723, 685);
    
    _putDontNest(result, 338, 473);
    
    _putDontNest(result, 521, 636);
    
    _putDontNest(result, 616, 706);
    
    _putDontNest(result, 688, 671);
    
    _putDontNest(result, 514, 528);
    
    _putDontNest(result, 430, 644);
    
    _putDontNest(result, 506, 657);
    
    _putDontNest(result, 423, 644);
    
    _putDontNest(result, 406, 720);
    
    _putDontNest(result, 549, 685);
    
    _putDontNest(result, 386, 418);
    
    _putDontNest(result, 549, 713);
    
    _putDontNest(result, 575, 616);
    
    _putDontNest(result, 575, 727);
    
    _putDontNest(result, 538, 644);
    
    _putDontNest(result, 492, 506);
    
    _putDontNest(result, 435, 582);
    
    _putDontNest(result, 545, 720);
    
    _putDontNest(result, 370, 706);
    
    _putDontNest(result, 502, 713);
    
    _putDontNest(result, 660, 699);
    
    _putDontNest(result, 354, 454);
    
    _putDontNest(result, 636, 706);
    
    _putDontNest(result, 430, 575);
    
    _putDontNest(result, 502, 685);
    
    _putDontNest(result, 448, 720);
    
    _putDontNest(result, 423, 575);
    
    _putDontNest(result, 338, 430);
    
    _putDontNest(result, 521, 664);
    
    _putDontNest(result, 394, 720);
    
    _putDontNest(result, 627, 692);
    
    _putDontNest(result, 399, 575);
    
    _putDontNest(result, 528, 657);
    
    _putDontNest(result, 381, 692);
    
    _putDontNest(result, 381, 514);
    
    _putDontNest(result, 559, 706);
    
    _putDontNest(result, 609, 706);
    
    _putDontNest(result, 473, 521);
    
    _putDontNest(result, 709, 706);
    
    _putDontNest(result, 524, 671);
    
    _putDontNest(result, 386, 568);
    
    _putDontNest(result, 619, 699);
    
    _putDontNest(result, 457, 657);
    
    _putDontNest(result, 467, 636);
    
    _putDontNest(result, 439, 521);
    
    _putDontNest(result, 545, 636);
    
    _putDontNest(result, 381, 542);
    
    _putDontNest(result, 585, 671);
    
    _putDontNest(result, 545, 664);
    
    _putDontNest(result, 445, 657);
    
    _putDontNest(result, 640, 644);
    
    _putDontNest(result, 514, 600);
    
    _putDontNest(result, 467, 664);
    
    _putDontNest(result, 370, 591);
    
    _putDontNest(result, 439, 514);
    
    _putDontNest(result, 381, 521);
    
    _putDontNest(result, 482, 623);
    
    _putDontNest(result, 439, 542);
    
    _putDontNest(result, 439, 692);
    
    _putDontNest(result, 454, 657);
    
    _putDontNest(result, 482, 492);
    
    _putDontNest(result, 399, 644);
    
    _putDontNest(result, 370, 482);
    
    _putDontNest(result, 482, 678);
    
    _putDontNest(result, 521, 720);
    
    _putDontNest(result, 354, 671);
    
    _putDontNest(result, 381, 406);
    
    _putDontNest(result, 531, 575);
    
    _putDontNest(result, 594, 609);
    
    _putDontNest(result, 619, 678);
    
    _putDontNest(result, 345, 499);
    
    _putDontNest(result, 406, 636);
    
    _putDontNest(result, 448, 664);
    
    _putDontNest(result, 435, 609);
    
    _putDontNest(result, 463, 473);
    
    _putDontNest(result, 386, 549);
    
    _putDontNest(result, 418, 506);
    
    _putDontNest(result, 413, 473);
    
    _putDontNest(result, 473, 692);
    
    _putDontNest(result, 454, 463);
    
    _putDontNest(result, 571, 600);
    
    _putDontNest(result, 473, 514);
    
    _putDontNest(result, 448, 636);
    
    _putDontNest(result, 406, 664);
    
    _putDontNest(result, 386, 413);
    
    _putDontNest(result, 473, 542);
    
    _putDontNest(result, 482, 699);
    
    _putDontNest(result, 553, 657);
    
    _putDontNest(result, 445, 463);
    
    _putDontNest(result, 582, 671);
    
    _putDontNest(result, 386, 535);
    
    _putDontNest(result, 531, 644);
    
    _putDontNest(result, 435, 559);
    
    _putDontNest(result, 399, 685);
    
    _putDontNest(result, 476, 699);
    
    _putDontNest(result, 553, 706);
    
    _putDontNest(result, 457, 706);
    
    _putDontNest(result, 435, 499);
    
    _putDontNest(result, 528, 706);
    
    _putDontNest(result, 559, 657);
    
    _putDontNest(result, 531, 685);
    
    _putDontNest(result, 445, 706);
    
    _putDontNest(result, 562, 636);
    
    _putDontNest(result, 476, 492);
    
    _putDontNest(result, 413, 535);
    
    _putDontNest(result, 709, 657);
    
    _putDontNest(result, 495, 720);
    
    _putDontNest(result, 531, 713);
    
    _putDontNest(result, 486, 549);
    
    _putDontNest(result, 439, 528);
    
    _putDontNest(result, 354, 727);
    
    _putDontNest(result, 354, 616);
    
    _putDontNest(result, 386, 430);
    
    _putDontNest(result, 510, 636);
    
    _putDontNest(result, 463, 549);
    
    _putDontNest(result, 386, 473);
    
    _putDontNest(result, 582, 727);
    
    _putDontNest(result, 510, 664);
    
    _putDontNest(result, 413, 549);
    
    _putDontNest(result, 582, 616);
    
    _putDontNest(result, 524, 616);
    
    _putDontNest(result, 492, 636);
    
    _putDontNest(result, 463, 568);
    
    _putDontNest(result, 486, 535);
    
    _putDontNest(result, 640, 685);
    
    _putDontNest(result, 524, 727);
    
    _putDontNest(result, 394, 506);
    
    _putDontNest(result, 506, 591);
    
    _putDontNest(result, 486, 568);
    
    _putDontNest(result, 463, 535);
    
    _putDontNest(result, 381, 528);
    
    _putDontNest(result, 562, 664);
    
    _putDontNest(result, 338, 418);
    
    _putDontNest(result, 578, 720);
    
    _putDontNest(result, 640, 713);
    
    _putDontNest(result, 4529, 657);
    
    _putDontNest(result, 517, 636);
    
    _putDontNest(result, 535, 664);
    
    _putDontNest(result, 473, 528);
    
    _putDontNest(result, 345, 609);
    
    _putDontNest(result, 399, 713);
    
    _putDontNest(result, 418, 720);
    
    _putDontNest(result, 612, 692);
    
    _putDontNest(result, 609, 657);
    
    _putDontNest(result, 591, 600);
    
    _putDontNest(result, 517, 664);
    
    _putDontNest(result, 454, 706);
    
    _putDontNest(result, 535, 636);
    
    _putDontNest(result, 345, 559);
    
    _putDontNest(result, 585, 616);
    
    _putDontNest(result, 585, 727);
    
    _putDontNest(result, 476, 623);
    
    _putDontNest(result, 476, 678);
    
    _putDontNest(result, 647, 692);
    
    _putDontNest(result, 492, 664);
    
    _putDontNest(result, 413, 568);
    
    _putDontNest(result, 702, 692);
    
    _putDontNest(result, 510, 706);
    
    _putDontNest(result, 506, 720);
    
    _putDontNest(result, 582, 609);
    
    _putDontNest(result, 549, 568);
    
    _putDontNest(result, 457, 664);
    
    _putDontNest(result, 445, 636);
    
    _putDontNest(result, 406, 463);
    
    _putDontNest(result, 549, 549);
    
    _putDontNest(result, 524, 609);
    
    _putDontNest(result, 600, 678);
    
    _putDontNest(result, 406, 657);
    
    _putDontNest(result, 354, 559);
    
    _putDontNest(result, 571, 678);
    
    _putDontNest(result, 502, 549);
    
    _putDontNest(result, 549, 535);
    
    _putDontNest(result, 542, 644);
    
    _putDontNest(result, 553, 664);
    
    _putDontNest(result, 418, 482);
    
    _putDontNest(result, 562, 706);
    
    _putDontNest(result, 345, 616);
    
    _putDontNest(result, 345, 727);
    
    _putDontNest(result, 454, 636);
    
    _putDontNest(result, 423, 473);
    
    _putDontNest(result, 430, 473);
    
    _putDontNest(result, 535, 706);
    
    _putDontNest(result, 418, 591);
    
    _putDontNest(result, 514, 699);
    
    _putDontNest(result, 499, 575);
    
    _putDontNest(result, 338, 575);
    
    _putDontNest(result, 600, 623);
    
    _putDontNest(result, 578, 591);
    
    _putDontNest(result, 528, 664);
    
    _putDontNest(result, 571, 623);
    
    _putDontNest(result, 528, 636);
    
    _putDontNest(result, 568, 713);
    
    _putDontNest(result, 585, 609);
    
    _putDontNest(result, 338, 644);
    
    _putDontNest(result, 514, 678);
    
    _putDontNest(result, 499, 644);
    
    _putDontNest(result, 545, 657);
    
    _putDontNest(result, 445, 664);
    
    _putDontNest(result, 603, 685);
    
    _putDontNest(result, 681, 671);
    
    _putDontNest(result, 454, 664);
    
    _putDontNest(result, 517, 706);
    
    _putDontNest(result, 695, 727);
    
    _putDontNest(result, 467, 657);
    
    _putDontNest(result, 457, 636);
    
    _putDontNest(result, 524, 559);
    
    _putDontNest(result, 553, 636);
    
    _putDontNest(result, 571, 699);
    
    _putDontNest(result, 542, 575);
    
    _putDontNest(result, 482, 600);
    
    _putDontNest(result, 502, 568);
    
    _putDontNest(result, 495, 591);
    
    _putDontNest(result, 667, 692);
    
    _putDontNest(result, 502, 535);
    
    _putDontNest(result, 594, 671);
    
    _putDontNest(result, 600, 699);
    
    _putDontNest(result, 492, 706);
    
    _putDontNest(result, 354, 609);
    
    _putDontNest(result, 603, 713);
    
    _putDontNest(result, 514, 623);
    
    _putDontNest(result, 435, 671);
    
    _putDontNest(result, 568, 685);
    
    _putDontNest(result, 370, 506);
    
    _putDontNest(result, 448, 657);
    
    _putDontNest(result, 467, 706);
    
    _putDontNest(result, 681, 727);
    
    _putDontNest(result, 517, 657);
    
    _putDontNest(result, 492, 657);
    
    _putDontNest(result, 476, 600);
    
    _putDontNest(result, 406, 706);
    
    _putDontNest(result, 535, 657);
    
    _putDontNest(result, 559, 636);
    
    _putDontNest(result, 545, 706);
    
    _putDontNest(result, 435, 727);
    
    _putDontNest(result, 435, 616);
    
    _putDontNest(result, 591, 623);
    
    _putDontNest(result, 448, 706);
    
    _putDontNest(result, 538, 549);
    
    _putDontNest(result, 521, 591);
    
    _putDontNest(result, 636, 720);
    
    _putDontNest(result, 542, 713);
    
    _putDontNest(result, 594, 727);
    
    _putDontNest(result, 594, 616);
    
    _putDontNest(result, 709, 664);
    
    _putDontNest(result, 510, 657);
    
    _putDontNest(result, 394, 482);
    
    _putDontNest(result, 338, 685);
    
    _putDontNest(result, 538, 535);
    
    _putDontNest(result, 499, 685);
    
    _putDontNest(result, 616, 720);
    
    _putDontNest(result, 538, 568);
    
    _putDontNest(result, 603, 644);
    
    _putDontNest(result, 499, 713);
    
    _putDontNest(result, 562, 657);
    
    _putDontNest(result, 381, 423);
    
    _putDontNest(result, 591, 699);
    
    _putDontNest(result, 338, 713);
    
    _putDontNest(result, 423, 549);
    
    _putDontNest(result, 354, 499);
    
    _putDontNest(result, 430, 549);
    
    _putDontNest(result, 568, 644);
    
    _putDontNest(result, 345, 671);
    
    _putDontNest(result, 609, 636);
    
    _putDontNest(result, 394, 591);
    
    _putDontNest(result, 506, 506);
    
    _putDontNest(result, 591, 678);
    
    _putDontNest(result, 430, 568);
    
    _putDontNest(result, 423, 568);
    
    _putDontNest(result, 542, 685);
    
    _putDontNest(result, 609, 664);
    
    _putDontNest(result, 423, 535);
    
    _putDontNest(result, 430, 535);
    
    _putDontNest(result, 370, 720);
    
    _putDontNest(result, 381, 435);
    
    _putDontNest(result, 559, 664);
    
    _putDontNest(result, 695, 671);
    
    _putDontNest(result, 660, 692);
    
    _putDontNest(result, 445, 506);
    
    _putDontNest(result, 616, 636);
    
    _putDontNest(result, 482, 514);
    
    _putDontNest(result, 482, 692);
    
    _putDontNest(result, 463, 713);
    
    _putDontNest(result, 418, 657);
    
    _putDontNest(result, 345, 454);
    
    _putDontNest(result, 381, 678);
    
    _putDontNest(result, 413, 713);
    
    _putDontNest(result, 636, 664);
    
    _putDontNest(result, 399, 549);
    
    _putDontNest(result, 709, 720);
    
    _putDontNest(result, 495, 657);
    
    _putDontNest(result, 413, 685);
    
    _putDontNest(result, 381, 492);
    
    _putDontNest(result, 454, 506);
    
    _putDontNest(result, 473, 678);
    
    _putDontNest(result, 521, 706);
    
    _putDontNest(result, 482, 521);
    
    _putDontNest(result, 448, 591);
    
    _putDontNest(result, 418, 463);
    
    _putDontNest(result, 381, 623);
    
    _putDontNest(result, 674, 713);
    
    _putDontNest(result, 623, 671);
    
    _putDontNest(result, 399, 535);
    
    _putDontNest(result, 406, 591);
    
    _putDontNest(result, 457, 506);
    
    _putDontNest(result, 399, 568);
    
    _putDontNest(result, 616, 664);
    
    _putDontNest(result, 619, 692);
    
    _putDontNest(result, 463, 685);
    
    _putDontNest(result, 482, 542);
    
    _putDontNest(result, 439, 623);
    
    _putDontNest(result, 473, 699);
    
    _putDontNest(result, 486, 685);
    
    _putDontNest(result, 439, 492);
    
    _putDontNest(result, 486, 713);
    
    _putDontNest(result, 439, 678);
    
    _putDontNest(result, 370, 636);
    
    _putDontNest(result, 531, 549);
    
    _putDontNest(result, 381, 699);
    
    _putDontNest(result, 406, 482);
    
    _putDontNest(result, 386, 575);
    
    _putDontNest(result, 476, 528);
    
    _putDontNest(result, 627, 699);
    
    _putDontNest(result, 394, 706);
    
    _putDontNest(result, 674, 685);
    
    _putDontNest(result, 578, 657);
    
    _putDontNest(result, 531, 535);
    
    _putDontNest(result, 386, 644);
    
    _putDontNest(result, 473, 492);
    
    _putDontNest(result, 448, 482);
    
    _putDontNest(result, 531, 568);
    
    _putDontNest(result, 545, 591);
    
    _putDontNest(result, 473, 623);
    
    _putDontNest(result, 439, 699);
    
    _putDontNest(result, 575, 609);
    
    _putDontNest(result, 609, 720);
    
    _putDontNest(result, 467, 591);
    
    _putDontNest(result, 370, 664);
    
    _putDontNest(result, 627, 678);
    
    _putDontNest(result, 559, 720);
    
    _putDontNest(result, 394, 657);
    
    _putDontNest(result, 454, 720);
    
    _putDontNest(result, 445, 720);
    
    _putDontNest(result, 517, 591);
    
    _putDontNest(result, 394, 463);
    
    _putDontNest(result, 674, 644);
    
    _putDontNest(result, 702, 699);
    
    _putDontNest(result, 553, 720);
    
    _putDontNest(result, 510, 591);
    
    _putDontNest(result, 418, 706);
    
    _putDontNest(result, 482, 528);
    
    _putDontNest(result, 457, 720);
    
    _putDontNest(result, 578, 706);
    
    _putDontNest(result, 463, 575);
    
    _putDontNest(result, 413, 644);
    
    _putDontNest(result, 486, 575);
    
    _putDontNest(result, 463, 644);
    
    _putDontNest(result, 354, 582);
    
    _putDontNest(result, 486, 644);
    
    _putDontNest(result, 413, 575);
    
    _putDontNest(result, 612, 678);
    
    _putDontNest(result, 492, 591);
    
    _putDontNest(result, 399, 473);
    
    _putDontNest(result, 506, 636);
    
    _putDontNest(result, 495, 706);
    
    _putDontNest(result, 521, 657);
    
    _putDontNest(result, 435, 454);
    
    _putDontNest(result, 647, 699);
    
    _putDontNest(result, 476, 521);
    
    _putDontNest(result, 612, 623);
    
    _putDontNest(result, 476, 542);
    
    _putDontNest(result, 702, 678);
    
    _putDontNest(result, 386, 685);
    
    _putDontNest(result, 623, 727);
    
    _putDontNest(result, 476, 514);
    
    _putDontNest(result, 647, 678);
    
    _putDontNest(result, 506, 664);
    
    _putDontNest(result, 476, 692);
    
    _putDontNest(result, 612, 699);
    
    _putDontNest(result, 535, 591);
    
    _putDontNest(result, 528, 720);
    
    _putDontNest(result, 562, 591);
    
    _putDontNest(result, 386, 713);
    
    _putDontNest(result, 524, 582);
    
    _putDontNest(result, 716, 699);
    
    _putDontNest(result, 568, 664);
    
    _putDontNest(result, 521, 535);
    
    _putDontNest(result, 394, 549);
    
    _putDontNest(result, 345, 692);
    
    _putDontNest(result, 345, 542);
    
    _putDontNest(result, 709, 644);
    
    _putDontNest(result, 473, 499);
    
    _putDontNest(result, 435, 528);
    
    _putDontNest(result, 399, 706);
    
    _putDontNest(result, 716, 678);
    
    _putDontNest(result, 386, 720);
    
    _putDontNest(result, 454, 713);
    
    _putDontNest(result, 688, 699);
    
    _putDontNest(result, 430, 482);
    
    _putDontNest(result, 354, 435);
    
    _putDontNest(result, 514, 582);
    
    _putDontNest(result, 423, 482);
    
    _putDontNest(result, 521, 568);
    
    _putDontNest(result, 445, 713);
    
    _putDontNest(result, 439, 499);
    
    _putDontNest(result, 603, 664);
    
    _putDontNest(result, 531, 706);
    
    _putDontNest(result, 418, 473);
    
    _putDontNest(result, 413, 506);
    
    _putDontNest(result, 430, 591);
    
    _putDontNest(result, 445, 685);
    
    _putDontNest(result, 338, 399);
    
    _putDontNest(result, 423, 591);
    
    _putDontNest(result, 454, 685);
    
    _putDontNest(result, 345, 514);
    
    _putDontNest(result, 695, 692);
    
    _putDontNest(result, 660, 671);
    
    _putDontNest(result, 457, 685);
    
    _putDontNest(result, 553, 713);
    
    _putDontNest(result, 528, 685);
    
    _putDontNest(result, 345, 521);
    
    _putDontNest(result, 394, 535);
    
    _putDontNest(result, 603, 636);
    
    _putDontNest(result, 463, 506);
    
    _putDontNest(result, 571, 582);
    
    _putDontNest(result, 394, 568);
    
    _putDontNest(result, 688, 678);
    
    _putDontNest(result, 528, 713);
    
    _putDontNest(result, 345, 406);
    
    _putDontNest(result, 568, 636);
    
    _putDontNest(result, 609, 644);
    
    _putDontNest(result, 381, 499);
    
    _putDontNest(result, 457, 713);
    
    _putDontNest(result, 354, 423);
    
    _putDontNest(result, 559, 644);
    
    _putDontNest(result, 553, 685);
    
    _putDontNest(result, 640, 706);
    
    _putDontNest(result, 667, 727);
    
    _putDontNest(result, 521, 549);
    
    _putDontNest(result, 538, 591);
    
    _putDontNest(result, 553, 575);
    
    _putDontNest(result, 486, 720);
    
    _putDontNest(result, 549, 591);
    
    _putDontNest(result, 495, 568);
    
    _putDontNest(result, 381, 609);
    
    _putDontNest(result, 394, 473);
    
    _putDontNest(result, 439, 559);
    
    _putDontNest(result, 399, 463);
    
    _putDontNest(result, 418, 535);
    
    _putDontNest(result, 674, 720);
    
    _putDontNest(result, 575, 699);
    
    _putDontNest(result, 381, 559);
    
    _putDontNest(result, 542, 636);
    
    _putDontNest(result, 386, 506);
    
    _putDontNest(result, 439, 609);
    
    _putDontNest(result, 578, 568);
    
    _putDontNest(result, 660, 727);
    
    _putDontNest(result, 495, 549);
    
    _putDontNest(result, 473, 559);
    
    _putDontNest(result, 594, 692);
    
    _putDontNest(result, 457, 575);
    
    _putDontNest(result, 454, 644);
    
    _putDontNest(result, 463, 720);
    
    _putDontNest(result, 399, 657);
    
    _putDontNest(result, 667, 671);
    
    _putDontNest(result, 445, 644);
    
    _putDontNest(result, 528, 575);
    
    _putDontNest(result, 435, 542);
    
    _putDontNest(result, 640, 657);
    
    _putDontNest(result, 435, 514);
    
    _putDontNest(result, 435, 692);
    
    _putDontNest(result, 338, 664);
    
    _putDontNest(result, 499, 664);
    
    _putDontNest(result, 528, 644);
    
    _putDontNest(result, 445, 575);
    
    _putDontNest(result, 502, 591);
    
    _putDontNest(result, 338, 636);
    
    _putDontNest(result, 473, 609);
    
    _putDontNest(result, 499, 636);
    
    _putDontNest(result, 495, 535);
    
    _putDontNest(result, 575, 623);
    
    _putDontNest(result, 709, 685);
    
    _putDontNest(result, 413, 720);
    
    _putDontNest(result, 454, 575);
    
    _putDontNest(result, 457, 644);
    
    _putDontNest(result, 559, 713);
    
    _putDontNest(result, 345, 528);
    
    _putDontNest(result, 609, 713);
    
    _putDontNest(result, 435, 521);
    
    _putDontNest(result, 559, 685);
    
    _putDontNest(result, 553, 644);
    
    _putDontNest(result, 575, 678);
    
    _putDontNest(result, 418, 549);
    
    _putDontNest(result, 609, 685);
    
    _putDontNest(result, 542, 664);
    
    _putDontNest(result, 531, 657);
    
    _putDontNest(result, 709, 713);
    
    _putDontNest(result, 681, 692);
    
    _putDontNest(result, 418, 568);
    
    _putDontNest(result, 510, 535);
    
    _putDontNest(result, 616, 685);
    
    _putDontNest(result, 448, 473);
    
    _putDontNest(result, 386, 399);
    
    _putDontNest(result, 370, 685);
    
    _putDontNest(result, 517, 568);
    
    _putDontNest(result, 535, 535);
    
    _putDontNest(result, 616, 713);
    
    _putDontNest(result, 510, 568);
    
    _putDontNest(result, 492, 549);
    
    _putDontNest(result, 338, 720);
    
    _putDontNest(result, 499, 720);
    
    _putDontNest(result, 549, 706);
    
    _putDontNest(result, 430, 463);
    
    _putDontNest(result, 439, 582);
    
    _putDontNest(result, 423, 463);
    
    _putDontNest(result, 486, 664);
    
    _putDontNest(result, 538, 657);
    
    _putDontNest(result, 463, 664);
    
    _putDontNest(result, 413, 636);
    
    _putDontNest(result, 463, 636);
    
    _putDontNest(result, 413, 664);
    
    _putDontNest(result, 492, 568);
    
    _putDontNest(result, 510, 549);
    
    _putDontNest(result, 723, 706);
    
    _putDontNest(result, 406, 473);
    
    _putDontNest(result, 636, 685);
    
    _putDontNest(result, 502, 706);
    
    _putDontNest(result, 486, 636);
    
    _putDontNest(result, 482, 616);
    
    _putDontNest(result, 482, 727);
    
    _putDontNest(result, 492, 535);
    
    _putDontNest(result, 370, 713);
    
    _putDontNest(result, 381, 582);
    
    _putDontNest(result, 345, 394);
    
    _putDontNest(result, 476, 671);
    
    _putDontNest(result, 619, 727);
    
    _putDontNest(result, 423, 657);
    
    _putDontNest(result, 430, 657);
    
    _putDontNest(result, 506, 644);
    
    _putDontNest(result, 473, 582);
    
    _putDontNest(result, 535, 549);
    
    _putDontNest(result, 517, 535);
    
    _putDontNest(result, 636, 713);
    
    _putDontNest(result, 542, 720);
    
    _putDontNest(result, 591, 609);
    
    _putDontNest(result, 535, 568);
    
    _putDontNest(result, 345, 445);
    
    _putDontNest(result, 562, 568);
    
    _putDontNest(result, 345, 600);
    
    _putDontNest(result, 674, 664);
    
    _putDontNest(result, 506, 575);
    
    _putDontNest(result, 517, 549);
    
    _putDontNest(result, 467, 535);
    
    _putDontNest(result, 514, 609);
    
    _putDontNest(result, 545, 549);
    
    _putDontNest(result, 467, 549);
    
    _putDontNest(result, 585, 699);
    
    _putDontNest(result, 406, 535);
    
    _putDontNest(result, 354, 623);
    
    _putDontNest(result, 545, 535);
    
    _putDontNest(result, 616, 644);
    
    _putDontNest(result, 603, 720);
    
    _putDontNest(result, 585, 678);
    
    _putDontNest(result, 467, 568);
    
    _putDontNest(result, 506, 713);
    
    _putDontNest(result, 524, 623);
    
    _putDontNest(result, 338, 506);
    
    _putDontNest(result, 499, 506);
    
    _putDontNest(result, 399, 482);
    
    _putDontNest(result, 582, 623);
    
    _putDontNest(result, 514, 559);
    
    _putDontNest(result, 636, 644);
    
    _putDontNest(result, 406, 568);
    
    _putDontNest(result, 370, 644);
    
    _putDontNest(result, 582, 678);
    
    _putDontNest(result, 399, 591);
    
    _putDontNest(result, 538, 706);
    
    _putDontNest(result, 506, 685);
    
    _putDontNest(result, 448, 549);
    
    _putDontNest(result, 571, 609);
    
    _putDontNest(result, 524, 678);
    
    _putDontNest(result, 549, 657);
    
    _putDontNest(result, 354, 699);
    
    _putDontNest(result, 386, 664);
    
    _putDontNest(result, 600, 609);
    
    _putDontNest(result, 502, 657);
    
    _putDontNest(result, 386, 636);
    
    _putDontNest(result, 582, 699);
    
    _putDontNest(result, 435, 600);
    
    _putDontNest(result, 623, 692);
    
    _putDontNest(result, 568, 720);
    
    _putDontNest(result, 723, 657);
    
    _putDontNest(result, 435, 445);
    
    _putDontNest(result, 476, 616);
    
    _putDontNest(result, 619, 671);
    
    _putDontNest(result, 406, 549);
    
    _putDontNest(result, 585, 623);
    
    _putDontNest(result, 476, 727);
    
    _putDontNest(result, 370, 575);
    
    _putDontNest(result, 354, 678);
    
    _putDontNest(result, 448, 535);
    
    _putDontNest(result, 571, 559);
    
    _putDontNest(result, 594, 600);
    
    _putDontNest(result, 524, 699);
    
    _putDontNest(result, 482, 671);
    
    _putDontNest(result, 448, 568);
    
    _putDontNest(result, 423, 706);
    
    _putDontNest(result, 430, 706);
    
    _putDontNest(result, 354, 492);
    
    _putDontNest(result, 545, 568);
    
    _putDontNest(result, 531, 591);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(5564, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4529, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(632, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(338, resultStoreId);
    result.putUnsafe(354, resultStoreId);
    result.putUnsafe(345, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(603, resultStoreId);
    result.putUnsafe(600, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(568, resultStoreId);
    result.putUnsafe(559, resultStoreId);
    result.putUnsafe(575, resultStoreId);
    result.putUnsafe(582, resultStoreId);
    result.putUnsafe(585, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(457, resultStoreId);
    result.putUnsafe(448, resultStoreId);
    result.putUnsafe(482, resultStoreId);
    result.putUnsafe(473, resultStoreId);
    result.putUnsafe(439, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(591, resultStoreId);
    result.putUnsafe(594, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(612, resultStoreId);
    result.putUnsafe(623, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(553, resultStoreId);
    result.putUnsafe(562, resultStoreId);
    result.putUnsafe(578, resultStoreId);
    result.putUnsafe(571, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(499, resultStoreId);
    result.putUnsafe(506, resultStoreId);
    result.putUnsafe(492, resultStoreId);
    result.putUnsafe(467, resultStoreId);
    result.putUnsafe(476, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(627, resultStoreId);
    result.putUnsafe(619, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(386, resultStoreId);
    result.putUnsafe(381, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4150, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(406, resultStoreId);
    result.putUnsafe(394, resultStoreId);
    result.putUnsafe(418, resultStoreId);
    result.putUnsafe(399, resultStoreId);
    result.putUnsafe(435, resultStoreId);
    result.putUnsafe(413, resultStoreId);
    result.putUnsafe(463, resultStoreId);
    result.putUnsafe(445, resultStoreId);
    result.putUnsafe(454, resultStoreId);
    result.putUnsafe(430, resultStoreId);
    result.putUnsafe(423, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(370, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(616, resultStoreId);
    result.putUnsafe(609, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(674, resultStoreId);
    result.putUnsafe(636, resultStoreId);
    result.putUnsafe(709, resultStoreId);
    result.putUnsafe(640, resultStoreId);
    result.putUnsafe(723, resultStoreId);
    result.putUnsafe(695, resultStoreId);
    result.putUnsafe(681, resultStoreId);
    result.putUnsafe(667, resultStoreId);
    result.putUnsafe(660, resultStoreId);
    result.putUnsafe(647, resultStoreId);
    result.putUnsafe(702, resultStoreId);
    result.putUnsafe(688, resultStoreId);
    result.putUnsafe(716, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(486, resultStoreId);
    result.putUnsafe(542, resultStoreId);
    result.putUnsafe(528, resultStoreId);
    result.putUnsafe(545, resultStoreId);
    result.putUnsafe(521, resultStoreId);
    result.putUnsafe(495, resultStoreId);
    result.putUnsafe(531, resultStoreId);
    result.putUnsafe(538, resultStoreId);
    result.putUnsafe(514, resultStoreId);
    result.putUnsafe(524, resultStoreId);
    result.putUnsafe(510, resultStoreId);
    result.putUnsafe(535, resultStoreId);
    result.putUnsafe(517, resultStoreId);
    result.putUnsafe(502, resultStoreId);
    result.putUnsafe(549, resultStoreId);
      
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
	
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQYXJhbVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Param\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"binXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"^\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiEiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDMzLDMzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"!\"),[\\char-class([range(33,33)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"String\")],{tag(\"category\"(\"String\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"export\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"property\",sort(\"PropertyAssignment\")),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"import\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"this\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"implements\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFlags\"),[conditional(\\iter-star(\\char-class([range(65,90),range(97,122)])),{\\not-follow(\\char-class([range(65,90),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkFyZ0V4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"protected\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"expression\",sort(\"Statement\")),[conditional(sort(\"Expression\"),{except(\"class\"),except(\"function\")}),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Param\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp = (IConstructor) _read("regular(opt(lex(\"ExponentPart\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"SingleEscapeCharacter\"),[\\char-class([range(34,34),range(39,39),range(92,92),range(98,98),range(102,102),range(110,110),range(114,114),range(116,116),range(118,118)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIioiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQyLDQyKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"*\"),[\\char-class([range(42,42)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p = (IConstructor) _read("prod(lex(\"HexInteger\"),[\\char-class([range(48,48)]),\\char-class([range(88,88),range(120,120)]),conditional(iter(\\char-class([range(48,57),range(65,70),range(97,102)])),{\\not-follow(\\char-class([range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p = (IConstructor) _read("prod(lit(\"new\"),[\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(119,119)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImludGVyZmFjZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"interface\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[conditional(\\char-class([range(48,48)]),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eU5hbWVcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyName\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(78,78)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Source\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Source\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Source\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImV4dGVuZHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"extends\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"switchCase\",sort(\"Statement\")),[lit(\"switch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"clauses\",\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CharacterEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CharacterEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DbGFzc0NoYXIiKSkp = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionClassChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"shr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"\\>\\>\"),{\\not-follow(\\char-class([range(62,62)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNob3J0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"short\"),[\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"var\"),[\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUyLDUyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Niw1NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NSw1NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"neq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"!=\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"not\",sort(\"Expression\")),[conditional(lit(\"!\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"int\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDb21tZW50Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CommentChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTdGF0ZW1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Statement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN5bmNocm9uaXplZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"synchronized\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"throwNoExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"preDecr\",sort(\"Expression\")),[lit(\"--\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryCatch\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUHJvcGVydHlBc3NpZ25tZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIn4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNiwxMjYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"~\"),[\\char-class([range(126,126)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[sort(\"UnicodeEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"returnNoExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"NonEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LAYOUT\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"LAYOUT\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"CommentChar\"),[conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"binNeg\",sort(\"Expression\")),[lit(\"~\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiRG91YmxlU3RyaW5nQ2hhciIpKSk00 = (IConstructor) _read("regular(\\iter-star(lex(\"DoubleStringChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImFic3RyYWN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"abstract\"),[\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDYXNlQ2xhdXNlXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiY9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(label(\"objectDefinition\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInByb3RlY3RlZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"protected\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Decimal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(48,48)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"double\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"breakNoLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ExponentPart\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"ExponentPart\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"switch\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"with\"),[\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"String\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"String\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"String\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInx8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFirstChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFirstChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"postIncr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"++\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"while\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIio9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"*=\"),[\\char-class([range(42,42)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"case\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"shrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"function\",sort(\"Expression\")),[sort(\"Function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyName\"),[sort(\"Numeric\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"var\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwxNjc3NzIxNSldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NSw1NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(49,49)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(54,54)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(55,55)]),\\char-class([range(50,50)]),\\char-class([range(49,49)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p = (IConstructor) _read("prod(label(\"property\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(61,61)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"String\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRyYW5zaWVudCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"transient\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"UnicodeEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"UnicodeEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p = (IConstructor) _read("prod(lit(\"try\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(121,121)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ForBinding\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ForBinding\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ForBinding\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"delete\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Param\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexDigit\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexDigit\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexDigit\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiE9PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzMsMzMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"!==\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[\\char-class([range(1,9),range(11,41),range(43,46),range(48,90),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyName\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyName\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyName\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"const\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ArgExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ArgExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiaXRlcihcXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"super\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlByb3BlcnR5QXNzaWdubWVudFwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Params\"),[label(\"lst\",\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"typeof\",sort(\"Expression\")),[lit(\"typeof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"forInDeclaration\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),sort(\"ForBinding\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp = (IConstructor) _read("regular(\\iter-star(\\char-class([range(48,57)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"++\"),[\\char-class([range(43,43)]),\\char-class([range(43,43)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiYmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"&&\"),[\\char-class([range(38,38)]),\\char-class([range(38,38)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"HexInteger\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"default\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"char\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexEscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexEscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexEscapeSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQYXJhbXNcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Params\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(109,109)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p = (IConstructor) _read("prod(label(\"forDo\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBody\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBody\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBody\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZpcnN0Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(105,105)]),\\char-class([range(114,114)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"ExponentPart\"),[\\char-class([range(69,69),range(101,101)]),lex(\"SignedInteger\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8XDwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYwLDYwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p = (IConstructor) _read("prod(lit(\"\\<\\<\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"eq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"==\"),{\\not-follow(\\char-class([range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"NonEscapeCharacter\"),[\\char-class([range(1,9),range(11,33),range(35,38),range(40,47),range(58,91),range(93,97),range(99,101),range(103,109),range(111,113),range(115,115),range(119,119),range(121,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTb3VyY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Source\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Expression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Expression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDaGFyYWN0ZXJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(sort(\"ArgExpression\"),[sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Declarator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Declarator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Declarator\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNvbnN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"const\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNCwxMjQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSk00 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"neqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"!==\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"debugger\"),[\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(98,98)]),\\char-class([range(117,117)]),\\char-class([range(103,103)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignSub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"-=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"transient\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"null\"),[\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(108,108)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"typeof\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"u\"),[\\char-class([range(117,117)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"switch\"),[\\char-class([range(115,115)]),\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionBody\"),[lex(\"RegularExpressionFirstChar\"),\\iter-star(lex(\"RegularExpressionChar\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"rem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"%\"),{\\not-follow(\\char-class([range(37,37),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDb21tZW50Q2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"div\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"/\"),{\\not-follow(\\char-class([range(47,47),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"sub\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"this\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDQ1LDQ1KV0pKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKG9wdChcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDQ1LDQ1KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(43,43),range(45,45)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(43,43),range(45,45)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000 = (IConstructor) _read("prod(layouts(\"LAYOUTLIST\"),[conditional(\\iter-star(lex(\"LAYOUT\")),{\\not-follow(\\char-class([range(9,10),range(32,32)])),\\not-follow(lit(\"//\")),\\not-follow(lit(\"/*\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNsYXNzIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"class\"),[\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"with\"),lit(\"abstract\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclaration\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclaration\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(65,90),range(97,122)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignBinAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throw\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDYXNlQ2xhdXNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"CaseClause\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkp = (IConstructor) _read("regular(iter(\\char-class([range(48,57),range(65,70),range(97,102)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"VarDecl\"),[sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),label(\"declarations\",\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJEZWNsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"VarDecl\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p = (IConstructor) _read("prod(lex(\"Whitespace\"),[\\char-class([range(9,10),range(13,13),range(32,32)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(117,117),range(120,120)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClass\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"PropertyAssignment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"PropertyAssignment\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionClass\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00 = (IConstructor) _read("prod(label(\"ifThen\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),conditional(empty(),{\\not-follow(lit(\"else\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"catch\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(99,99)]),\\char-class([range(104,104)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Niw3NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsNjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg5LDg5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3OSw3OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg0LDg0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImltcGxlbWVudHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"implements\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p = (IConstructor) _read("prod(label(\"defaultCase\",sort(\"CaseClause\")),[lit(\"default\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"binAnd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"&\"),{\\not-follow(\\char-class([range(38,38),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"false\"),[\\char-class([range(102,102)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000 = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"//\"),conditional(\\iter-star(\\char-class([range(1,9),range(11,16777215)])),{\\end-of-line()})],{tag(\"category\"(\"Comment\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiYiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM4LDM4KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"&\"),[\\char-class([range(38,38)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(1,9),range(11,38),range(40,91),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaWduZWRJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"SignedInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkV4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p = (IConstructor) _read("prod(lit(\"typeof\"),[\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm5hdGl2ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"native\"),[\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD5cPiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\\>\\>\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(label(\"prefixPlus\",sort(\"Expression\")),[conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDcwKSxyYW5nZSg5NywxMDIpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiaXRlcihcXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KSxyYW5nZSg2NSw3MCkscmFuZ2UoOTcsMTAyKV0pKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDcwKSxyYW5nZSg5NywxMDIpXSkpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57),range(65,70),range(97,102)])),[\\char-class([range(0,0)]),lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(iter(\\char-class([range(48,57),range(65,70),range(97,102)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyName\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"DoubleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"while\"),[\\char-class([range(119,119)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"or\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"||\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SignedInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SignedInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SignedInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUGFyYW0iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Param\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\";\"),[\\char-class([range(59,59)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p = (IConstructor) _read("prod(label(\"debugger\",sort(\"Statement\")),[lit(\"debugger\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChcXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUxLDUxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUxLDUxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"opt(\\\\char-class([range(43,43),range(45,45)]))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(51,51)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(52,52)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"-=\"),[\\char-class([range(45,45)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"Id\"),[conditional(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]),{delete(keywords(\"Reserved\"))})],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp = (IConstructor) _read("regular(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihlbXB0eSgpKQ0000 = (IConstructor) _read("regular(empty())", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgib3B0KFxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(61,61)])),[\\char-class([range(0,0)]),lit(\"opt(\\\\char-class([range(61,61)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(\\char-class([range(61,61)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"LAYOUT\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiQ29tbWVudENoYXIiKSkp = (IConstructor) _read("regular(\\iter-star(lex(\"CommentChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"long\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00 = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),\\char-class([range(46,46)]),\\iter-star(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"static\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"throwExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),label(\"expression\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"public\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionFirstChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpression\"),[\\char-class([range(47,47)]),lex(\"RegularExpressionBody\"),\\char-class([range(47,47)]),lex(\"RegularExpressionFlags\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"true\"),[\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"whileDo\",sort(\"Statement\")),[lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"NonEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"float\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKSk00 = (IConstructor) _read("regular(opt(\\char-class([range(61,61)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"opt(sort(\\\"ExponentPart\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lex(\"ExponentPart\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjYsNjYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBody\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throws\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"this\",sort(\"Expression\")),[lit(\"this\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJJZFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Id\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"breakLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"array\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Numeric\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Numeric\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Numeric\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"returnExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Boolean\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Boolean\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Boolean\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclaration\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclaration\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"member\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"[\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"varDecl\",sort(\"Statement\")),[sort(\"VarDecl\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJOdW1lcmljXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Numeric\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(117,117)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSk00 = (IConstructor) _read("regular(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CommentChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"CommentChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJCb29sZWFuXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Boolean\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(66,66)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"continue\"),[\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"default\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"new\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"for\"),[\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00 = (IConstructor) _read("prod(layouts(\"$default$\"),[],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"delete\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"cond\",sort(\"Expression\")),[conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\"?\"),layouts(\"LAYOUTLIST\"),conditional(sort(\"Expression\"),{except(\"cond\")}),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignShl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Initializer\"),[lit(\"=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(66,66)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(115,115)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(104,104)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"try\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"mul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"*\"),{\\not-follow(\\char-class([range(42,42),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignDiv\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"/=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Numeric\"),[conditional(lex(\"Decimal\"),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"continueNoLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p = (IConstructor) _read("prod(lex(\"Comment\"),[lit(\"/*\"),\\iter-star(lex(\"CommentChar\")),lit(\"*/\")],{tag(\"category\"(\"Comment\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignMul\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"*=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJNZXRob2REZWZpbml0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc3LDc3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"MethodDefinition\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(77,77)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClass\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClass\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClass\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"CaseClause\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"CaseClause\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"private\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZvaWQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKQ0000 = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyAssignment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DoubleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DoubleStringChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"true\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p = (IConstructor) _read("prod(label(\"and\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"volatile\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBackslashSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBackslashSequence\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclarationNoIn\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"true\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleEscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSk00 = (IConstructor) _read("regular(\\iter-star(\\char-class([range(1,9),range(11,16777215)])))", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKQ0000 = (IConstructor) _read("regular(\\iter-star(lex(\"LAYOUT\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(48,57)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(48,57)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(48,57)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Expression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"Expression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p = (IConstructor) _read("prod(lit(\"char\"),[\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhEaWdpdFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"HexDigit\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(68,68)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"null\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"new\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"finally\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsSW50ZWdlclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"DecimalInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionClassChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"void\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p = (IConstructor) _read("prod(sort(\"ForBinding\"),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\":\"),[\\char-class([range(58,58)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8vIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"//\"),[\\char-class([range(47,47)]),\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p = (IConstructor) _read("prod(sort(\"Literal\"),[lex(\"RegularExpression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Whitespace\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(39,39)]),\\iter-star(lex(\"SingleStringChar\")),\\char-class([range(39,39)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIml0ZXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiovIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"*/\"),[\\char-class([range(42,42)]),\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQobGl0KCIsIikpKQ0000 = (IConstructor) _read("regular(opt(lit(\",\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00 = (IConstructor) _read("prod(label(\"prefixMin\",sort(\"Expression\")),[conditional(lit(\"-\"),{\\not-follow(\\char-class([range(45,45),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"==\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignAdd\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"+=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJXaGl0ZXNwYWNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg3LDg3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Whitespace\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(87,87)]),\\char-class([range(104,104)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImV4cG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"export\"),[\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"case\"),[\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionClass\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8XDw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\<\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN0YXRpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"static\"),[\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFlags\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFlags\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFlags\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"EscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignRem\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"%=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRocm93cyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKV0se30p = (IConstructor) _read("prod(lit(\"throws\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(115,115)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChlbXB0eSgpLFtdLHt9KQ0000 = (IConstructor) _read("prod(empty(),[],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"-\"),[\\char-class([range(45,45)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"set\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(34,34)]),\\iter-star(lex(\"DoubleStringChar\")),\\char-class([range(34,34)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNlcShbXFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKFwiTEFZT1VUTElTVFwiKSxvcHQoXFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODQsODQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ5LDQ5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(116,116)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(65,65)]),\\char-class([range(89,89)]),\\char-class([range(79,79)]),\\char-class([range(85,85)]),\\char-class([range(84,84)]),\\char-class([range(76,76)]),\\char-class([range(73,73)]),\\char-class([range(83,83)]),\\char-class([range(84,84)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(44,44)]),\\char-class([range(54,54)]),\\char-class([range(49,49)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"SingleStringChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyKGxleCgiU2luZ2xlU3RyaW5nQ2hhciIpKSk00 = (IConstructor) _read("regular(\\iter-star(lex(\"SingleStringChar\")))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"return\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Initializer\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"postDec\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"--\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"false\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"false\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMSFNFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"LHSExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(72,72)]),\\char-class([range(83,83)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"instanceof\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInBhY2thZ2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA3LDEwNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"package\"),[\\char-class([range(112,112)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(107,107)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Statement\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Statement\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Statement\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"else\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"in\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImludCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"int\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"interface\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"set\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Param\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJGb3JCaW5kaW5nXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Niw2NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ForBinding\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(66,66)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ExponentPart\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"binOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"|\"),{\\not-follow(\\char-class([range(61,61),range(124,124)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p = (IConstructor) _read("prod(lex(\"HexDigit\"),[\\char-class([range(48,57),range(65,70),range(97,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsaXQoIiwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJvcHQobGl0KFwiLFwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKG9wdChsaXQoIiwiKSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lit(\",\")),[\\char-class([range(0,0)]),lit(\"opt(lit(\\\",\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lit(\",\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Whitespace\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Whitespace\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Whitespace\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000 = (IConstructor) _read("prod(label(\"geq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00 = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[lex(\"SingleEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"if\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"enum\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"LAYOUT\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionBackslashSequence\"),[\\char-class([range(92,92)]),\\char-class([range(1,9),range(11,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJ5dGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"byte\"),[\\char-class([range(98,98)]),\\char-class([range(121,121)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM3LDM3KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"%\"),[\\char-class([range(37,37)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"synchronized\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"byte\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p = (IConstructor) _read("prod(label(\"call\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\")\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInN1cGVyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"super\"),[\\char-class([range(115,115)]),\\char-class([range(117,117)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)])],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkp = (IConstructor) _read("regular(opt(\\char-class([range(43,43),range(45,45)])))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZpbmFsIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKV0se30p = (IConstructor) _read("prod(lit(\"final\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"goto\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"Function\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(70,70)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Params\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Params\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Params\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p = (IConstructor) _read("prod(lit(\"\\>\"),[\\char-class([range(62,62)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"final\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"class\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"CharacterEscapeSequence\"),[lex(\"SingleEscapeCharacter\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[lit(\"null\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTdGF0ZW1lbnRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"Statement\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImVudW0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"enum\"),[\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(117,117)]),\\char-class([range(109,109)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p = (IConstructor) _read("prod(lit(\"\\<\"),[\\char-class([range(60,60)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(49,57)]),conditional(\\iter-star(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Literal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Literal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Literal\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"if\"),[\\char-class([range(105,105)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[lex(\"RegularExpressionBackslashSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"/\"),[\\char-class([range(47,47)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DecimalInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DecimalInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DecimalInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"empty\",sort(\"Statement\")),[lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImltcG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"import\"),[\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"ifThenElse\",sort(\"Statement\")),[lit(\"if\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"else\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\")\"),[\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"HexEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"with\",sort(\"Statement\")),[lit(\"with\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"scope\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJBcmdFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"ArgExpression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"SignedInteger\"),[opt(\\char-class([range(43,43),range(45,45)])),conditional(iter(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00 = (IConstructor) _read("prod(start(sort(\"Source\")),[layouts(\"LAYOUTLIST\"),label(\"top\",sort(\"Source\")),layouts(\"LAYOUTLIST\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"continue\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryCatchFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"function\"),[\\char-class([range(102,102)]),\\char-class([range(117,117)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"finally\"),[\\char-class([range(102,102)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(121,121)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p = (IConstructor) _read("prod(label(\"caseOf\",sort(\"CaseClause\")),[lit(\"case\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5NCw5NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"^=\"),[\\char-class([range(94,94)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDY1LDkwKSxyYW5nZSg5NywxMjIpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(65,90),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(65,90),range(97,122)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIml0ZXIoXFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57),range(65,70),range(97,102)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(55,55)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(48,48)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJDb21tZW50XCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Comment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"PropertyAssignment\"),[sort(\"MethodDefinition\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"}\"),[\\char-class([range(125,125)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p = (IConstructor) _read("prod(label(\"instanceof\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"instanceof\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[lex(\"CharacterEscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000 = (IConstructor) _read("prod(label(\"source\",sort(\"Source\")),[\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIis9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"+=\"),[\\char-class([range(43,43)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"get\"),[\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p = (IConstructor) _read("prod(label(\"newDotTarget\",sort(\"Expression\")),[lit(\"new\"),layouts(\"LAYOUTLIST\"),lit(\".\"),layouts(\"LAYOUTLIST\"),lit(\"target\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj09PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p = (IConstructor) _read("prod(lit(\"===\"),[\\char-class([range(61,61)]),\\char-class([range(61,61)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00 = (IConstructor) _read("prod(label(\"doWhile\",sort(\"Statement\")),[lit(\"do\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"while\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"cond\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"extends\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"NonEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"NonEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"NonEscapeCharacter\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Comment\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Comment\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Comment\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChsaXQoXCIsXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"opt(lit(\\\",\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Decimal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Decimal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Decimal\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"String\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRvdWJsZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"double\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODYsODYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclaration\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"shl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionClassChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"break\"),[\\char-class([range(98,98)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(107,107)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiU9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzNywzNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"%=\"),[\\char-class([range(37,37)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00 = (IConstructor) _read("prod(label(\"eqq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"===\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"do\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"(\"),[\\char-class([range(40,40)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000 = (IConstructor) _read("prod(label(\"leq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00 = (IConstructor) _read("prod(label(\"add\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"+\"),{\\not-follow(\\char-class([range(43,43),range(61,61)]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"--\"),[\\char-class([range(45,45)]),\\char-class([range(45,45)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImZsb2F0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p = (IConstructor) _read("prod(lit(\"float\"),[\\char-class([range(102,102)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD5cPj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInZvbGF0aWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTgsMTE4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p = (IConstructor) _read("prod(lit(\"volatile\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"break\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImxvbmciKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"long\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000 = (IConstructor) _read("prod(label(\"bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Initializer\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Initializer\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Initializer\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"var\",sort(\"Expression\")),[lex(\"Id\")],{})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000 = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"continueLabel\",sort(\"Statement\")),[lit(\"continue\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInRhcmdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"target\"),[\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(116,116)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"RegularExpressionClass\"),[\\char-class([range(91,91)]),\\iter-star(lex(\"RegularExpressionClassChar\")),\\char-class([range(93,93)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIj8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYzLDYzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"?\"),[\\char-class([range(63,63)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"for\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"do\"),[\\char-class([range(100,100)]),\\char-class([range(111,111)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"CaseClause\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"CaseClause\"),[layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"LHSExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LHSExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"LHSExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzZXEoW2NvbmRpdGlvbmFsKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pLHtcXG5vdC1wcmVjZWRlKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcXG5vdC1mb2xsb3coXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])),[\\char-class([range(0,0)]),lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"delete\",sort(\"Expression\")),[lit(\"delete\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"HexInteger\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"HexInteger\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"HexInteger\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00 = (IConstructor) _read("prod(label(\"gt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p = (IConstructor) _read("prod(label(\"function\",sort(\"Statement\")),[sort(\"Function\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"CommentChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"CommentChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"CommentChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi8qIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"/*\"),[\\char-class([range(47,47)]),\\char-class([range(42,42)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p = (IConstructor) _read("prod(label(\"inn\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNlcShbY29uZGl0aW9uYWwoXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xcbm90LXByZWNlZGUoXFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxcaXRlci1zdGFyKFxcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSkse1xcbm90LWZvbGxvdyhcXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTEsNTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU0LDU0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTIsNTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU2LDU2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUzLDUzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTcsNTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDU1LDU1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDksNDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MCw1MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Miw1MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTYsNTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1MSw1MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTQsNTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Miw1MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTYsNTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Myw1MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1NCw1NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTMsNTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg1Nyw1NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTUsNTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0OSw0OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNTAsNTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDUwLDUwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTI1LDEyNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"seq([conditional(\\\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\\\not-precede(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\\\not-follow(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})])\"),[\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(100,100)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(123,123)]),\\char-class([range(92,92)]),\\char-class([range(110,110)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(45,45)]),\\char-class([range(102,102)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(119,119)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(44,44)]),\\char-class([range(51,51)]),\\char-class([range(54,54)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(53,53)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)]),\\char-class([range(125,125)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p = (IConstructor) _read("prod(sort(\"UnicodeEscapeSequence\"),[lit(\"u\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\"),layouts(\"LAYOUTLIST\"),lex(\"HexDigit\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Function\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Function\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Function\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p = (IConstructor) _read("prod(label(\"assignBinOr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"|=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"boolean\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"debugger\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwxNjc3NzIxNSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3RhcihcXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(1,9),range(11,16777215)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(1,9),range(11,16777215)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(1,9),range(11,16777215)]))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInByaXZhdGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"private\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(118,118)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"SingleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"SingleStringChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00 = (IConstructor) _read("regular(\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Boolean\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJVbmljb2RlRXNjYXBlU2VxdWVuY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"sort(\\\"UnicodeEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(85,85)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(99,99)]),\\char-class([range(111,111)]),\\char-class([range(100,100)]),\\char-class([range(101,101)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIi89IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"/=\"),[\\char-class([range(47,47)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00 = (IConstructor) _read("prod(label(\"block\",sort(\"Statement\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"DoubleStringChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"DoubleStringChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00 = (IConstructor) _read("prod(label(\"nonInit\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p = (IConstructor) _read("prod(sort(\"MethodDefinition\"),[lit(\"get\"),layouts(\"LAYOUTLIST\"),sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"CommentChar\"),[\\char-class([range(1,41),range(43,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImJvb2xlYW4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"boolean\"),[\\char-class([range(98,98)]),\\char-class([range(111,111)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(97,97)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"forIn\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"var\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\"in\"),layouts(\"LAYOUTLIST\"),label(\"obj\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclaration\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p = (IConstructor) _read("prod(lex(\"SingleStringChar\"),[\\char-class([range(92,92)]),lex(\"EscapeSequence\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleStringChar\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Expression\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000 = (IConstructor) _read("prod(lex(\"HexEscapeSequence\"),[\\char-class([range(120,120)]),lex(\"HexDigit\"),lex(\"HexDigit\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Niw4NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"PropertyAssignment\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"PropertyAssignment\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Declarator\"),[lit(\"var\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p = (IConstructor) _read("prod(lit(\"instanceof\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(111,111)]),\\char-class([range(102,102)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\",\"),[\\char-class([range(44,44)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"native\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Param\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Param\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Param\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk0LDk0KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"^\"),[\\char-class([range(94,94)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"Decimal\"),[\\char-class([range(46,46)]),iter(\\char-class([range(48,57)])),opt(lex(\"ExponentPart\"))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpression\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpression\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpression\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p = (IConstructor) _read("prod(lit(\"opt(sort(\\\"ExponentPart\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoImdvdG8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"goto\"),[\\char-class([range(103,103)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(111,111)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInB1YmxpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"public\"),[\\char-class([range(112,112)]),\\char-class([range(117,117)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(99,99)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlw11XD49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"short\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00 = (IConstructor) _read("prod(sort(\"Literal\"),[sort(\"Numeric\")],{tag(\"category\"(\"Numeric\"))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000 = (IConstructor) _read("prod(label(\"forDoDeclarations\",sort(\"Statement\")),[lit(\"for\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Declarator\"),layouts(\"LAYOUTLIST\"),\\iter-seps(sort(\"VariableDeclarationNoIn\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"conds\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\";\"),layouts(\"LAYOUTLIST\"),label(\"ops\",\\iter-star-seps(sort(\"Expression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00 = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"MethodDefinition\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"MethodDefinition\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"MethodDefinition\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArgExpression\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"ArgExpression\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00 = (IConstructor) _read("prod(label(\"lt\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000 = (IConstructor) _read("prod(label(\"preIncr\",sort(\"Expression\")),[lit(\"++\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionClassChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionClassChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionClassChar\"))))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"+\"),[\\char-class([range(43,43)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"HexEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJIZXhJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcyLDcyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"HexInteger\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(72,72)]),\\char-class([range(101,101)]),\\char-class([range(120,120)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000 = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"package\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzZXEoW1xcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksbGF5b3V0cyhcIkxBWU9VVExJU1RcIiksb3B0KFxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNlcShbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKV0pKSl9KQ0000 = (IConstructor) _read("prod(label(\"$MetaHole\",seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])),[\\char-class([range(0,0)]),lit(\"seq([\\\\char-class([range(61,61)]),layouts(\\\"LAYOUTLIST\\\"),opt(\\\\char-class([range(61,61)]))])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))])))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000 = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJMaXRlcmFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"Literal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(76,76)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Id\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Id\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Id\")))})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000 = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[\\char-class([range(48,57)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"\\\\iter-seps(sort(\\\"VariableDeclarationNoIn\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(86,86)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p = (IConstructor) _read("prod(lex(\"DoubleStringChar\"),[\\char-class([range(1,9),range(11,33),range(35,91),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00 = (IConstructor) _read("prod(sort(\"Function\"),[lit(\"function\"),layouts(\"LAYOUTLIST\"),label(\"name\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),label(\"parameters\",sort(\"Params\")),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),lit(\"{\"),layouts(\"LAYOUTLIST\"),label(\"body\",\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")])),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclarationNoIn\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",conditional(sort(\"Expression\"),{except(\"inn\")}))],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p = (IConstructor) _read("prod(label(\"labeled\",sort(\"Statement\")),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIiE9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzMywzMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"!=\"),[\\char-class([range(33,33)]),\\char-class([range(61,61)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"sort(\\\"RegularExpressionFlags\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(82,82)]),\\char-class([range(101,101)]),\\char-class([range(103,103)]),\\char-class([range(117,117)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(120,120)]),\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(70,70)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(103,103)]),\\char-class([range(115,115)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p = (IConstructor) _read("prod(sort(\"LHSExpression\"),[conditional(sort(\"Expression\"),{except(\"array\"),except(\"objectDefinition\"),except(\"assign\")})],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p = (IConstructor) _read("prod(lit(\"return\"),[\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(110,110)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoInNvcnQoXCJEZWNsYXJhdG9yXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000 = (IConstructor) _read("prod(lit(\"sort(\\\"Declarator\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000 = (IConstructor) _read("prod(label(\"assignBinXor\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"^=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00 = (IConstructor) _read("prod(label(\"tryFinally\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"finally\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00 = (IConstructor) _read("prod(lex(\"RegularExpressionChar\"),[\\char-class([range(1,9),range(11,46),range(48,90),range(93,16777215)])],{})", RascalValueFactory.Production);
  private static final IConstructor cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00 = (IConstructor) _read("prod(lit(\"]\"),[\\char-class([range(93,93)])],{})", RascalValueFactory.Production);
    
  // Item declarations
	
	
  protected static class String {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(24, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(23, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(21, 1, cHJvZChsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,83,116,114,105,110,103,34,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(22, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(20, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(25, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(31, 2, new int[][]{{39,39}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(28, 0, new int[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(30, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiU2luZ2xlU3RyaW5nQ2hhciIpKSk00, new NonTerminalStackNode<IConstructor>(29, 0, "SingleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(36, 2, new int[][]{{34,34}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(33, 0, new int[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(35, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiRG91YmxlU3RyaW5nQ2hhciIpKSk00, new NonTerminalStackNode<IConstructor>(34, 0, "DoubleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlN0cmluZyIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTdHJpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU3RyaW5nIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzksMzkpXSksXGl0ZXItc3RhcihsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM5LDM5KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlN0cmluZyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGl0ZXItc3RhcihsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class Decimal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new OptionalStackNode<IConstructor>(81, 1, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(80, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(79, 0, "DecimalInteger", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode<IConstructor>(88, 3, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(87, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(83, 0, "DecimalInteger", null, null);
      tmp[1] = new CharStackNode<IConstructor>(84, 1, new int[][]{{46,46}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(86, 2, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(85, 0, new int[][]{{48,57}}, null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(91, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(93, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(96, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(92, 1, cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(95, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(94, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(99, 0, new int[][]{{46,46}}, null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(103, 2, cmVndWxhcihvcHQobGV4KCJFeHBvbmVudFBhcnQiKSkp, new NonTerminalStackNode<IConstructor>(102, 0, "ExponentPart", null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(101, 1, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(100, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLG9wdChsZXgoIkV4cG9uZW50UGFydCIpKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbbGV4KCJEZWNpbWFsSW50ZWdlciIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Niw0NildKSxcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksb3B0KGxleCgiRXhwb25lbnRQYXJ0IikpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWwiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRGVjaW1hbFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEZWNpbWFsIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxvcHQobGV4KCJFeHBvbmVudFBhcnQiKSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Function {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(210, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(212, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(214, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(213, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(211, 1, cHJvZChsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,70,117,110,99,116,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(215, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[0] = new LiteralStackNode<IConstructor>(218, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(231, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(229, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(230, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(228, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(222, 4, "Params", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(234, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(220, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(225, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(227, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(221, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(233, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(219, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(224, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(226, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[13] = new NonTerminalStackNode<IConstructor>(254, 13, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(248, 10, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(236, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(247, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(241, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(252, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(250, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(251, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(255, 14, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(238, 2, "Id", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(243, 6, "Params", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(246, 8, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(240, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(249, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(237, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(242, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(245, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGdW5jdGlvbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJGdW5jdGlvblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiRnVuY3Rpb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgicGFyYW1ldGVycyIsc29ydCgiUGFyYW1zIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJib2R5IixcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(builder);
      
        _init_cHJvZChzb3J0KCJGdW5jdGlvbiIpLFtsaXQoImZ1bmN0aW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJuYW1lIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoInBhcmFtZXRlcnMiLHNvcnQoIlBhcmFtcyIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiYm9keSIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Expression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(595, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(599, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(598, 2, cHJvZChsaXQoIl4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk0LDk0KV0pXSx7fSk00, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(600, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(594, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(487, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(491, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(490, 2, cHJvZChsaXQoIlw11XD4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(492, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(486, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(341, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(339, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(342, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(340, 2, cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(338, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(567, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(563, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(568, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(566, 2, cHJvZChsaXQoIj09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(562, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(668, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(670, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(667, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(669, 2, cHJvZChsaXQoIiY9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(671, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(622, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(620, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(619, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(623, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(621, 2, cHJvZChsaXQoInx8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pXSx7fSk00, new int[] {124,124}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(677, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(675, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(674, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(678, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(676, 2, cHJvZChsaXQoIlw11XD49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,62,61}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(413, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(411, 0, cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(412, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(688, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(692, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(690, 2, cHJvZChsaXQoIl49IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5NCw5NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(691, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(689, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(554, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(558, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(557, 2, cHJvZChsaXQoIiE9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzMywzMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(559, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(553, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(429, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(430, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(428, 0, cHJvZChsaXQoIiEiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDMzLDMzKV0pXSx7fSk00, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(434, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(435, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(433, 0, cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000, new int[] {45,45}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(291, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(300, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(297, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(296, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUHJvcGVydHlBc3NpZ25tZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(292, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(293, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(294, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(295, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(301, 6, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(299, 4, cmVndWxhcihvcHQobGl0KCIsIikpKQ0000, new LiteralStackNode<IConstructor>(298, 0, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(290, 0, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(393, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(394, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(392, 0, cHJvZChsaXQoIn4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNiwxMjYpXSldLHt9KQ0000, new int[] {126}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(643, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(641, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(644, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(642, 2, cHJvZChsaXQoIlw11XD5cPj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(640, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(382, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(383, 2, cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(381, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(498, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(496, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(499, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(497, 2, cHJvZChsaXQoIlw11XD5cPiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYyLDYyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(495, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(304, 0, "Function", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(656, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(648, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(657, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(655, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(647, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(398, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(399, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(397, 0, cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(731, 1, cHJvZChsaXQoInNvcnQoXCJFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(734, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(733, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(730, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(732, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(735, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(307, 0, "Literal", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(572, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(574, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(571, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(573, 2, cHJvZChsaXQoIiE9PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzMsMzMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(575, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(661, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(663, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(660, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(662, 2, cHJvZChsaXQoIi09IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(664, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(449, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(453, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(448, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(452, 2, cHJvZChsaXQoIiUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM3LDM3KV0pXSx7fSk00, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(454, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(458, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(462, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(457, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(461, 2, cHJvZChsaXQoIi8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pXSx7fSk00, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(463, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(468, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(472, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(467, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(471, 2, cHJvZChsaXQoIi0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pXSx7fSk00, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(473, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(590, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(586, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(585, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(591, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(589, 2, cHJvZChsaXQoIiYiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDM4LDM4KV0pXSx7fSk00, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(405, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(404, 0, cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(406, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(310, 0, cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(348, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(350, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(346, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(345, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(349, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(347, 2, cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(351, 6, cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00, new int[] {93}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(320, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(314, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(323, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(313, 0, cHJvZChsaXQoIlsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pXSx7fSk00, new int[] {91}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(322, 4, cmVndWxhcihvcHQobGl0KCIsIikpKQ0000, new LiteralStackNode<IConstructor>(321, 0, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(319, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(315, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(316, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(317, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(318, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(324, 6, cHJvZChsaXQoIl0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkzLDkzKV0pXSx7fSk00, new int[] {93}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(697, 2, cHJvZChsaXQoIi89IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(699, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(695, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(696, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(698, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(704, 2, cHJvZChsaXQoIio9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(706, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(702, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(703, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(705, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(634, 6, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(629, 2, cHJvZChsaXQoIj8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYzLDYzKV0pXSx7fSk00, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(632, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(627, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(635, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(628, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(633, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(630, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(636, 8, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(711, 2, cHJvZChsaXQoIlw8XDw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(713, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(709, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(710, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(712, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(443, 2, cHJvZChsaXQoIioiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQyLDQyKV0pXSx7fSk00, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(445, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(439, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(440, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(444, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(614, 2, cHJvZChsaXQoIiYmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzOCwzOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpXSldLHt9KQ0000, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(616, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(612, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(613, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(615, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(741, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(744, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(739, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(740, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkV4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(743, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(742, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(370, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(368, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(369, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(718, 2, cHJvZChsaXQoIiU9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgzNywzNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(720, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(716, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(717, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(719, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(725, 2, cHJvZChsaXQoIis9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSldLHt9KQ0000, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(727, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(723, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(724, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(726, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(388, 2, cHJvZChsaXQoIi0tIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSldLHt9KQ0000, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(386, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(387, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(609, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(607, 2, cHJvZChsaXQoInwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNCwxMjQpXSldLHt9KQ0000, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(603, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(608, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(604, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(514, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(512, 2, cHJvZChsaXQoIlw11PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(510, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(513, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(511, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[4] = new SeparatedListStackNode<IConstructor>(362, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(358, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(359, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(360, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(361, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(364, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(356, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(354, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(357, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(355, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(363, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(517, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(519, 2, cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(521, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(518, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(520, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(373, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(375, 2, cHJvZChsaXQoIi4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ2LDQ2KV0pXSx7fSk00, new int[] {46}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(377, 4, cHJvZChsaXQoInRhcmdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000, new int[] {116,97,114,103,101,116}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(374, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(376, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(578, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(580, 2, cHJvZChsaXQoIj09PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(582, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(579, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(581, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(524, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(526, 2, cHJvZChsaXQoIlw8PSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjAsNjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(528, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(525, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(527, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(502, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(504, 2, cHJvZChsaXQoIlw8XDwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYwLDYwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(506, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(503, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(505, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(476, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(480, 2, cHJvZChsaXQoIisiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKV0pXSx7fSk00, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(482, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(477, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(481, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(327, 0, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(329, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(331, 4, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(328, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(330, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(334, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(416, 0, cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(418, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(417, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(531, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(533, 2, cHJvZChsaXQoIlw11IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2Miw2MildKV0se30p, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(535, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(532, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(534, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(538, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(542, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(540, 2, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(541, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(539, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(681, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(685, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(683, 2, cHJvZChsaXQoInw9IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjQsMTI0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKV0se30p, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(684, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(682, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(545, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(549, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(547, 2, cHJvZChsaXQoIlw8IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg2MCw2MCldKV0se30p, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(548, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(546, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(421, 0, cHJvZChsaXQoIisrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpXSldLHt9KQ0000, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(423, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(422, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiYmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiXD5cPiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjIsNjIpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKGxlZnQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiZXEiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCI9PSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgib3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8fCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJlZml4TWluIixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIi0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KSxyYW5nZSg2MSw2MSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluWG9yIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibmVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiIT0iKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibm90Iixzb3J0KCJFeHByZXNzaW9uIikpLFtjb25kaXRpb25hbChsaXQoIiEiKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicHJlRGVjciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCItLSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgib2JqZWN0RGVmaW5pdGlvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxvcHQobGl0KCIsIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiYmluTmVnIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIn4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicG9zdEluY3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIrKyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgic2hyciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIlw11XD5cPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkZ1bmN0aW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiPSIpLHtcbm90LWZvbGxvdyhzZXEoW1xjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSldKSldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidHlwZW9mIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoInR5cGVvZiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkV4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkV4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGl0ZXJhbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiTGl0ZXJhbCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgibmVxcSIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiE9PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzcsMzcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic3ViIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiLSIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYmluQW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiJiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzgsMzgpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgicHJlZml4UGx1cyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwobGl0KCIrIikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNjEsNjEpXSkpfSksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgidGhpcyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCJ0aGlzIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibWVtYmVyIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXJyYXkiLHNvcnQoIkV4cHJlc3Npb24iKSksW2xpdCgiWyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLG9wdChsaXQoIiwiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduRGl2Iixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduTXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj8iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwoc29ydCgiRXhwcmVzc2lvbiIpLHtleGNlcHQoImNvbmQiKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduU2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPD0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgibXVsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKiIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYW5kIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJiYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MobGVmdCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibmV3Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduUmVtIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiJT0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKz0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicG9zdERlYyIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi0tIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksY29uZGl0aW9uYWwobGl0KCJ8Iikse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2MSw2MSkscmFuZ2UoMTI0LDEyNCldKSl9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MocmlnaHQoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZ2VxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXD49IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiY2FsbCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiaW5zdGFuY2VvZiIsc29ydCgiRXhwcmVzc2lvbiIpKSxbc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImluc3RhbmNlb2YiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibmV3RG90VGFyZ2V0Iixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoIm5ldyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIi4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ0YXJnZXQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiZXFxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiPT09IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKHJpZ2h0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGVxIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDw9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKV0se2Fzc29jKFxub24tYXNzb2MoKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgic2hsIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiXDxcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYWRkIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGxpdCgiKyIpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoNDMsNDMpLHJhbmdlKDYxLDYxKV0pKX0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhsZWZ0KCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiYnJhY2tldCIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIildLHticmFja2V0KCl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidmFyIixzb3J0KCJFeHByZXNzaW9uIikpLFtsZXgoIklkIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZGVsZXRlIixzb3J0KCJFeHByZXNzaW9uIikpLFtsaXQoImRlbGV0ZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZ3QiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaW5uIixzb3J0KCJFeHByZXNzaW9uIikpLFtzb3J0KCJFeHByZXNzaW9uIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7YXNzb2MoXG5vbi1hc3NvYygpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiYXNzaWduQmluT3IiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ8PSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhyaWdodCgpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgibHQiLHNvcnQoIkV4cHJlc3Npb24iKSksW3NvcnQoIkV4cHJlc3Npb24iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJcPCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHthc3NvYyhcbm9uLWFzc29jKCkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgicHJlSW5jciIsc29ydCgiRXhwcmVzc2lvbiIpKSxbbGl0KCIrKyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class layouts_$default$ {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new EpsilonStackNode<IConstructor>(819, 0);
      builder.addAlternative(Parser.cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYXlvdXRzKCIkZGVmYXVsdCQiKSxbXSx7fSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionFlags {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(838, 0, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKSk00, new CharStackNode<IConstructor>(835, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(843, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(846, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(841, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(842, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(845, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(844, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSxbY29uZGl0aW9uYWwoXGl0ZXItc3RhcihcY2hhci1jbGFzcyhbcmFuZ2UoNjUsOTApLHJhbmdlKDk3LDEyMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTcsMTIyKV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25GbGFnc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkZsYWdzIikpKX0p(builder);
      
    }
  }
	
  protected static class Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(857, 1, cHJvZChsaXQoInNvcnQoXCJTb3VyY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(860, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(859, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(858, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(861, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(856, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(867, 0, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(865, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(866, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTb3VyY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU291cmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTb3VyY2UiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgic291cmNlIixzb3J0KCJTb3VyY2UiKSksW1xpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class RegularExpressionFirstChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1023, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1022, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1020, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkZpcnN0Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3MCw3MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1024, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1021, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1019, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1027, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1029, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1031, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDQxKSxyYW5nZSg0Myw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25DbGFzcyIpXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class HexDigit {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1139, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1138, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1136, 1, cHJvZChsaXQoInNvcnQoXCJIZXhEaWdpdFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1140, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1137, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1135, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1143, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleERpZ2l0IikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleERpZ2l0XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleERpZ2l0IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkhleERpZ2l0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKV0se30p(builder);
      
    }
  }
	
  protected static class CommentChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1709, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1713, 1, cHJvZChsaXQoInNvcnQoXCJDb21tZW50Q2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1712, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1717, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1716, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1715, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1714, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1721, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1726, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1722, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDb21tZW50Q2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1723, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1725, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1724, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1730, 0, new int[][]{{1,41},{43,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ3LDQ3KV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNvbW1lbnRDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNvbW1lbnRDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnRDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNvbW1lbnRDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIkNvbW1lbnRDaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNvbW1lbnRDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDQxKSxyYW5nZSg0MywxNjc3NzIxNSldKV0se30p(builder);
      
    }
  }
	
  protected static class ForBinding {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1800, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1799, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1797, 1, cHJvZChsaXQoInNvcnQoXCJGb3JCaW5kaW5nXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcwLDcwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Niw2NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,70,111,114,66,105,110,100,105,110,103,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1801, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1798, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1796, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1804, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJGb3JCaW5kaW5nIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkZvckJpbmRpbmdcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkZvckJpbmRpbmciKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJGb3JCaW5kaW5nIiksW2xleCgiSWQiKV0se30p(builder);
      
    }
  }
	
  protected static class RegularExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(1855, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(1852, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1853, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(1854, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1858, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1863, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1862, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1861, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1860, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1859, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFxjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmxhZ3MiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uIikpKX0p(builder);
      
    }
  }
	
  protected static class UnicodeEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(1894, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1893, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1891, 1, cHJvZChsaXQoInNvcnQoXCJVbmljb2RlRXNjYXBlU2VxdWVuY2VcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1895, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1892, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1890, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(1898, 0, cHJvZChsaXQoInUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSldLHt9KQ0000, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(1902, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(1904, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1900, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(1906, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1901, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(1905, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1903, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1899, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiVW5pY29kZUVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJVbmljb2RlRXNjYXBlU2VxdWVuY2UiKSxbbGl0KCJ1IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGV4KCJIZXhEaWdpdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIkhleERpZ2l0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSGV4RGlnaXQiKV0se30p(builder);
      
    }
  }
	
  protected static class CaseClause {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(1951, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1950, 0, cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(1956, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(1954, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1955, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1953, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1952, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(1961, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1960, 1, cHJvZChsaXQoInNvcnQoXCJDYXNlQ2xhdXNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1963, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1962, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1964, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1959, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(1976, 6, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(1974, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1975, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(1968, 0, cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(1970, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(1972, 4, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(1973, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(1969, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(1971, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1979, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1981, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1984, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1980, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJDYXNlQ2xhdXNlXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1983, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(1982, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiZGVmYXVsdENhc2UiLHNvcnQoIkNhc2VDbGF1c2UiKSksW2xpdCgiZGVmYXVsdCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNhc2VDbGF1c2VcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkNhc2VDbGF1c2UiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiY2FzZU9mIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtsaXQoImNhc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjoiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJDYXNlQ2xhdXNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIkNhc2VDbGF1c2VcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
    }
  }
	
  protected static class VariableDeclaration {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2070, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2069, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2067, 1, cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2066, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2068, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2071, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2079, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2078, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2076, 1, cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODYsODYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2075, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2080, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2077, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2091, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2092, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2093, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2088, 0, "Id", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2090, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2097, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXNlcHMoc29ydChcIlZhcmlhYmxlRGVjbGFyYXRpb25cIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImV4cCIsc29ydCgiRXhwcmVzc2lvbiIpKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbiIpKSxbbGFiZWwoImlkIixsZXgoIklkIikpXSx7fSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionBody {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2107, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2106, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2104, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjYsNjYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2108, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2105, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2103, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2113, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKQ0000, new NonTerminalStackNode<IConstructor>(2112, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2111, 0, "RegularExpressionFirstChar", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJvZHlcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25Cb2R5IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQm9keSIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uRmlyc3RDaGFyIiksXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKV0se30p(builder);
      
    }
  }
	
  protected static class Declarator {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2195, 1, cHJvZChsaXQoInNvcnQoXCJEZWNsYXJhdG9yXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,68,101,99,108,97,114,97,116,111,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2198, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2197, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2194, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2196, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2199, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2202, 0, cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJEZWNsYXJhdG9yIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2xhcmF0b3JcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkRlY2xhcmF0b3IiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJEZWNsYXJhdG9yIiksW2xpdCgidmFyIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class VarDecl {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(2218, 1, cHJvZChsaXQoInNvcnQoXCJWYXJEZWNsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2221, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2220, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2217, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2219, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2222, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2226, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2233, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2225, 0, "Declarator", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2231, 2, cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2227, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2228, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2229, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2230, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2234, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJEZWNsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlZhckRlY2xcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIlZhckRlY2wiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJWYXJEZWNsIiksW3NvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImRlY2xhcmF0aW9ucyIsXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class DoubleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2284, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2283, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2289, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2292, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2287, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2288, 1, cHJvZChsaXQoInNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY4LDY4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2291, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2290, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2296, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2301, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2298, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2300, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2299, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2297, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJEb3VibGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2305, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiRG91YmxlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJEb3VibGVTdHJpbmdDaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkRvdWJsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzMpLHJhbmdlKDM1LDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(builder);
      
    }
  }
	
  protected static class Id {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SequenceStackNode<IConstructor>(2385, 0, cmVndWxhcihzZXEoW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkse1xub3QtcHJlY2VkZShcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldKSk00, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2378, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2382, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKSk00, new CharStackNode<IConstructor>(2379, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(Parser.cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2388, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2393, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2390, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2392, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2391, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2389, 1, cHJvZChsaXQoInNvcnQoXCJJZFwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIklkIiksW2NvbmRpdGlvbmFsKHNlcShbY29uZGl0aW9uYWwoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSx7XG5vdC1wcmVjZWRlKFxjaGFyLWNsYXNzKFtyYW5nZSgzNiwzNikscmFuZ2UoNDgsNTcpLHJhbmdlKDY1LDkwKSxyYW5nZSg5NSw5NSkscmFuZ2UoOTcsMTIyKV0pKX0pLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpLHtcbm90LWZvbGxvdyhcY2hhci1jbGFzcyhbcmFuZ2UoMzYsMzYpLHJhbmdlKDQ4LDU3KSxyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0pLHtkZWxldGUoa2V5d29yZHMoIlJlc2VydmVkIikpfSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIklkIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIklkXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIklkIikpKX0p(builder);
      
    }
  }
	
  protected static class NonEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2398, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2401, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2403, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2406, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2402, 1, cHJvZChsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2405, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2404, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSwzMykscmFuZ2UoMzUsMzgpLHJhbmdlKDQwLDQ3KSxyYW5nZSg1OCw5MSkscmFuZ2UoOTMsOTcpLHJhbmdlKDk5LDEwMSkscmFuZ2UoMTAzLDEwOSkscmFuZ2UoMTExLDExMykscmFuZ2UoMTE1LDExNSkscmFuZ2UoMTE5LDExOSkscmFuZ2UoMTIxLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIk5vbkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJOb25Fc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
    }
  }
	
  protected static class RegularExpressionClassChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2419, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2421, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2426, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2429, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2424, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2425, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2428, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2427, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2433, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2438, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2435, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2434, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhclwiKSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2437, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2436, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW2xleCgiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZSIpXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDkxKSxyYW5nZSg5NCwxNjc3NzIxNSldKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXIoc29ydChcIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyXCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3RhcihsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3NDaGFyIikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class Whitespace {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2562, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2570, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2567, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2565, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2569, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2568, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2566, 1, cHJvZChsaXQoInNvcnQoXCJXaGl0ZXNwYWNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg3LDg3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIldoaXRlc3BhY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDksMTApLHJhbmdlKDEzLDEzKSxyYW5nZSgzMiwzMildKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIldoaXRlc3BhY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiV2hpdGVzcGFjZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJXaGl0ZXNwYWNlIikpKX0p(builder);
      
    }
  }
	
  protected static class HexEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2614, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2613, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2611, 1, cHJvZChsaXQoInNvcnQoXCJIZXhFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2615, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2612, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2610, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2618, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2620, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2619, 1, "HexDigit", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkhleEVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkhleEVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkhleEVzY2FwZVNlcXVlbmNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLGxleCgiSGV4RGlnaXQiKSxsZXgoIkhleERpZ2l0IildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class MethodDefinition {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[12] = new SeparatedListStackNode<IConstructor>(2837, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2835, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2836, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2827, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(2829, 6, "Param", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2825, 2, "PropertyName", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(2832, 9, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2830, 7, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(2838, 13, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2831, 8, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(2839, 14, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(2833, 10, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2823, 0, cHJvZChsaXQoInNldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {115,101,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2826, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2834, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2824, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2828, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(2850, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2845, 4, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2843, 2, "PropertyName", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(2849, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2848, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2841, 0, cHJvZChsaXQoImdldCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {103,101,116}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(2853, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(2851, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2852, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(2855, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(2847, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2844, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(2854, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2842, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2846, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2862, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2861, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2859, 1, cHJvZChsaXQoInNvcnQoXCJNZXRob2REZWZpbml0aW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc3LDc3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,77,101,116,104,111,100,68,101,102,105,110,105,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2858, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2863, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2860, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgic2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiUGFyYW0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJNZXRob2REZWZpbml0aW9uIiksW2xpdCgiZ2V0IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlByb3BlcnR5TmFtZSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgieyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIn0iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJNZXRob2REZWZpbml0aW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk1ldGhvZERlZmluaXRpb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk1ldGhvZERlZmluaXRpb24iKSkpfSk00(builder);
      
    }
  }
	
  protected static class layouts_LAYOUTLIST {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new ListStackNode<IConstructor>(2912, 0, cmVndWxhcihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKQ0000, new NonTerminalStackNode<IConstructor>(2907, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
      builder.addAlternative(Parser.cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYXlvdXRzKCJMQVlPVVRMSVNUIiksW2NvbmRpdGlvbmFsKFxpdGVyLXN0YXIobGV4KCJMQVlPVVQiKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg5LDEwKSxyYW5nZSgzMiwzMildKSksXG5vdC1mb2xsb3cobGl0KCIvLyIpKSxcbm90LWZvbGxvdyhsaXQoIi8qIikpfSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Comment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2959, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pKSk00, new CharStackNode<IConstructor>(2957, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(2956, 0, cHJvZChsaXQoIi8vIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000, new int[] {47,47}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2964, 2, cHJvZChsaXQoIiovIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Miw0MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDcsNDcpXSldLHt9KQ0000, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(2963, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiQ29tbWVudENoYXIiKSkp, new NonTerminalStackNode<IConstructor>(2962, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2961, 0, cHJvZChsaXQoIi8qIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0Nyw0NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDIsNDIpXSldLHt9KQ0000, new int[] {47,42}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2967, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2969, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2968, 1, cHJvZChsaXQoInNvcnQoXCJDb21tZW50XCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2971, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(2970, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2972, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvLyIpLGNvbmRpdGlvbmFsKFxpdGVyLXN0YXIoXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMTY3NzcyMTUpXSkpLHtcZW5kLW9mLWxpbmUoKX0pXSx7dGFnKCJjYXRlZ29yeSIoIkNvbW1lbnQiKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNvbW1lbnQiKSxbbGl0KCIvKiIpLFxpdGVyLXN0YXIobGV4KCJDb21tZW50Q2hhciIpKSxsaXQoIiovIildLHt0YWcoImNhdGVnb3J5IigiQ29tbWVudCIpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNvbW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiQ29tbWVudFwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJDb21tZW50IikpKX0p(builder);
      
    }
  }
	
  protected static class Reserved {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3289, 0, cHJvZChsaXQoImludCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {105,110,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3291, 0, cHJvZChsaXQoImNoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3293, 0, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3295, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3297, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3299, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3301, 0, cHJvZChsaXQoIm5hdGl2ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3303, 0, cHJvZChsaXQoInNob3J0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3305, 0, cHJvZChsaXQoInBhY2thZ2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA3LDEwNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3307, 0, cHJvZChsaXQoImV4cG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3309, 0, cHJvZChsaXQoInByb3RlY3RlZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3311, 0, cHJvZChsaXQoImltcG9ydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3313, 0, cHJvZChsaXQoImltcGxlbWVudHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3315, 0, cHJvZChsaXQoImZ1bmN0aW9uIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3317, 0, cHJvZChsaXQoImRvdWJsZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3319, 0, cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3321, 0, cHJvZChsaXQoImNhc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3323, 0, cHJvZChsaXQoInZhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE4LDExOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSldLHt9KQ0000, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3325, 0, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3327, 0, cHJvZChsaXQoImNvbnN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3329, 0, cHJvZChsaXQoInN1cGVyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pXSx7fSk00, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3331, 0, cHJvZChsaXQoInRyYW5zaWVudCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSldLHt9KQ0000, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3333, 0, cHJvZChsaXQoInR5cGVvZiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3335, 0, cHJvZChsaXQoInRoaXMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3337, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3340, 1, cHJvZChsaXQoImFic3RyYWN0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3339, 0, cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3342, 0, cHJvZChsaXQoInB1YmxpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTgsOTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3344, 0, cHJvZChsaXQoImxvbmciKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSldLHt9KQ0000, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3346, 0, cHJvZChsaXQoInN0YXRpYyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pXSx7fSk00, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3348, 0, cHJvZChsaXQoImZsb2F0IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKV0se30p, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3350, 0, cHJvZChsaXQoInRocm93cyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKV0se30p, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3352, 0, cHJvZChsaXQoImRlZmF1bHQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pXSx7fSk00, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3354, 0, cHJvZChsaXQoIm5ldyIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKV0se30p, new int[] {110,101,119}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3356, 0, cHJvZChsaXQoImRlbGV0ZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAwLDEwMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3358, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3360, 0, cHJvZChsaXQoInByaXZhdGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3362, 0, cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3364, 0, cHJvZChsaXQoInZvbGF0aWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTgsMTE4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3366, 0, cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3368, 0, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3370, 0, cHJvZChsaXQoInZvaWQiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOCwxMTgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3372, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3374, 0, cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3376, 0, cHJvZChsaXQoImludGVyZmFjZSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3378, 0, cHJvZChsaXQoImluc3RhbmNlb2YiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKV0se30p, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3380, 0, cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3382, 0, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3384, 0, cHJvZChsaXQoInN5bmNocm9uaXplZCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSldLHt9KQ0000, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3386, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3388, 0, cHJvZChsaXQoImVudW0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSldLHt9KQ0000, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3390, 0, cHJvZChsaXQoImJ5dGUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3392, 0, cHJvZChsaXQoImNsYXNzIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3394, 0, cHJvZChsaXQoImdvdG8iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSldLHt9KQ0000, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3396, 0, cHJvZChsaXQoImZpbmFsIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKV0se30p, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3398, 0, cHJvZChsaXQoImV4dGVuZHMiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMCwxMDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSldLHt9KQ0000, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3400, 0, cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00, new int[] {100,111}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3402, 0, cHJvZChsaXQoImJvb2xlYW4iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3404, 0, cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {100,101,98,117,103,103,101,114}, null, null);
      builder.addAlternative(Parser.cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjaGFyIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXRjaCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb250aW51ZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJicmVhayIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmb3IiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuYXRpdmUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzaG9ydCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwYWNrYWdlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHBvcnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcm90ZWN0ZWQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBvcnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbXBsZW1lbnRzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmdW5jdGlvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkb3VibGUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzd2l0Y2giKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjYXNlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2YXIiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aGlsZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjb25zdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdXBlciIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cmFuc2llbnQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0eXBlb2YiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aGlzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvdyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ3aXRoIiksbGl0KCJhYnN0cmFjdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwdWJsaWMiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJsb25nIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzdGF0aWMiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmbG9hdCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0aHJvd3MiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWZhdWx0IildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJuZXciKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWxldGUiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnkiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJwcml2YXRlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ0cnVlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2xhdGlsZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJudWxsIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbGx5IildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJ2b2lkIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJyZXR1cm4iKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmYWxzZSIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnRlcmZhY2UiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbnN0YW5jZW9mIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbHNlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpbiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJzeW5jaHJvbml6ZWQiKV0se30p(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJpZiIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJlbnVtIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJieXRlIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJjbGFzcyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJnb3RvIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJmaW5hbCIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJleHRlbmRzIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkbyIpXSx7fSk00(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJib29sZWFuIildLHt9KQ0000(builder);
      
        _init_cHJvZChrZXl3b3JkcygiUmVzZXJ2ZWQiKSxbbGl0KCJkZWJ1Z2dlciIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Boolean {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3476, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3475, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3473, 1, cHJvZChsaXQoInNvcnQoXCJCb29sZWFuXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3472, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3477, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3474, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3480, 0, cHJvZChsaXQoInRydWUiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3482, 0, cHJvZChsaXQoImZhbHNlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJCb29sZWFuIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkJvb2xlYW5cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkJvb2xlYW4iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgidHJ1ZSIpXSx7fSk00(builder);
      
        _init_cHJvZChzb3J0KCJCb29sZWFuIiksW2xpdCgiZmFsc2UiKV0se30p(builder);
      
    }
  }
	
  protected static class SingleEscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3486, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3491, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3494, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3489, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3490, 1, cHJvZChsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3493, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3492, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpLHJhbmdlKDM5LDM5KSxyYW5nZSg5Miw5MikscmFuZ2UoOTgsOTgpLHJhbmdlKDEwMiwxMDIpLHJhbmdlKDExMCwxMTApLHJhbmdlKDExNCwxMTQpLHJhbmdlKDExNiwxMTYpLHJhbmdlKDExOCwxMTgpXSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJTaW5nbGVFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
    }
  }
	
  protected static class HexInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new CharStackNode<IConstructor>(3531, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3535, 2, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkp, new CharStackNode<IConstructor>(3532, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3530, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3538, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3540, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3543, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3539, 1, cHJvZChsaXQoInNvcnQoXCJIZXhJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDcyLDcyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3542, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3541, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkhleEludGVnZXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDQ4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OCw4OCkscmFuZ2UoMTIwLDEyMCldKSxjb25kaXRpb25hbChpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NykscmFuZ2UoNjUsNzApLHJhbmdlKDk3LDEwMildKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg2NSw5MCkscmFuZ2UoOTUsOTUpLHJhbmdlKDk3LDEyMildKSl9KV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkhleEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiSGV4SW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJIZXhJbnRlZ2VyIikpKX0p(builder);
      
    }
  }
	
  protected static class RegularExpressionBackslashSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3589, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3592, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3587, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3588, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY2LDY2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3591, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3590, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3595, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3596, 1, new int[][]{{1,9},{11,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25CYWNrc2xhc2hTZXF1ZW5jZVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkJhY2tzbGFzaFNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxLDkpLHJhbmdlKDExLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class EscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(3696, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3698, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3702, 1, cHJvZChsaXQoInNvcnQoXCJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEzLDExMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3705, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3704, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3703, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3706, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3701, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3709, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3711, 0, "CharacterEscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2NvbmRpdGlvbmFsKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW3NvcnQoIlVuaWNvZGVFc2NhcGVTZXF1ZW5jZSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiSGV4RXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZVNlcXVlbmNlIiksW2xleCgiQ2hhcmFjdGVyRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
    }
  }
	
  protected static class ExponentPart {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3720, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3719, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3717, 1, cHJvZChsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3721, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3718, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3716, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(3725, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(3724, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3732, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3731, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3729, 1, cHJvZChsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgwLDgwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3728, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3733, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3730, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFeHBvbmVudFBhcnRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXhwb25lbnRQYXJ0IikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkV4cG9uZW50UGFydCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpLHJhbmdlKDEwMSwxMDEpXSksbGV4KCJTaWduZWRJbnRlZ2VyIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkV4cG9uZW50UGFydCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIm9wdChzb3J0KFwiRXhwb25lbnRQYXJ0XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIob3B0KGxleCgiRXhwb25lbnRQYXJ0IikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class SignedInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3797, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3796, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3794, 1, cHJvZChsaXQoInNvcnQoXCJTaWduZWRJbnRlZ2VyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3793, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3798, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3795, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(3802, 0, cmVndWxhcihvcHQoXGNoYXItY2xhc3MoW3JhbmdlKDQzLDQzKSxyYW5nZSg0NSw0NSldKSkp, new CharStackNode<IConstructor>(3801, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(3806, 1, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3803, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpZ25lZEludGVnZXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2lnbmVkSW50ZWdlclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaWduZWRJbnRlZ2VyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlNpZ25lZEludGVnZXIiKSxbb3B0KFxjaGFyLWNsYXNzKFtyYW5nZSg0Myw0MykscmFuZ2UoNDUsNDUpXSkpLGNvbmRpdGlvbmFsKGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSx7XG5vdC1mb2xsb3coXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKX0pXSx7fSk00(builder);
      
    }
  }
	
  protected static class Numeric {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3831, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3838, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3837, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3834, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3839, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3836, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3835, 1, cHJvZChsaXQoInNvcnQoXCJOdW1lcmljXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3844, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiSGV4SW50ZWdlciIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJOdW1lcmljIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIk51bWVyaWNcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIk51bWVyaWMiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJOdW1lcmljIiksW2NvbmRpdGlvbmFsKGxleCgiRGVjaW1hbCIpLHtcbm90LXByZWNlZGUoXGNoYXItY2xhc3MoW3JhbmdlKDM2LDM2KSxyYW5nZSg0OCw1NykscmFuZ2UoNjUsOTApLHJhbmdlKDk1LDk1KSxyYW5nZSg5NywxMjIpXSkpfSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class start__Source {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(3854, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(3851, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3852, 1, "Source", null, null);
      builder.addAlternative(Parser.cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzdGFydChzb3J0KCJTb3VyY2UiKSksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgidG9wIixzb3J0KCJTb3VyY2UiKSksbGF5b3V0cygiTEFZT1VUTElTVCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class Param {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(3858, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3862, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,97,114,97,109,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3866, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3863, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3865, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3864, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3861, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(3879, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3876, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3875, 1, cHJvZChsaXQoInNvcnQoXCJQYXJhbVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4MCw4MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,80,97,114,97,109,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3874, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3878, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(3877, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQYXJhbSIpLFtsZXgoIklkIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlBhcmFtXCIpLFtsaXQoXCIsXCIpXSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJQYXJhbSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbSIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJQYXJhbVwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiUGFyYW0iKSkpfSk00(builder);
      
    }
  }
	
  protected static class RegularExpressionClass {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4009, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4012, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4007, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4008, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgyLDgyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTcsMTE3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMCwxMjApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDY3LDY3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4011, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4010, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4015, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4018, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4017, 1, cmVndWxhcihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DbGFzc0NoYXIiKSkp, new NonTerminalStackNode<IConstructor>(4016, 0, "RegularExpressionClassChar", null, null), false, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUmVndWxhckV4cHJlc3Npb25DbGFzc1wiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkxLDkxKV0pLFxpdGVyLXN0YXIobGV4KCJSZWd1bGFyRXhwcmVzc2lvbkNsYXNzQ2hhciIpKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class Statement {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4151, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4152, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4150, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4156, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4161, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4163, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4158, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4170, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4164, 8, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4162, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4157, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4171, 12, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4159, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4165, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4168, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiQ2FzZUNsYXVzZSIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(4166, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4167, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4155, 0, cHJvZChsaXQoInN3aXRjaCIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE5LDExOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4175, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4176, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4174, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4182, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4191, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4193, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4186, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4180, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4184, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4187, 8, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4183, 4, "Declarator", null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4194, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4192, 12, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4181, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4185, 6, "ForBinding", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(4189, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4179, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4188, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4206, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4203, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4198, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4205, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4200, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4207, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4197, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4210, 10, cmVndWxhcihlbXB0eSgpKQ0000, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4199, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4204, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4201, 4, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4214, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4213, 0, cHJvZChsaXQoImRlYnVnZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4215, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4220, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4218, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4219, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4228, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4225, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4223, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4227, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4226, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4224, 1, cHJvZChsaXQoInNvcnQoXCJTdGF0ZW1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4232, 0, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4251, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4244, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4245, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4235, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4241, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4237, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4249, 14, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4247, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4239, 4, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4243, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4250, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4242, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4236, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4240, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4248, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4238, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4246, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4264, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4254, 0, cHJvZChsaXQoImRvIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDAsMTAwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pXSx7fSk00, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4265, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4260, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4256, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4267, 12, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4258, 4, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4262, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4259, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4255, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4261, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4257, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4266, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4288, 10, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4284, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4285, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4286, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4287, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4270, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4300, 16, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4283, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4274, 4, "Declarator", null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4297, 14, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4293, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4294, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4295, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4296, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4291, 12, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4302, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4272, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4280, 6, cmVndWxhcihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSk00, new NonTerminalStackNode<IConstructor>(4276, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4277, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4278, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4279, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4299, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4282, 8, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4301, 17, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4273, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4290, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4292, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4281, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4275, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4271, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4306, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4307, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4305, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4311, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4312, 2, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4310, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4322, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4320, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4316, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4326, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4318, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4323, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4317, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4321, 6, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4319, 4, cHJvZChsaXQoImNhdGNoIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pXSx7fSk00, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4327, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4324, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4325, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4315, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4333, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4350, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4357, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4331, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4339, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4341, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4359, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4346, 8, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4342, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4343, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4344, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4345, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4338, 4, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4334, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4335, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4336, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4337, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4355, 12, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkp, new NonTerminalStackNode<IConstructor>(4351, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4352, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4353, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4354, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4358, 14, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4332, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4340, 6, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4349, 10, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4330, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4348, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4360, 16, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4367, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4366, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4364, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTdGF0ZW1lbnRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4368, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4365, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4363, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4383, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4377, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4382, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4380, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4375, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4374, 0, cHJvZChsaXQoIndoaWxlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pXSx7fSk00, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4378, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4376, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4381, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4390, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4387, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4386, 0, cHJvZChsaXQoInRocm93IiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDQsMTA0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTksMTE5KV0pXSx7fSk00, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4391, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4388, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4397, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4395, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4394, 0, cHJvZChsaXQoImJyZWFrIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNywxMDcpXSldLHt9KQ0000, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4398, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4396, 2, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4401, 0, "VarDecl", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4408, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4405, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4404, 0, cHJvZChsaXQoInJldHVybiIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKV0se30p, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4409, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4406, 2, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4416, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4425, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4414, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4419, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4412, 0, cHJvZChsaXQoImlmIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDIsMTAyKV0pXSx7fSk00, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4423, 10, cHJvZChsaXQoImVsc2UiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSldLHt9KQ0000, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4422, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4424, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4415, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4413, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4418, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4420, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4421, 8, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4432, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4430, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4435, 6, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4428, 0, cHJvZChsaXQoIndpdGgiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExOSwxMTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSldLHt9KQ0000, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4431, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4434, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4429, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4436, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4437, 8, "Statement", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4440, 0, cHJvZChsaXQoImNvbnRpbnVlIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKV0se30p, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4442, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4444, 4, cHJvZChsaXQoIjsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU5LDU5KV0pXSx7fSk00, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4441, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4443, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4447, 0, "Function", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4450, 0, cHJvZChsaXQoInsiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyMywxMjMpXSldLHt9KQ0000, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4456, 4, cHJvZChsaXQoIn0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEyNSwxMjUpXSldLHt9KQ0000, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4454, 2, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiU3RhdGVtZW50IiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(4452, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4453, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4455, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4451, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4471, 10, cHJvZChsaXQoIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4459, 0, cHJvZChsaXQoImZvciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTAyLDEwMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKV0se30p, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4470, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4473, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4463, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4466, 6, cHJvZChsaXQoImluIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pXSx7fSk00, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4461, 2, cHJvZChsaXQoIigiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pXSx7fSk00, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4468, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4472, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4462, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4467, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4460, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4465, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4476, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4480, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4478, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4479, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4477, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4483, 0, cHJvZChsaXQoInRyeSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIxLDEyMSldKV0se30p, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4487, 4, cHJvZChsaXQoImZpbmFsbHkiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEwMiwxMDIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjEsMTIxKV0pXSx7fSk00, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4485, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4489, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4486, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4488, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4484, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiU3RhdGVtZW50IikpLFtjb25kaXRpb25hbChzb3J0KCJFeHByZXNzaW9uIikse2V4Y2VwdCgiY2xhc3MiKSxleGNlcHQoImZ1bmN0aW9uIil9KSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgic3dpdGNoQ2FzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInN3aXRjaCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNvbmQiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoInsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoImNsYXVzZXMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJDYXNlQ2xhdXNlIiksW2xheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJ9IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYnJlYWtOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiYnJlYWsiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZm9ySW5EZWNsYXJhdGlvbiIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImZvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIigiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRGVjbGFyYXRvciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJGb3JCaW5kaW5nIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaWZUaGVuIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiaWYiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kIixzb3J0KCJFeHByZXNzaW9uIikpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGNvbmRpdGlvbmFsKGVtcHR5KCkse1xub3QtZm9sbG93KGxpdCgiZWxzZSIpKX0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZGVidWdnZXIiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJkZWJ1Z2dlciIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIjsiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiY29udGludWVOb0xhYmVsIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgiY29udGludWUiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU3RhdGVtZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJTdGF0ZW1lbnQiKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZW1wdHkiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2hGaW5hbGx5Iixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgidHJ5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImNhdGNoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZG9XaGlsZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImRvIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9yRG9EZWNsYXJhdGlvbnMiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIkRlY2xhcmF0b3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksXGl0ZXItc2Vwcyhzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgib3BzIixcaXRlci1zdGFyLXNlcHMoc29ydCgiRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIikiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmV0dXJuTm9FeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJyZXR1cm4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidGhyb3dOb0V4cCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRocm93IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5Q2F0Y2giLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0cnkiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiY2F0Y2giKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9yRG8iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJjb25kcyIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIkV4cHJlc3Npb24iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJvcHMiLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJFeHByZXNzaW9uIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJTdGF0ZW1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU3RhdGVtZW50XCIpKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlN0YXRlbWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgid2hpbGVEbyIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndoaWxlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgidGhyb3dFeHAiLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ0aHJvdyIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiZXhwcmVzc2lvbiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiYnJlYWtMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImJyZWFrIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgidmFyRGVjbCIsc29ydCgiU3RhdGVtZW50IikpLFtzb3J0KCJWYXJEZWNsIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgicmV0dXJuRXhwIixzb3J0KCJTdGF0ZW1lbnQiKSksW2xpdCgicmV0dXJuIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOyIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiaWZUaGVuRWxzZSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImlmIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiKCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsYWJlbCgiY29uZCIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoImVsc2UiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiU3RhdGVtZW50IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgid2l0aCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoIndpdGgiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJzY29wZSIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiY29udGludWVMYWJlbCIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoImNvbnRpbnVlIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxleCgiSWQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI7IildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiZnVuY3Rpb24iLHNvcnQoIlN0YXRlbWVudCIpKSxbc29ydCgiRnVuY3Rpb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiYmxvY2siLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJ7IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLFxpdGVyLXN0YXItc2Vwcyhzb3J0KCJTdGF0ZW1lbnQiKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpXSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgifSIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiZm9ySW4iLHNvcnQoIlN0YXRlbWVudCIpKSxbbGl0KCJmb3IiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIoIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJ2YXIiLHNvcnQoIkV4cHJlc3Npb24iKSksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiaW4iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGFiZWwoIm9iaiIsc29ydCgiRXhwcmVzc2lvbiIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIpIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgibGFiZWxlZCIsc29ydCgiU3RhdGVtZW50IikpLFtsZXgoIklkIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgidHJ5RmluYWxseSIsc29ydCgiU3RhdGVtZW50IikpLFtsaXQoInRyeSIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJTdGF0ZW1lbnQiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCJmaW5hbGx5IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLHNvcnQoIlN0YXRlbWVudCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class LHSExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(4520, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4522, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4525, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4521, 1, cHJvZChsaXQoInNvcnQoXCJMSFNFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Miw3MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,76,72,83,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4524, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4523, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4529, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMSFNFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxIU0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxIU0V4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMSFNFeHByZXNzaW9uIiksW2NvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJhcnJheSIpLGV4Y2VwdCgib2JqZWN0RGVmaW5pdGlvbiIpLGV4Y2VwdCgiYXNzaWduIil9KV0se30p(builder);
      
    }
  }
	
  protected static class Literal {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4541, 0, "String", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4543, 0, "RegularExpression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4545, 0, "Boolean", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4547, 0, "Numeric", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4549, 0, cHJvZChsaXQoIm51bGwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSldLHt9KQ0000, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4557, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4554, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4556, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4555, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4553, 1, cHJvZChsaXQoInNvcnQoXCJMaXRlcmFsXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc2LDc2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4552, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiU3RyaW5nIildLHt0YWcoImNhdGVnb3J5IigiU3RyaW5nIikpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xleCgiUmVndWxhckV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIkJvb2xlYW4iKV0se30p(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW3NvcnQoIk51bWVyaWMiKV0se3RhZygiY2F0ZWdvcnkiKCJOdW1lcmljIikpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJMaXRlcmFsIiksW2xpdCgibnVsbCIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJMaXRlcmFsIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkxpdGVyYWxcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkxpdGVyYWwiKSkpfSk00(builder);
      
    }
  }
	
  protected static class ArgExpression {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4568, 1, cHJvZChsaXQoInNvcnQoXCJBcmdFeHByZXNzaW9uXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4572, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4569, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4571, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4570, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4567, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4575, 0, "Expression", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4583, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4580, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4579, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIkFyZ0V4cHJlc3Npb25cIiksW2xpdChcIixcIildKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTEsOTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDQsNDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTMsOTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4578, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4582, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4581, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkFyZ0V4cHJlc3Npb25cIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKHNvcnQoIkFyZ0V4cHJlc3Npb24iKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJBcmdFeHByZXNzaW9uIiksW3NvcnQoIkV4cHJlc3Npb24iKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJBcmdFeHByZXNzaW9uIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgiXFxpdGVyLXN0YXItc2Vwcyhzb3J0KFwiQXJnRXhwcmVzc2lvblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyLXNlcHMoc29ydCgiQXJnRXhwcmVzc2lvbiIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
    }
  }
	
  protected static class PropertyName {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4883, 0, "Numeric", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4885, 0, "String", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4892, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4891, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4889, 1, cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eU5hbWVcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4893, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4890, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4888, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4896, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbc29ydCgiTnVtZXJpYyIpXSx7fSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJTdHJpbmciKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eU5hbWUiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlOYW1lXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eU5hbWUiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eU5hbWUiKSxbbGV4KCJJZCIpXSx7fSk00(builder);
      
    }
  }
	
  protected static class EscapeCharacter {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4900, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4902, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4910, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4907, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4905, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4909, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(4908, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4906, 1, cHJvZChsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(4913, 0, new int[][]{{48,57}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNykscmFuZ2UoMTIwLDEyMCldKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtsZXgoIlNpbmdsZUVzY2FwZUNoYXJhY3RlciIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkVzY2FwZUNoYXJhY3RlciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJFc2NhcGVDaGFyYWN0ZXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiRXNjYXBlQ2hhcmFjdGVyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkVzY2FwZUNoYXJhY3RlciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSldLHt9KQ0000(builder);
      
    }
  }
	
  protected static class CharacterEscapeSequence {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5031, 1, cHJvZChsaXQoInNvcnQoXCJDaGFyYWN0ZXJFc2NhcGVTZXF1ZW5jZVwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OSw5OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjksNjkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMywxMTMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5034, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5033, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5032, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5035, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5030, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5038, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5040, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiTm9uRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkNoYXJhY3RlckVzY2FwZVNlcXVlbmNlIiksW2xleCgiU2luZ2xlRXNjYXBlQ2hhcmFjdGVyIildLHt9KQ0000(builder);
      
    }
  }
	
  protected static class RegularExpressionChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5144, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5146, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5148, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5152, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Miw4MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE3LDExNyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY5LDY5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMjAsMTIwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTIsMTEyKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5155, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5154, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5153, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5156, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5151, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5162, 1, cHJvZChsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODIsODIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNywxMTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OSw2OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTIwLDEyMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5165, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5164, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5163, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5166, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5161, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2xhc3MiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQmFja3NsYXNoU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMSw5KSxyYW5nZSgxMSw0NikscmFuZ2UoNDgsOTApLHJhbmdlKDkzLDE2Nzc3MjE1KV0pXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlJlZ3VsYXJFeHByZXNzaW9uQ2hhciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJSZWd1bGFyRXhwcmVzc2lvbkNoYXJcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiUmVndWxhckV4cHJlc3Npb25DaGFyIikpKX0p(builder);
      
    }
  }
	
  protected static class PropertyAssignment {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5173, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5174, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5176, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5172, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5175, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5183, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5182, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5179, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5181, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5180, 1, cHJvZChsaXQoInNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5184, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5187, 0, "MethodDefinition", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5190, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5192, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5194, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5193, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5195, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5191, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyLXNlcHMoc29ydChcIlByb3BlcnR5QXNzaWdubWVudFwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NSw0NSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEyLDExMildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMSwxMjEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDksMTA5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgicHJvcGVydHkiLHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpKSxbc29ydCgiUHJvcGVydHlOYW1lIiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiOiIpLGxheW91dHMoIkxBWU9VVExJU1QiKSxzb3J0KCJFeHByZXNzaW9uIildLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUHJvcGVydHlBc3NpZ25tZW50XCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSkpfSk00(builder);
      
        _init_cHJvZChzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSxbc29ydCgiTWV0aG9kRGVmaW5pdGlvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQcm9wZXJ0eUFzc2lnbm1lbnQiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhci1zZXBzKHNvcnQoXCJQcm9wZXJ0eUFzc2lnbm1lbnRcIiksW2xpdChcIixcIildKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlByb3BlcnR5QXNzaWdubWVudCIpLFtsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCIsIiksbGF5b3V0cygiTEFZT1VUTElTVCIpXSkpKX0p(builder);
      
    }
  }
	
  protected static class Initializer {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5284, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5282, 0, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5283, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5287, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5289, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5292, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5288, 1, cHJvZChsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEyMiwxMjIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKV0se30p, new int[] {115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5291, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5290, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJJbml0aWFsaXplciIpLFtsaXQoIj0iKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksc29ydCgiRXhwcmVzc2lvbiIpXSx7fSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJJbml0aWFsaXplciIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJJbml0aWFsaXplclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiSW5pdGlhbGl6ZXIiKSkpfSk00(builder);
      
    }
  }
	
  protected static class LAYOUT {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5299, 1, cHJvZChsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzYsNzYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDY1LDY1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4OSw4OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzksNzkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg1LDg1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4NCw4NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5302, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5301, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5300, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5303, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5298, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5306, 0, "Whitespace", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5314, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5311, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5309, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5313, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5312, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5310, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Niw3NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjUsNjUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg5LDg5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3OSw3OSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODUsODUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg0LDg0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5318, 0, "Comment", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJMQVlPVVRcIikiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKGxleCgiTEFZT1VUIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIldoaXRlc3BhY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkxBWU9VVCIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJMQVlPVVRcIikpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zdGFyKGxleCgiTEFZT1VUIikpKSl9KQ0000(builder);
      
        _init_cHJvZChsZXgoIkxBWU9VVCIpLFtsZXgoIkNvbW1lbnQiKV0se30p(builder);
      
    }
  }
	
  protected static class DecimalInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5363, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5365, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5369, 1, cmVndWxhcihcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5366, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5377, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5374, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5376, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5375, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5372, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5373, 1, cHJvZChsaXQoInNvcnQoXCJEZWNpbWFsSW50ZWdlclwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOSwxMDkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OCw0OCldKV0se30p(builder);
      
        _init_cHJvZChsZXgoIkRlY2ltYWxJbnRlZ2VyIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg0OSw1NyldKSxjb25kaXRpb25hbChcaXRlci1zdGFyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkse1xub3QtZm9sbG93KFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSl9KV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIkRlY2ltYWxJbnRlZ2VyIikpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pLGxpdCgic29ydChcIkRlY2ltYWxJbnRlZ2VyXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihsZXgoIkRlY2ltYWxJbnRlZ2VyIikpKX0p(builder);
      
    }
  }
	
  protected static class VariableDeclarationNoIn {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5534, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5537, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5532, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5533, 1, cHJvZChsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Niw4NildKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5OCw5OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjgsNjgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk5LDk5KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDc4LDc4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg3Myw3MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5536, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5535, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5543, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5546, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5541, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5542, 1, cHJvZChsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksW1xjaGFyLWNsYXNzKFtyYW5nZSg5Miw5MildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDUsNDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMiwxMTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDg2LDg2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk4LDk4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2OCw2OCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAxLDEwMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTksOTkpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTExLDExMSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNzgsNzgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDczLDczKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5MSw5MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA4LDEwOCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0NCw0NCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Myw5MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5545, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5544, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5554, 0, "Id", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5558, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5564, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5561, 2, cHJvZChsaXQoIj0iKSxbXGNoYXItY2xhc3MoW3JhbmdlKDYxLDYxKV0pXSx7fSk00, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5562, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5560, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoInNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIoc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JbiIpKSxbXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKSxsaXQoIlxcaXRlci1zZXBzKHNvcnQoXCJWYXJpYWJsZURlY2xhcmF0aW9uTm9JblwiKSxbbGl0KFwiLFwiKV0pIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihcaXRlci1zZXBzKHNvcnQoIlZhcmlhYmxlRGVjbGFyYXRpb25Ob0luIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSkpfSk00(builder);
      
        _init_cHJvZChsYWJlbCgibm9uSW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiaW5pdCIsc29ydCgiVmFyaWFibGVEZWNsYXJhdGlvbk5vSW4iKSksW2xhYmVsKCJpZCIsbGV4KCJJZCIpKSxsYXlvdXRzKCJMQVlPVVRMSVNUIiksbGl0KCI9IiksbGF5b3V0cygiTEFZT1VUTElTVCIpLGxhYmVsKCJleHAiLGNvbmRpdGlvbmFsKHNvcnQoIkV4cHJlc3Npb24iKSx7ZXhjZXB0KCJpbm4iKX0pKV0se30p(builder);
      
    }
  }
	
  protected static class SingleStringChar {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5683, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5686, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5691, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5688, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5690, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5689, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5687, 1, cHJvZChsaXQoInNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpIiksW1xjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTEsMTExKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MCw0MCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDgsMTA4KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDEsMTAxKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg4Myw4MyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE2LDExNildKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA1LDEwNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTEwLDExMCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTAzLDEwMyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNjcsNjcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNCwxMDQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p, tmp);
	}
    protected static final void _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5694, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5695, 1, "EscapeSequence", null, null);
      builder.addAlternative(Parser.cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5703, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5700, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5702, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5701, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5698, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5699, 1, cHJvZChsaXQoIlxcaXRlci1zdGFyKHNvcnQoXCJTaW5nbGVTdHJpbmdDaGFyXCIpKSIpLFtcY2hhci1jbGFzcyhbcmFuZ2UoOTIsOTIpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQ1LDQ1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTUsMTE1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE0LDExNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDAsNDApXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODMsODMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwNSwxMDUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMCwxMTApXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMywxMDMpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwOCwxMDgpXSksXGNoYXItY2xhc3MoW3JhbmdlKDEwMSwxMDEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDgzLDgzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTYsMTE2KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDUsMTA1KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTAsMTEwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMDMsMTAzKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg2Nyw2NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA0LDEwNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoOTcsOTcpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDM0LDM0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg0MSw0MSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoNDEsNDEpXSldLHt9KQ0000, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDEsOSkscmFuZ2UoMTEsMzgpLHJhbmdlKDQwLDkxKSxyYW5nZSg5MywxNjc3NzIxNSldKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSIpLGxpdCgiOiIpLGl0ZXIoXGNoYXItY2xhc3MoW3JhbmdlKDQ4LDU3KV0pKSxcY2hhci1jbGFzcyhbcmFuZ2UoMCwwKV0pXSx7dGFnKCJob2xlVHlwZSIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKX0p(builder);
      
        _init_cHJvZChsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDkyLDkyKV0pLGxleCgiRXNjYXBlU2VxdWVuY2UiKV0se30p(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixsZXgoIlNpbmdsZVN0cmluZ0NoYXIiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJcXGl0ZXItc3Rhcihzb3J0KFwiU2luZ2xlU3RyaW5nQ2hhclwiKSkiKSxsaXQoIjoiKSxpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSksXGNoYXItY2xhc3MoW3JhbmdlKDAsMCldKV0se3RhZygiaG9sZVR5cGUiKFxpdGVyLXN0YXIobGV4KCJTaW5nbGVTdHJpbmdDaGFyIikpKSl9KQ0000(builder);
      
    }
  }
	
  protected static class Params {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(5947, 0, cmVndWxhcihcaXRlci1zdGFyLXNlcHMoc29ydCgiUGFyYW0iKSxbbGF5b3V0cygiTEFZT1VUTElTVCIpLGxpdCgiLCIpLGxheW91dHMoIkxBWU9VVExJU1QiKV0pKQ0000, new NonTerminalStackNode<IConstructor>(5943, 0, "Param", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(5944, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(5945, 2, cHJvZChsaXQoIiwiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDQ0LDQ0KV0pXSx7fSk00, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(5946, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000, tmp);
	}
    protected static final void _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5956, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5953, 2, cHJvZChsaXQoIjoiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDU4LDU4KV0pXSx7fSk00, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5951, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5955, 3, cmVndWxhcihpdGVyKFxjaGFyLWNsYXNzKFtyYW5nZSg0OCw1NyldKSkp, new CharStackNode<IConstructor>(5954, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5952, 1, cHJvZChsaXQoInNvcnQoXCJQYXJhbXNcIikiKSxbXGNoYXItY2xhc3MoW3JhbmdlKDExNSwxMTUpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExMSwxMTEpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNCwxMTQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDExNiwxMTYpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQwLDQwKV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgzNCwzNCldKSxcY2hhci1jbGFzcyhbcmFuZ2UoODAsODApXSksXGNoYXItY2xhc3MoW3JhbmdlKDk3LDk3KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSgxMTQsMTE0KV0pLFxjaGFyLWNsYXNzKFtyYW5nZSg5Nyw5NyldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTA5LDEwOSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMTE1LDExNSldKSxcY2hhci1jbGFzcyhbcmFuZ2UoMzQsMzQpXSksXGNoYXItY2xhc3MoW3JhbmdlKDQxLDQxKV0pXSx7fSk00, new int[] {115,111,114,116,40,34,80,97,114,97,109,115,34,41}, null, null);
      builder.addAlternative(Parser.cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_cHJvZChzb3J0KCJQYXJhbXMiKSxbbGFiZWwoImxzdCIsXGl0ZXItc3Rhci1zZXBzKHNvcnQoIlBhcmFtIiksW2xheW91dHMoIkxBWU9VVExJU1QiKSxsaXQoIiwiKSxsYXlvdXRzKCJMQVlPVVRMSVNUIildKSldLHt9KQ0000(builder);
      
        _init_cHJvZChsYWJlbCgiJE1ldGFIb2xlIixzb3J0KCJQYXJhbXMiKSksW1xjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSksbGl0KCJzb3J0KFwiUGFyYW1zXCIpIiksbGl0KCI6IiksaXRlcihcY2hhci1jbGFzcyhbcmFuZ2UoNDgsNTcpXSkpLFxjaGFyLWNsYXNzKFtyYW5nZSgwLDApXSldLHt0YWcoImhvbGVUeXBlIihzb3J0KCJQYXJhbXMiKSkpfSk00(builder);
      
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