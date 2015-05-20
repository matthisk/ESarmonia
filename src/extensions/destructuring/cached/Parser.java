package extensions.destructuring.cached;

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
    
    
    
    
    _putDontNest(result, 600, 673);
    
    _putDontNest(result, 549, 649);
    
    _putDontNest(result, 553, 689);
    
    _putDontNest(result, 553, 737);
    
    _putDontNest(result, 495, 705);
    
    _putDontNest(result, 692, 842);
    
    _putDontNest(result, 544, 772);
    
    _putDontNest(result, 537, 800);
    
    _putDontNest(result, 581, 635);
    
    _putDontNest(result, 562, 772);
    
    _putDontNest(result, 495, 642);
    
    _putDontNest(result, 571, 673);
    
    _putDontNest(result, 733, 765);
    
    _putDontNest(result, 606, 750);
    
    _putDontNest(result, 596, 807);
    
    _putDontNest(result, 527, 656);
    
    _putDontNest(result, 652, 682);
    
    _putDontNest(result, 467, 682);
    
    _putDontNest(result, 6015, 656);
    
    _putDontNest(result, 714, 842);
    
    _putDontNest(result, 495, 835);
    
    _putDontNest(result, 495, 814);
    
    _putDontNest(result, 600, 765);
    
    _putDontNest(result, 616, 821);
    
    _putDontNest(result, 577, 779);
    
    _putDontNest(result, 606, 635);
    
    _putDontNest(result, 587, 613);
    
    _putDontNest(result, 571, 765);
    
    _putDontNest(result, 645, 696);
    
    _putDontNest(result, 495, 730);
    
    _putDontNest(result, 559, 577);
    
    _putDontNest(result, 532, 758);
    
    _putDontNest(result, 508, 800);
    
    _putDontNest(result, 520, 705);
    
    _putDontNest(result, 581, 750);
    
    _putDontNest(result, 520, 730);
    
    _putDontNest(result, 491, 649);
    
    _putDontNest(result, 500, 656);
    
    _putDontNest(result, 620, 779);
    
    _putDontNest(result, 682, 758);
    
    _putDontNest(result, 520, 814);
    
    _putDontNest(result, 775, 786);
    
    _putDontNest(result, 553, 714);
    
    _putDontNest(result, 699, 807);
    
    _putDontNest(result, 520, 835);
    
    _putDontNest(result, 520, 642);
    
    _putDontNest(result, 782, 779);
    
    _putDontNest(result, 609, 807);
    
    _putDontNest(result, 838, 758);
    
    _putDontNest(result, 659, 821);
    
    _putDontNest(result, 460, 696);
    
    _putDontNest(result, 559, 807);
    
    _putDontNest(result, 638, 779);
    
    _putDontNest(result, 730, 772);
    
    _putDontNest(result, 789, 772);
    
    _putDontNest(result, 587, 793);
    
    _putDontNest(result, 587, 628);
    
    _putDontNest(result, 663, 807);
    
    _putDontNest(result, 682, 730);
    
    _putDontNest(result, 663, 714);
    
    _putDontNest(result, 549, 663);
    
    _putDontNest(result, 500, 635);
    
    _putDontNest(result, 645, 723);
    
    _putDontNest(result, 508, 613);
    
    _putDontNest(result, 559, 689);
    
    _putDontNest(result, 537, 793);
    
    _putDontNest(result, 537, 628);
    
    _putDontNest(result, 520, 758);
    
    _putDontNest(result, 682, 835);
    
    _putDontNest(result, 549, 559);
    
    _putDontNest(result, 596, 714);
    
    _putDontNest(result, 682, 814);
    
    _putDontNest(result, 527, 635);
    
    _putDontNest(result, 699, 737);
    
    _putDontNest(result, 562, 682);
    
    _putDontNest(result, 726, 842);
    
    _putDontNest(result, 532, 705);
    
    _putDontNest(result, 527, 750);
    
    _putDontNest(result, 460, 723);
    
    _putDontNest(result, 460, 620);
    
    _putDontNest(result, 673, 723);
    
    _putDontNest(result, 817, 772);
    
    _putDontNest(result, 609, 737);
    
    _putDontNest(result, 652, 772);
    
    _putDontNest(result, 460, 527);
    
    _putDontNest(result, 467, 772);
    
    _putDontNest(result, 559, 737);
    
    _putDontNest(result, 761, 765);
    
    _putDontNest(result, 577, 606);
    
    _putDontNest(result, 838, 835);
    
    _putDontNest(result, 838, 814);
    
    _putDontNest(result, 663, 737);
    
    _putDontNest(result, 508, 628);
    
    _putDontNest(result, 796, 786);
    
    _putDontNest(result, 532, 642);
    
    _putDontNest(result, 508, 793);
    
    _putDontNest(result, 656, 765);
    
    _putDontNest(result, 581, 656);
    
    _putDontNest(result, 667, 750);
    
    _putDontNest(result, 559, 714);
    
    _putDontNest(result, 609, 714);
    
    _putDontNest(result, 491, 559);
    
    _putDontNest(result, 631, 786);
    
    _putDontNest(result, 825, 807);
    
    _putDontNest(result, 596, 689);
    
    _putDontNest(result, 537, 613);
    
    _putDontNest(result, 500, 750);
    
    _putDontNest(result, 754, 772);
    
    _putDontNest(result, 620, 606);
    
    _putDontNest(result, 699, 714);
    
    _putDontNest(result, 553, 807);
    
    _putDontNest(result, 495, 508);
    
    _putDontNest(result, 467, 491);
    
    _putDontNest(result, 596, 737);
    
    _putDontNest(result, 577, 596);
    
    _putDontNest(result, 656, 673);
    
    _putDontNest(result, 495, 758);
    
    _putDontNest(result, 544, 682);
    
    _putDontNest(result, 750, 765);
    
    _putDontNest(result, 663, 689);
    
    _putDontNest(result, 682, 705);
    
    _putDontNest(result, 587, 800);
    
    _putDontNest(result, 606, 656);
    
    _putDontNest(result, 532, 730);
    
    _putDontNest(result, 491, 663);
    
    _putDontNest(result, 609, 689);
    
    _putDontNest(result, 532, 814);
    
    _putDontNest(result, 532, 835);
    
    _putDontNest(result, 673, 765);
    
    _putDontNest(result, 460, 765);
    
    _putDontNest(result, 467, 642);
    
    _putDontNest(result, 537, 587);
    
    _putDontNest(result, 754, 835);
    
    _putDontNest(result, 754, 814);
    
    _putDontNest(result, 659, 737);
    
    _putDontNest(result, 520, 682);
    
    _putDontNest(result, 708, 750);
    
    _putDontNest(result, 460, 520);
    
    _putDontNest(result, 508, 587);
    
    _putDontNest(result, 562, 758);
    
    _putDontNest(result, 642, 635);
    
    _putDontNest(result, 476, 750);
    
    _putDontNest(result, 467, 835);
    
    _putDontNest(result, 467, 814);
    
    _putDontNest(result, 587, 786);
    
    _putDontNest(result, 652, 835);
    
    _putDontNest(result, 656, 723);
    
    _putDontNest(result, 652, 814);
    
    _putDontNest(result, 789, 758);
    
    _putDontNest(result, 652, 730);
    
    _putDontNest(result, 616, 689);
    
    _putDontNest(result, 730, 758);
    
    _putDontNest(result, 467, 730);
    
    _putDontNest(result, 838, 772);
    
    _putDontNest(result, 659, 714);
    
    _putDontNest(result, 652, 705);
    
    _putDontNest(result, 817, 835);
    
    _putDontNest(result, 635, 663);
    
    _putDontNest(result, 817, 814);
    
    _putDontNest(result, 467, 705);
    
    _putDontNest(result, 726, 779);
    
    _putDontNest(result, 825, 821);
    
    _putDontNest(result, 544, 758);
    
    _putDontNest(result, 495, 682);
    
    _putDontNest(result, 645, 673);
    
    _putDontNest(result, 775, 793);
    
    _putDontNest(result, 682, 772);
    
    _putDontNest(result, 600, 696);
    
    _putDontNest(result, 553, 821);
    
    _putDontNest(result, 571, 696);
    
    _putDontNest(result, 645, 765);
    
    _putDontNest(result, 616, 737);
    
    _putDontNest(result, 652, 642);
    
    _putDontNest(result, 532, 772);
    
    _putDontNest(result, 796, 800);
    
    _putDontNest(result, 476, 635);
    
    _putDontNest(result, 642, 750);
    
    _putDontNest(result, 659, 689);
    
    _putDontNest(result, 628, 649);
    
    _putDontNest(result, 616, 714);
    
    _putDontNest(result, 631, 800);
    
    _putDontNest(result, 460, 673);
    
    _putDontNest(result, 508, 568);
    
    _putDontNest(result, 609, 821);
    
    _putDontNest(result, 635, 649);
    
    _putDontNest(result, 467, 758);
    
    _putDontNest(result, 520, 772);
    
    _putDontNest(result, 600, 723);
    
    _putDontNest(result, 616, 807);
    
    _putDontNest(result, 476, 656);
    
    _putDontNest(result, 746, 750);
    
    _putDontNest(result, 6051, 656);
    
    _putDontNest(result, 571, 620);
    
    _putDontNest(result, 638, 842);
    
    _putDontNest(result, 571, 723);
    
    _putDontNest(result, 495, 772);
    
    _putDontNest(result, 537, 568);
    
    _putDontNest(result, 562, 642);
    
    _putDontNest(result, 628, 663);
    
    _putDontNest(result, 699, 821);
    
    _putDontNest(result, 562, 705);
    
    _putDontNest(result, 714, 779);
    
    _putDontNest(result, 754, 758);
    
    _putDontNest(result, 532, 682);
    
    _putDontNest(result, 631, 793);
    
    _putDontNest(result, 631, 628);
    
    _putDontNest(result, 685, 750);
    
    _putDontNest(result, 659, 807);
    
    _putDontNest(result, 562, 835);
    
    _putDontNest(result, 559, 821);
    
    _putDontNest(result, 562, 814);
    
    _putDontNest(result, 577, 842);
    
    _putDontNest(result, 562, 730);
    
    _putDontNest(result, 587, 587);
    
    _putDontNest(result, 663, 821);
    
    _putDontNest(result, 796, 793);
    
    _putDontNest(result, 730, 814);
    
    _putDontNest(result, 642, 656);
    
    _putDontNest(result, 508, 786);
    
    _putDontNest(result, 730, 835);
    
    _putDontNest(result, 544, 705);
    
    _putDontNest(result, 730, 730);
    
    _putDontNest(result, 789, 835);
    
    _putDontNest(result, 652, 758);
    
    _putDontNest(result, 789, 814);
    
    _putDontNest(result, 656, 696);
    
    _putDontNest(result, 620, 842);
    
    _putDontNest(result, 467, 508);
    
    _putDontNest(result, 544, 835);
    
    _putDontNest(result, 544, 814);
    
    _putDontNest(result, 817, 758);
    
    _putDontNest(result, 544, 730);
    
    _putDontNest(result, 775, 800);
    
    _putDontNest(result, 692, 779);
    
    _putDontNest(result, 544, 642);
    
    _putDontNest(result, 782, 842);
    
    _putDontNest(result, 596, 821);
    
    _putDontNest(result, 537, 786);
    
    _putDontNest(result, 635, 682);
    
    _putDontNest(result, 649, 689);
    
    _putDontNest(result, 631, 723);
    
    _putDontNest(result, 649, 737);
    
    _putDontNest(result, 513, 737);
    
    _putDontNest(result, 761, 800);
    
    _putDontNest(result, 495, 559);
    
    _putDontNest(result, 568, 714);
    
    _putDontNest(result, 460, 786);
    
    _putDontNest(result, 733, 793);
    
    _putDontNest(result, 577, 656);
    
    _putDontNest(result, 460, 568);
    
    _putDontNest(result, 587, 765);
    
    _putDontNest(result, 513, 689);
    
    _putDontNest(result, 495, 663);
    
    _putDontNest(result, 571, 613);
    
    _putDontNest(result, 628, 772);
    
    _putDontNest(result, 613, 807);
    
    _putDontNest(result, 568, 689);
    
    _putDontNest(result, 527, 779);
    
    _putDontNest(result, 705, 807);
    
    _putDontNest(result, 645, 786);
    
    _putDontNest(result, 624, 821);
    
    _putDontNest(result, 520, 559);
    
    _putDontNest(result, 549, 758);
    
    _putDontNest(result, 810, 835);
    
    _putDontNest(result, 810, 814);
    
    _putDontNest(result, 568, 737);
    
    _putDontNest(result, 587, 673);
    
    _putDontNest(result, 606, 606);
    
    _putDontNest(result, 741, 772);
    
    _putDontNest(result, 476, 842);
    
    _putDontNest(result, 600, 793);
    
    _putDontNest(result, 600, 628);
    
    _putDontNest(result, 638, 656);
    
    _putDontNest(result, 656, 800);
    
    _putDontNest(result, 513, 714);
    
    _putDontNest(result, 708, 842);
    
    _putDontNest(result, 649, 714);
    
    _putDontNest(result, 803, 835);
    
    _putDontNest(result, 571, 628);
    
    _putDontNest(result, 803, 814);
    
    _putDontNest(result, 571, 793);
    
    _putDontNest(result, 723, 758);
    
    _putDontNest(result, 768, 821);
    
    _putDontNest(result, 460, 513);
    
    _putDontNest(result, 532, 649);
    
    _putDontNest(result, 676, 758);
    
    _putDontNest(result, 520, 663);
    
    _putDontNest(result, 620, 656);
    
    _putDontNest(result, 500, 779);
    
    _putDontNest(result, 460, 549);
    
    _putDontNest(result, 673, 786);
    
    _putDontNest(result, 750, 800);
    
    _putDontNest(result, 491, 758);
    
    _putDontNest(result, 642, 842);
    
    _putDontNest(result, 737, 814);
    
    _putDontNest(result, 737, 835);
    
    _putDontNest(result, 581, 606);
    
    _putDontNest(result, 667, 779);
    
    _putDontNest(result, 527, 606);
    
    _putDontNest(result, 635, 772);
    
    _putDontNest(result, 571, 800);
    
    _putDontNest(result, 689, 772);
    
    _putDontNest(result, 613, 689);
    
    _putDontNest(result, 649, 807);
    
    _putDontNest(result, 628, 682);
    
    _putDontNest(result, 685, 842);
    
    _putDontNest(result, 723, 835);
    
    _putDontNest(result, 723, 814);
    
    _putDontNest(result, 723, 730);
    
    _putDontNest(result, 705, 714);
    
    _putDontNest(result, 568, 577);
    
    _putDontNest(result, 590, 821);
    
    _putDontNest(result, 676, 730);
    
    _putDontNest(result, 500, 596);
    
    _putDontNest(result, 676, 835);
    
    _putDontNest(result, 676, 814);
    
    _putDontNest(result, 613, 714);
    
    _putDontNest(result, 491, 705);
    
    _putDontNest(result, 491, 730);
    
    _putDontNest(result, 656, 793);
    
    _putDontNest(result, 520, 649);
    
    _putDontNest(result, 532, 663);
    
    _putDontNest(result, 656, 628);
    
    _putDontNest(result, 491, 835);
    
    _putDontNest(result, 491, 814);
    
    _putDontNest(result, 606, 779);
    
    _putDontNest(result, 577, 635);
    
    _putDontNest(result, 600, 800);
    
    _putDontNest(result, 737, 758);
    
    _putDontNest(result, 676, 705);
    
    _putDontNest(result, 460, 537);
    
    _putDontNest(result, 513, 577);
    
    _putDontNest(result, 638, 750);
    
    _putDontNest(result, 761, 793);
    
    _putDontNest(result, 631, 696);
    
    _putDontNest(result, 508, 765);
    
    _putDontNest(result, 537, 673);
    
    _putDontNest(result, 613, 737);
    
    _putDontNest(result, 460, 587);
    
    _putDontNest(result, 549, 642);
    
    _putDontNest(result, 620, 635);
    
    _putDontNest(result, 527, 596);
    
    _putDontNest(result, 495, 649);
    
    _putDontNest(result, 705, 737);
    
    _putDontNest(result, 549, 835);
    
    _putDontNest(result, 549, 814);
    
    _putDontNest(result, 537, 765);
    
    _putDontNest(result, 500, 606);
    
    _putDontNest(result, 810, 758);
    
    _putDontNest(result, 568, 807);
    
    _putDontNest(result, 549, 730);
    
    _putDontNest(result, 620, 750);
    
    _putDontNest(result, 549, 705);
    
    _putDontNest(result, 638, 635);
    
    _putDontNest(result, 513, 807);
    
    _putDontNest(result, 696, 772);
    
    _putDontNest(result, 532, 559);
    
    _putDontNest(result, 508, 673);
    
    _putDontNest(result, 581, 779);
    
    _putDontNest(result, 803, 758);
    
    _putDontNest(result, 733, 800);
    
    _putDontNest(result, 717, 772);
    
    _putDontNest(result, 750, 793);
    
    _putDontNest(result, 491, 642);
    
    _putDontNest(result, 577, 750);
    
    _putDontNest(result, 590, 807);
    
    _putDontNest(result, 689, 730);
    
    _putDontNest(result, 628, 758);
    
    _putDontNest(result, 689, 705);
    
    _putDontNest(result, 508, 620);
    
    _putDontNest(result, 673, 793);
    
    _putDontNest(result, 568, 821);
    
    _putDontNest(result, 649, 821);
    
    _putDontNest(result, 460, 613);
    
    _putDontNest(result, 689, 835);
    
    _putDontNest(result, 692, 750);
    
    _putDontNest(result, 689, 814);
    
    _putDontNest(result, 581, 842);
    
    _putDontNest(result, 467, 559);
    
    _putDontNest(result, 733, 786);
    
    _putDontNest(result, 476, 596);
    
    _putDontNest(result, 491, 772);
    
    _putDontNest(result, 508, 723);
    
    _putDontNest(result, 460, 793);
    
    _putDontNest(result, 460, 628);
    
    _putDontNest(result, 714, 750);
    
    _putDontNest(result, 635, 642);
    
    _putDontNest(result, 685, 779);
    
    _putDontNest(result, 676, 772);
    
    _putDontNest(result, 624, 689);
    
    _putDontNest(result, 587, 696);
    
    _putDontNest(result, 635, 730);
    
    _putDontNest(result, 537, 723);
    
    _putDontNest(result, 624, 737);
    
    _putDontNest(result, 723, 772);
    
    _putDontNest(result, 537, 620);
    
    _putDontNest(result, 635, 835);
    
    _putDontNest(result, 635, 814);
    
    _putDontNest(result, 717, 835);
    
    _putDontNest(result, 717, 814);
    
    _putDontNest(result, 606, 842);
    
    _putDontNest(result, 513, 821);
    
    _putDontNest(result, 571, 786);
    
    _putDontNest(result, 635, 705);
    
    _putDontNest(result, 652, 663);
    
    _putDontNest(result, 717, 730);
    
    _putDontNest(result, 467, 663);
    
    _putDontNest(result, 544, 649);
    
    _putDontNest(result, 600, 786);
    
    _putDontNest(result, 696, 730);
    
    _putDontNest(result, 741, 758);
    
    _putDontNest(result, 476, 606);
    
    _putDontNest(result, 696, 814);
    
    _putDontNest(result, 696, 835);
    
    _putDontNest(result, 775, 765);
    
    _putDontNest(result, 549, 772);
    
    _putDontNest(result, 562, 649);
    
    _putDontNest(result, 624, 714);
    
    _putDontNest(result, 645, 793);
    
    _putDontNest(result, 696, 705);
    
    _putDontNest(result, 645, 628);
    
    _putDontNest(result, 750, 786);
    
    _putDontNest(result, 696, 758);
    
    _putDontNest(result, 676, 682);
    
    _putDontNest(result, 571, 587);
    
    _putDontNest(result, 628, 642);
    
    _putDontNest(result, 491, 682);
    
    _putDontNest(result, 628, 730);
    
    _putDontNest(result, 628, 705);
    
    _putDontNest(result, 796, 765);
    
    _putDontNest(result, 761, 786);
    
    _putDontNest(result, 613, 821);
    
    _putDontNest(result, 590, 714);
    
    _putDontNest(result, 4956, 423);
    
    _putDontNest(result, 537, 696);
    
    _putDontNest(result, 667, 842);
    
    _putDontNest(result, 803, 772);
    
    _putDontNest(result, 717, 758);
    
    _putDontNest(result, 642, 779);
    
    _putDontNest(result, 4956, 835);
    
    _putDontNest(result, 741, 835);
    
    _putDontNest(result, 562, 663);
    
    _putDontNest(result, 741, 814);
    
    _putDontNest(result, 590, 689);
    
    _putDontNest(result, 810, 772);
    
    _putDontNest(result, 768, 807);
    
    _putDontNest(result, 527, 842);
    
    _putDontNest(result, 726, 750);
    
    _putDontNest(result, 544, 559);
    
    _putDontNest(result, 689, 758);
    
    _putDontNest(result, 645, 800);
    
    _putDontNest(result, 590, 737);
    
    _putDontNest(result, 628, 814);
    
    _putDontNest(result, 628, 835);
    
    _putDontNest(result, 737, 772);
    
    _putDontNest(result, 708, 779);
    
    _putDontNest(result, 587, 723);
    
    _putDontNest(result, 656, 786);
    
    _putDontNest(result, 476, 779);
    
    _putDontNest(result, 549, 682);
    
    _putDontNest(result, 587, 620);
    
    _putDontNest(result, 631, 765);
    
    _putDontNest(result, 508, 696);
    
    _putDontNest(result, 705, 821);
    
    _putDontNest(result, 624, 807);
    
    _putDontNest(result, 635, 758);
    
    _putDontNest(result, 467, 649);
    
    _putDontNest(result, 673, 800);
    
    _putDontNest(result, 544, 663);
    
    _putDontNest(result, 460, 800);
    
    _putDontNest(result, 500, 842);
    
    _putDontNest(result, 652, 649);
    
    _putDontNest(result, 631, 673);
    
    _putDontNest(result, 624, 682);
    
    _putDontNest(result, 553, 663);
    
    _putDontNest(result, 495, 544);
    
    _putDontNest(result, 491, 807);
    
    _putDontNest(result, 508, 635);
    
    _putDontNest(result, 508, 750);
    
    _putDontNest(result, 635, 821);
    
    _putDontNest(result, 705, 758);
    
    _putDontNest(result, 568, 835);
    
    _putDontNest(result, 568, 814);
    
    _putDontNest(result, 692, 723);
    
    _putDontNest(result, 513, 705);
    
    _putDontNest(result, 568, 730);
    
    _putDontNest(result, 549, 807);
    
    _putDontNest(result, 500, 793);
    
    _putDontNest(result, 476, 537);
    
    _putDontNest(result, 500, 628);
    
    _putDontNest(result, 649, 705);
    
    _putDontNest(result, 685, 786);
    
    _putDontNest(result, 733, 779);
    
    _putDontNest(result, 568, 705);
    
    _putDontNest(result, 513, 730);
    
    _putDontNest(result, 577, 673);
    
    _putDontNest(result, 667, 793);
    
    _putDontNest(result, 649, 730);
    
    _putDontNest(result, 649, 835);
    
    _putDontNest(result, 491, 577);
    
    _putDontNest(result, 649, 814);
    
    _putDontNest(result, 513, 814);
    
    _putDontNest(result, 513, 835);
    
    _putDontNest(result, 717, 821);
    
    _putDontNest(result, 571, 779);
    
    _putDontNest(result, 577, 765);
    
    _putDontNest(result, 513, 642);
    
    _putDontNest(result, 596, 649);
    
    _putDontNest(result, 600, 779);
    
    _putDontNest(result, 606, 800);
    
    _putDontNest(result, 649, 642);
    
    _putDontNest(result, 587, 656);
    
    _putDontNest(result, 568, 642);
    
    _putDontNest(result, 613, 758);
    
    _putDontNest(result, 527, 613);
    
    _putDontNest(result, 590, 772);
    
    _putDontNest(result, 549, 577);
    
    _putDontNest(result, 676, 807);
    
    _putDontNest(result, 689, 821);
    
    _putDontNest(result, 620, 765);
    
    _putDontNest(result, 537, 750);
    
    _putDontNest(result, 500, 613);
    
    _putDontNest(result, 638, 673);
    
    _putDontNest(result, 737, 737);
    
    _putDontNest(result, 476, 587);
    
    _putDontNest(result, 696, 821);
    
    _putDontNest(result, 581, 800);
    
    _putDontNest(result, 638, 765);
    
    _putDontNest(result, 609, 649);
    
    _putDontNest(result, 620, 673);
    
    _putDontNest(result, 559, 649);
    
    _putDontNest(result, 782, 765);
    
    _putDontNest(result, 723, 807);
    
    _putDontNest(result, 537, 635);
    
    _putDontNest(result, 663, 649);
    
    _putDontNest(result, 527, 793);
    
    _putDontNest(result, 527, 628);
    
    _putDontNest(result, 714, 723);
    
    _putDontNest(result, 737, 807);
    
    _putDontNest(result, 663, 663);
    
    _putDontNest(result, 645, 842);
    
    _putDontNest(result, 768, 772);
    
    _putDontNest(result, 476, 549);
    
    _putDontNest(result, 553, 649);
    
    _putDontNest(result, 750, 779);
    
    _putDontNest(result, 628, 821);
    
    _putDontNest(result, 606, 613);
    
    _putDontNest(result, 491, 737);
    
    _putDontNest(result, 587, 635);
    
    _putDontNest(result, 581, 628);
    
    _putDontNest(result, 581, 793);
    
    _putDontNest(result, 559, 663);
    
    _putDontNest(result, 741, 821);
    
    _putDontNest(result, 590, 682);
    
    _putDontNest(result, 587, 750);
    
    _putDontNest(result, 609, 663);
    
    _putDontNest(result, 571, 606);
    
    _putDontNest(result, 803, 807);
    
    _putDontNest(result, 761, 779);
    
    _putDontNest(result, 491, 689);
    
    _putDontNest(result, 476, 568);
    
    _putDontNest(result, 549, 714);
    
    _putDontNest(result, 676, 689);
    
    _putDontNest(result, 624, 772);
    
    _putDontNest(result, 723, 737);
    
    _putDontNest(result, 537, 656);
    
    _putDontNest(result, 810, 807);
    
    _putDontNest(result, 705, 730);
    
    _putDontNest(result, 705, 835);
    
    _putDontNest(result, 705, 814);
    
    _putDontNest(result, 549, 737);
    
    _putDontNest(result, 613, 642);
    
    _putDontNest(result, 568, 758);
    
    _putDontNest(result, 606, 793);
    
    _putDontNest(result, 606, 628);
    
    _putDontNest(result, 649, 758);
    
    _putDontNest(result, 692, 696);
    
    _putDontNest(result, 476, 513);
    
    _putDontNest(result, 708, 786);
    
    _putDontNest(result, 513, 758);
    
    _putDontNest(result, 581, 613);
    
    _putDontNest(result, 476, 786);
    
    _putDontNest(result, 656, 779);
    
    _putDontNest(result, 642, 786);
    
    _putDontNest(result, 508, 656);
    
    _putDontNest(result, 559, 559);
    
    _putDontNest(result, 667, 800);
    
    _putDontNest(result, 571, 596);
    
    _putDontNest(result, 491, 714);
    
    _putDontNest(result, 613, 705);
    
    _putDontNest(result, 549, 689);
    
    _putDontNest(result, 500, 800);
    
    _putDontNest(result, 460, 842);
    
    _putDontNest(result, 613, 730);
    
    _putDontNest(result, 673, 842);
    
    _putDontNest(result, 613, 835);
    
    _putDontNest(result, 613, 814);
    
    _putDontNest(result, 676, 714);
    
    _putDontNest(result, 596, 663);
    
    _putDontNest(result, 676, 737);
    
    _putDontNest(result, 527, 800);
    
    _putDontNest(result, 750, 842);
    
    _putDontNest(result, 635, 737);
    
    _putDontNest(result, 696, 714);
    
    _putDontNest(result, 761, 842);
    
    _putDontNest(result, 616, 663);
    
    _putDontNest(result, 568, 682);
    
    _putDontNest(result, 513, 682);
    
    _putDontNest(result, 624, 642);
    
    _putDontNest(result, 631, 635);
    
    _putDontNest(result, 737, 821);
    
    _putDontNest(result, 476, 800);
    
    _putDontNest(result, 696, 737);
    
    _putDontNest(result, 803, 821);
    
    _putDontNest(result, 741, 807);
    
    _putDontNest(result, 659, 663);
    
    _putDontNest(result, 527, 568);
    
    _putDontNest(result, 667, 786);
    
    _putDontNest(result, 642, 800);
    
    _putDontNest(result, 500, 786);
    
    _putDontNest(result, 631, 750);
    
    _putDontNest(result, 685, 793);
    
    _putDontNest(result, 768, 835);
    
    _putDontNest(result, 768, 814);
    
    _putDontNest(result, 500, 549);
    
    _putDontNest(result, 638, 696);
    
    _putDontNest(result, 635, 714);
    
    _putDontNest(result, 460, 779);
    
    _putDontNest(result, 500, 513);
    
    _putDontNest(result, 705, 772);
    
    _putDontNest(result, 673, 779);
    
    _putDontNest(result, 810, 821);
    
    _putDontNest(result, 624, 730);
    
    _putDontNest(result, 527, 786);
    
    _putDontNest(result, 726, 765);
    
    _putDontNest(result, 467, 544);
    
    _putDontNest(result, 624, 835);
    
    _putDontNest(result, 624, 814);
    
    _putDontNest(result, 500, 568);
    
    _putDontNest(result, 624, 705);
    
    _putDontNest(result, 717, 737);
    
    _putDontNest(result, 649, 682);
    
    _putDontNest(result, 577, 696);
    
    _putDontNest(result, 645, 779);
    
    _putDontNest(result, 689, 714);
    
    _putDontNest(result, 635, 689);
    
    _putDontNest(result, 689, 737);
    
    _putDontNest(result, 590, 758);
    
    _putDontNest(result, 628, 807);
    
    _putDontNest(result, 613, 772);
    
    _putDontNest(result, 620, 696);
    
    _putDontNest(result, 708, 800);
    
    _putDontNest(result, 656, 842);
    
    _putDontNest(result, 692, 673);
    
    _putDontNest(result, 733, 842);
    
    _putDontNest(result, 590, 705);
    
    _putDontNest(result, 692, 765);
    
    _putDontNest(result, 500, 587);
    
    _putDontNest(result, 549, 821);
    
    _putDontNest(result, 613, 682);
    
    _putDontNest(result, 717, 807);
    
    _putDontNest(result, 577, 620);
    
    _putDontNest(result, 581, 786);
    
    _putDontNest(result, 616, 649);
    
    _putDontNest(result, 628, 714);
    
    _putDontNest(result, 460, 606);
    
    _putDontNest(result, 631, 656);
    
    _putDontNest(result, 689, 807);
    
    _putDontNest(result, 620, 723);
    
    _putDontNest(result, 590, 730);
    
    _putDontNest(result, 676, 821);
    
    _putDontNest(result, 620, 620);
    
    _putDontNest(result, 590, 814);
    
    _putDontNest(result, 590, 835);
    
    _putDontNest(result, 628, 737);
    
    _putDontNest(result, 685, 800);
    
    _putDontNest(result, 491, 821);
    
    _putDontNest(result, 642, 628);
    
    _putDontNest(result, 642, 793);
    
    _putDontNest(result, 600, 842);
    
    _putDontNest(result, 696, 807);
    
    _putDontNest(result, 476, 628);
    
    _putDontNest(result, 500, 537);
    
    _putDontNest(result, 476, 793);
    
    _putDontNest(result, 708, 793);
    
    _putDontNest(result, 513, 772);
    
    _putDontNest(result, 606, 786);
    
    _putDontNest(result, 649, 772);
    
    _putDontNest(result, 571, 842);
    
    _putDontNest(result, 638, 723);
    
    _putDontNest(result, 659, 649);
    
    _putDontNest(result, 568, 772);
    
    _putDontNest(result, 628, 689);
    
    _putDontNest(result, 460, 596);
    
    _putDontNest(result, 527, 587);
    
    _putDontNest(result, 714, 765);
    
    _putDontNest(result, 590, 642);
    
    _putDontNest(result, 768, 758);
    
    _putDontNest(result, 723, 821);
    
    _putDontNest(result, 635, 807);
    
    _putDontNest(result, 624, 758);
    
    _putDontNest(result, 476, 613);
    
    _putDontNest(result, 577, 723);
    
    _putDontNest(result, 553, 730);
    
    _putDontNest(result, 467, 821);
    
    _putDontNest(result, 754, 821);
    
    _putDontNest(result, 663, 758);
    
    _putDontNest(result, 656, 635);
    
    _putDontNest(result, 495, 714);
    
    _putDontNest(result, 782, 793);
    
    _putDontNest(result, 726, 786);
    
    _putDontNest(result, 476, 527);
    
    _putDontNest(result, 553, 814);
    
    _putDontNest(result, 527, 765);
    
    _putDontNest(result, 553, 835);
    
    _putDontNest(result, 596, 758);
    
    _putDontNest(result, 520, 714);
    
    _putDontNest(result, 577, 613);
    
    _putDontNest(result, 587, 779);
    
    _putDontNest(result, 613, 649);
    
    _putDontNest(result, 476, 723);
    
    _putDontNest(result, 476, 620);
    
    _putDontNest(result, 685, 696);
    
    _putDontNest(result, 600, 656);
    
    _putDontNest(result, 495, 737);
    
    _putDontNest(result, 708, 723);
    
    _putDontNest(result, 571, 656);
    
    _putDontNest(result, 508, 596);
    
    _putDontNest(result, 553, 705);
    
    _putDontNest(result, 638, 628);
    
    _putDontNest(result, 638, 793);
    
    _putDontNest(result, 495, 689);
    
    _putDontNest(result, 513, 663);
    
    _putDontNest(result, 796, 842);
    
    _putDontNest(result, 642, 723);
    
    _putDontNest(result, 649, 663);
    
    _putDontNest(result, 532, 577);
    
    _putDontNest(result, 652, 821);
    
    _putDontNest(result, 620, 793);
    
    _putDontNest(result, 825, 423);
    
    _putDontNest(result, 620, 628);
    
    _putDontNest(result, 537, 596);
    
    _putDontNest(result, 616, 682);
    
    _putDontNest(result, 375, 28);
    
    _putDontNest(result, 825, 835);
    
    _putDontNest(result, 568, 663);
    
    _putDontNest(result, 825, 814);
    
    _putDontNest(result, 553, 642);
    
    _putDontNest(result, 527, 673);
    
    _putDontNest(result, 817, 821);
    
    _putDontNest(result, 520, 689);
    
    _putDontNest(result, 631, 842);
    
    _putDontNest(result, 500, 673);
    
    _putDontNest(result, 467, 532);
    
    _putDontNest(result, 609, 758);
    
    _putDontNest(result, 577, 628);
    
    _putDontNest(result, 577, 793);
    
    _putDontNest(result, 838, 807);
    
    _putDontNest(result, 667, 673);
    
    _putDontNest(result, 559, 758);
    
    _putDontNest(result, 508, 606);
    
    _putDontNest(result, 532, 807);
    
    _putDontNest(result, 667, 765);
    
    _putDontNest(result, 513, 559);
    
    _putDontNest(result, 500, 520);
    
    _putDontNest(result, 656, 750);
    
    _putDontNest(result, 568, 559);
    
    _putDontNest(result, 620, 613);
    
    _putDontNest(result, 659, 682);
    
    _putDontNest(result, 520, 737);
    
    _putDontNest(result, 500, 765);
    
    _putDontNest(result, 537, 606);
    
    _putDontNest(result, 682, 807);
    
    _putDontNest(result, 699, 758);
    
    _putDontNest(result, 609, 730);
    
    _putDontNest(result, 714, 786);
    
    _putDontNest(result, 699, 730);
    
    _putDontNest(result, 682, 737);
    
    _putDontNest(result, 692, 786);
    
    _putDontNest(result, 495, 807);
    
    _putDontNest(result, 663, 705);
    
    _putDontNest(result, 559, 705);
    
    _putDontNest(result, 609, 705);
    
    _putDontNest(result, 663, 835);
    
    _putDontNest(result, 559, 730);
    
    _putDontNest(result, 587, 606);
    
    _putDontNest(result, 571, 750);
    
    _putDontNest(result, 606, 673);
    
    _putDontNest(result, 663, 814);
    
    _putDontNest(result, 495, 577);
    
    _putDontNest(result, 609, 835);
    
    _putDontNest(result, 609, 814);
    
    _putDontNest(result, 532, 689);
    
    _putDontNest(result, 600, 750);
    
    _putDontNest(result, 559, 835);
    
    _putDontNest(result, 663, 730);
    
    _putDontNest(result, 562, 821);
    
    _putDontNest(result, 559, 814);
    
    _putDontNest(result, 532, 737);
    
    _putDontNest(result, 699, 705);
    
    _putDontNest(result, 663, 642);
    
    _putDontNest(result, 606, 765);
    
    _putDontNest(result, 571, 635);
    
    _putDontNest(result, 733, 750);
    
    _putDontNest(result, 4956, 371);
    
    _putDontNest(result, 600, 635);
    
    _putDontNest(result, 559, 642);
    
    _putDontNest(result, 577, 800);
    
    _putDontNest(result, 609, 642);
    
    _putDontNest(result, 616, 772);
    
    _putDontNest(result, 520, 807);
    
    _putDontNest(result, 699, 814);
    
    _putDontNest(result, 699, 835);
    
    _putDontNest(result, 685, 723);
    
    _putDontNest(result, 596, 814);
    
    _putDontNest(result, 682, 714);
    
    _putDontNest(result, 596, 835);
    
    _putDontNest(result, 553, 758);
    
    _putDontNest(result, 775, 842);
    
    _putDontNest(result, 613, 663);
    
    _putDontNest(result, 476, 696);
    
    _putDontNest(result, 620, 800);
    
    _putDontNest(result, 596, 730);
    
    _putDontNest(result, 596, 705);
    
    _putDontNest(result, 581, 673);
    
    _putDontNest(result, 508, 779);
    
    _putDontNest(result, 532, 714);
    
    _putDontNest(result, 587, 596);
    
    _putDontNest(result, 638, 800);
    
    _putDontNest(result, 789, 821);
    
    _putDontNest(result, 581, 765);
    
    _putDontNest(result, 656, 656);
    
    _putDontNest(result, 659, 772);
    
    _putDontNest(result, 568, 649);
    
    _putDontNest(result, 730, 821);
    
    _putDontNest(result, 825, 758);
    
    _putDontNest(result, 649, 649);
    
    _putDontNest(result, 642, 696);
    
    _putDontNest(result, 596, 642);
    
    _putDontNest(result, 513, 649);
    
    _putDontNest(result, 537, 779);
    
    _putDontNest(result, 544, 821);
    
    _putDontNest(result, 520, 577);
    
    _putDontNest(result, 782, 800);
    
    _putDontNest(result, 606, 620);
    
    _putDontNest(result, 500, 696);
    
    _putDontNest(result, 659, 642);
    
    _putDontNest(result, 699, 772);
    
    _putDontNest(result, 685, 765);
    
    _putDontNest(result, 645, 656);
    
    _putDontNest(result, 616, 705);
    
    _putDontNest(result, 467, 689);
    
    _putDontNest(result, 495, 821);
    
    _putDontNest(result, 581, 620);
    
    _putDontNest(result, 544, 807);
    
    _putDontNest(result, 652, 714);
    
    _putDontNest(result, 508, 842);
    
    _putDontNest(result, 638, 786);
    
    _putDontNest(result, 590, 649);
    
    _putDontNest(result, 606, 723);
    
    _putDontNest(result, 537, 842);
    
    _putDontNest(result, 520, 821);
    
    _putDontNest(result, 667, 696);
    
    _putDontNest(result, 544, 577);
    
    _putDontNest(result, 596, 772);
    
    _putDontNest(result, 726, 793);
    
    _putDontNest(result, 782, 786);
    
    _putDontNest(result, 495, 532);
    
    _putDontNest(result, 652, 689);
    
    _putDontNest(result, 616, 730);
    
    _putDontNest(result, 616, 835);
    
    _putDontNest(result, 616, 814);
    
    _putDontNest(result, 527, 696);
    
    _putDontNest(result, 663, 772);
    
    _putDontNest(result, 789, 807);
    
    _putDontNest(result, 581, 723);
    
    _putDontNest(result, 553, 682);
    
    _putDontNest(result, 467, 737);
    
    _putDontNest(result, 559, 772);
    
    _putDontNest(result, 730, 807);
    
    _putDontNest(result, 577, 786);
    
    _putDontNest(result, 652, 737);
    
    _putDontNest(result, 609, 772);
    
    _putDontNest(result, 616, 642);
    
    _putDontNest(result, 685, 673);
    
    _putDontNest(result, 624, 663);
    
    _putDontNest(result, 714, 800);
    
    _putDontNest(result, 577, 568);
    
    _putDontNest(result, 460, 656);
    
    _putDontNest(result, 775, 779);
    
    _putDontNest(result, 692, 800);
    
    _putDontNest(result, 620, 786);
    
    _putDontNest(result, 659, 705);
    
    _putDontNest(result, 659, 730);
    
    _putDontNest(result, 467, 714);
    
    _putDontNest(result, 562, 807);
    
    _putDontNest(result, 659, 814);
    
    _putDontNest(result, 659, 835);
    
    _putDontNest(result, 581, 696);
    
    _putDontNest(result, 544, 737);
    
    _putDontNest(result, 754, 807);
    
    _putDontNest(result, 825, 772);
    
    _putDontNest(result, 659, 758);
    
    _putDontNest(result, 796, 779);
    
    _putDontNest(result, 500, 527);
    
    _putDontNest(result, 559, 682);
    
    _putDontNest(result, 616, 758);
    
    _putDontNest(result, 708, 765);
    
    _putDontNest(result, 817, 807);
    
    _putDontNest(result, 460, 635);
    
    _putDontNest(result, 544, 714);
    
    _putDontNest(result, 726, 800);
    
    _putDontNest(result, 645, 750);
    
    _putDontNest(result, 577, 587);
    
    _putDontNest(result, 838, 821);
    
    _putDontNest(result, 562, 737);
    
    _putDontNest(result, 587, 842);
    
    _putDontNest(result, 562, 689);
    
    _putDontNest(result, 467, 577);
    
    _putDontNest(result, 532, 821);
    
    _putDontNest(result, 667, 723);
    
    _putDontNest(result, 645, 635);
    
    _putDontNest(result, 590, 663);
    
    _putDontNest(result, 609, 682);
    
    _putDontNest(result, 692, 793);
    
    _putDontNest(result, 606, 696);
    
    _putDontNest(result, 682, 821);
    
    _putDontNest(result, 500, 620);
    
    _putDontNest(result, 663, 682);
    
    _putDontNest(result, 553, 772);
    
    _putDontNest(result, 500, 723);
    
    _putDontNest(result, 476, 520);
    
    _putDontNest(result, 631, 779);
    
    _putDontNest(result, 544, 689);
    
    _putDontNest(result, 527, 620);
    
    _putDontNest(result, 673, 750);
    
    _putDontNest(result, 527, 723);
    
    _putDontNest(result, 714, 793);
    
    _putDontNest(result, 460, 750);
    
    _putDontNest(result, 642, 673);
    
    _putDontNest(result, 476, 765);
    
    _putDontNest(result, 642, 765);
    
    _putDontNest(result, 476, 673);
    
    _putDontNest(result, 624, 649);
    
    _putDontNest(result, 562, 714);
    
    _putDontNest(result, 467, 807);
    
    _putDontNest(result, 730, 737);
    
    _putDontNest(result, 596, 682);
    
    _putDontNest(result, 652, 807);
    
    _putDontNest(result, 467, 606);
    
    _putDontNest(result, 559, 786);
    
    _putDontNest(result, 590, 765);
    
    _putDontNest(result, 714, 730);
    
    _putDontNest(result, 635, 635);
    
    _putDontNest(result, 562, 779);
    
    _putDontNest(result, 495, 842);
    
    _putDontNest(result, 476, 559);
    
    _putDontNest(result, 513, 723);
    
    _putDontNest(result, 692, 705);
    
    _putDontNest(result, 692, 730);
    
    _putDontNest(result, 568, 620);
    
    _putDontNest(result, 559, 568);
    
    _putDontNest(result, 508, 821);
    
    _putDontNest(result, 696, 750);
    
    _putDontNest(result, 663, 786);
    
    _putDontNest(result, 717, 750);
    
    _putDontNest(result, 577, 772);
    
    _putDontNest(result, 609, 786);
    
    _putDontNest(result, 616, 800);
    
    _putDontNest(result, 4956, 446);
    
    _putDontNest(result, 631, 714);
    
    _putDontNest(result, 628, 656);
    
    _putDontNest(result, 635, 750);
    
    _putDontNest(result, 699, 786);
    
    _putDontNest(result, 590, 673);
    
    _putDontNest(result, 775, 807);
    
    _putDontNest(result, 714, 814);
    
    _putDontNest(result, 553, 587);
    
    _putDontNest(result, 714, 835);
    
    _putDontNest(result, 513, 620);
    
    _putDontNest(result, 649, 723);
    
    _putDontNest(result, 642, 663);
    
    _putDontNest(result, 638, 772);
    
    _putDontNest(result, 730, 779);
    
    _putDontNest(result, 789, 779);
    
    _putDontNest(result, 659, 800);
    
    _putDontNest(result, 467, 596);
    
    _putDontNest(result, 596, 786);
    
    _putDontNest(result, 544, 779);
    
    _putDontNest(result, 520, 842);
    
    _putDontNest(result, 537, 821);
    
    _putDontNest(result, 631, 689);
    
    _putDontNest(result, 692, 814);
    
    _putDontNest(result, 692, 835);
    
    _putDontNest(result, 689, 750);
    
    _putDontNest(result, 568, 723);
    
    _putDontNest(result, 782, 772);
    
    _putDontNest(result, 726, 758);
    
    _putDontNest(result, 631, 737);
    
    _putDontNest(result, 620, 772);
    
    _putDontNest(result, 613, 696);
    
    _putDontNest(result, 476, 663);
    
    _putDontNest(result, 544, 596);
    
    _putDontNest(result, 741, 750);
    
    _putDontNest(result, 587, 821);
    
    _putDontNest(result, 796, 807);
    
    _putDontNest(result, 544, 606);
    
    _putDontNest(result, 638, 682);
    
    _putDontNest(result, 768, 765);
    
    _putDontNest(result, 620, 682);
    
    _putDontNest(result, 562, 596);
    
    _putDontNest(result, 652, 779);
    
    _putDontNest(result, 568, 696);
    
    _putDontNest(result, 624, 765);
    
    _putDontNest(result, 635, 656);
    
    _putDontNest(result, 513, 696);
    
    _putDontNest(result, 628, 750);
    
    _putDontNest(result, 705, 723);
    
    _putDontNest(result, 817, 779);
    
    _putDontNest(result, 649, 696);
    
    _putDontNest(result, 577, 682);
    
    _putDontNest(result, 642, 649);
    
    _putDontNest(result, 692, 758);
    
    _putDontNest(result, 726, 814);
    
    _putDontNest(result, 726, 835);
    
    _putDontNest(result, 682, 842);
    
    _putDontNest(result, 553, 786);
    
    _putDontNest(result, 476, 649);
    
    _putDontNest(result, 613, 723);
    
    _putDontNest(result, 624, 673);
    
    _putDontNest(result, 628, 635);
    
    _putDontNest(result, 613, 620);
    
    _putDontNest(result, 825, 786);
    
    _putDontNest(result, 631, 807);
    
    _putDontNest(result, 659, 628);
    
    _putDontNest(result, 838, 842);
    
    _putDontNest(result, 659, 793);
    
    _putDontNest(result, 559, 587);
    
    _putDontNest(result, 562, 606);
    
    _putDontNest(result, 596, 587);
    
    _putDontNest(result, 754, 779);
    
    _putDontNest(result, 714, 758);
    
    _putDontNest(result, 460, 544);
    
    _putDontNest(result, 616, 793);
    
    _putDontNest(result, 616, 628);
    
    _putDontNest(result, 467, 779);
    
    _putDontNest(result, 532, 842);
    
    _putDontNest(result, 508, 714);
    
    _putDontNest(result, 682, 779);
    
    _putDontNest(result, 817, 842);
    
    _putDontNest(result, 553, 800);
    
    _putDontNest(result, 495, 606);
    
    _putDontNest(result, 559, 613);
    
    _putDontNest(result, 838, 779);
    
    _putDontNest(result, 638, 758);
    
    _putDontNest(result, 508, 689);
    
    _putDontNest(result, 613, 765);
    
    _putDontNest(result, 754, 842);
    
    _putDontNest(result, 631, 821);
    
    _putDontNest(result, 537, 689);
    
    _putDontNest(result, 596, 613);
    
    _putDontNest(result, 609, 793);
    
    _putDontNest(result, 577, 758);
    
    _putDontNest(result, 609, 628);
    
    _putDontNest(result, 692, 682);
    
    _putDontNest(result, 559, 793);
    
    _putDontNest(result, 559, 628);
    
    _putDontNest(result, 663, 793);
    
    _putDontNest(result, 587, 807);
    
    _putDontNest(result, 663, 628);
    
    _putDontNest(result, 495, 596);
    
    _putDontNest(result, 508, 737);
    
    _putDontNest(result, 527, 649);
    
    _putDontNest(result, 606, 663);
    
    _putDontNest(result, 590, 696);
    
    _putDontNest(result, 491, 656);
    
    _putDontNest(result, 796, 821);
    
    _putDontNest(result, 532, 779);
    
    _putDontNest(result, 467, 842);
    
    _putDontNest(result, 652, 842);
    
    _putDontNest(result, 500, 649);
    
    _putDontNest(result, 520, 596);
    
    _putDontNest(result, 620, 758);
    
    _putDontNest(result, 782, 758);
    
    _putDontNest(result, 726, 772);
    
    _putDontNest(result, 596, 628);
    
    _putDontNest(result, 596, 793);
    
    _putDontNest(result, 537, 714);
    
    _putDontNest(result, 825, 800);
    
    _putDontNest(result, 737, 750);
    
    _putDontNest(result, 581, 663);
    
    _putDontNest(result, 613, 673);
    
    _putDontNest(result, 537, 737);
    
    _putDontNest(result, 624, 723);
    
    _putDontNest(result, 705, 765);
    
    _putDontNest(result, 549, 656);
    
    _putDontNest(result, 520, 606);
    
    _putDontNest(result, 699, 793);
    
    _putDontNest(result, 638, 730);
    
    _putDontNest(result, 581, 649);
    
    _putDontNest(result, 568, 765);
    
    _putDontNest(result, 676, 750);
    
    _putDontNest(result, 723, 750);
    
    _putDontNest(result, 527, 663);
    
    _putDontNest(result, 508, 807);
    
    _putDontNest(result, 638, 642);
    
    _putDontNest(result, 730, 842);
    
    _putDontNest(result, 775, 821);
    
    _putDontNest(result, 620, 642);
    
    _putDontNest(result, 638, 814);
    
    _putDontNest(result, 638, 835);
    
    _putDontNest(result, 508, 577);
    
    _putDontNest(result, 587, 689);
    
    _putDontNest(result, 624, 696);
    
    _putDontNest(result, 513, 765);
    
    _putDontNest(result, 649, 765);
    
    _putDontNest(result, 663, 800);
    
    _putDontNest(result, 559, 800);
    
    _putDontNest(result, 532, 606);
    
    _putDontNest(result, 491, 750);
    
    _putDontNest(result, 577, 642);
    
    _putDontNest(result, 609, 800);
    
    _putDontNest(result, 616, 786);
    
    _putDontNest(result, 500, 559);
    
    _putDontNest(result, 714, 772);
    
    _putDontNest(result, 537, 807);
    
    _putDontNest(result, 699, 800);
    
    _putDontNest(result, 553, 613);
    
    _putDontNest(result, 568, 673);
    
    _putDontNest(result, 577, 705);
    
    _putDontNest(result, 649, 673);
    
    _putDontNest(result, 495, 779);
    
    _putDontNest(result, 577, 730);
    
    _putDontNest(result, 513, 673);
    
    _putDontNest(result, 562, 842);
    
    _putDontNest(result, 587, 737);
    
    _putDontNest(result, 491, 635);
    
    _putDontNest(result, 577, 814);
    
    _putDontNest(result, 577, 835);
    
    _putDontNest(result, 532, 596);
    
    _putDontNest(result, 587, 714);
    
    _putDontNest(result, 789, 842);
    
    _putDontNest(result, 659, 786);
    
    _putDontNest(result, 620, 705);
    
    _putDontNest(result, 590, 723);
    
    _putDontNest(result, 825, 793);
    
    _putDontNest(result, 606, 649);
    
    _putDontNest(result, 590, 620);
    
    _putDontNest(result, 620, 730);
    
    _putDontNest(result, 596, 800);
    
    _putDontNest(result, 549, 750);
    
    _putDontNest(result, 620, 835);
    
    _putDontNest(result, 620, 814);
    
    _putDontNest(result, 500, 663);
    
    _putDontNest(result, 537, 577);
    
    _putDontNest(result, 544, 842);
    
    _putDontNest(result, 520, 779);
    
    _putDontNest(result, 549, 635);
    
    _putDontNest(result, 527, 559);
    
    _putDontNest(result, 553, 628);
    
    _putDontNest(result, 638, 705);
    
    _putDontNest(result, 553, 793);
    
    _putDontNest(result, 782, 835);
    
    _putDontNest(result, 782, 814);
    
    _putDontNest(result, 692, 772);
    
    _putDontNest(result, 467, 635);
    
    _putDontNest(result, 624, 800);
    
    _putDontNest(result, 663, 696);
    
    _putDontNest(result, 568, 587);
    
    _putDontNest(result, 467, 750);
    
    _putDontNest(result, 553, 620);
    
    _putDontNest(result, 460, 577);
    
    _putDontNest(result, 613, 786);
    
    _putDontNest(result, 652, 635);
    
    _putDontNest(result, 761, 821);
    
    _putDontNest(result, 562, 656);
    
    _putDontNest(result, 741, 779);
    
    _putDontNest(result, 460, 807);
    
    _putDontNest(result, 559, 696);
    
    _putDontNest(result, 673, 807);
    
    _putDontNest(result, 606, 682);
    
    _putDontNest(result, 609, 696);
    
    _putDontNest(result, 527, 772);
    
    _putDontNest(result, 590, 613);
    
    _putDontNest(result, 810, 842);
    
    _putDontNest(result, 628, 779);
    
    _putDontNest(result, 513, 587);
    
    _putDontNest(result, 652, 750);
    
    _putDontNest(result, 708, 814);
    
    _putDontNest(result, 708, 835);
    
    _putDontNest(result, 476, 730);
    
    _putDontNest(result, 803, 842);
    
    _putDontNest(result, 476, 835);
    
    _putDontNest(result, 642, 642);
    
    _putDontNest(result, 476, 814);
    
    _putDontNest(result, 750, 821);
    
    _putDontNest(result, 667, 772);
    
    _putDontNest(result, 596, 696);
    
    _putDontNest(result, 708, 730);
    
    _putDontNest(result, 553, 723);
    
    _putDontNest(result, 500, 772);
    
    _putDontNest(result, 685, 758);
    
    _putDontNest(result, 581, 682);
    
    _putDontNest(result, 705, 786);
    
    _putDontNest(result, 476, 705);
    
    _putDontNest(result, 645, 807);
    
    _putDontNest(result, 590, 628);
    
    _putDontNest(result, 590, 793);
    
    _putDontNest(result, 768, 800);
    
    _putDontNest(result, 642, 705);
    
    _putDontNest(result, 544, 656);
    
    _putDontNest(result, 642, 730);
    
    _putDontNest(result, 656, 821);
    
    _putDontNest(result, 476, 642);
    
    _putDontNest(result, 642, 835);
    
    _putDontNest(result, 737, 842);
    
    _putDontNest(result, 642, 814);
    
    _putDontNest(result, 568, 786);
    
    _putDontNest(result, 685, 730);
    
    _putDontNest(result, 676, 842);
    
    _putDontNest(result, 645, 689);
    
    _putDontNest(result, 673, 714);
    
    _putDontNest(result, 642, 758);
    
    _putDontNest(result, 699, 723);
    
    _putDontNest(result, 659, 673);
    
    _putDontNest(result, 568, 568);
    
    _putDontNest(result, 476, 758);
    
    _putDontNest(result, 685, 814);
    
    _putDontNest(result, 723, 842);
    
    _putDontNest(result, 685, 835);
    
    _putDontNest(result, 476, 508);
    
    _putDontNest(result, 596, 723);
    
    _putDontNest(result, 596, 620);
    
    _putDontNest(result, 590, 800);
    
    _putDontNest(result, 768, 793);
    
    _putDontNest(result, 645, 737);
    
    _putDontNest(result, 635, 779);
    
    _putDontNest(result, 460, 714);
    
    _putDontNest(result, 717, 779);
    
    _putDontNest(result, 491, 842);
    
    _putDontNest(result, 562, 635);
    
    _putDontNest(result, 616, 673);
    
    _putDontNest(result, 527, 682);
    
    _putDontNest(result, 652, 656);
    
    _putDontNest(result, 467, 656);
    
    _putDontNest(result, 733, 821);
    
    _putDontNest(result, 559, 620);
    
    _putDontNest(result, 609, 723);
    
    _putDontNest(result, 559, 723);
    
    _putDontNest(result, 659, 765);
    
    _putDontNest(result, 500, 682);
    
    _putDontNest(result, 696, 779);
    
    _putDontNest(result, 663, 723);
    
    _putDontNest(result, 581, 772);
    
    _putDontNest(result, 667, 682);
    
    _putDontNest(result, 460, 737);
    
    _putDontNest(result, 544, 635);
    
    _putDontNest(result, 673, 737);
    
    _putDontNest(result, 645, 714);
    
    _putDontNest(result, 544, 750);
    
    _putDontNest(result, 513, 568);
    
    _putDontNest(result, 624, 628);
    
    _putDontNest(result, 624, 793);
    
    _putDontNest(result, 460, 689);
    
    _putDontNest(result, 549, 842);
    
    _putDontNest(result, 689, 779);
    
    _putDontNest(result, 730, 750);
    
    _putDontNest(result, 491, 502);
    
    _putDontNest(result, 562, 750);
    
    _putDontNest(result, 616, 765);
    
    _putDontNest(result, 600, 821);
    
    _putDontNest(result, 553, 696);
    
    _putDontNest(result, 571, 821);
    
    _putDontNest(result, 708, 758);
    
    _putDontNest(result, 513, 786);
    
    _putDontNest(result, 685, 705);
    
    _putDontNest(result, 649, 786);
    
    _putDontNest(result, 606, 772);
    
    _putDontNest(result, 476, 682);
    
    _putDontNest(result, 581, 730);
    
    _putDontNest(result, 656, 737);
    
    _putDontNest(result, 733, 807);
    
    _putDontNest(result, 705, 793);
    
    _putDontNest(result, 635, 842);
    
    _putDontNest(result, 581, 642);
    
    _putDontNest(result, 549, 779);
    
    _putDontNest(result, 689, 842);
    
    _putDontNest(result, 596, 673);
    
    _putDontNest(result, 520, 750);
    
    _putDontNest(result, 581, 705);
    
    _putDontNest(result, 581, 814);
    
    _putDontNest(result, 581, 835);
    
    _putDontNest(result, 559, 765);
    
    _putDontNest(result, 659, 723);
    
    _putDontNest(result, 495, 750);
    
    _putDontNest(result, 609, 765);
    
    _putDontNest(result, 656, 714);
    
    _putDontNest(result, 513, 800);
    
    _putDontNest(result, 606, 642);
    
    _putDontNest(result, 663, 765);
    
    _putDontNest(result, 649, 800);
    
    _putDontNest(result, 723, 779);
    
    _putDontNest(result, 613, 793);
    
    _putDontNest(result, 613, 628);
    
    _putDontNest(result, 568, 800);
    
    _putDontNest(result, 638, 649);
    
    _putDontNest(result, 590, 786);
    
    _putDontNest(result, 676, 779);
    
    _putDontNest(result, 699, 765);
    
    _putDontNest(result, 500, 758);
    
    _putDontNest(result, 685, 772);
    
    _putDontNest(result, 606, 705);
    
    _putDontNest(result, 620, 649);
    
    _putDontNest(result, 609, 673);
    
    _putDontNest(result, 495, 635);
    
    _putDontNest(result, 559, 673);
    
    _putDontNest(result, 606, 730);
    
    _putDontNest(result, 532, 656);
    
    _putDontNest(result, 667, 758);
    
    _putDontNest(result, 500, 508);
    
    _putDontNest(result, 717, 842);
    
    _putDontNest(result, 663, 673);
    
    _putDontNest(result, 606, 814);
    
    _putDontNest(result, 491, 779);
    
    _putDontNest(result, 606, 835);
    
    _putDontNest(result, 616, 723);
    
    _putDontNest(result, 600, 807);
    
    _putDontNest(result, 696, 842);
    
    _putDontNest(result, 571, 807);
    
    _putDontNest(result, 656, 689);
    
    _putDontNest(result, 642, 682);
    
    _putDontNest(result, 577, 649);
    
    _putDontNest(result, 613, 613);
    
    _putDontNest(result, 527, 758);
    
    _putDontNest(result, 596, 765);
    
    _putDontNest(result, 520, 635);
    
    _putDontNest(result, 532, 635);
    
    _putDontNest(result, 825, 765);
    
    _putDontNest(result, 532, 750);
    
    _putDontNest(result, 761, 807);
    
    _putDontNest(result, 705, 800);
    
    _putDontNest(result, 606, 758);
    
    _putDontNest(result, 571, 714);
    
    _putDontNest(result, 649, 793);
    
    _putDontNest(result, 667, 730);
    
    _putDontNest(result, 649, 628);
    
    _putDontNest(result, 500, 705);
    
    _putDontNest(result, 491, 596);
    
    _putDontNest(result, 737, 779);
    
    _putDontNest(result, 708, 772);
    
    _putDontNest(result, 513, 628);
    
    _putDontNest(result, 513, 793);
    
    _putDontNest(result, 600, 714);
    
    _putDontNest(result, 667, 814);
    
    _putDontNest(result, 476, 772);
    
    _putDontNest(result, 667, 835);
    
    _putDontNest(result, 527, 705);
    
    _putDontNest(result, 600, 737);
    
    _putDontNest(result, 741, 842);
    
    _putDontNest(result, 577, 663);
    
    _putDontNest(result, 750, 807);
    
    _putDontNest(result, 495, 656);
    
    _putDontNest(result, 571, 737);
    
    _putDontNest(result, 616, 696);
    
    _putDontNest(result, 527, 814);
    
    _putDontNest(result, 527, 835);
    
    _putDontNest(result, 553, 765);
    
    _putDontNest(result, 624, 786);
    
    _putDontNest(result, 527, 730);
    
    _putDontNest(result, 645, 821);
    
    _putDontNest(result, 553, 673);
    
    _putDontNest(result, 682, 750);
    
    _putDontNest(result, 476, 491);
    
    _putDontNest(result, 527, 642);
    
    _putDontNest(result, 549, 596);
    
    _putDontNest(result, 810, 779);
    
    _putDontNest(result, 568, 613);
    
    _putDontNest(result, 628, 842);
    
    _putDontNest(result, 460, 532);
    
    _putDontNest(result, 513, 613);
    
    _putDontNest(result, 571, 689);
    
    _putDontNest(result, 656, 807);
    
    _putDontNest(result, 581, 758);
    
    _putDontNest(result, 685, 682);
    
    _putDontNest(result, 491, 606);
    
    _putDontNest(result, 600, 689);
    
    _putDontNest(result, 638, 663);
    
    _putDontNest(result, 642, 772);
    
    _putDontNest(result, 577, 559);
    
    _putDontNest(result, 803, 779);
    
    _putDontNest(result, 673, 821);
    
    _putDontNest(result, 500, 642);
    
    _putDontNest(result, 659, 696);
    
    _putDontNest(result, 460, 821);
    
    _putDontNest(result, 768, 786);
    
    _putDontNest(result, 520, 656);
    
    _putDontNest(result, 549, 606);
    
    _putDontNest(result, 620, 663);
    
    _putDontNest(result, 500, 835);
    
    _putDontNest(result, 500, 814);
    
    _putDontNest(result, 667, 705);
    
    _putDontNest(result, 500, 730);
    
    _putDontNest(result, 568, 793);
    
    _putDontNest(result, 613, 800);
    
    _putDontNest(result, 568, 628);
    
    _putDontNest(result, 520, 620);
    
    _putDontNest(result, 590, 779);
    
    _putDontNest(result, 568, 842);
    
    _putDontNest(result, 460, 758);
    
    _putDontNest(result, 673, 758);
    
    _putDontNest(result, 635, 800);
    
    _putDontNest(result, 676, 786);
    
    _putDontNest(result, 491, 568);
    
    _putDontNest(result, 544, 765);
    
    _putDontNest(result, 642, 737);
    
    _putDontNest(result, 476, 737);
    
    _putDontNest(result, 741, 793);
    
    _putDontNest(result, 549, 786);
    
    _putDontNest(result, 532, 696);
    
    _putDontNest(result, 723, 786);
    
    _putDontNest(result, 520, 723);
    
    _putDontNest(result, 649, 842);
    
    _putDontNest(result, 571, 772);
    
    _putDontNest(result, 708, 714);
    
    _putDontNest(result, 513, 842);
    
    _putDontNest(result, 606, 821);
    
    _putDontNest(result, 562, 673);
    
    _putDontNest(result, 616, 635);
    
    _putDontNest(result, 600, 772);
    
    _putDontNest(result, 549, 568);
    
    _putDontNest(result, 476, 714);
    
    _putDontNest(result, 717, 800);
    
    _putDontNest(result, 733, 772);
    
    _putDontNest(result, 460, 508);
    
    _putDontNest(result, 642, 714);
    
    _putDontNest(result, 616, 750);
    
    _putDontNest(result, 562, 765);
    
    _putDontNest(result, 491, 786);
    
    _putDontNest(result, 4575, 426);
    
    _putDontNest(result, 628, 628);
    
    _putDontNest(result, 628, 793);
    
    _putDontNest(result, 581, 821);
    
    _putDontNest(result, 789, 765);
    
    _putDontNest(result, 659, 635);
    
    _putDontNest(result, 476, 689);
    
    _putDontNest(result, 696, 800);
    
    _putDontNest(result, 730, 765);
    
    _putDontNest(result, 708, 737);
    
    _putDontNest(result, 495, 723);
    
    _putDontNest(result, 642, 689);
    
    _putDontNest(result, 495, 620);
    
    _putDontNest(result, 659, 750);
    
    _putDontNest(result, 656, 682);
    
    _putDontNest(result, 685, 807);
    
    _putDontNest(result, 495, 527);
    
    _putDontNest(result, 631, 663);
    
    _putDontNest(result, 544, 673);
    
    _putDontNest(result, 645, 758);
    
    _putDontNest(result, 689, 800);
    
    _putDontNest(result, 616, 656);
    
    _putDontNest(result, 705, 842);
    
    _putDontNest(result, 500, 821);
    
    _putDontNest(result, 532, 620);
    
    _putDontNest(result, 737, 786);
    
    _putDontNest(result, 659, 656);
    
    _putDontNest(result, 460, 705);
    
    _putDontNest(result, 600, 682);
    
    _putDontNest(result, 642, 807);
    
    _putDontNest(result, 491, 587);
    
    _putDontNest(result, 741, 800);
    
    _putDontNest(result, 652, 765);
    
    _putDontNest(result, 467, 765);
    
    _putDontNest(result, 761, 772);
    
    _putDontNest(result, 476, 807);
    
    _putDontNest(result, 645, 705);
    
    _putDontNest(result, 696, 793);
    
    _putDontNest(result, 500, 532);
    
    _putDontNest(result, 467, 673);
    
    _putDontNest(result, 708, 807);
    
    _putDontNest(result, 631, 649);
    
    _putDontNest(result, 652, 673);
    
    _putDontNest(result, 685, 737);
    
    _putDontNest(result, 628, 800);
    
    _putDontNest(result, 645, 835);
    
    _putDontNest(result, 645, 814);
    
    _putDontNest(result, 645, 730);
    
    _putDontNest(result, 810, 786);
    
    _putDontNest(result, 527, 821);
    
    _putDontNest(result, 491, 497);
    
    _putDontNest(result, 495, 696);
    
    _putDontNest(result, 635, 628);
    
    _putDontNest(result, 635, 793);
    
    _putDontNest(result, 460, 642);
    
    _putDontNest(result, 685, 714);
    
    _putDontNest(result, 682, 723);
    
    _putDontNest(result, 549, 587);
    
    _putDontNest(result, 667, 821);
    
    _putDontNest(result, 532, 723);
    
    _putDontNest(result, 750, 772);
    
    _putDontNest(result, 520, 696);
    
    _putDontNest(result, 717, 793);
    
    _putDontNest(result, 803, 786);
    
    _putDontNest(result, 673, 705);
    
    _putDontNest(result, 476, 577);
    
    _putDontNest(result, 656, 772);
    
    _putDontNest(result, 613, 842);
    
    _putDontNest(result, 754, 765);
    
    _putDontNest(result, 673, 730);
    
    _putDontNest(result, 460, 730);
    
    _putDontNest(result, 768, 779);
    
    _putDontNest(result, 460, 835);
    
    _putDontNest(result, 4956, 385);
    
    _putDontNest(result, 460, 814);
    
    _putDontNest(result, 673, 835);
    
    _putDontNest(result, 673, 814);
    
    _putDontNest(result, 689, 793);
    
    _putDontNest(result, 645, 642);
    
    _putDontNest(result, 685, 689);
    
    _putDontNest(result, 571, 682);
    
    _putDontNest(result, 590, 606);
    
    _putDontNest(result, 467, 520);
    
    _putDontNest(result, 624, 779);
    
    _putDontNest(result, 817, 765);
    
    _putDontNest(result, 645, 772);
    
    _putDontNest(result, 741, 786);
    
    _putDontNest(result, 513, 606);
    
    _putDontNest(result, 663, 656);
    
    _putDontNest(result, 628, 786);
    
    _putDontNest(result, 527, 577);
    
    _putDontNest(result, 810, 800);
    
    _putDontNest(result, 676, 793);
    
    _putDontNest(result, 460, 772);
    
    _putDontNest(result, 581, 737);
    
    _putDontNest(result, 737, 800);
    
    _putDontNest(result, 600, 758);
    
    _putDontNest(result, 750, 814);
    
    _putDontNest(result, 750, 835);
    
    _putDontNest(result, 476, 821);
    
    _putDontNest(result, 508, 663);
    
    _putDontNest(result, 656, 642);
    
    _putDontNest(result, 606, 714);
    
    _putDontNest(result, 571, 758);
    
    _putDontNest(result, 581, 689);
    
    _putDontNest(result, 708, 821);
    
    _putDontNest(result, 613, 779);
    
    _putDontNest(result, 587, 649);
    
    _putDontNest(result, 723, 793);
    
    _putDontNest(result, 768, 842);
    
    _putDontNest(result, 527, 807);
    
    _putDontNest(result, 596, 656);
    
    _putDontNest(result, 624, 842);
    
    _putDontNest(result, 476, 532);
    
    _putDontNest(result, 568, 606);
    
    _putDontNest(result, 553, 635);
    
    _putDontNest(result, 549, 793);
    
    _putDontNest(result, 549, 628);
    
    _putDontNest(result, 682, 765);
    
    _putDontNest(result, 537, 559);
    
    _putDontNest(result, 500, 807);
    
    _putDontNest(result, 460, 491);
    
    _putDontNest(result, 491, 613);
    
    _putDontNest(result, 606, 737);
    
    _putDontNest(result, 532, 765);
    
    _putDontNest(result, 667, 807);
    
    _putDontNest(result, 532, 673);
    
    _putDontNest(result, 508, 559);
    
    _putDontNest(result, 559, 656);
    
    _putDontNest(result, 609, 656);
    
    _putDontNest(result, 838, 765);
    
    _putDontNest(result, 606, 689);
    
    _putDontNest(result, 761, 814);
    
    _putDontNest(result, 761, 835);
    
    _putDontNest(result, 581, 714);
    
    _putDontNest(result, 553, 750);
    
    _putDontNest(result, 562, 696);
    
    _putDontNest(result, 500, 577);
    
    _putDontNest(result, 537, 663);
    
    _putDontNest(result, 467, 527);
    
    _putDontNest(result, 568, 596);
    
    _putDontNest(result, 673, 772);
    
    _putDontNest(result, 549, 613);
    
    _putDontNest(result, 656, 705);
    
    _putDontNest(result, 705, 779);
    
    _putDontNest(result, 513, 596);
    
    _putDontNest(result, 491, 793);
    
    _putDontNest(result, 656, 730);
    
    _putDontNest(result, 491, 628);
    
    _putDontNest(result, 642, 821);
    
    _putDontNest(result, 803, 800);
    
    _putDontNest(result, 544, 696);
    
    _putDontNest(result, 467, 723);
    
    _putDontNest(result, 733, 758);
    
    _putDontNest(result, 467, 620);
    
    _putDontNest(result, 656, 814);
    
    _putDontNest(result, 652, 723);
    
    _putDontNest(result, 656, 835);
    
    _putDontNest(result, 613, 606);
    
    _putDontNest(result, 689, 786);
    
    _putDontNest(result, 635, 786);
    
    _putDontNest(result, 810, 793);
    
    _putDontNest(result, 500, 737);
    
    _putDontNest(result, 606, 807);
    
    _putDontNest(result, 696, 786);
    
    _putDontNest(result, 761, 758);
    
    _putDontNest(result, 562, 723);
    
    _putDontNest(result, 549, 800);
    
    _putDontNest(result, 520, 673);
    
    _putDontNest(result, 596, 750);
    
    _putDontNest(result, 500, 689);
    
    _putDontNest(result, 590, 842);
    
    _putDontNest(result, 699, 750);
    
    _putDontNest(result, 723, 800);
    
    _putDontNest(result, 527, 689);
    
    _putDontNest(result, 568, 779);
    
    _putDontNest(result, 544, 620);
    
    _putDontNest(result, 652, 696);
    
    _putDontNest(result, 467, 696);
    
    _putDontNest(result, 544, 723);
    
    _putDontNest(result, 663, 635);
    
    _putDontNest(result, 733, 835);
    
    _putDontNest(result, 733, 814);
    
    _putDontNest(result, 537, 649);
    
    _putDontNest(result, 571, 642);
    
    _putDontNest(result, 656, 758);
    
    _putDontNest(result, 581, 807);
    
    _putDontNest(result, 609, 635);
    
    _putDontNest(result, 495, 673);
    
    _putDontNest(result, 649, 779);
    
    _putDontNest(result, 645, 682);
    
    _putDontNest(result, 600, 642);
    
    _putDontNest(result, 737, 793);
    
    _putDontNest(result, 513, 779);
    
    _putDontNest(result, 559, 635);
    
    _putDontNest(result, 663, 750);
    
    _putDontNest(result, 803, 793);
    
    _putDontNest(result, 717, 786);
    
    _putDontNest(result, 571, 814);
    
    _putDontNest(result, 600, 730);
    
    _putDontNest(result, 571, 835);
    
    _putDontNest(result, 667, 714);
    
    _putDontNest(result, 559, 750);
    
    _putDontNest(result, 571, 730);
    
    _putDontNest(result, 600, 835);
    
    _putDontNest(result, 600, 814);
    
    _putDontNest(result, 495, 765);
    
    _putDontNest(result, 750, 758);
    
    _putDontNest(result, 609, 750);
    
    _putDontNest(result, 587, 663);
    
    _putDontNest(result, 491, 800);
    
    _putDontNest(result, 500, 714);
    
    _putDontNest(result, 571, 705);
    
    _putDontNest(result, 553, 656);
    
    _putDontNest(result, 685, 821);
    
    _putDontNest(result, 495, 520);
    
    _putDontNest(result, 600, 705);
    
    _putDontNest(result, 676, 800);
    
    _putDontNest(result, 527, 737);
    
    _putDontNest(result, 508, 649);
    
    _putDontNest(result, 527, 714);
    
    _putDontNest(result, 596, 635);
    
    _putDontNest(result, 520, 765);
    
    _putDontNest(result, 667, 737);
    
    _putDontNest(result, 460, 682);
    
    _putDontNest(result, 562, 620);
    
    _putDontNest(result, 667, 689);
    
    _putDontNest(result, 817, 800);
    
    _putDontNest(result, 692, 714);
    
    _putDontNest(result, 467, 800);
    
    _putDontNest(result, 562, 613);
    
    _putDontNest(result, 838, 786);
    
    _putDontNest(result, 825, 842);
    
    _putDontNest(result, 476, 544);
    
    _putDontNest(result, 631, 730);
    
    _putDontNest(result, 692, 689);
    
    _putDontNest(result, 631, 705);
    
    _putDontNest(result, 537, 682);
    
    _putDontNest(result, 645, 649);
    
    _putDontNest(result, 549, 696);
    
    _putDontNest(result, 682, 786);
    
    _putDontNest(result, 553, 842);
    
    _putDontNest(result, 775, 758);
    
    _putDontNest(result, 624, 635);
    
    _putDontNest(result, 714, 737);
    
    _putDontNest(result, 628, 673);
    
    _putDontNest(result, 460, 649);
    
    _putDontNest(result, 652, 800);
    
    _putDontNest(result, 741, 765);
    
    _putDontNest(result, 532, 786);
    
    _putDontNest(result, 495, 587);
    
    _putDontNest(result, 789, 793);
    
    _putDontNest(result, 587, 772);
    
    _putDontNest(result, 676, 696);
    
    _putDontNest(result, 796, 835);
    
    _putDontNest(result, 796, 814);
    
    _putDontNest(result, 730, 793);
    
    _putDontNest(result, 590, 656);
    
    _putDontNest(result, 491, 696);
    
    _putDontNest(result, 624, 750);
    
    _putDontNest(result, 628, 765);
    
    _putDontNest(result, 544, 793);
    
    _putDontNest(result, 544, 628);
    
    _putDontNest(result, 631, 835);
    
    _putDontNest(result, 631, 814);
    
    _putDontNest(result, 562, 628);
    
    _putDontNest(result, 562, 793);
    
    _putDontNest(result, 631, 642);
    
    _putDontNest(result, 520, 587);
    
    _putDontNest(result, 495, 537);
    
    _putDontNest(result, 532, 568);
    
    _putDontNest(result, 692, 737);
    
    _putDontNest(result, 508, 682);
    
    _putDontNest(result, 754, 800);
    
    _putDontNest(result, 544, 613);
    
    _putDontNest(result, 726, 807);
    
    _putDontNest(result, 609, 842);
    
    _putDontNest(result, 717, 765);
    
    _putDontNest(result, 692, 807);
    
    _putDontNest(result, 549, 723);
    
    _putDontNest(result, 544, 800);
    
    _putDontNest(result, 491, 620);
    
    _putDontNest(result, 676, 723);
    
    _putDontNest(result, 817, 793);
    
    _putDontNest(result, 577, 821);
    
    _putDontNest(result, 559, 842);
    
    _putDontNest(result, 616, 779);
    
    _putDontNest(result, 663, 842);
    
    _putDontNest(result, 495, 549);
    
    _putDontNest(result, 520, 568);
    
    _putDontNest(result, 495, 786);
    
    _putDontNest(result, 562, 800);
    
    _putDontNest(result, 532, 587);
    
    _putDontNest(result, 495, 513);
    
    _putDontNest(result, 467, 613);
    
    _putDontNest(result, 635, 765);
    
    _putDontNest(result, 624, 656);
    
    _putDontNest(result, 549, 620);
    
    _putDontNest(result, 726, 737);
    
    _putDontNest(result, 587, 682);
    
    _putDontNest(result, 699, 842);
    
    _putDontNest(result, 590, 750);
    
    _putDontNest(result, 460, 663);
    
    _putDontNest(result, 782, 821);
    
    _putDontNest(result, 520, 786);
    
    _putDontNest(result, 775, 814);
    
    _putDontNest(result, 775, 835);
    
    _putDontNest(result, 596, 842);
    
    _putDontNest(result, 714, 807);
    
    _putDontNest(result, 537, 772);
    
    _putDontNest(result, 495, 568);
    
    _putDontNest(result, 696, 765);
    
    _putDontNest(result, 730, 800);
    
    _putDontNest(result, 659, 779);
    
    _putDontNest(result, 638, 821);
    
    _putDontNest(result, 789, 800);
    
    _putDontNest(result, 508, 772);
    
    _putDontNest(result, 491, 723);
    
    _putDontNest(result, 796, 758);
    
    _putDontNest(result, 467, 628);
    
    _putDontNest(result, 467, 793);
    
    _putDontNest(result, 652, 793);
    
    _putDontNest(result, 652, 628);
    
    _putDontNest(result, 689, 765);
    
    _putDontNest(result, 620, 821);
    
    _putDontNest(result, 754, 793);
    
    _putDontNest(result, 635, 673);
    
    _putDontNest(result, 590, 635);
    
    _putDontNest(result, 645, 663);
    
    _putDontNest(result, 631, 758);
    
    _putDontNest(result, 460, 559);
    
    _putDontNest(result, 537, 705);
    
    _putDontNest(result, 692, 821);
    
    _putDontNest(result, 568, 635);
    
    _putDontNest(result, 723, 765);
    
    _putDontNest(result, 532, 613);
    
    _putDontNest(result, 532, 628);
    
    _putDontNest(result, 532, 793);
    
    _putDontNest(result, 508, 642);
    
    _putDontNest(result, 656, 663);
    
    _putDontNest(result, 631, 682);
    
    _putDontNest(result, 717, 723);
    
    _putDontNest(result, 635, 723);
    
    _putDontNest(result, 537, 730);
    
    _putDontNest(result, 537, 835);
    
    _putDontNest(result, 537, 814);
    
    _putDontNest(result, 682, 793);
    
    _putDontNest(result, 549, 765);
    
    _putDontNest(result, 775, 772);
    
    _putDontNest(result, 782, 807);
    
    _putDontNest(result, 676, 673);
    
    _putDontNest(result, 714, 821);
    
    _putDontNest(result, 553, 606);
    
    _putDontNest(result, 491, 673);
    
    _putDontNest(result, 663, 779);
    
    _putDontNest(result, 696, 723);
    
    _putDontNest(result, 616, 842);
    
    _putDontNest(result, 577, 577);
    
    _putDontNest(result, 649, 635);
    
    _putDontNest(result, 609, 779);
    
    _putDontNest(result, 559, 779);
    
    _putDontNest(result, 638, 807);
    
    _putDontNest(result, 513, 635);
    
    _putDontNest(result, 491, 765);
    
    _putDontNest(result, 562, 786);
    
    _putDontNest(result, 495, 800);
    
    _putDontNest(result, 544, 568);
    
    _putDontNest(result, 628, 696);
    
    _putDontNest(result, 513, 750);
    
    _putDontNest(result, 649, 750);
    
    _putDontNest(result, 467, 587);
    
    _putDontNest(result, 568, 750);
    
    _putDontNest(result, 689, 723);
    
    _putDontNest(result, 620, 807);
    
    _putDontNest(result, 699, 779);
    
    _putDontNest(result, 676, 765);
    
    _putDontNest(result, 544, 786);
    
    _putDontNest(result, 508, 705);
    
    _putDontNest(result, 596, 779);
    
    _putDontNest(result, 600, 649);
    
    _putDontNest(result, 467, 537);
    
    _putDontNest(result, 613, 656);
    
    _putDontNest(result, 553, 596);
    
    _putDontNest(result, 549, 673);
    
    _putDontNest(result, 520, 800);
    
    _putDontNest(result, 571, 649);
    
    _putDontNest(result, 537, 642);
    
    _putDontNest(result, 577, 807);
    
    _putDontNest(result, 838, 793);
    
    _putDontNest(result, 659, 842);
    
    _putDontNest(result, 508, 835);
    
    _putDontNest(result, 730, 786);
    
    _putDontNest(result, 508, 814);
    
    _putDontNest(result, 587, 758);
    
    _putDontNest(result, 508, 730);
    
    _putDontNest(result, 789, 786);
    
    _putDontNest(result, 520, 613);
    
    _putDontNest(result, 682, 800);
    
    _putDontNest(result, 553, 779);
    
    _putDontNest(result, 577, 689);
    
    _putDontNest(result, 838, 800);
    
    _putDontNest(result, 596, 606);
    
    _putDontNest(result, 620, 689);
    
    _putDontNest(result, 613, 750);
    
    _putDontNest(result, 638, 737);
    
    _putDontNest(result, 638, 689);
    
    _putDontNest(result, 737, 765);
    
    _putDontNest(result, 620, 737);
    
    _putDontNest(result, 631, 772);
    
    _putDontNest(result, 544, 587);
    
    _putDontNest(result, 613, 635);
    
    _putDontNest(result, 754, 786);
    
    _putDontNest(result, 467, 568);
    
    _putDontNest(result, 705, 750);
    
    _putDontNest(result, 628, 723);
    
    _putDontNest(result, 817, 786);
    
    _putDontNest(result, 587, 705);
    
    _putDontNest(result, 596, 596);
    
    _putDontNest(result, 620, 714);
    
    _putDontNest(result, 467, 549);
    
    _putDontNest(result, 577, 737);
    
    _putDontNest(result, 652, 786);
    
    _putDontNest(result, 587, 835);
    
    _putDontNest(result, 587, 814);
    
    _putDontNest(result, 467, 786);
    
    _putDontNest(result, 600, 663);
    
    _putDontNest(result, 571, 663);
    
    _putDontNest(result, 467, 513);
    
    _putDontNest(result, 495, 613);
    
    _putDontNest(result, 532, 800);
    
    _putDontNest(result, 796, 772);
    
    _putDontNest(result, 587, 730);
    
    _putDontNest(result, 508, 758);
    
    _putDontNest(result, 562, 587);
    
    _putDontNest(result, 559, 606);
    
    _putDontNest(result, 513, 656);
    
    _putDontNest(result, 638, 714);
    
    _putDontNest(result, 635, 696);
    
    _putDontNest(result, 649, 656);
    
    _putDontNest(result, 587, 642);
    
    _putDontNest(result, 537, 758);
    
    _putDontNest(result, 810, 765);
    
    _putDontNest(result, 520, 628);
    
    _putDontNest(result, 656, 649);
    
    _putDontNest(result, 520, 793);
    
    _putDontNest(result, 568, 656);
    
    _putDontNest(result, 825, 779);
    
    _putDontNest(result, 726, 821);
    
    _putDontNest(result, 803, 765);
    
    _putDontNest(result, 559, 596);
    
    _putDontNest(result, 495, 628);
    
    _putDontNest(result, 495, 793);
    
    _putDontNest(result, 500, 544);
    
    _putDontNest(result, 577, 714);
   return result;
  }
    
  protected static IntegerMap _initDontNestGroups() {
    IntegerMap result = new IntegerMap();
    int resultStoreId = result.size();
    
    
    ++resultStoreId;
    
    result.putUnsafe(596, resultStoreId);
    result.putUnsafe(553, resultStoreId);
    result.putUnsafe(562, resultStoreId);
    result.putUnsafe(571, resultStoreId);
    result.putUnsafe(587, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(730, resultStoreId);
    result.putUnsafe(723, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(746, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(676, resultStoreId);
    result.putUnsafe(692, resultStoreId);
    result.putUnsafe(667, resultStoreId);
    result.putUnsafe(685, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(825, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(495, resultStoreId);
    result.putUnsafe(500, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(717, resultStoreId);
    result.putUnsafe(714, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(705, resultStoreId);
    result.putUnsafe(708, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(737, resultStoreId);
    result.putUnsafe(726, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(768, resultStoreId);
    result.putUnsafe(789, resultStoreId);
    result.putUnsafe(838, resultStoreId);
    result.putUnsafe(775, resultStoreId);
    result.putUnsafe(796, resultStoreId);
    result.putUnsafe(782, resultStoreId);
    result.putUnsafe(817, resultStoreId);
    result.putUnsafe(754, resultStoreId);
    result.putUnsafe(810, resultStoreId);
    result.putUnsafe(803, resultStoreId);
    result.putUnsafe(761, resultStoreId);
    result.putUnsafe(750, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(375, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(590, resultStoreId);
    result.putUnsafe(613, resultStoreId);
    result.putUnsafe(620, resultStoreId);
    result.putUnsafe(581, resultStoreId);
    result.putUnsafe(606, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(491, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(559, resultStoreId);
    result.putUnsafe(544, resultStoreId);
    result.putUnsafe(532, resultStoreId);
    result.putUnsafe(520, resultStoreId);
    result.putUnsafe(549, resultStoreId);
    result.putUnsafe(577, resultStoreId);
    result.putUnsafe(527, resultStoreId);
    result.putUnsafe(513, resultStoreId);
    result.putUnsafe(568, resultStoreId);
    result.putUnsafe(508, resultStoreId);
    result.putUnsafe(537, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(624, resultStoreId);
    result.putUnsafe(649, resultStoreId);
    result.putUnsafe(652, resultStoreId);
    result.putUnsafe(628, resultStoreId);
    result.putUnsafe(635, resultStoreId);
    result.putUnsafe(600, resultStoreId);
    result.putUnsafe(656, resultStoreId);
    result.putUnsafe(645, resultStoreId);
    result.putUnsafe(631, resultStoreId);
    result.putUnsafe(638, resultStoreId);
    result.putUnsafe(642, resultStoreId);
    result.putUnsafe(659, resultStoreId);
    result.putUnsafe(616, resultStoreId);
    result.putUnsafe(663, resultStoreId);
    result.putUnsafe(609, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(6015, resultStoreId);
    result.putUnsafe(6051, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(699, resultStoreId);
    result.putUnsafe(682, resultStoreId);
    result.putUnsafe(673, resultStoreId);
    result.putUnsafe(696, resultStoreId);
    result.putUnsafe(689, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(741, resultStoreId);
    result.putUnsafe(733, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4956, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(467, resultStoreId);
    result.putUnsafe(460, resultStoreId);
    result.putUnsafe(476, resultStoreId);
    ++resultStoreId;
    
    result.putUnsafe(4575, resultStoreId);
      
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
  private static final IConstructor prod__AssignmentPattern__ArrayDestructure_ = (IConstructor) _read("prod(sort(\"AssignmentPattern\"),[sort(\"ArrayDestructure\")],{})", Factory.Production);
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
  private static final IConstructor prod__lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(sort(\\\"Initializer\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Param__AssignmentPattern_ = (IConstructor) _read("prod(sort(\"Param\"),[sort(\"AssignmentPattern\")],{})", Factory.Production);
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
  private static final IConstructor prod__$MetaHole_Initializer__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__Initializer = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Initializer\")),[\\char-class([range(0,0)]),lit(\"opt(sort(\\\"Initializer\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(sort(\"Initializer\"))))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_int_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"int\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CommentChar\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(111,111)]),\\char-class([range(109,109)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Statement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(83,83)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"synchronized\"),[\\char-class([range(115,115)]),\\char-class([range(121,121)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(105,105)]),\\char-class([range(122,122)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"throwNoExp\",sort(\"Statement\")),[lit(\"throw\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_ = (IConstructor) _read("prod(label(\"tryCatch\",sort(\"Statement\")),[lit(\"try\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\"),layouts(\"LAYOUTLIST\"),lit(\"catch\"),layouts(\"LAYOUTLIST\"),lit(\"(\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\")\"),layouts(\"LAYOUTLIST\"),sort(\"Statement\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit___126__char_class___range__126_126_ = (IConstructor) _read("prod(lit(\"~\"),[\\char-class([range(126,126)])],{})", Factory.Production);
  private static final IConstructor prod__EscapeSequence__UnicodeEscapeSequence_ = (IConstructor) _read("prod(lex(\"EscapeSequence\"),[sort(\"UnicodeEscapeSequence\")],{})", Factory.Production);
  private static final IConstructor prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnNoExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"NonEscapeCharacter\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(78,78)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"LAYOUT\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"LAYOUT\")))})", Factory.Production);
  private static final IConstructor prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"preDecr\",sort(\"Expression\")),[lit(\"--\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"AssignmentProperty\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__CommentChar__char_class___range__42_42_ = (IConstructor) _read("prod(lex(\"CommentChar\"),[conditional(\\char-class([range(42,42)]),{\\not-follow(\\char-class([range(47,47)]))})],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"RegularExpressionChar\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"RegularExpressionChar\"))))})", Factory.Production);
  private static final IConstructor prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(label(\"binNeg\",sort(\"Expression\")),[lit(\"~\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star__DoubleStringChar = (IConstructor) _read("regular(\\iter-star(lex(\"DoubleStringChar\")))", Factory.Production);
  private static final IConstructor prod__Reserved__lit_function_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"function\")],{})", Factory.Production);
  private static final IConstructor prod__assign_Expression__ObjectDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[sort(\"ObjectDestructure\"),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"abstract\"),[\\char-class([range(97,97)]),\\char-class([range(98,98)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(sort(\\\"CaseClause\\\"))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(67,67)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(117,117)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"AssignmentProperty\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"AssignmentProperty\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"AssignmentProperty\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"&=\"),[\\char-class([range(38,38)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(label(\"objectDefinition\",sort(\"Expression\")),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"PropertyAssignment\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"protected\"),[\\char-class([range(112,112)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Decimal\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(105,105)]),\\char-class([range(109,109)]),\\char-class([range(97,97)]),\\char-class([range(108,108)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__DecimalInteger__char_class___range__48_48_ = (IConstructor) _read("prod(lex(\"DecimalInteger\"),[\\char-class([range(48,48)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"EscapeSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"EscapeSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"EscapeSequence\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_double_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"double\")],{})", Factory.Production);
  private static final IConstructor prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakNoLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionChar\")))})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__69_69_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"AssignmentElement\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(69,69)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__LHSExpression__AssignmentPattern_ = (IConstructor) _read("prod(sort(\"LHSExpression\"),[sort(\"AssignmentPattern\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"ExponentPart\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ExponentPart\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"ExponentPart\")))})", Factory.Production);
  private static final IConstructor prod__lit_in__char_class___range__105_105_char_class___range__110_110_ = (IConstructor) _read("prod(lit(\"in\"),[\\char-class([range(105,105)]),\\char-class([range(110,110)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_switch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"switch\")],{})", Factory.Production);
  private static final IConstructor prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_ = (IConstructor) _read("prod(lit(\"with\"),[\\char-class([range(119,119)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(104,104)])],{})", Factory.Production);
  private static final IConstructor prod__lit___61__char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"=\"),[\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"String\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"String\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"String\")))})", Factory.Production);
  private static final IConstructor prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"||\"),[\\char-class([range(124,124)]),\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor prod__lit___46_46_46__char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_ = (IConstructor) _read("prod(lit(\"...\"),[\\char-class([range(46,46)]),\\char-class([range(46,46)]),\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionFirstChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionFirstChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionFirstChar\")))})", Factory.Production);
  private static final IConstructor prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShrr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>\\>\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__lit___91__char_class___range__91_91_ = (IConstructor) _read("prod(lit(\"[\"),[\\char-class([range(91,91)])],{})", Factory.Production);
  private static final IConstructor prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_ = (IConstructor) _read("prod(label(\"postIncr\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"++\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_while_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"while\")],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclaration__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[sort(\"AssignmentPattern\"),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", Factory.Production);
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
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star-seps(sort(\\\"AssignmentProperty\\\"),[lit(\\\",\\\")])\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(101,101)]),\\char-class([range(112,112)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(91,91)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)])],{})", Factory.Production);
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
  private static final IConstructor regular__opt__Initializer = (IConstructor) _read("regular(opt(sort(\"Initializer\")))", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"CharacterEscapeSequence\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(67,67)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(69,69)]),\\char-class([range(115,115)]),\\char-class([range(99,99)]),\\char-class([range(97,97)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(83,83)]),\\char-class([range(101,101)]),\\char-class([range(113,113)]),\\char-class([range(117,117)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(99,99)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_catch_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"catch\")],{})", Factory.Production);
  private static final IConstructor prod__ArgExpression__Expression_ = (IConstructor) _read("prod(sort(\"ArgExpression\"),[sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionClassChar\"),[\\char-class([range(1,9),range(11,91),range(94,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__literal_Expression__Literal_ = (IConstructor) _read("prod(label(\"literal\",sort(\"Expression\")),[sort(\"Literal\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Declarator\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Declarator\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Declarator\")))})", Factory.Production);
  private static final IConstructor prod__Decimal__DecimalInteger_opt__ExponentPart_ = (IConstructor) _read("prod(lex(\"Decimal\"),[lex(\"DecimalInteger\"),opt(lex(\"ExponentPart\"))],{})", Factory.Production);
  private static final IConstructor prod__lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__54_54_char_class___range__53_53_char_class___range__44_44_char_class___range__57_57_char_class___range__48_48_char_class___range__41_41_char_class___range__44_44_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__57_57_char_class___range__55_55_char_class___range__44_44_char_class___range__49_49_char_class___range__50_50_char_class___range__50_50_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"\\\\iter-star(\\\\char-class([range(65,90),range(97,122)]))\"),[\\char-class([range(92,92)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(54,54)]),\\char-class([range(53,53)]),\\char-class([range(44,44)]),\\char-class([range(57,57)]),\\char-class([range(48,48)]),\\char-class([range(41,41)]),\\char-class([range(44,44)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(57,57)]),\\char-class([range(55,55)]),\\char-class([range(44,44)]),\\char-class([range(49,49)]),\\char-class([range(50,50)]),\\char-class([range(50,50)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"|=\"),[\\char-class([range(124,124)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__lit___124__char_class___range__124_124_ = (IConstructor) _read("prod(lit(\"|\"),[\\char-class([range(124,124)])],{})", Factory.Production);
  private static final IConstructor regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("regular(seq([conditional(\\char-class([range(36,36),range(65,90),range(95,95),range(97,122)]),{\\not-precede(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))}),conditional(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),{\\not-follow(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))})]))", Factory.Production);
  private static final IConstructor regular__iter__char_class___range__48_57 = (IConstructor) _read("regular(iter(\\char-class([range(48,57)])))", Factory.Production);
  private static final IConstructor prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_ = (IConstructor) _read("prod(lit(\"throw\"),[\\char-class([range(116,116)]),\\char-class([range(104,104)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(119,119)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VarDecl\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VarDecl\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VarDecl\")))})", Factory.Production);
  private static final IConstructor prod__AssignmentProperty__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_AssignmentElement_ = (IConstructor) _read("prod(sort(\"AssignmentProperty\"),[sort(\"PropertyName\"),layouts(\"LAYOUTLIST\"),lit(\":\"),layouts(\"LAYOUTLIST\"),sort(\"AssignmentElement\")],{})", Factory.Production);
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
  private static final IConstructor prod__$MetaHole_ArrayDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArrayDestructure = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ArrayDestructure\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ArrayDestructure\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ArrayDestructure\")))})", Factory.Production);
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
  private static final IConstructor prod__$MetaHole_ObjectDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ObjectDestructure = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"ObjectDestructure\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"ObjectDestructure\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"ObjectDestructure\")))})", Factory.Production);
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
  private static final IConstructor prod__init_VariableDeclarationNoIn__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclarationNoIn\")),[sort(\"AssignmentPattern\"),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",conditional(sort(\"Expression\"),{except(\"inn\")}))],{})", Factory.Production);
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
  private static final IConstructor prod__AssignmentProperty__Id_layouts_LAYOUTLIST_opt__Initializer_ = (IConstructor) _read("prod(sort(\"AssignmentProperty\"),[lex(\"Id\"),layouts(\"LAYOUTLIST\"),opt(sort(\"Initializer\"))],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_throws_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"throws\")],{})", Factory.Production);
  private static final IConstructor prod__this_Expression__lit_this_ = (IConstructor) _read("prod(label(\"this\",sort(\"Expression\")),[lit(\"this\")],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"Id\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(73,73)]),\\char-class([range(100,100)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"breakLabel\",sort(\"Statement\")),[lit(\"break\"),layouts(\"LAYOUTLIST\"),lex(\"Id\"),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"AssignmentElement\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__$MetaHole_char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_51_54_44_51_54_41_44_114_97_110_103_101_40_52_56_44_53_55_41_44_114_97_110_103_101_40_54_53_44_57_48_41_44_114_97_110_103_101_40_57_53_44_57_53_41_44_114_97_110_103_101_40_57_55_44_49_50_50_41_93_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122 = (IConstructor) _read("prod(label(\"$MetaHole\",\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)])),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(\\\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(\\char-class([range(36,36),range(48,57),range(65,90),range(95,95),range(97,122)]))))})", Factory.Production);
  private static final IConstructor prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"array\",sort(\"Expression\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"ArgExpression\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Numeric\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Numeric\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Numeric\")))})", Factory.Production);
  private static final IConstructor prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_ = (IConstructor) _read("prod(label(\"returnExp\",sort(\"Statement\")),[lit(\"return\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\")),layouts(\"LAYOUTLIST\"),lit(\";\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Boolean\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Boolean\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Boolean\")))})", Factory.Production);
  private static final IConstructor prod__lit___123__char_class___range__123_123_ = (IConstructor) _read("prod(lit(\"{\"),[\\char-class([range(123,123)])],{})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__79_79_char_class___range__98_98_char_class___range__106_106_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__68_68_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ObjectDestructure\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(79,79)]),\\char-class([range(98,98)]),\\char-class([range(106,106)]),\\char-class([range(101,101)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
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
  private static final IConstructor prod__assign_Expression__ArrayDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assign\",sort(\"Expression\")),[conditional(sort(\"ArrayDestructure\"),{except(\"base\")}),layouts(\"LAYOUTLIST\"),conditional(lit(\"=\"),{\\not-follow(seq([\\char-class([range(61,61)]),layouts(\"LAYOUTLIST\"),opt(\\char-class([range(61,61)]))]))}),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right = (IConstructor) _read("prod(label(\"assignShl\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\<\\<=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(right())})", Factory.Production);
  private static final IConstructor prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_ = (IConstructor) _read("prod(sort(\"Initializer\"),[lit(\"=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{})", Factory.Production);
  private static final IConstructor prod__ForBinding__AssignmentPattern_ = (IConstructor) _read("prod(sort(\"ForBinding\"),[sort(\"AssignmentPattern\")],{})", Factory.Production);
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
  private static final IConstructor regular__iter_star__RegularExpressionChar = (IConstructor) _read("regular(\\iter-star(lex(\"RegularExpressionChar\")))", Factory.Production);
  private static final IConstructor prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"DoubleStringChar\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"DoubleStringChar\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"DoubleStringChar\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_true_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left = (IConstructor) _read("prod(label(\"and\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"&&\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(left())})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_volatile_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"volatile\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"RegularExpressionBackslashSequence\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"RegularExpressionBackslashSequence\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"RegularExpressionBackslashSequence\")))})", Factory.Production);
  private static final IConstructor prod__AssignmentElement__LHSExpression_layouts_LAYOUTLIST_opt__Initializer_ = (IConstructor) _read("prod(sort(\"AssignmentElement\"),[sort(\"LHSExpression\"),layouts(\"LAYOUTLIST\"),opt(sort(\"Initializer\"))],{})", Factory.Production);
  private static final IConstructor prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_ = (IConstructor) _read("prod(lit(\"void\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(105,105)]),\\char-class([range(100,100)])],{})", Factory.Production);
  private static final IConstructor prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"else\"),[\\char-class([range(101,101)]),\\char-class([range(108,108)]),\\char-class([range(115,115)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"VariableDeclarationNoIn\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"VariableDeclarationNoIn\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"VariableDeclarationNoIn\")))})", Factory.Production);
  private static final IConstructor prod__Boolean__lit_true_ = (IConstructor) _read("prod(sort(\"Boolean\"),[lit(\"true\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"SingleEscapeCharacter\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"SingleEscapeCharacter\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"SingleEscapeCharacter\")))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"PropertyAssignment\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentElement = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"AssignmentElement\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"AssignmentElement\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"AssignmentElement\")))})", Factory.Production);
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
  private static final IConstructor prod__ObjectDestructure__lit___123_layouts_LAYOUTLIST_iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_ = (IConstructor) _read("prod(sort(\"ObjectDestructure\"),[lit(\"{\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"AssignmentProperty\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"}\")],{})", Factory.Production);
  private static final IConstructor prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_ = (IConstructor) _read("prod(lex(\"String\"),[\\char-class([range(39,39)]),\\iter-star(lex(\"SingleStringChar\")),\\char-class([range(39,39)])],{})", Factory.Production);
  private static final IConstructor prod__lit___105_116_101_114_40_92_99_104_97_114_45_99_108_97_115_115_40_91_114_97_110_103_101_40_52_56_44_53_55_41_93_41_41__char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__40_40_char_class___range__92_92_char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__40_40_char_class___range__91_91_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__103_103_char_class___range__101_101_char_class___range__40_40_char_class___range__52_52_char_class___range__56_56_char_class___range__44_44_char_class___range__53_53_char_class___range__55_55_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"iter(\\\\char-class([range(48,57)]))\"),[\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(40,40)]),\\char-class([range(92,92)]),\\char-class([range(99,99)]),\\char-class([range(104,104)]),\\char-class([range(97,97)]),\\char-class([range(114,114)]),\\char-class([range(45,45)]),\\char-class([range(99,99)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(40,40)]),\\char-class([range(91,91)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(110,110)]),\\char-class([range(103,103)]),\\char-class([range(101,101)]),\\char-class([range(40,40)]),\\char-class([range(52,52)]),\\char-class([range(56,56)]),\\char-class([range(44,44)]),\\char-class([range(53,53)]),\\char-class([range(55,55)]),\\char-class([range(41,41)]),\\char-class([range(93,93)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_AssignmentPattern__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentPattern = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"AssignmentPattern\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"AssignmentPattern\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"AssignmentPattern\")))})", Factory.Production);
  private static final IConstructor prod__base_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"base\",sort(\"ArrayDestructure\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"AssignmentElement\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
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
  private static final IConstructor prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\<=\"),[\\char-class([range(60,60)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Whitespace\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Whitespace\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Whitespace\")))})", Factory.Production);
  private static final IConstructor prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc = (IConstructor) _read("prod(label(\"geq\",sort(\"Expression\")),[sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\"\\>=\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\")],{assoc(\\non-assoc())})", Factory.Production);
  private static final IConstructor prod__EscapeCharacter__SingleEscapeCharacter_ = (IConstructor) _read("prod(lex(\"EscapeCharacter\"),[lex(\"SingleEscapeCharacter\")],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_if_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"if\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentProperty = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"AssignmentProperty\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"AssignmentProperty\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"AssignmentProperty\")))})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_enum_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"enum\")],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"LAYOUT\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star(sort(\\\"LAYOUT\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star(lex(\"LAYOUT\"))))})", Factory.Production);
  private static final IConstructor prod__lit___46__char_class___range__46_46_ = (IConstructor) _read("prod(lit(\".\"),[\\char-class([range(46,46)])],{})", Factory.Production);
  private static final IConstructor prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_ = (IConstructor) _read("prod(label(\"init\",sort(\"VariableDeclaration\")),[label(\"id\",lex(\"Id\")),layouts(\"LAYOUTLIST\"),lit(\"=\"),layouts(\"LAYOUTLIST\"),label(\"exp\",sort(\"Expression\"))],{})", Factory.Production);
  private static final IConstructor prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_ = (IConstructor) _read("prod(lex(\"RegularExpressionBackslashSequence\"),[\\char-class([range(92,92)]),\\char-class([range(1,9),range(11,16777215)])],{})", Factory.Production);
  private static final IConstructor prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"byte\"),[\\char-class([range(98,98)]),\\char-class([range(121,121)]),\\char-class([range(116,116)]),\\char-class([range(101,101)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_lit___44__char_class___range__0_0_lit___111_112_116_40_108_105_116_40_34_44_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__lit___44 = (IConstructor) _read("prod(label(\"$MetaHole\",lit(\",\")),[\\char-class([range(0,0)]),lit(\"opt(lit(\\\",\\\"))\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(opt(lit(\",\"))))})", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__114_114_char_class___range__97_97_char_class___range__121_121_char_class___range__68_68_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"ArrayDestructure\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(114,114)]),\\char-class([range(114,114)]),\\char-class([range(97,97)]),\\char-class([range(121,121)]),\\char-class([range(68,68)]),\\char-class([range(101,101)]),\\char-class([range(115,115)]),\\char-class([range(116,116)]),\\char-class([range(114,114)]),\\char-class([range(117,117)]),\\char-class([range(99,99)]),\\char-class([range(116,116)]),\\char-class([range(117,117)]),\\char-class([range(114,114)]),\\char-class([range(101,101)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
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
  private static final IConstructor prod__LAYOUT__Comment_ = (IConstructor) _read("prod(lex(\"LAYOUT\"),[lex(\"Comment\")],{})", Factory.Production);
  private static final IConstructor prod__rest_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_LHSExpression_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_ = (IConstructor) _read("prod(label(\"rest\",sort(\"ArrayDestructure\")),[lit(\"[\"),layouts(\"LAYOUTLIST\"),\\iter-star-seps(sort(\"AssignmentElement\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")]),layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\"),lit(\"...\"),layouts(\"LAYOUTLIST\"),sort(\"LHSExpression\"),layouts(\"LAYOUTLIST\"),opt(lit(\",\")),layouts(\"LAYOUTLIST\"),lit(\"]\")],{})", Factory.Production);
  private static final IConstructor prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_ = (IConstructor) _read("prod(lex(\"SignedInteger\"),[opt(\\char-class([range(43,43),range(45,45)])),conditional(iter(\\char-class([range(48,57)])),{\\not-follow(\\char-class([range(48,57)]))})],{})", Factory.Production);
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
  private static final IConstructor prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"AssignmentElement\")),[\\char-class([range(0,0)]),lit(\"\\\\iter-star-seps(sort(\\\"AssignmentElement\\\"),[lit(\\\",\\\")])\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(\\iter-star-seps(sort(\"AssignmentElement\"),[layouts(\"LAYOUTLIST\"),lit(\",\"),layouts(\"LAYOUTLIST\")])))})", Factory.Production);
  private static final IConstructor prod__lit___111_112_116_40_108_105_116_40_34_44_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"opt(lit(\\\",\\\"))\"),[\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(108,108)]),\\char-class([range(105,105)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(44,44)]),\\char-class([range(34,34)]),\\char-class([range(41,41)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal = (IConstructor) _read("prod(label(\"$MetaHole\",lex(\"Decimal\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Decimal\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(lex(\"Decimal\")))})", Factory.Production);
  private static final IConstructor prod__AssignmentPattern__ObjectDestructure_ = (IConstructor) _read("prod(sort(\"AssignmentPattern\"),[sort(\"ObjectDestructure\")],{})", Factory.Production);
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
  private static final IConstructor prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__116_116_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"AssignmentPattern\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(116,116)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(110,110)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_____char_class___range__45_45_char_class___range__45_45_ = (IConstructor) _read("prod(lit(\"--\"),[\\char-class([range(45,45)]),\\char-class([range(45,45)])],{})", Factory.Production);
  private static final IConstructor prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_ = (IConstructor) _read("prod(lit(\"float\"),[\\char-class([range(102,102)]),\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(97,97)]),\\char-class([range(116,116)])],{})", Factory.Production);
  private static final IConstructor prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_ = (IConstructor) _read("prod(lit(\"\\>\\>\\>=\"),[\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(62,62)]),\\char-class([range(61,61)])],{})", Factory.Production);
  private static final IConstructor prod__Reserved__lit_break_ = (IConstructor) _read("prod(keywords(\"Reserved\"),[lit(\"break\")],{})", Factory.Production);
  private static final IConstructor prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_ = (IConstructor) _read("prod(lit(\"long\"),[\\char-class([range(108,108)]),\\char-class([range(111,111)]),\\char-class([range(110,110)]),\\char-class([range(103,103)])],{})", Factory.Production);
  private static final IConstructor prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket = (IConstructor) _read("prod(label(\"bracket\",sort(\"Expression\")),[lit(\"(\"),layouts(\"LAYOUTLIST\"),sort(\"Expression\"),layouts(\"LAYOUTLIST\"),lit(\")\")],{bracket()})", Factory.Production);
  private static final IConstructor prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer = (IConstructor) _read("prod(label(\"$MetaHole\",sort(\"Initializer\")),[\\char-class([range(0,0)]),lit(\"sort(\\\"Initializer\\\")\"),lit(\":\"),iter(\\char-class([range(48,57)])),\\char-class([range(0,0)])],{tag(\"holeType\"(sort(\"Initializer\")))})", Factory.Production);
  private static final IConstructor prod__var_Expression__Id_ = (IConstructor) _read("prod(label(\"var\",sort(\"Expression\")),[lex(\"Id\")],{})", Factory.Production);
  private static final IConstructor regular__iter_star_seps__Statement__layouts_LAYOUTLIST = (IConstructor) _read("regular(\\iter-star-seps(sort(\"Statement\"),[layouts(\"LAYOUTLIST\")]))", Factory.Production);
  private static final IConstructor prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__69_69_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"AssignmentElement\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(69,69)]),\\char-class([range(108,108)]),\\char-class([range(101,101)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
  private static final IConstructor prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_ = (IConstructor) _read("prod(lit(\"volatile\"),[\\char-class([range(118,118)]),\\char-class([range(111,111)]),\\char-class([range(108,108)]),\\char-class([range(97,97)]),\\char-class([range(116,116)]),\\char-class([range(105,105)]),\\char-class([range(108,108)]),\\char-class([range(101,101)])],{})", Factory.Production);
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
  private static final IConstructor prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_ = (IConstructor) _read("prod(lit(\"sort(\\\"AssignmentProperty\\\")\"),[\\char-class([range(115,115)]),\\char-class([range(111,111)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(40,40)]),\\char-class([range(34,34)]),\\char-class([range(65,65)]),\\char-class([range(115,115)]),\\char-class([range(115,115)]),\\char-class([range(105,105)]),\\char-class([range(103,103)]),\\char-class([range(110,110)]),\\char-class([range(109,109)]),\\char-class([range(101,101)]),\\char-class([range(110,110)]),\\char-class([range(116,116)]),\\char-class([range(80,80)]),\\char-class([range(114,114)]),\\char-class([range(111,111)]),\\char-class([range(112,112)]),\\char-class([range(101,101)]),\\char-class([range(114,114)]),\\char-class([range(116,116)]),\\char-class([range(121,121)]),\\char-class([range(34,34)]),\\char-class([range(41,41)])],{})", Factory.Production);
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
	
	
  protected static class ArrayDestructure {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ArrayDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArrayDestructure(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(9, 1, prod__lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__114_114_char_class___range__97_97_char_class___range__121_121_char_class___range__68_68_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,114,114,97,121,68,101,115,116,114,117,99,116,117,114,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(12, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(11, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(8, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(10, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(13, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ArrayDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArrayDestructure, tmp);
	}
    protected static final void _init_prod__base_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(24, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(23, 2, regular__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(19, 0, "AssignmentElement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(20, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(21, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(22, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(28, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(26, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(25, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(17, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(18, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(27, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__base_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__rest_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_LHSExpression_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[6] = new LiteralStackNode<IConstructor>(41, 6, prod__lit___46_46_46__char_class___range__46_46_char_class___range__46_46_char_class___range__46_46_, new int[] {46,46,46}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(42, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(43, 8, "LHSExpression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(39, 4, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(48, 12, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(37, 2, regular__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(33, 0, "AssignmentElement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(34, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(35, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(36, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[10] = new OptionalStackNode<IConstructor>(46, 10, regular__opt__lit___44, new LiteralStackNode<IConstructor>(45, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(31, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(44, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(47, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(38, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(40, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(32, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__rest_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_LHSExpression_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ArrayDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_114_97_121_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArrayDestructure(builder);
      
        _init_prod__base_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(builder);
      
        _init_prod__rest_ArrayDestructure__lit___91_layouts_LAYOUTLIST_iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_lit___46_46_46_layouts_LAYOUTLIST_LHSExpression_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(builder);
      
    }
  }
	
  protected static class String {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(57, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(56, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(54, 1, prod__lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,114,105,110,103,34,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(55, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(53, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(58, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_String__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_114_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__String, tmp);
	}
    protected static final void _init_prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(64, 2, new int[][]{{39,39}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(61, 0, new int[][]{{39,39}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(63, 1, regular__iter_star__SingleStringChar, new NonTerminalStackNode<IConstructor>(62, 0, "SingleStringChar", null, null), false, null, null);
      builder.addAlternative(Parser.prod__String__char_class___range__39_39_iter_star__SingleStringChar_char_class___range__39_39_, tmp);
	}
    protected static final void _init_prod__String__char_class___range__34_34_iter_star__DoubleStringChar_char_class___range__34_34_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new CharStackNode<IConstructor>(69, 2, new int[][]{{34,34}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(66, 0, new int[][]{{34,34}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(68, 1, regular__iter_star__DoubleStringChar, new NonTerminalStackNode<IConstructor>(67, 0, "DoubleStringChar", null, null), false, null, null);
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
      
      tmp[1] = new OptionalStackNode<IConstructor>(114, 1, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(113, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(112, 0, "DecimalInteger", null, null);
      builder.addAlternative(Parser.prod__Decimal__DecimalInteger_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[4];
      
      tmp[3] = new OptionalStackNode<IConstructor>(121, 3, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(120, 0, "ExponentPart", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(116, 0, "DecimalInteger", null, null);
      tmp[1] = new CharStackNode<IConstructor>(117, 1, new int[][]{{46,46}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(119, 2, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(118, 0, new int[][]{{48,57}}, null, null), false, null, null);
      builder.addAlternative(Parser.prod__Decimal__DecimalInteger_char_class___range__46_46_iter_star__char_class___range__48_57_opt__ExponentPart_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(124, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(126, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(129, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(125, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(128, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(127, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Decimal__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Decimal, tmp);
	}
    protected static final void _init_prod__Decimal__char_class___range__46_46_iter__char_class___range__48_57_opt__ExponentPart_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(132, 0, new int[][]{{46,46}}, null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(136, 2, regular__opt__ExponentPart, new NonTerminalStackNode<IConstructor>(135, 0, "ExponentPart", null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(134, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(133, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(282, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(284, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(286, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(285, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(283, 1, prod__lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,117,110,99,116,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(287, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Function__char_class___range__0_0_lit___115_111_114_116_40_34_70_117_110_99_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Function, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[0] = new LiteralStackNode<IConstructor>(290, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(303, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(301, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(302, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(300, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(294, 4, "Params", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(306, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(292, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(297, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(299, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(293, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(305, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(291, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(296, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(298, 7, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Function__lit_function_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__Function__lit_function_layouts_LAYOUTLIST_name_Id_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_parameters_Params_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_body_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[13] = new NonTerminalStackNode<IConstructor>(326, 13, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(320, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(308, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(319, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(313, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(324, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(322, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(323, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(327, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(310, 2, "Id", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(315, 6, "Params", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(318, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(312, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(321, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(309, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(314, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(317, 7, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(709, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(713, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(712, 2, prod__lit___94__char_class___range__94_94_, new int[] {94}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(714, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(708, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__binXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(601, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(605, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(604, 2, prod__lit___62_62__char_class___range__62_62_char_class___range__62_62_, new int[] {62,62}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{62,62}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(606, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(600, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(463, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(461, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(464, 4, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(462, 2, prod__lit___46__char_class___range__46_46_, new int[] {46}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(460, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__property_Expression__Expression_layouts_LAYOUTLIST_lit___46_layouts_LAYOUTLIST_Id_, tmp);
	}
    protected static final void _init_prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(512, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(513, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(511, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__typeof_Expression__lit_typeof_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(681, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(677, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(682, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(680, 2, prod__lit___61_61__char_class___range__61_61_char_class___range__61_61_, new int[] {61,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(676, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__eq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(769, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(771, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(768, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(770, 2, prod__lit___38_61__char_class___range__38_38_char_class___range__61_61_, new int[] {38,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(772, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignBinAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(736, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(734, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(733, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(737, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(735, 2, prod__lit___124_124__char_class___range__124_124_char_class___range__124_124_, new int[] {124,124}, null, null);
      builder.addAlternative(Parser.prod__or_Expression__Expression_layouts_LAYOUTLIST_lit___124_124_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(778, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(776, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(775, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(779, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(777, 2, prod__lit___62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,61}, null, null);
      builder.addAlternative(Parser.prod__assignShr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(527, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(525, 0, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[1] = new NonTerminalStackNode<IConstructor>(526, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__prefixMin_Expression__lit___layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(631, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(633, 2, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(635, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(632, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(634, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__instanceof_Expression__Expression_layouts_LAYOUTLIST_lit_instanceof_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(782, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(786, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(784, 2, prod__lit___94_61__char_class___range__94_94_char_class___range__61_61_, new int[] {94,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(785, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(783, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinXor_Expression__Expression_layouts_LAYOUTLIST_lit___94_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(668, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(672, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(671, 2, prod__lit___33_61__char_class___range__33_33_char_class___range__61_61_, new int[] {33,61}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(673, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(667, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__neq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(543, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(544, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(542, 0, prod__lit___33__char_class___range__33_33_, new int[] {33}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61}})});
      builder.addAlternative(Parser.prod__not_Expression__lit___33_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(548, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(549, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(547, 0, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      builder.addAlternative(Parser.prod__preDecr_Expression__lit____layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(413, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(422, 5, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(419, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(418, 2, regular__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(414, 0, "PropertyAssignment", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(415, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(416, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(417, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(423, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(421, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(420, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(412, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      builder.addAlternative(Parser.prod__objectDefinition_Expression__lit___123_layouts_LAYOUTLIST_iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(507, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(508, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(506, 0, prod__lit___126__char_class___range__126_126_, new int[] {126}, null, null);
      builder.addAlternative(Parser.prod__binNeg_Expression__lit___126_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assign_Expression__ObjectDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(362, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(370, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(369, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(371, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(361, 0, "ObjectDestructure", null, null);
      builder.addAlternative(Parser.prod__assign_Expression__ObjectDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(757, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(755, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(758, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(756, 2, prod__lit___62_62_62_61__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_char_class___range__61_61_, new int[] {62,62,62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(754, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignShrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(496, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(497, 2, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(495, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__postIncr_Expression__Expression_layouts_LAYOUTLIST_lit___43_43_, tmp);
	}
    protected static final void _init_prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(612, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(610, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(613, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(611, 2, prod__lit___62_62_62__char_class___range__62_62_char_class___range__62_62_char_class___range__62_62_, new int[] {62,62,62}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(609, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__shrr_Expression__Expression_layouts_LAYOUTLIST_lit___62_62_62_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__function_Expression__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(426, 0, "Function", null, null);
      builder.addAlternative(Parser.prod__function_Expression__Function_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(389, 1, prod__lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(392, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(391, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(388, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(390, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(393, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Expression__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Expression, tmp);
	}
    protected static final void _init_prod__literal_Expression__Literal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(429, 0, "Literal", null, null);
      builder.addAlternative(Parser.prod__literal_Expression__Literal_, tmp);
	}
    protected static final void _init_prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(686, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(688, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(685, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(687, 2, prod__lit___33_61_61__char_class___range__33_33_char_class___range__61_61_char_class___range__61_61_, new int[] {33,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(689, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__neqq_Expression__Expression_layouts_LAYOUTLIST_lit___33_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(762, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(764, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(761, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(763, 2, prod__lit___45_61__char_class___range__45_45_char_class___range__61_61_, new int[] {45,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(765, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__assignSub_Expression__Expression_layouts_LAYOUTLIST_lit___45_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(563, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(567, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(562, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(566, 2, prod__lit___37__char_class___range__37_37_, new int[] {37}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{37,37},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(568, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__rem_Expression__Expression_layouts_LAYOUTLIST_lit___37_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(572, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(576, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(571, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(575, 2, prod__lit___47__char_class___range__47_47_, new int[] {47}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(577, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__div_Expression__Expression_layouts_LAYOUTLIST_lit___47_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(582, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(586, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(581, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(585, 2, prod__lit____char_class___range__45_45_, new int[] {45}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{45,45},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(587, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__sub_Expression__Expression_layouts_LAYOUTLIST_lit___layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(704, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(700, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(699, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(705, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(703, 2, prod__lit___38__char_class___range__38_38_, new int[] {38}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{38,38},{61,61}})});
      builder.addAlternative(Parser.prod__binAnd_Expression__Expression_layouts_LAYOUTLIST_lit___38_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(519, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(518, 0, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[2] = new NonTerminalStackNode<IConstructor>(520, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__prefixPlus_Expression__lit___43_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__this_Expression__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(432, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__this_Expression__lit_this_, tmp);
	}
    protected static final void _init_prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(470, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(472, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(468, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(467, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(471, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(469, 2, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(473, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__member_Expression__Expression_layouts_LAYOUTLIST_lit___91_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(442, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(436, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(445, 5, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(435, 0, prod__lit___91__char_class___range__91_91_, new int[] {91}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(444, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(443, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(441, 2, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(437, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(438, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(439, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(440, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(446, 6, prod__lit___93__char_class___range__93_93_, new int[] {93}, null, null);
      builder.addAlternative(Parser.prod__array_Expression__lit___91_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___93_, tmp);
	}
    protected static final void _init_prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(791, 2, prod__lit___47_61__char_class___range__47_47_char_class___range__61_61_, new int[] {47,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(793, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(789, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(790, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(792, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignDiv_Expression__Expression_layouts_LAYOUTLIST_lit___47_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(798, 2, prod__lit___42_61__char_class___range__42_42_char_class___range__61_61_, new int[] {42,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(800, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(796, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(797, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(799, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignMul_Expression__Expression_layouts_LAYOUTLIST_lit___42_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[6] = new LiteralStackNode<IConstructor>(748, 6, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(743, 2, prod__lit___63__char_class___range__63_63_, new int[] {63}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(746, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(741, 0, "Expression", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(749, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(747, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(742, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(744, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(750, 8, "Expression", null, null);
      builder.addAlternative(Parser.prod__cond_Expression__Expression_layouts_LAYOUTLIST_lit___63_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assign_Expression__ArrayDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(383, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(385, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(375, 0, "ArrayDestructure", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(376, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(384, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assign_Expression__ArrayDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(805, 2, prod__lit___60_60_61__char_class___range__60_60_char_class___range__60_60_char_class___range__61_61_, new int[] {60,60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(807, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(803, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(804, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(806, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignShl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(557, 2, prod__lit___42__char_class___range__42_42_, new int[] {42}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{42,42},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(559, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(553, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(554, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(558, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__mul_Expression__Expression_layouts_LAYOUTLIST_lit___42_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(728, 2, prod__lit___38_38__char_class___range__38_38_char_class___range__38_38_, new int[] {38,38}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(730, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(726, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(727, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(729, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__and_Expression__Expression_layouts_LAYOUTLIST_lit___38_38_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(399, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(402, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(397, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(398, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(401, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(400, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Expression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(491, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(489, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(490, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__new_Expression__lit_new_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(812, 2, prod__lit___37_61__char_class___range__37_37_char_class___range__61_61_, new int[] {37,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(814, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(810, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(811, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(813, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignRem_Expression__Expression_layouts_LAYOUTLIST_lit___37_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(819, 2, prod__lit___43_61__char_class___range__43_43_char_class___range__61_61_, new int[] {43,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(821, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(817, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(818, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(820, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignAdd_Expression__Expression_layouts_LAYOUTLIST_lit___43_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(502, 2, prod__lit_____char_class___range__45_45_char_class___range__45_45_, new int[] {45,45}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(500, 0, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(501, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__postDec_Expression__Expression_layouts_LAYOUTLIST_lit____, tmp);
	}
    protected static final void _init_prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(723, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(721, 2, prod__lit___124__char_class___range__124_124_, new int[] {124}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{61,61},{124,124}})});
      tmp[0] = new NonTerminalStackNode<IConstructor>(717, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(722, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(718, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__binOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(628, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(626, 2, prod__lit___62_61__char_class___range__62_62_char_class___range__61_61_, new int[] {62,61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(624, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(627, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(625, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__geq_Expression__Expression_layouts_LAYOUTLIST_lit___62_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[4] = new SeparatedListStackNode<IConstructor>(484, 4, regular__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(480, 0, "ArgExpression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(481, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(482, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(483, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(486, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(478, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(476, 0, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(479, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(477, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(485, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__call_Expression__Expression_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_, tmp);
	}
    protected static final void _init_prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(692, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(694, 2, prod__lit___61_61_61__char_class___range__61_61_char_class___range__61_61_char_class___range__61_61_, new int[] {61,61,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(696, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(693, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(695, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__eqq_Expression__Expression_layouts_LAYOUTLIST_lit___61_61_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(638, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(640, 2, prod__lit___60_61__char_class___range__60_60_char_class___range__61_61_, new int[] {60,61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(642, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(639, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(641, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__leq_Expression__Expression_layouts_LAYOUTLIST_lit___60_61_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(616, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(618, 2, prod__lit___60_60__char_class___range__60_60_char_class___range__60_60_, new int[] {60,60}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(620, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(617, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(619, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__shl_Expression__Expression_layouts_LAYOUTLIST_lit___60_60_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(590, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(594, 2, prod__lit___43__char_class___range__43_43_, new int[] {43}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{43,43},{61,61}})});
      tmp[4] = new NonTerminalStackNode<IConstructor>(596, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(591, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(595, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__add_Expression__Expression_layouts_LAYOUTLIST_lit___43_layouts_LAYOUTLIST_Expression__assoc__left, tmp);
	}
    protected static final void _init_prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(449, 0, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(451, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(453, 4, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(450, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(452, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__bracket_Expression__lit___40_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___41__bracket, tmp);
	}
    protected static final void _init_prod__var_Expression__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(456, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__var_Expression__Id_, tmp);
	}
    protected static final void _init_prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(530, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(532, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(531, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__delete_Expression__lit_delete_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(645, 0, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(647, 2, prod__lit___62__char_class___range__62_62_, new int[] {62}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(649, 4, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(646, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(648, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__gt_Expression__Expression_layouts_LAYOUTLIST_lit___62_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(825, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(835, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(833, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(834, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(826, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assign_Expression__Expression_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(652, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(656, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(654, 2, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(655, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(653, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__inn_Expression__Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(838, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(842, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(840, 2, prod__lit___124_61__char_class___range__124_124_char_class___range__61_61_, new int[] {124,61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(841, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(839, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__assignBinOr_Expression__Expression_layouts_LAYOUTLIST_lit___124_61_layouts_LAYOUTLIST_Expression__assoc__right, tmp);
	}
    protected static final void _init_prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(659, 0, "Expression", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(663, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(661, 2, prod__lit___60__char_class___range__60_60_, new int[] {60}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(662, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(660, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__lt_Expression__Expression_layouts_LAYOUTLIST_lit___60_layouts_LAYOUTLIST_Expression__assoc__non_assoc, tmp);
	}
    protected static final void _init_prod__preIncr_Expression__lit___43_43_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new LiteralStackNode<IConstructor>(535, 0, prod__lit___43_43__char_class___range__43_43_char_class___range__43_43_, new int[] {43,43}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(537, 2, "Expression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(536, 1, "layouts_LAYOUTLIST", null, null);
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
      
        _init_prod__assign_Expression__ObjectDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
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
      
        _init_prod__assign_Expression__ArrayDestructure_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_Expression__assoc__right(builder);
      
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
      
      tmp[0] = new EpsilonStackNode<IConstructor>(912, 0);
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
      
      tmp[0] = new ListStackNode<IConstructor>(988, 0, regular__iter_star__char_class___range__65_90_range__97_122, new CharStackNode<IConstructor>(985, 0, new int[][]{{65,90},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{97,122}})});
      builder.addAlternative(Parser.prod__RegularExpressionFlags__iter_star__char_class___range__65_90_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionFlags__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFlags(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(993, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(996, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(991, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(992, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_108_97_103_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__108_108_char_class___range__97_97_char_class___range__103_103_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,108,97,103,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(995, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(994, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(1007, 1, prod__lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__111_111_char_class___range__117_117_char_class___range__114_114_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,111,117,114,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1010, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1009, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1008, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1011, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1006, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Source__char_class___range__0_0_lit___115_111_114_116_40_34_83_111_117_114_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Source, tmp);
	}
    protected static final void _init_prod__source_Source__iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(1017, 0, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(1015, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(1016, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1173, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1172, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1170, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__70_70_char_class___range__105_105_char_class___range__114_114_char_class___range__115_115_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,70,105,114,115,116,67,104,97,114,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1174, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1171, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1169, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionFirstChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_70_105_114_115_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionFirstChar, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1177, 0, new int[][]{{1,9},{11,41},{43,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__char_class___range__1_9_range__11_41_range__43_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionClass_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1179, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionFirstChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionFirstChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1181, 0, "RegularExpressionBackslashSequence", null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1280, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1279, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1277, 1, prod__lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__68_68_char_class___range__105_105_char_class___range__103_103_char_class___range__105_105_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,68,105,103,105,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1281, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1278, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1276, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexDigit__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_68_105_103_105_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexDigit, tmp);
	}
    protected static final void _init_prod__HexDigit__char_class___range__48_57_range__65_70_range__97_102_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1284, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(1886, 0, new int[][]{{42,42}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{47,47}})});
      builder.addAlternative(Parser.prod__CommentChar__char_class___range__42_42_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(1890, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1889, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1894, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1893, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1892, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1891, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CommentChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(1898, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1903, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1899, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,111,109,109,101,110,116,67,104,97,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1900, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(1902, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1901, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CommentChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_111_109_109_101_110_116_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__CommentChar, tmp);
	}
    protected static final void _init_prod__CommentChar__char_class___range__1_41_range__43_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(1907, 0, new int[][]{{1,41},{43,16777215}}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(1977, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(1976, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(1974, 1, prod__lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__70_70_char_class___range__111_111_char_class___range__114_114_char_class___range__66_66_char_class___range__105_105_char_class___range__110_110_char_class___range__100_100_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,70,111,114,66,105,110,100,105,110,103,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(1978, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(1975, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(1973, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding, tmp);
	}
    protected static final void _init_prod__ForBinding__AssignmentPattern_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1981, 0, "AssignmentPattern", null, null);
      builder.addAlternative(Parser.prod__ForBinding__AssignmentPattern_, tmp);
	}
    protected static final void _init_prod__ForBinding__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(1983, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__ForBinding__Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ForBinding__char_class___range__0_0_lit___115_111_114_116_40_34_70_111_114_66_105_110_100_105_110_103_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ForBinding(builder);
      
        _init_prod__ForBinding__AssignmentPattern_(builder);
      
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
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(2034, 3, "RegularExpressionFlags", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2031, 0, new int[][]{{47,47}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2032, 1, "RegularExpressionBody", null, null);
      tmp[2] = new CharStackNode<IConstructor>(2033, 2, new int[][]{{47,47}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpression__char_class___range__47_47_RegularExpressionBody_char_class___range__47_47_RegularExpressionFlags_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpression__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2037, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2042, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2041, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2040, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2039, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2038, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(2073, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2072, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2070, 1, prod__lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__85_85_char_class___range__110_110_char_class___range__105_105_char_class___range__99_99_char_class___range__111_111_char_class___range__100_100_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,85,110,105,99,111,100,101,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2074, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2071, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2069, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_UnicodeEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_85_110_105_99_111_100_101_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__UnicodeEscapeSequence, tmp);
	}
    protected static final void _init_prod__UnicodeEscapeSequence__lit_u_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_layouts_LAYOUTLIST_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2077, 0, prod__lit_u__char_class___range__117_117_, new int[] {117}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2081, 4, "HexDigit", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(2083, 6, "HexDigit", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2079, 2, "HexDigit", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(2085, 8, "HexDigit", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2080, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(2084, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2082, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2078, 1, "layouts_LAYOUTLIST", null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2130, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2129, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(2135, 4, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2133, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2134, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2132, 3, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2131, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__defaultCase_CaseClause__lit_default_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2140, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2139, 1, prod__lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2142, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2141, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2143, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2138, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CaseClause__char_class___range__0_0_lit___115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CaseClause, tmp);
	}
    protected static final void _init_prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[6] = new SeparatedListStackNode<IConstructor>(2155, 6, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2153, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2154, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2147, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2149, 2, "Expression", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2151, 4, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2152, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2148, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2150, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__caseOf_CaseClause__lit_case_layouts_LAYOUTLIST_Expression_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_CaseClause__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__CaseClause__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2158, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2160, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2163, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2159, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_67_97_115_101_67_108_97_117_115_101_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__117_117_char_class___range__115_115_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,67,97,115,101,67,108,97,117,115,101,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2162, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2161, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
    
    protected static final void _init_prod__init_VariableDeclaration__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2302, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2303, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2301, 0, "AssignmentPattern", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2304, 3, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2305, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclaration__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2313, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2312, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2310, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2309, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2311, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2314, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclaration, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2322, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2321, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2319, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2318, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2323, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2320, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclaration__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2334, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(2336, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2331, 0, "Id", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2335, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2333, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclaration__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclaration__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2340, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__nonInit_VariableDeclaration__id_Id_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__init_VariableDeclaration__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
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
      
      tmp[3] = new ListStackNode<IConstructor>(2350, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2349, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2347, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__111_111_char_class___range__100_100_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,111,100,121,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2351, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2348, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2346, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBody__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_111_100_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBody, tmp);
	}
    protected static final void _init_prod__RegularExpressionBody__RegularExpressionFirstChar_iter_star__RegularExpressionChar_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new ListStackNode<IConstructor>(2356, 1, regular__iter_star__RegularExpressionChar, new NonTerminalStackNode<IConstructor>(2355, 0, "RegularExpressionChar", null, null), false, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2354, 0, "RegularExpressionFirstChar", null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(2438, 1, prod__lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__111_111_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,108,97,114,97,116,111,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2441, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2440, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2437, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2439, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2442, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Declarator__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_108_97_114_97_116_111_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Declarator, tmp);
	}
    protected static final void _init_prod__Declarator__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(2445, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(2461, 1, prod__lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,68,101,99,108,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2464, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2463, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2460, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2462, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2465, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VarDecl__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_68_101_99_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VarDecl, tmp);
	}
    protected static final void _init_prod__VarDecl__Declarator_layouts_LAYOUTLIST_declarations_iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2469, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2476, 3, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(2468, 0, "Declarator", null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(2474, 2, regular__iter_seps__VariableDeclaration__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2470, 0, "VariableDeclaration", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2471, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2472, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2473, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(2477, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(2527, 1, "EscapeSequence", null, null);
      tmp[0] = new CharStackNode<IConstructor>(2526, 0, new int[][]{{92,92}}, null, null);
      builder.addAlternative(Parser.prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2532, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2535, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2530, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2531, 1, prod__lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2534, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2533, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2539, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2544, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2541, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2543, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2542, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2540, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,68,111,117,98,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar, tmp);
	}
    protected static final void _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2548, 0, new int[][]{{1,9},{11,33},{35,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__DoubleStringChar__char_class___range__92_92_EscapeSequence_(builder);
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DoubleStringChar(builder);
      
        _init_prod__$MetaHole_DoubleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_68_111_117_98_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__DoubleStringChar(builder);
      
        _init_prod__DoubleStringChar__char_class___range__1_9_range__11_33_range__35_91_range__93_16777215_(builder);
      
    }
  }
	
  protected static class ObjectDestructure {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_ObjectDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ObjectDestructure(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(2613, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2612, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2610, 1, prod__lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__79_79_char_class___range__98_98_char_class___range__106_106_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__68_68_char_class___range__101_101_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__99_99_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,79,98,106,101,99,116,68,101,115,116,114,117,99,116,117,114,101,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2609, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2614, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2611, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ObjectDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ObjectDestructure, tmp);
	}
    protected static final void _init_prod__ObjectDestructure__lit___123_layouts_LAYOUTLIST_iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[2] = new SeparatedListStackNode<IConstructor>(2623, 2, regular__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(2619, 0, "AssignmentProperty", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(2620, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(2621, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(2622, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(2628, 6, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new OptionalStackNode<IConstructor>(2626, 4, regular__opt__lit___44, new LiteralStackNode<IConstructor>(2625, 0, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(2617, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(2624, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2618, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(2627, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__ObjectDestructure__lit___123_layouts_LAYOUTLIST_iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ObjectDestructure__char_class___range__0_0_lit___115_111_114_116_40_34_79_98_106_101_99_116_68_101_115_116_114_117_99_116_117_114_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ObjectDestructure(builder);
      
        _init_prod__ObjectDestructure__lit___123_layouts_LAYOUTLIST_iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_opt__lit___44_layouts_LAYOUTLIST_lit___125_(builder);
      
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
      
      tmp[0] = new SequenceStackNode<IConstructor>(2652, 0, regular__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new CharStackNode<IConstructor>(2645, 0, new int[][]{{36,36},{65,90},{95,95},{97,122}}, new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null), new ListStackNode<IConstructor>(2649, 1, regular__iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122, new CharStackNode<IConstructor>(2646, 0, new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})})}, null, new ICompletionFilter[] {new StringMatchRestriction(new int[] {98,114,101,97,107}), new StringMatchRestriction(new int[] {116,104,105,115}), new StringMatchRestriction(new int[] {105,102}), new StringMatchRestriction(new int[] {110,97,116,105,118,101}), new StringMatchRestriction(new int[] {116,114,97,110,115,105,101,110,116}), new StringMatchRestriction(new int[] {105,110,116}), new StringMatchRestriction(new int[] {116,104,114,111,119,115}), new StringMatchRestriction(new int[] {105,110,115,116,97,110,99,101,111,102}), new StringMatchRestriction(new int[] {110,101,119}), new StringMatchRestriction(new int[] {115,117,112,101,114}), new StringMatchRestriction(new int[] {99,97,116,99,104}), new StringMatchRestriction(new int[] {116,114,121}), new StringMatchRestriction(new int[] {101,120,116,101,110,100,115}), new StringMatchRestriction(new int[] {105,110,116,101,114,102,97,99,101}), new StringMatchRestriction(new int[] {101,108,115,101}), new StringMatchRestriction(new int[] {102,117,110,99,116,105,111,110}), new StringMatchRestriction(new int[] {99,108,97,115,115}), new StringMatchRestriction(new int[] {102,108,111,97,116}), new StringMatchRestriction(new int[] {108,111,110,103}), new StringMatchRestriction(new int[] {118,111,108,97,116,105,108,101}), new StringMatchRestriction(new int[] {115,104,111,114,116}), new StringMatchRestriction(new int[] {119,104,105,108,101}), new StringMatchRestriction(new int[] {100,111,117,98,108,101}), new StringMatchRestriction(new int[] {116,121,112,101,111,102}), new StringMatchRestriction(new int[] {99,97,115,101}), new StringMatchRestriction(new int[] {105,109,112,108,101,109,101,110,116,115}), new StringMatchRestriction(new int[] {114,101,116,117,114,110}), new StringMatchRestriction(new int[] {99,104,97,114}), new StringMatchRestriction(new int[] {102,105,110,97,108}), new StringMatchRestriction(new int[] {115,119,105,116,99,104}), new StringMatchRestriction(new int[] {101,120,112,111,114,116}), new StringMatchRestriction(new int[] {115,121,110,99,104,114,111,110,105,122,101,100}), new StringMatchRestriction(new int[] {118,111,105,100}), new StringMatchRestriction(new int[] {100,101,108,101,116,101}), new StringMatchRestriction(new int[] {100,111}), new StringMatchRestriction(new int[] {112,117,98,108,105,99}), new StringMatchRestriction(new int[] {102,111,114}), new StringMatchRestriction(new int[] {98,121,116,101}), new StringMatchRestriction(new int[] {98,111,111,108,101,97,110}), new StringMatchRestriction(new int[] {112,114,111,116,101,99,116,101,100}), new StringMatchRestriction(new int[] {115,116,97,116,105,99}), new StringMatchRestriction(new int[] {116,114,117,101}), new StringMatchRestriction(new int[] {99,111,110,115,116}), new StringMatchRestriction(new int[] {103,111,116,111}), new StringMatchRestriction(new int[] {102,97,108,115,101}), new StringMatchRestriction(new int[] {102,105,110,97,108,108,121}), new StringMatchRestriction(new int[] {112,114,105,118,97,116,101}), new StringMatchRestriction(new int[] {100,101,102,97,117,108,116}), new StringMatchRestriction(new int[] {101,110,117,109}), new StringMatchRestriction(new int[] {100,101,98,117,103,103,101,114}), new StringMatchRestriction(new int[] {118,97,114}), new StringMatchRestriction(new int[] {110,117,108,108}), new StringMatchRestriction(new int[] {99,111,110,116,105,110,117,101}), new StringMatchRestriction(new int[] {116,104,114,111,119}), new StringMatchRestriction(new int[] {112,97,99,107,97,103,101}), new StringMatchRestriction(new int[] {105,109,112,111,114,116}), new StringMatchRestriction(new int[] {105,110})});
      builder.addAlternative(Parser.prod__Id__seq___char_class___range__36_36_range__65_90_range__95_95_range__97_122_iter_star__char_class___range__36_36_range__48_57_range__65_90_range__95_95_range__97_122_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Id__char_class___range__0_0_lit___115_111_114_116_40_34_73_100_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Id(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2655, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2660, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2657, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2659, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2658, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2656, 1, prod__lit___115_111_114_116_40_34_73_100_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__100_100_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,100,34,41}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(2665, 0, new int[][]{{1,9},{11,33},{35,38},{40,47},{58,91},{93,97},{99,101},{103,109},{111,113},{115,115},{119,119},{121,16777215}}, null, null);
      builder.addAlternative(Parser.prod__NonEscapeCharacter__char_class___range__1_9_range__11_33_range__35_38_range__40_47_range__58_91_range__93_97_range__99_101_range__103_109_range__111_113_range__115_115_range__119_119_range__121_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_NonEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__NonEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2668, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2670, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2673, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2669, 1, prod__lit___115_111_114_116_40_34_78_111_110_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__111_111_char_class___range__110_110_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,111,110,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2672, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2671, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(2686, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(2688, 0, new int[][]{{1,9},{11,91},{94,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClassChar__char_class___range__1_9_range__11_91_range__94_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(2693, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2696, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2691, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2692, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2695, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2694, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClassChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionClassChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionClassChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(2700, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2705, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2702, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2701, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2704, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2703, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(2858, 0, new int[][]{{9,10},{13,13},{32,32}}, null, null);
      builder.addAlternative(Parser.prod__Whitespace__char_class___range__9_10_range__13_13_range__32_32_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Whitespace__char_class___range__0_0_lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Whitespace(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(2866, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2863, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2861, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(2865, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2864, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2862, 1, prod__lit___115_111_114_116_40_34_87_104_105_116_101_115_112_97_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__87_87_char_class___range__104_104_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__115_115_char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,87,104,105,116,101,115,112,97,99,101,34,41}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(2910, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(2909, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(2907, 1, prod__lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(2911, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(2908, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(2906, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_HexEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexEscapeSequence, tmp);
	}
    protected static final void _init_prod__HexEscapeSequence__char_class___range__120_120_HexDigit_HexDigit_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(2914, 0, new int[][]{{120,120}}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(2916, 2, "HexDigit", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(2915, 1, "HexDigit", null, null);
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
      
      tmp[12] = new SeparatedListStackNode<IConstructor>(3133, 12, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(3131, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(3132, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(3123, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(3125, 6, "Param", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(3121, 2, "PropertyName", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(3128, 9, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(3126, 7, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(3134, 13, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(3127, 8, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(3135, 14, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(3129, 10, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3119, 0, prod__lit_set__char_class___range__115_115_char_class___range__101_101_char_class___range__116_116_, new int[] {115,101,116}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(3122, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(3130, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3120, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(3124, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_set_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Param_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(3146, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(3141, 4, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(3139, 2, "PropertyName", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(3145, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(3144, 7, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3137, 0, prod__lit_get__char_class___range__103_103_char_class___range__101_101_char_class___range__116_116_, new int[] {103,101,116}, null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(3149, 10, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(3147, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(3148, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(3151, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(3143, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(3140, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(3150, 11, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(3138, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(3142, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__MethodDefinition__lit_get_layouts_LAYOUTLIST_PropertyName_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__$MetaHole_MethodDefinition__char_class___range__0_0_lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__MethodDefinition(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(3158, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3157, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3155, 1, prod__lit___115_111_114_116_40_34_77_101_116_104_111_100_68_101_102_105_110_105_116_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__77_77_char_class___range__101_101_char_class___range__116_116_char_class___range__104_104_char_class___range__111_111_char_class___range__100_100_char_class___range__68_68_char_class___range__101_101_char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,77,101,116,104,111,100,68,101,102,105,110,105,116,105,111,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3154, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3159, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3156, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
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
      
      tmp[0] = new ListStackNode<IConstructor>(3223, 0, regular__iter_star__LAYOUT, new NonTerminalStackNode<IConstructor>(3218, 0, "LAYOUT", null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{9,10},{32,32}}), new StringFollowRestriction(new int[] {47,47}), new StringFollowRestriction(new int[] {47,42})});
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
      
      tmp[1] = new ListStackNode<IConstructor>(3270, 1, regular__iter_star__char_class___range__1_9_range__11_16777215, new CharStackNode<IConstructor>(3268, 0, new int[][]{{1,9},{11,16777215}}, null, null), false, null, new ICompletionFilter[] {new AtEndOfLineRequirement()});
      tmp[0] = new LiteralStackNode<IConstructor>(3267, 0, prod__lit___47_47__char_class___range__47_47_char_class___range__47_47_, new int[] {47,47}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_47_iter_star__char_class___range__1_9_range__11_16777215__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3275, 2, prod__lit___42_47__char_class___range__42_42_char_class___range__47_47_, new int[] {42,47}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(3274, 1, regular__iter_star__CommentChar, new NonTerminalStackNode<IConstructor>(3273, 0, "CommentChar", null, null), false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3272, 0, prod__lit___47_42__char_class___range__47_47_char_class___range__42_42_, new int[] {47,42}, null, null);
      builder.addAlternative(Parser.prod__Comment__lit___47_42_iter_star__CommentChar_lit___42_47__tag__category___67_111_109_109_101_110_116, tmp);
	}
    protected static final void _init_prod__$MetaHole_Comment__char_class___range__0_0_lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Comment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3278, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3280, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3279, 1, prod__lit___115_111_114_116_40_34_67_111_109_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__111_111_char_class___range__109_109_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,111,109,109,101,110,116,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3282, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3281, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3283, 4, new int[][]{{0,0}}, null, null);
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
      
      tmp[0] = new LiteralStackNode<IConstructor>(3628, 0, prod__lit_int__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_, new int[] {105,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_int_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_char_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3630, 0, prod__lit_char__char_class___range__99_99_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_, new int[] {99,104,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_char_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_catch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3632, 0, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_catch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_continue_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3634, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_continue_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_break_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3636, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_break_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_for_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3638, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_for_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_native_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3640, 0, prod__lit_native__char_class___range__110_110_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__118_118_char_class___range__101_101_, new int[] {110,97,116,105,118,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_native_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_short_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3642, 0, prod__lit_short__char_class___range__115_115_char_class___range__104_104_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {115,104,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_short_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_package_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3644, 0, prod__lit_package__char_class___range__112_112_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__97_97_char_class___range__103_103_char_class___range__101_101_, new int[] {112,97,99,107,97,103,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_package_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_export_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3646, 0, prod__lit_export__char_class___range__101_101_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {101,120,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_export_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_protected_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3648, 0, prod__lit_protected__char_class___range__112_112_char_class___range__114_114_char_class___range__111_111_char_class___range__116_116_char_class___range__101_101_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__100_100_, new int[] {112,114,111,116,101,99,116,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_protected_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_import_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3650, 0, prod__lit_import__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_, new int[] {105,109,112,111,114,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_import_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_implements_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3652, 0, prod__lit_implements__char_class___range__105_105_char_class___range__109_109_char_class___range__112_112_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__115_115_, new int[] {105,109,112,108,101,109,101,110,116,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_implements_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3654, 0, prod__lit_function__char_class___range__102_102_char_class___range__117_117_char_class___range__110_110_char_class___range__99_99_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_, new int[] {102,117,110,99,116,105,111,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_function_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_double_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3656, 0, prod__lit_double__char_class___range__100_100_char_class___range__111_111_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_, new int[] {100,111,117,98,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_double_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_switch_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3658, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_switch_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_case_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3660, 0, prod__lit_case__char_class___range__99_99_char_class___range__97_97_char_class___range__115_115_char_class___range__101_101_, new int[] {99,97,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_case_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_var_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3662, 0, prod__lit_var__char_class___range__118_118_char_class___range__97_97_char_class___range__114_114_, new int[] {118,97,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_var_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_while_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3664, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_while_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_const_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3666, 0, prod__lit_const__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_, new int[] {99,111,110,115,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_const_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_super_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3668, 0, prod__lit_super__char_class___range__115_115_char_class___range__117_117_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_, new int[] {115,117,112,101,114}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_super_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_transient_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3670, 0, prod__lit_transient__char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__110_110_char_class___range__115_115_char_class___range__105_105_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_, new int[] {116,114,97,110,115,105,101,110,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_transient_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_typeof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3672, 0, prod__lit_typeof__char_class___range__116_116_char_class___range__121_121_char_class___range__112_112_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {116,121,112,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_typeof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_this_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3674, 0, prod__lit_this__char_class___range__116_116_char_class___range__104_104_char_class___range__105_105_char_class___range__115_115_, new int[] {116,104,105,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_this_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throw_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3676, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throw_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_with_lit_abstract_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new LiteralStackNode<IConstructor>(3679, 1, prod__lit_abstract__char_class___range__97_97_char_class___range__98_98_char_class___range__115_115_char_class___range__116_116_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_, new int[] {97,98,115,116,114,97,99,116}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(3678, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_with_lit_abstract_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_public_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3681, 0, prod__lit_public__char_class___range__112_112_char_class___range__117_117_char_class___range__98_98_char_class___range__108_108_char_class___range__105_105_char_class___range__99_99_, new int[] {112,117,98,108,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_public_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_long_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3683, 0, prod__lit_long__char_class___range__108_108_char_class___range__111_111_char_class___range__110_110_char_class___range__103_103_, new int[] {108,111,110,103}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_long_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_static_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3685, 0, prod__lit_static__char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__99_99_, new int[] {115,116,97,116,105,99}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_static_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_float_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3687, 0, prod__lit_float__char_class___range__102_102_char_class___range__108_108_char_class___range__111_111_char_class___range__97_97_char_class___range__116_116_, new int[] {102,108,111,97,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_float_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_throws_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3689, 0, prod__lit_throws__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_char_class___range__115_115_, new int[] {116,104,114,111,119,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_throws_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_default_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3691, 0, prod__lit_default__char_class___range__100_100_char_class___range__101_101_char_class___range__102_102_char_class___range__97_97_char_class___range__117_117_char_class___range__108_108_char_class___range__116_116_, new int[] {100,101,102,97,117,108,116}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_default_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_new_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3693, 0, prod__lit_new__char_class___range__110_110_char_class___range__101_101_char_class___range__119_119_, new int[] {110,101,119}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_new_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_delete_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3695, 0, prod__lit_delete__char_class___range__100_100_char_class___range__101_101_char_class___range__108_108_char_class___range__101_101_char_class___range__116_116_char_class___range__101_101_, new int[] {100,101,108,101,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_delete_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_try_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3697, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_try_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_private_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3699, 0, prod__lit_private__char_class___range__112_112_char_class___range__114_114_char_class___range__105_105_char_class___range__118_118_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_, new int[] {112,114,105,118,97,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_private_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3701, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_true_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_volatile_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3703, 0, prod__lit_volatile__char_class___range__118_118_char_class___range__111_111_char_class___range__108_108_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {118,111,108,97,116,105,108,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_volatile_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3705, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_null_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_finally_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3707, 0, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_finally_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_void_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3709, 0, prod__lit_void__char_class___range__118_118_char_class___range__111_111_char_class___range__105_105_char_class___range__100_100_, new int[] {118,111,105,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_void_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_return_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3711, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_return_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3713, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_false_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_interface_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3715, 0, prod__lit_interface__char_class___range__105_105_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__102_102_char_class___range__97_97_char_class___range__99_99_char_class___range__101_101_, new int[] {105,110,116,101,114,102,97,99,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_interface_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_instanceof_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3717, 0, prod__lit_instanceof__char_class___range__105_105_char_class___range__110_110_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__111_111_char_class___range__102_102_, new int[] {105,110,115,116,97,110,99,101,111,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_instanceof_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_else_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3719, 0, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_else_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_in_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3721, 0, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_in_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_synchronized_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3723, 0, prod__lit_synchronized__char_class___range__115_115_char_class___range__121_121_char_class___range__110_110_char_class___range__99_99_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__110_110_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__100_100_, new int[] {115,121,110,99,104,114,111,110,105,122,101,100}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_synchronized_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_if_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3725, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_if_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_enum_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3727, 0, prod__lit_enum__char_class___range__101_101_char_class___range__110_110_char_class___range__117_117_char_class___range__109_109_, new int[] {101,110,117,109}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_enum_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_byte_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3729, 0, prod__lit_byte__char_class___range__98_98_char_class___range__121_121_char_class___range__116_116_char_class___range__101_101_, new int[] {98,121,116,101}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_byte_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_class_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3731, 0, prod__lit_class__char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_, new int[] {99,108,97,115,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_class_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_goto_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3733, 0, prod__lit_goto__char_class___range__103_103_char_class___range__111_111_char_class___range__116_116_char_class___range__111_111_, new int[] {103,111,116,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_goto_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_final_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3735, 0, prod__lit_final__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_, new int[] {102,105,110,97,108}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_final_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_extends_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3737, 0, prod__lit_extends__char_class___range__101_101_char_class___range__120_120_char_class___range__116_116_char_class___range__101_101_char_class___range__110_110_char_class___range__100_100_char_class___range__115_115_, new int[] {101,120,116,101,110,100,115}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_extends_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_do_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3739, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_do_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3741, 0, prod__lit_boolean__char_class___range__98_98_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_, new int[] {98,111,111,108,101,97,110}, null, null);
      builder.addAlternative(Parser.prod__Reserved__lit_boolean_, tmp);
	}
    protected static final void _init_prod__Reserved__lit_debugger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3743, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
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
      
      tmp[3] = new ListStackNode<IConstructor>(3815, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3814, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3812, 1, prod__lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__66_66_char_class___range__111_111_char_class___range__111_111_char_class___range__108_108_char_class___range__101_101_char_class___range__97_97_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,66,111,111,108,101,97,110,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3811, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3816, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3813, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Boolean__char_class___range__0_0_lit___115_111_114_116_40_34_66_111_111_108_101_97_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Boolean, tmp);
	}
    protected static final void _init_prod__Boolean__lit_true_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3819, 0, prod__lit_true__char_class___range__116_116_char_class___range__114_114_char_class___range__117_117_char_class___range__101_101_, new int[] {116,114,117,101}, null, null);
      builder.addAlternative(Parser.prod__Boolean__lit_true_, tmp);
	}
    protected static final void _init_prod__Boolean__lit_false_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(3821, 0, prod__lit_false__char_class___range__102_102_char_class___range__97_97_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {102,97,108,115,101}, null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(3825, 0, new int[][]{{34,34},{39,39},{92,92},{98,98},{102,102},{110,110},{114,114},{116,116},{118,118}}, null, null);
      builder.addAlternative(Parser.prod__SingleEscapeCharacter__char_class___range__34_34_range__39_39_range__92_92_range__98_98_range__102_102_range__110_110_range__114_114_range__116_116_range__118_118_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleEscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleEscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(3830, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3833, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3828, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3829, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3832, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3831, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[1] = new CharStackNode<IConstructor>(3870, 1, new int[][]{{88,88},{120,120}}, null, null);
      tmp[2] = new ListStackNode<IConstructor>(3874, 2, regular__iter__char_class___range__48_57_range__65_70_range__97_102, new CharStackNode<IConstructor>(3871, 0, new int[][]{{48,57},{65,70},{97,102}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{65,90},{95,95},{97,122}})});
      tmp[0] = new CharStackNode<IConstructor>(3869, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__HexInteger__char_class___range__48_48_char_class___range__88_88_range__120_120_iter__char_class___range__48_57_range__65_70_range__97_102_, tmp);
	}
    protected static final void _init_prod__$MetaHole_HexInteger__char_class___range__0_0_lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__HexInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(3877, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(3879, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3882, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3878, 1, prod__lit___115_111_114_116_40_34_72_101_120_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__72_72_char_class___range__101_101_char_class___range__120_120_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,72,101,120,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3881, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3880, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[2] = new LiteralStackNode<IConstructor>(3928, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(3931, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(3926, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(3927, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__66_66_char_class___range__97_97_char_class___range__99_99_char_class___range__107_107_char_class___range__115_115_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__104_104_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,66,97,99,107,115,108,97,115,104,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(3930, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(3929, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence, tmp);
	}
    protected static final void _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(3934, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new CharStackNode<IConstructor>(3935, 1, new int[][]{{1,9},{11,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionBackslashSequence__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_66_97_99_107_115_108_97_115_104_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionBackslashSequence(builder);
      
        _init_prod__RegularExpressionBackslashSequence__char_class___range__92_92_char_class___range__1_9_range__11_16777215_(builder);
      
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
      
      tmp[3] = new ListStackNode<IConstructor>(4038, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4037, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4035, 1, prod__lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4039, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4036, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4034, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart, tmp);
	}
    protected static final void _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4043, 1, "SignedInteger", null, null);
      tmp[0] = new CharStackNode<IConstructor>(4042, 0, new int[][]{{69,69},{101,101}}, null, null);
      builder.addAlternative(Parser.prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4050, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4049, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4047, 1, prod__lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__111_111_char_class___range__110_110_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {111,112,116,40,115,111,114,116,40,34,69,120,112,111,110,101,110,116,80,97,114,116,34,41,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4046, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4051, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4048, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ExponentPart(builder);
      
        _init_prod__ExponentPart__char_class___range__69_69_range__101_101_SignedInteger_(builder);
      
        _init_prod__$MetaHole_ExponentPart__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_69_120_112_111_110_101_110_116_80_97_114_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__ExponentPart(builder);
      
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
      
      tmp[0] = new CharStackNode<IConstructor>(4109, 0, new int[][]{{48,48}}, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__EscapeSequence__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__UnicodeEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4111, 0, "UnicodeEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__UnicodeEscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4115, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4118, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4117, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4116, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4119, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4114, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeSequence, tmp);
	}
    protected static final void _init_prod__EscapeSequence__HexEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4122, 0, "HexEscapeSequence", null, null);
      builder.addAlternative(Parser.prod__EscapeSequence__HexEscapeSequence_, tmp);
	}
    protected static final void _init_prod__EscapeSequence__CharacterEscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4124, 0, "CharacterEscapeSequence", null, null);
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
	
  protected static class SignedInteger {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4164, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4163, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4161, 1, prod__lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__101_101_char_class___range__100_100_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,103,110,101,100,73,110,116,101,103,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4160, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4165, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4162, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SignedInteger__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_103_110_101_100_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SignedInteger, tmp);
	}
    protected static final void _init_prod__SignedInteger__opt__char_class___range__43_43_range__45_45_iter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new OptionalStackNode<IConstructor>(4169, 0, regular__opt__char_class___range__43_43_range__45_45, new CharStackNode<IConstructor>(4168, 0, new int[][]{{43,43},{45,45}}, null, null), null, null);
      tmp[1] = new ListStackNode<IConstructor>(4173, 1, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4170, 0, new int[][]{{48,57}}, null, null), true, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4198, 0, "HexInteger", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
      builder.addAlternative(Parser.prod__Numeric__HexInteger_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4205, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4204, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4201, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4206, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4203, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4202, 1, prod__lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__78_78_char_class___range__117_117_char_class___range__109_109_char_class___range__101_101_char_class___range__114_114_char_class___range__105_105_char_class___range__99_99_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,78,117,109,101,114,105,99,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Numeric__char_class___range__0_0_lit___115_111_114_116_40_34_78_117_109_101_114_105_99_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Numeric, tmp);
	}
    protected static final void _init_prod__Numeric__Decimal_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4211, 0, "Decimal", new IEnterFilter[] {new CharPrecedeRestriction(new int[][]{{36,36},{48,57},{65,90},{95,95},{97,122}})}, null);
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
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(4221, 2, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4218, 0, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4219, 1, "Source", null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4225, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__Param__Id_, tmp);
	}
    protected static final void _init_prod__Param__AssignmentPattern_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4227, 0, "AssignmentPattern", null, null);
      builder.addAlternative(Parser.prod__Param__AssignmentPattern_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(4231, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,97,114,97,109,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4235, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4232, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4234, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4233, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4230, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Param__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_97_114_97_109_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4248, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4245, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4244, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4243, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4247, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4246, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Param__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Param, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Param__Id_(builder);
      
        _init_prod__Param__AssignmentPattern_(builder);
      
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
      
      tmp[2] = new LiteralStackNode<IConstructor>(4405, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4408, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4403, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4404, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__108_108_char_class___range__97_97_char_class___range__115_115_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,108,97,115,115,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4407, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4406, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass, tmp);
	}
    protected static final void _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[0] = new CharStackNode<IConstructor>(4411, 0, new int[][]{{91,91}}, null, null);
      tmp[2] = new CharStackNode<IConstructor>(4414, 2, new int[][]{{93,93}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(4413, 1, regular__iter_star__RegularExpressionClassChar, new NonTerminalStackNode<IConstructor>(4412, 0, "RegularExpressionClassChar", null, null), false, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_RegularExpressionClass__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_108_97_115_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionClass(builder);
      
        _init_prod__RegularExpressionClass__char_class___range__91_91_iter_star__RegularExpressionClassChar_char_class___range__93_93_(builder);
      
    }
  }
	
  protected static class AssignmentElement {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(4419, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4421, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4424, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4420, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__69_69_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,115,115,105,103,110,109,101,110,116,69,108,101,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4423, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4422, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__AssignmentElement__LHSExpression_layouts_LAYOUTLIST_opt__Initializer_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new OptionalStackNode<IConstructor>(4434, 2, regular__opt__Initializer, new NonTerminalStackNode<IConstructor>(4433, 0, "Initializer", null, null), null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4431, 0, "LHSExpression", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4432, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__AssignmentElement__LHSExpression_layouts_LAYOUTLIST_opt__Initializer_, tmp);
	}
    protected static final void _init_prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentElement(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4442, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4441, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4440, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4439, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4437, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4438, 1, prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__69_69_char_class___range__108_108_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,115,115,105,103,110,109,101,110,116,69,108,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentElement, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentElement__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__AssignmentElement__LHSExpression_layouts_LAYOUTLIST_opt__Initializer_(builder);
      
        _init_prod__$MetaHole_AssignmentElement__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_69_108_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentElement(builder);
      
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4576, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4577, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(4575, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__expression_Statement__Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4581, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4586, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4588, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4583, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4595, 11, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4589, 8, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4587, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4582, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4596, 12, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4584, 4, "Expression", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4590, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new SeparatedListStackNode<IConstructor>(4593, 10, regular__iter_star_seps__CaseClause__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4591, 0, "CaseClause", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4592, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4580, 0, prod__lit_switch__char_class___range__115_115_char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {115,119,105,116,99,104}, null, null);
      builder.addAlternative(Parser.prod__switchCase_Statement__lit_switch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___123_layouts_LAYOUTLIST_clauses_iter_star_seps__CaseClause__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4600, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4601, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4599, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      builder.addAlternative(Parser.prod__breakNoLabel_Statement__lit_break_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[15];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4607, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4616, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4618, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4611, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4605, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4609, 5, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4612, 8, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4608, 4, "Declarator", null, null);
      tmp[14] = new NonTerminalStackNode<IConstructor>(4619, 14, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4617, 12, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4606, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4610, 6, "ForBinding", null, null);
      tmp[10] = new NonTerminalStackNode<IConstructor>(4614, 10, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4604, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4613, 9, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forInDeclaration_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_ForBinding_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[11];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4631, 8, "Statement", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4628, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4623, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4630, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4625, 3, "layouts_LAYOUTLIST", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4632, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4622, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new EmptyStackNode<IConstructor>(4635, 10, regular__empty, null, new ICompletionFilter[] {new StringFollowRestriction(new int[] {101,108,115,101})});
      tmp[2] = new LiteralStackNode<IConstructor>(4624, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4629, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4626, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__ifThen_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_empty_, tmp);
	}
    protected static final void _init_prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4639, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4638, 0, prod__lit_debugger__char_class___range__100_100_char_class___range__101_101_char_class___range__98_98_char_class___range__117_117_char_class___range__103_103_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_, new int[] {100,101,98,117,103,103,101,114}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4640, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__debugger_Statement__lit_debugger_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new LiteralStackNode<IConstructor>(4645, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4643, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4644, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueNoLabel_Statement__lit_continue_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4653, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4650, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4648, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4652, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4651, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4649, 1, prod__lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Statement, tmp);
	}
    protected static final void _init_prod__empty_Statement__lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4657, 0, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      builder.addAlternative(Parser.prod__empty_Statement__lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[16] = new NonTerminalStackNode<IConstructor>(4676, 16, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4669, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4670, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4660, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4666, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4662, 2, "Statement", null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4674, 14, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4672, 12, "Statement", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4664, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4668, 8, "Id", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4675, 15, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4667, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4661, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4665, 5, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4673, 13, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4663, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4671, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__tryCatchFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[9] = new NonTerminalStackNode<IConstructor>(4689, 9, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4679, 0, prod__lit_do__char_class___range__100_100_char_class___range__111_111_, new int[] {100,111}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4690, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4685, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4681, 2, "Statement", null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4692, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4683, 4, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4687, 8, "Expression", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4684, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4680, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4686, 7, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4682, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4691, 11, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__doWhile_Statement__lit_do_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[19];
      
      tmp[10] = new SeparatedListStackNode<IConstructor>(4713, 10, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4709, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4710, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4711, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4712, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4695, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[16] = new LiteralStackNode<IConstructor>(4725, 16, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4708, 9, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4699, 4, "Declarator", null, null);
      tmp[14] = new SeparatedListStackNode<IConstructor>(4722, 14, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4718, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4719, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4720, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4721, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new LiteralStackNode<IConstructor>(4716, 12, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[18] = new NonTerminalStackNode<IConstructor>(4727, 18, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4697, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new SeparatedListStackNode<IConstructor>(4705, 6, regular__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4701, 0, "VariableDeclarationNoIn", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4702, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4703, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4704, 3, "layouts_LAYOUTLIST", null, null)}, true, null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4724, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new LiteralStackNode<IConstructor>(4707, 8, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[17] = new NonTerminalStackNode<IConstructor>(4726, 17, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4698, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4715, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4717, 13, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4706, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4700, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4696, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forDoDeclarations_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Declarator_layouts_LAYOUTLIST_iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4731, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4732, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4730, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      builder.addAlternative(Parser.prod__returnNoExp_Statement__lit_return_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(4736, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4737, 2, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4735, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      builder.addAlternative(Parser.prod__throwNoExp_Statement__lit_throw_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[7] = new NonTerminalStackNode<IConstructor>(4747, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4745, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4741, 1, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4751, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4743, 3, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4748, 8, "Id", null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4742, 2, "Statement", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4746, 6, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4744, 4, prod__lit_catch__char_class___range__99_99_char_class___range__97_97_char_class___range__116_116_char_class___range__99_99_char_class___range__104_104_, new int[] {99,97,116,99,104}, null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4752, 12, "Statement", null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4749, 9, "layouts_LAYOUTLIST", null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4750, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4740, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      builder.addAlternative(Parser.prod__tryCatch_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_catch_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[17];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4758, 3, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4775, 11, "layouts_LAYOUTLIST", null, null);
      tmp[13] = new NonTerminalStackNode<IConstructor>(4782, 13, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4756, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4764, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4766, 7, "layouts_LAYOUTLIST", null, null);
      tmp[15] = new NonTerminalStackNode<IConstructor>(4784, 15, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new SeparatedListStackNode<IConstructor>(4771, 8, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4767, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4768, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4769, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4770, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[4] = new SeparatedListStackNode<IConstructor>(4763, 4, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4759, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4760, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4761, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4762, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[12] = new SeparatedListStackNode<IConstructor>(4780, 12, regular__iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4776, 0, "Expression", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4777, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(4778, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(4779, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[14] = new LiteralStackNode<IConstructor>(4783, 14, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4757, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4765, 6, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4774, 10, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4755, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4773, 9, "layouts_LAYOUTLIST", null, null);
      tmp[16] = new NonTerminalStackNode<IConstructor>(4785, 16, "Statement", null, null);
      builder.addAlternative(Parser.prod__forDo_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_conds_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___59_layouts_LAYOUTLIST_ops_iter_star_seps__Expression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(4792, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4791, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4789, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__116_116_char_class___range__97_97_char_class___range__116_116_char_class___range__101_101_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,116,97,116,101,109,101,110,116,34,41,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4793, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4790, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4788, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Statement__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_116_97_116_101_109_101_110_116_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__Statement__layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[8] = new NonTerminalStackNode<IConstructor>(4808, 8, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4802, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4807, 7, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4805, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4800, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4799, 0, prod__lit_while__char_class___range__119_119_char_class___range__104_104_char_class___range__105_105_char_class___range__108_108_char_class___range__101_101_, new int[] {119,104,105,108,101}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4803, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4801, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4806, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      builder.addAlternative(Parser.prod__whileDo_Statement__lit_while_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4815, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4812, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4811, 0, prod__lit_throw__char_class___range__116_116_char_class___range__104_104_char_class___range__114_114_char_class___range__111_111_char_class___range__119_119_, new int[] {116,104,114,111,119}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4816, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4813, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__throwExp_Statement__lit_throw_layouts_LAYOUTLIST_expression_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4822, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4820, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4819, 0, prod__lit_break__char_class___range__98_98_char_class___range__114_114_char_class___range__101_101_char_class___range__97_97_char_class___range__107_107_, new int[] {98,114,101,97,107}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4823, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4821, 2, "Id", null, null);
      builder.addAlternative(Parser.prod__breakLabel_Statement__lit_break_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__varDecl_Statement__VarDecl_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4826, 0, "VarDecl", null, null);
      builder.addAlternative(Parser.prod__varDecl_Statement__VarDecl_, tmp);
	}
    protected static final void _init_prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new NonTerminalStackNode<IConstructor>(4833, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4830, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4829, 0, prod__lit_return__char_class___range__114_114_char_class___range__101_101_char_class___range__116_116_char_class___range__117_117_char_class___range__114_114_char_class___range__110_110_, new int[] {114,101,116,117,114,110}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4834, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4831, 2, "Expression", null, null);
      builder.addAlternative(Parser.prod__returnExp_Statement__lit_return_layouts_LAYOUTLIST_exp_Expression_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4841, 4, "Expression", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4850, 12, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4839, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4844, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4837, 0, prod__lit_if__char_class___range__105_105_char_class___range__102_102_, new int[] {105,102}, null, null);
      tmp[10] = new LiteralStackNode<IConstructor>(4848, 10, prod__lit_else__char_class___range__101_101_char_class___range__108_108_char_class___range__115_115_char_class___range__101_101_, new int[] {101,108,115,101}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4847, 9, "layouts_LAYOUTLIST", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4849, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4840, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4838, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4843, 5, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4845, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4846, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__ifThenElse_Statement__lit_if_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_cond_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_else_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[9];
      
      tmp[4] = new NonTerminalStackNode<IConstructor>(4857, 4, "Expression", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4855, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4860, 6, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4853, 0, prod__lit_with__char_class___range__119_119_char_class___range__105_105_char_class___range__116_116_char_class___range__104_104_, new int[] {119,105,116,104}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4856, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4859, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4854, 1, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4861, 7, "layouts_LAYOUTLIST", null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4862, 8, "Statement", null, null);
      builder.addAlternative(Parser.prod__with_Statement__lit_with_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_scope_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4865, 0, prod__lit_continue__char_class___range__99_99_char_class___range__111_111_char_class___range__110_110_char_class___range__116_116_char_class___range__105_105_char_class___range__110_110_char_class___range__117_117_char_class___range__101_101_, new int[] {99,111,110,116,105,110,117,101}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4867, 2, "Id", null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4869, 4, prod__lit___59__char_class___range__59_59_, new int[] {59}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4866, 1, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4868, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__continueLabel_Statement__lit_continue_layouts_LAYOUTLIST_Id_layouts_LAYOUTLIST_lit___59_, tmp);
	}
    protected static final void _init_prod__function_Statement__Function_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4872, 0, "Function", null, null);
      builder.addAlternative(Parser.prod__function_Statement__Function_, tmp);
	}
    protected static final void _init_prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4875, 0, prod__lit___123__char_class___range__123_123_, new int[] {123}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4881, 4, prod__lit___125__char_class___range__125_125_, new int[] {125}, null, null);
      tmp[2] = new SeparatedListStackNode<IConstructor>(4879, 2, regular__iter_star_seps__Statement__layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(4877, 0, "Statement", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(4878, 1, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4880, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4876, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__block_Statement__lit___123_layouts_LAYOUTLIST_iter_star_seps__Statement__layouts_LAYOUTLIST_layouts_LAYOUTLIST_lit___125_, tmp);
	}
    protected static final void _init_prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[13];
      
      tmp[10] = new LiteralStackNode<IConstructor>(4896, 10, prod__lit___41__char_class___range__41_41_, new int[] {41}, null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(4884, 0, prod__lit_for__char_class___range__102_102_char_class___range__111_111_char_class___range__114_114_, new int[] {102,111,114}, null, null);
      tmp[9] = new NonTerminalStackNode<IConstructor>(4895, 9, "layouts_LAYOUTLIST", null, null);
      tmp[12] = new NonTerminalStackNode<IConstructor>(4898, 12, "Statement", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4888, 4, "Expression", null, null);
      tmp[6] = new LiteralStackNode<IConstructor>(4891, 6, prod__lit_in__char_class___range__105_105_char_class___range__110_110_, new int[] {105,110}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4886, 2, prod__lit___40__char_class___range__40_40_, new int[] {40}, null, null);
      tmp[8] = new NonTerminalStackNode<IConstructor>(4893, 8, "Expression", null, null);
      tmp[11] = new NonTerminalStackNode<IConstructor>(4897, 11, "layouts_LAYOUTLIST", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4887, 3, "layouts_LAYOUTLIST", null, null);
      tmp[7] = new NonTerminalStackNode<IConstructor>(4892, 7, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4885, 1, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4890, 5, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__forIn_Statement__lit_for_layouts_LAYOUTLIST_lit___40_layouts_LAYOUTLIST_var_Expression_layouts_LAYOUTLIST_lit_in_layouts_LAYOUTLIST_obj_Expression_layouts_LAYOUTLIST_lit___41_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4901, 0, "Id", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(4905, 4, "Statement", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4903, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4904, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4902, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__labeled_Statement__Id_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Statement_, tmp);
	}
    protected static final void _init_prod__tryFinally_Statement__lit_try_layouts_LAYOUTLIST_Statement_layouts_LAYOUTLIST_lit_finally_layouts_LAYOUTLIST_Statement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[7];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4908, 0, prod__lit_try__char_class___range__116_116_char_class___range__114_114_char_class___range__121_121_, new int[] {116,114,121}, null, null);
      tmp[4] = new LiteralStackNode<IConstructor>(4912, 4, prod__lit_finally__char_class___range__102_102_char_class___range__105_105_char_class___range__110_110_char_class___range__97_97_char_class___range__108_108_char_class___range__108_108_char_class___range__121_121_, new int[] {102,105,110,97,108,108,121}, null, null);
      tmp[2] = new NonTerminalStackNode<IConstructor>(4910, 2, "Statement", null, null);
      tmp[6] = new NonTerminalStackNode<IConstructor>(4914, 6, "Statement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(4911, 3, "layouts_LAYOUTLIST", null, null);
      tmp[5] = new NonTerminalStackNode<IConstructor>(4913, 5, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(4909, 1, "layouts_LAYOUTLIST", null, null);
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
    
    protected static final void _init_prod__LHSExpression__AssignmentPattern_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4944, 0, "AssignmentPattern", null, null);
      builder.addAlternative(Parser.prod__LHSExpression__AssignmentPattern_, tmp);
	}
    protected static final void _init_prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(4947, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4949, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4952, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4948, 1, prod__lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__72_72_char_class___range__83_83_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,72,83,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4951, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4950, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LHSExpression__char_class___range__0_0_lit___115_111_114_116_40_34_76_72_83_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LHSExpression, tmp);
	}
    protected static final void _init_prod__LHSExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4956, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__LHSExpression__Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__LHSExpression__AssignmentPattern_(builder);
      
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4968, 0, "String", null, null);
      builder.addAlternative(Parser.prod__Literal__String_, tmp);
	}
    protected static final void _init_prod__Literal__Numeric_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4970, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__Literal__Numeric_, tmp);
	}
    protected static final void _init_prod__Literal__RegularExpression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4972, 0, "RegularExpression", null, null);
      builder.addAlternative(Parser.prod__Literal__RegularExpression_, tmp);
	}
    protected static final void _init_prod__Literal__Boolean_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(4974, 0, "Boolean", null, null);
      builder.addAlternative(Parser.prod__Literal__Boolean_, tmp);
	}
    protected static final void _init_prod__Literal__lit_null_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new LiteralStackNode<IConstructor>(4976, 0, prod__lit_null__char_class___range__110_110_char_class___range__117_117_char_class___range__108_108_char_class___range__108_108_, new int[] {110,117,108,108}, null, null);
      builder.addAlternative(Parser.prod__Literal__lit_null_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Literal__char_class___range__0_0_lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Literal(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(4984, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4981, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4983, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4982, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(4980, 1, prod__lit___115_111_114_116_40_34_76_105_116_101_114_97_108_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__97_97_char_class___range__108_108_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,105,116,101,114,97,108,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4979, 0, new int[][]{{0,0}}, null, null);
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(4995, 1, prod__lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(4999, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(4996, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(4998, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(4997, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(4994, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__ArgExpression, tmp);
	}
    protected static final void _init_prod__ArgExpression__Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5002, 0, "Expression", null, null);
      builder.addAlternative(Parser.prod__ArgExpression__Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_ArgExpression__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__ArgExpression__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5010, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5007, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5006, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_114_103_69_120_112_114_101_115_115_105_111_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__114_114_char_class___range__103_103_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,114,103,69,120,112,114,101,115,115,105,111,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5005, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5009, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5008, 0, new int[][]{{48,57}}, null, null), true, null, null);
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5310, 0, "Numeric", null, null);
      builder.addAlternative(Parser.prod__PropertyName__Numeric_, tmp);
	}
    protected static final void _init_prod__PropertyName__String_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5312, 0, "String", null, null);
      builder.addAlternative(Parser.prod__PropertyName__String_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5319, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5318, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5316, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__78_78_char_class___range__97_97_char_class___range__109_109_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,78,97,109,101,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5320, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5317, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5315, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyName__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_78_97_109_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyName, tmp);
	}
    protected static final void _init_prod__PropertyName__Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5323, 0, "Id", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(5327, 0, new int[][]{{117,117},{120,120}}, null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__char_class___range__117_117_range__120_120_, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5329, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__SingleEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5337, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5334, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5332, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5336, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5335, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5333, 1, prod__lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,69,115,99,97,112,101,67,104,97,114,97,99,116,101,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter, tmp);
	}
    protected static final void _init_prod__EscapeCharacter__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5340, 0, new int[][]{{48,57}}, null, null);
      builder.addAlternative(Parser.prod__EscapeCharacter__char_class___range__48_57_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__EscapeCharacter__char_class___range__117_117_range__120_120_(builder);
      
        _init_prod__EscapeCharacter__SingleEscapeCharacter_(builder);
      
        _init_prod__$MetaHole_EscapeCharacter__char_class___range__0_0_lit___115_111_114_116_40_34_69_115_99_97_112_101_67_104_97_114_97_99_116_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__EscapeCharacter(builder);
      
        _init_prod__EscapeCharacter__char_class___range__48_57_(builder);
      
    }
  }
	
  protected static class AssignmentPattern {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__AssignmentPattern__ArrayDestructure_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5366, 0, "ArrayDestructure", null, null);
      builder.addAlternative(Parser.prod__AssignmentPattern__ArrayDestructure_, tmp);
	}
    protected static final void _init_prod__$MetaHole_AssignmentPattern__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentPattern(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5371, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5374, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5369, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5370, 1, prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__97_97_char_class___range__116_116_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,115,115,105,103,110,109,101,110,116,80,97,116,116,101,114,110,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5373, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5372, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_AssignmentPattern__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentPattern, tmp);
	}
    protected static final void _init_prod__AssignmentPattern__ObjectDestructure_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5377, 0, "ObjectDestructure", null, null);
      builder.addAlternative(Parser.prod__AssignmentPattern__ObjectDestructure_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__AssignmentPattern__ArrayDestructure_(builder);
      
        _init_prod__$MetaHole_AssignmentPattern__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_97_116_116_101_114_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentPattern(builder);
      
        _init_prod__AssignmentPattern__ObjectDestructure_(builder);
      
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(5473, 1, prod__lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__99_99_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__69_69_char_class___range__115_115_char_class___range__99_99_char_class___range__97_97_char_class___range__112_112_char_class___range__101_101_char_class___range__83_83_char_class___range__101_101_char_class___range__113_113_char_class___range__117_117_char_class___range__101_101_char_class___range__110_110_char_class___range__99_99_char_class___range__101_101_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,67,104,97,114,97,99,116,101,114,69,115,99,97,112,101,83,101,113,117,101,110,99,101,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5476, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5475, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5474, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5477, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5472, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5480, 0, "NonEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__CharacterEscapeSequence__NonEscapeCharacter_, tmp);
	}
    protected static final void _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5482, 0, "SingleEscapeCharacter", null, null);
      builder.addAlternative(Parser.prod__CharacterEscapeSequence__SingleEscapeCharacter_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_CharacterEscapeSequence__char_class___range__0_0_lit___115_111_114_116_40_34_67_104_97_114_97_99_116_101_114_69_115_99_97_112_101_83_101_113_117_101_110_99_101_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__CharacterEscapeSequence(builder);
      
        _init_prod__CharacterEscapeSequence__NonEscapeCharacter_(builder);
      
        _init_prod__CharacterEscapeSequence__SingleEscapeCharacter_(builder);
      
    }
  }
	
  protected static class AssignmentProperty {
    public final static AbstractStackNode<IConstructor>[] EXPECTS;
    static{
      ExpectBuilder<IConstructor> builder = new ExpectBuilder<IConstructor>(_resultStoreIdMappings);
      init(builder);
      EXPECTS = builder.buildExpectArray();
    }
    
    protected static final void _init_prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5591, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5590, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5588, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,65,115,115,105,103,110,109,101,110,116,80,114,111,112,101,114,116,121,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5589, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5592, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5587, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__AssignmentProperty__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_AssignmentElement_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5600, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5599, 0, "PropertyName", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5601, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5603, 4, "AssignmentElement", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5602, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__AssignmentProperty__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_AssignmentElement_, tmp);
	}
    protected static final void _init_prod__AssignmentProperty__Id_layouts_LAYOUTLIST_opt__Initializer_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5606, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5605, 0, "Id", null, null);
      tmp[2] = new OptionalStackNode<IConstructor>(5608, 2, regular__opt__Initializer, new NonTerminalStackNode<IConstructor>(5607, 0, "Initializer", null, null), null, null);
      builder.addAlternative(Parser.prod__AssignmentProperty__Id_layouts_LAYOUTLIST_opt__Initializer_, tmp);
	}
    protected static final void _init_prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentProperty(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5613, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5611, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5615, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5614, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5616, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5612, 1, prod__lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,65,115,115,105,103,110,109,101,110,116,80,114,111,112,101,114,116,121,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentProperty, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__AssignmentProperty__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(builder);
      
        _init_prod__AssignmentProperty__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_AssignmentElement_(builder);
      
        _init_prod__AssignmentProperty__Id_layouts_LAYOUTLIST_opt__Initializer_(builder);
      
        _init_prod__$MetaHole_AssignmentProperty__char_class___range__0_0_lit___115_111_114_116_40_34_65_115_115_105_103_110_109_101_110_116_80_114_111_112_101_114_116_121_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__AssignmentProperty(builder);
      
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
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5621, 0, "RegularExpressionClass", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionClass_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__RegularExpressionBackslashSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5623, 0, "RegularExpressionBackslashSequence", null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__RegularExpressionBackslashSequence_, tmp);
	}
    protected static final void _init_prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new CharStackNode<IConstructor>(5625, 0, new int[][]{{1,9},{11,46},{48,90},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__RegularExpressionChar__char_class___range__1_9_range__11_46_range__48_90_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5629, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5632, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5631, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5630, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5633, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5628, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__RegularExpressionChar, tmp);
	}
    protected static final void _init_prod__$MetaHole_RegularExpressionChar__char_class___range__0_0_lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__RegularExpressionChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5639, 1, prod__lit___115_111_114_116_40_34_82_101_103_117_108_97_114_69_120_112_114_101_115_115_105_111_110_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__82_82_char_class___range__101_101_char_class___range__103_103_char_class___range__117_117_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__69_69_char_class___range__120_120_char_class___range__112_112_char_class___range__114_114_char_class___range__101_101_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,82,101,103,117,108,97,114,69,120,112,114,101,115,115,105,111,110,67,104,97,114,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5642, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5641, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5640, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5643, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5638, 0, new int[][]{{0,0}}, null, null);
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
      
      tmp[1] = new NonTerminalStackNode<IConstructor>(5650, 1, "layouts_LAYOUTLIST", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5651, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(5653, 4, "Expression", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(5649, 0, "PropertyName", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(5652, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__property_PropertyAssignment__PropertyName_layouts_LAYOUTLIST_lit___58_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[3] = new ListStackNode<IConstructor>(5660, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5659, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5656, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5658, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5657, 1, prod__lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5661, 4, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__PropertyAssignment, tmp);
	}
    protected static final void _init_prod__PropertyAssignment__MethodDefinition_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5664, 0, "MethodDefinition", null, null);
      builder.addAlternative(Parser.prod__PropertyAssignment__MethodDefinition_, tmp);
	}
    protected static final void _init_prod__$MetaHole_PropertyAssignment__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star_seps__PropertyAssignment__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(5667, 0, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5669, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5671, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5670, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5672, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5668, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_45_115_101_112_115_40_115_111_114_116_40_34_80_114_111_112_101_114_116_121_65_115_115_105_103_110_109_101_110_116_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__114_114_char_class___range__111_111_char_class___range__112_112_char_class___range__101_101_char_class___range__114_114_char_class___range__116_116_char_class___range__121_121_char_class___range__65_65_char_class___range__115_115_char_class___range__115_115_char_class___range__105_105_char_class___range__103_103_char_class___range__110_110_char_class___range__109_109_char_class___range__101_101_char_class___range__110_110_char_class___range__116_116_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,45,115,101,112,115,40,115,111,114,116,40,34,80,114,111,112,101,114,116,121,65,115,115,105,103,110,109,101,110,116,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
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
    
    protected static final void _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__Initializer(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[1] = new LiteralStackNode<IConstructor>(5761, 1, prod__lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41__char_class___range__111_111_char_class___range__112_112_char_class___range__116_116_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {111,112,116,40,115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41,41}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5762, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5765, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5764, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5763, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5760, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Initializer__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__Initializer, tmp);
	}
    protected static final void _init_prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[3];
      
      tmp[2] = new NonTerminalStackNode<IConstructor>(5771, 2, "Expression", null, null);
      tmp[0] = new LiteralStackNode<IConstructor>(5769, 0, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(5770, 1, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__Initializer__lit___61_layouts_LAYOUTLIST_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(5776, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5779, 4, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5775, 1, prod__lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__73_73_char_class___range__110_110_char_class___range__105_105_char_class___range__116_116_char_class___range__105_105_char_class___range__97_97_char_class___range__108_108_char_class___range__105_105_char_class___range__122_122_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,73,110,105,116,105,97,108,105,122,101,114,34,41}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5774, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5778, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5777, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Initializer__char_class___range__0_0_lit___115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Initializer, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__$MetaHole_Initializer__char_class___range__0_0_lit___111_112_116_40_115_111_114_116_40_34_73_110_105_116_105_97_108_105_122_101_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__opt__Initializer(builder);
      
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
      
      tmp[1] = new LiteralStackNode<IConstructor>(5786, 1, prod__lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,76,65,89,79,85,84,34,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5789, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5788, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5787, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(5790, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5785, 0, new int[][]{{0,0}}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___115_111_114_116_40_34_76_65_89_79_85_84_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Whitespace_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5793, 0, "Whitespace", null, null);
      builder.addAlternative(Parser.prod__LAYOUT__Whitespace_, tmp);
	}
    protected static final void _init_prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5801, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5798, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5796, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5800, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5799, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5797, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__76_76_char_class___range__65_65_char_class___range__89_89_char_class___range__79_79_char_class___range__85_85_char_class___range__84_84_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,76,65,89,79,85,84,34,41,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_LAYOUT__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_76_65_89_79_85_84_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__LAYOUT, tmp);
	}
    protected static final void _init_prod__LAYOUT__Comment_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(5805, 0, "Comment", null, null);
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
      
      tmp[0] = new CharStackNode<IConstructor>(5850, 0, new int[][]{{48,48}}, null, null);
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__48_48_, tmp);
	}
    protected static final void _init_prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(5852, 0, new int[][]{{49,57}}, null, null);
      tmp[1] = new ListStackNode<IConstructor>(5856, 1, regular__iter_star__char_class___range__48_57, new CharStackNode<IConstructor>(5853, 0, new int[][]{{48,57}}, null, null), false, null, new ICompletionFilter[] {new CharFollowRestriction(new int[][]{{48,57}})});
      builder.addAlternative(Parser.prod__DecimalInteger__char_class___range__49_57_iter_star__char_class___range__48_57_, tmp);
	}
    protected static final void _init_prod__$MetaHole_DecimalInteger__char_class___range__0_0_lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__DecimalInteger(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(5864, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(5861, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(5863, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(5862, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(5859, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(5860, 1, prod__lit___115_111_114_116_40_34_68_101_99_105_109_97_108_73_110_116_101_103_101_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__105_105_char_class___range__109_109_char_class___range__97_97_char_class___range__108_108_char_class___range__73_73_char_class___range__110_110_char_class___range__116_116_char_class___range__101_101_char_class___range__103_103_char_class___range__101_101_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,68,101,99,105,109,97,108,73,110,116,101,103,101,114,34,41}, null, null);
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
    
    protected static final void _init_prod__init_VariableDeclarationNoIn__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(6012, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(6013, 3, "layouts_LAYOUTLIST", null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(6011, 1, "layouts_LAYOUTLIST", null, null);
      tmp[0] = new NonTerminalStackNode<IConstructor>(6010, 0, "AssignmentPattern", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(6015, 4, "Expression", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclarationNoIn__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(6021, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(6024, 4, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6023, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6022, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(6019, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6020, 1, prod__lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__VariableDeclarationNoIn, tmp);
	}
    protected static final void _init_prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[2] = new LiteralStackNode<IConstructor>(6030, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(6033, 4, new int[][]{{0,0}}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(6028, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6029, 1, prod__lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__101_101_char_class___range__112_112_char_class___range__115_115_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__86_86_char_class___range__97_97_char_class___range__114_114_char_class___range__105_105_char_class___range__97_97_char_class___range__98_98_char_class___range__108_108_char_class___range__101_101_char_class___range__68_68_char_class___range__101_101_char_class___range__99_99_char_class___range__108_108_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__116_116_char_class___range__105_105_char_class___range__111_111_char_class___range__110_110_char_class___range__78_78_char_class___range__111_111_char_class___range__73_73_char_class___range__110_110_char_class___range__34_34_char_class___range__41_41_char_class___range__44_44_char_class___range__91_91_char_class___range__108_108_char_class___range__105_105_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__44_44_char_class___range__34_34_char_class___range__41_41_char_class___range__93_93_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,101,112,115,40,115,111,114,116,40,34,86,97,114,105,97,98,108,101,68,101,99,108,97,114,97,116,105,111,110,78,111,73,110,34,41,44,91,108,105,116,40,34,44,34,41,93,41}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6032, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6031, 0, new int[][]{{48,57}}, null, null), true, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_VariableDeclarationNoIn__char_class___range__0_0_lit___92_105_116_101_114_45_115_101_112_115_40_115_111_114_116_40_34_86_97_114_105_97_98_108_101_68_101_99_108_97_114_97_116_105_111_110_78_111_73_110_34_41_44_91_108_105_116_40_34_44_34_41_93_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_seps__VariableDeclarationNoIn__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, tmp);
	}
    protected static final void _init_prod__nonInit_VariableDeclarationNoIn__id_Id_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[1];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(6041, 0, "Id", null, null);
      builder.addAlternative(Parser.prod__nonInit_VariableDeclarationNoIn__id_Id_, tmp);
	}
    protected static final void _init_prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new NonTerminalStackNode<IConstructor>(6045, 0, "Id", null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6048, 2, prod__lit___61__char_class___range__61_61_, new int[] {61}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(6047, 1, "layouts_LAYOUTLIST", null, null);
      tmp[4] = new NonTerminalStackNode<IConstructor>(6051, 4, "Expression", null, null);
      tmp[3] = new NonTerminalStackNode<IConstructor>(6049, 3, "layouts_LAYOUTLIST", null, null);
      builder.addAlternative(Parser.prod__init_VariableDeclarationNoIn__id_Id_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__init_VariableDeclarationNoIn__AssignmentPattern_layouts_LAYOUTLIST_lit___61_layouts_LAYOUTLIST_exp_Expression_(builder);
      
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
      
      tmp[0] = new CharStackNode<IConstructor>(6170, 0, new int[][]{{1,9},{11,38},{40,91},{93,16777215}}, null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__1_9_range__11_38_range__40_91_range__93_16777215_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[0] = new CharStackNode<IConstructor>(6173, 0, new int[][]{{0,0}}, null, null);
      tmp[4] = new CharStackNode<IConstructor>(6178, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6175, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6177, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6176, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6174, 1, prod__lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__SingleStringChar, tmp);
	}
    protected static final void _init_prod__SingleStringChar__char_class___range__92_92_EscapeSequence_(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[2];
      
      tmp[0] = new CharStackNode<IConstructor>(6181, 0, new int[][]{{92,92}}, null, null);
      tmp[1] = new NonTerminalStackNode<IConstructor>(6182, 1, "EscapeSequence", null, null);
      builder.addAlternative(Parser.prod__SingleStringChar__char_class___range__92_92_EscapeSequence_, tmp);
	}
    protected static final void _init_prod__$MetaHole_SingleStringChar__char_class___range__0_0_lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__iter_star__SingleStringChar(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(6190, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6187, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6189, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6188, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[0] = new CharStackNode<IConstructor>(6185, 0, new int[][]{{0,0}}, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6186, 1, prod__lit___92_105_116_101_114_45_115_116_97_114_40_115_111_114_116_40_34_83_105_110_103_108_101_83_116_114_105_110_103_67_104_97_114_34_41_41__char_class___range__92_92_char_class___range__105_105_char_class___range__116_116_char_class___range__101_101_char_class___range__114_114_char_class___range__45_45_char_class___range__115_115_char_class___range__116_116_char_class___range__97_97_char_class___range__114_114_char_class___range__40_40_char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__83_83_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__108_108_char_class___range__101_101_char_class___range__83_83_char_class___range__116_116_char_class___range__114_114_char_class___range__105_105_char_class___range__110_110_char_class___range__103_103_char_class___range__67_67_char_class___range__104_104_char_class___range__97_97_char_class___range__114_114_char_class___range__34_34_char_class___range__41_41_char_class___range__41_41_, new int[] {92,105,116,101,114,45,115,116,97,114,40,115,111,114,116,40,34,83,105,110,103,108,101,83,116,114,105,110,103,67,104,97,114,34,41,41}, null, null);
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
      
      tmp[0] = new SeparatedListStackNode<IConstructor>(6462, 0, regular__iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST, new NonTerminalStackNode<IConstructor>(6458, 0, "Param", null, null), (AbstractStackNode<IConstructor>[]) new AbstractStackNode[]{new NonTerminalStackNode<IConstructor>(6459, 1, "layouts_LAYOUTLIST", null, null), new LiteralStackNode<IConstructor>(6460, 2, prod__lit___44__char_class___range__44_44_, new int[] {44}, null, null), new NonTerminalStackNode<IConstructor>(6461, 3, "layouts_LAYOUTLIST", null, null)}, false, null, null);
      builder.addAlternative(Parser.prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_, tmp);
	}
    protected static final void _init_prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params(ExpectBuilder<IConstructor> builder) {
      AbstractStackNode<IConstructor>[] tmp = (AbstractStackNode<IConstructor>[]) new AbstractStackNode[5];
      
      tmp[4] = new CharStackNode<IConstructor>(6471, 4, new int[][]{{0,0}}, null, null);
      tmp[2] = new LiteralStackNode<IConstructor>(6468, 2, prod__lit___58__char_class___range__58_58_, new int[] {58}, null, null);
      tmp[0] = new CharStackNode<IConstructor>(6466, 0, new int[][]{{0,0}}, null, null);
      tmp[3] = new ListStackNode<IConstructor>(6470, 3, regular__iter__char_class___range__48_57, new CharStackNode<IConstructor>(6469, 0, new int[][]{{48,57}}, null, null), true, null, null);
      tmp[1] = new LiteralStackNode<IConstructor>(6467, 1, prod__lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41__char_class___range__115_115_char_class___range__111_111_char_class___range__114_114_char_class___range__116_116_char_class___range__40_40_char_class___range__34_34_char_class___range__80_80_char_class___range__97_97_char_class___range__114_114_char_class___range__97_97_char_class___range__109_109_char_class___range__115_115_char_class___range__34_34_char_class___range__41_41_, new int[] {115,111,114,116,40,34,80,97,114,97,109,115,34,41}, null, null);
      builder.addAlternative(Parser.prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params, tmp);
	}
    public static void init(ExpectBuilder<IConstructor> builder){
      
        _init_prod__Params__lst_iter_star_seps__Param__layouts_LAYOUTLIST_lit___44_layouts_LAYOUTLIST_(builder);
      
        _init_prod__$MetaHole_Params__char_class___range__0_0_lit___115_111_114_116_40_34_80_97_114_97_109_115_34_41_lit___58_iter__char_class___range__48_57_char_class___range__0_0__tag__holeType__Params(builder);
      
    }
  }
	
  // Parse methods    
  
  public AbstractStackNode<IConstructor>[] ArrayDestructure() {
    return ArrayDestructure.EXPECTS;
  }
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
  public AbstractStackNode<IConstructor>[] ObjectDestructure() {
    return ObjectDestructure.EXPECTS;
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
  public AbstractStackNode<IConstructor>[] ExponentPart() {
    return ExponentPart.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] EscapeSequence() {
    return EscapeSequence.EXPECTS;
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
  public AbstractStackNode<IConstructor>[] AssignmentElement() {
    return AssignmentElement.EXPECTS;
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
  public AbstractStackNode<IConstructor>[] AssignmentPattern() {
    return AssignmentPattern.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] CharacterEscapeSequence() {
    return CharacterEscapeSequence.EXPECTS;
  }
  public AbstractStackNode<IConstructor>[] AssignmentProperty() {
    return AssignmentProperty.EXPECTS;
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