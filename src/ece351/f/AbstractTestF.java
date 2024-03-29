/* *********************************************************************
 * ECE351 
 * Department of Electrical and Computer Engineering 
 * University of Waterloo 
 * Term: Winter 2015 (1151)
 *
 * The base version of this file is the intellectual property of the
 * University of Waterloo. Redistribution is prohibited.
 *
 * By pushing changes to this file I affirm that I am the author of
 * all changes. I affirm that I have complied with the course
 * collaboration policy and have not plagiarized my work. 
 *
 * I understand that redistributing this file might expose me to
 * disciplinary action under UW Policy 71. I understand that Policy 71
 * allows for retroactive modification of my final grade in a course.
 * For example, if I post my solutions to these labs on GitHub after I
 * finish ECE351, and a future student plagiarizes them, then I too
 * could be found guilty of plagiarism. Consequently, my final grade
 * in ECE351 could be retroactively lowered. This might require that I
 * repeat ECE351, which in turn might delay my graduation.
 *
 * https://uwaterloo.ca/secretariat-general-counsel/policies-procedures-guidelines/policy-71
 * 
 * ********************************************************************/

package ece351.f;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import ece351.common.ast.AndExpr;
import ece351.common.ast.AssignmentStatement;
import ece351.common.ast.ConstantExpr;
import ece351.common.ast.NotExpr;
import ece351.common.ast.OrExpr;
import ece351.common.ast.VarExpr;
import ece351.f.ast.FProgram;
import ece351.util.BaseTest351;

/**
 * This file is generated by the course staff from the F programs in the tests directory.
 */
public abstract class AbstractTestF extends BaseTest351 {
	protected abstract void test(final String name, final FProgram fp1);
	public final static Map<String,FProgram> FPROGRAMS;
	static {
		final Map<String,FProgram> m = new TreeMap<String,FProgram>();
		m.put("cse0", make_cse0());
		m.put("cse1", make_cse1());
		m.put("cse2", make_cse2());
		m.put("cse3", make_cse3());
		m.put("cse4", make_cse4());
		m.put("cse5", make_cse5());
		m.put("ex00", make_ex00());
		m.put("ex01", make_ex01());
		m.put("ex02", make_ex02());
		m.put("ex03", make_ex03());
		m.put("ex04", make_ex04());
		m.put("ex05", make_ex05());
		m.put("ex06", make_ex06());
		m.put("ex07", make_ex07());
		m.put("ex08", make_ex08());
		m.put("ex09", make_ex09());
		m.put("ex10", make_ex10());
		m.put("ex11", make_ex11());
		m.put("ex12", make_ex12());
		m.put("ex13", make_ex13());
		m.put("jvarty_advanced", make_jvarty_advanced());
		m.put("jvarty_basic", make_jvarty_basic());
		m.put("nary_or", make_nary_or());
		m.put("opt0_and_nested_or", make_opt0_and_nested_or());
		m.put("opt0_left_parens", make_opt0_left_parens());
		m.put("opt0_nested_and", make_opt0_nested_and());
		m.put("opt0_nested_or", make_opt0_nested_or());
		m.put("opt0_no_parens", make_opt0_no_parens());
		m.put("opt0_not_or", make_opt0_not_or());
		m.put("opt0_right_parens", make_opt0_right_parens());
		m.put("opt1_and_false1", make_opt1_and_false1());
		m.put("opt1_and_false2", make_opt1_and_false2());
		m.put("opt1_and_true1", make_opt1_and_true1());
		m.put("opt1_and_true2", make_opt1_and_true2());
		m.put("opt1_false_and_false", make_opt1_false_and_false());
		m.put("opt1_false_and_true", make_opt1_false_and_true());
		m.put("opt1_false_or_false", make_opt1_false_or_false());
		m.put("opt1_false_or_true", make_opt1_false_or_true());
		m.put("opt1_not_false", make_opt1_not_false());
		m.put("opt1_not_false_and_true", make_opt1_not_false_and_true());
		m.put("opt1_not_false_or_false", make_opt1_not_false_or_false());
		m.put("opt1_not_false_or_true", make_opt1_not_false_or_true());
		m.put("opt1_not_true", make_opt1_not_true());
		m.put("opt1_not_true_and_false", make_opt1_not_true_and_false());
		m.put("opt1_not_true_or_false", make_opt1_not_true_or_false());
		m.put("opt1_or_false1", make_opt1_or_false1());
		m.put("opt1_or_false2", make_opt1_or_false2());
		m.put("opt1_or_true1", make_opt1_or_true1());
		m.put("opt1_or_true2", make_opt1_or_true2());
		m.put("opt1_true_and_false", make_opt1_true_and_false());
		m.put("opt1_true_and_true", make_opt1_true_and_true());
		m.put("opt1_true_or_false", make_opt1_true_or_false());
		m.put("opt1_true_or_true", make_opt1_true_or_true());
		m.put("opt2_and1", make_opt2_and1());
		m.put("opt2_and2", make_opt2_and2());
		m.put("opt2_or1", make_opt2_or1());
		m.put("opt2_or2", make_opt2_or2());
		m.put("opt3_and_dup", make_opt3_and_dup());
		m.put("opt3_or_dup", make_opt3_or_dup());
		m.put("opt4_and_or", make_opt4_and_or());
		m.put("opt4_and_or2", make_opt4_and_or2());
		m.put("opt4_big1", make_opt4_big1());
		m.put("opt4_big2", make_opt4_big2());
		m.put("opt4_or_and", make_opt4_or_and());
		m.put("opt4_or_no_paren", make_opt4_or_no_paren());
		m.put("opt5_fixed_point", make_opt5_fixed_point());
		m.put("opt5_not_and", make_opt5_not_and());
		m.put("z01", make_z01());
		m.put("z02", make_z02());
		m.put("z03", make_z03());
		m.put("z04", make_z04());
		m.put("z05", make_z05());
		m.put("z06", make_z06());
		m.put("z07", make_z07());
		m.put("z08", make_z08());
		m.put("z09", make_z09());
		m.put("z10", make_z10());
		m.put("z11", make_z11());
		m.put("z12", make_z12());
		m.put("z13", make_z13());
		FPROGRAMS = Collections.unmodifiableMap(m);
	}
	@Test public void cse0() {test("cse0", FPROGRAMS.get("cse0"));}
	protected static FProgram make_cse0() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("z", ConstantExpr.TrueExpr));
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new VarExpr("b"))));
		fp = fp.append(new AssignmentStatement("t", new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c"))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new VarExpr("a"), new VarExpr("b"))));
		fp = fp.append(new AssignmentStatement("r", new OrExpr(new OrExpr(new VarExpr("c"), new VarExpr("b")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void cse1() {test("cse1", FPROGRAMS.get("cse1"));}
	protected static FProgram make_cse1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("d"), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new VarExpr("e"), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void cse2() {test("cse2", FPROGRAMS.get("cse2"));}
	protected static FProgram make_cse2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("c"), new VarExpr("d")))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("c"), new VarExpr("d")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void cse3() {test("cse3", FPROGRAMS.get("cse3"));}
	protected static FProgram make_cse3() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("c"), new VarExpr("d")))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("e"), new VarExpr("f")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void cse4() {test("cse4", FPROGRAMS.get("cse4"));}
	protected static FProgram make_cse4() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("c"), new VarExpr("d")))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new AndExpr(new VarExpr("b"), new VarExpr("a")), new AndExpr(new VarExpr("d"), new VarExpr("c")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void cse5() {test("cse5", FPROGRAMS.get("cse5"));}
	protected static FProgram make_cse5() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("c"), new VarExpr("d")))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new AndExpr(new VarExpr("e"), new VarExpr("f")), new AndExpr(new VarExpr("b"), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex00() {test("ex00", FPROGRAMS.get("ex00"));}
	protected static FProgram make_ex00() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", ConstantExpr.FalseExpr));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex01() {test("ex01", FPROGRAMS.get("ex01"));}
	protected static FProgram make_ex01() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", ConstantExpr.TrueExpr));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex02() {test("ex02", FPROGRAMS.get("ex02"));}
	protected static FProgram make_ex02() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new VarExpr("a")));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex03() {test("ex03", FPROGRAMS.get("ex03"));}
	protected static FProgram make_ex03() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new NotExpr(new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex04() {test("ex04", FPROGRAMS.get("ex04"));}
	protected static FProgram make_ex04() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new VarExpr("a")));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex05() {test("ex05", FPROGRAMS.get("ex05"));}
	protected static FProgram make_ex05() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex06() {test("ex06", FPROGRAMS.get("ex06"));}
	protected static FProgram make_ex06() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("c"), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex07() {test("ex07", FPROGRAMS.get("ex07"));}
	protected static FProgram make_ex07() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new NotExpr(new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex08() {test("ex08", FPROGRAMS.get("ex08"));}
	protected static FProgram make_ex08() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new NotExpr(new VarExpr("a")), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex09() {test("ex09", FPROGRAMS.get("ex09"));}
	protected static FProgram make_ex09() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new NotExpr(new VarExpr("a")), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex10() {test("ex10", FPROGRAMS.get("ex10"));}
	protected static FProgram make_ex10() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), new NotExpr(new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex11() {test("ex11", FPROGRAMS.get("ex11"));}
	protected static FProgram make_ex11() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex12() {test("ex12", FPROGRAMS.get("ex12"));}
	protected static FProgram make_ex12() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void ex13() {test("ex13", FPROGRAMS.get("ex13"));}
	protected static FProgram make_ex13() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new AndExpr(new VarExpr("b"), new VarExpr("c")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void jvarty_advanced() {test("jvarty_advanced", FPROGRAMS.get("jvarty_advanced"));}
	protected static FProgram make_jvarty_advanced() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("k", new NotExpr(new NotExpr(new NotExpr(ConstantExpr.FalseExpr)))));
		fp = fp.append(new AssignmentStatement("l", new NotExpr(new OrExpr(ConstantExpr.FalseExpr, ConstantExpr.TrueExpr))));
		fp = fp.append(new AssignmentStatement("m", new AndExpr(new OrExpr(new VarExpr("n"), new VarExpr("o")), ConstantExpr.FalseExpr)));
		fp = fp.append(new AssignmentStatement("p", new AndExpr(ConstantExpr.TrueExpr, new OrExpr(new VarExpr("q"), new VarExpr("r")))));
		fp = fp.append(new AssignmentStatement("s", new OrExpr(new OrExpr(new OrExpr(new VarExpr("t"), new VarExpr("u")), new VarExpr("v")), ConstantExpr.FalseExpr)));
		fp = fp.append(new AssignmentStatement("w", new OrExpr(new OrExpr(new OrExpr(new VarExpr("x"), new VarExpr("y")), new VarExpr("z")), ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void jvarty_basic() {test("jvarty_basic", FPROGRAMS.get("jvarty_basic"));}
	protected static FProgram make_jvarty_basic() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("a", new NotExpr(ConstantExpr.FalseExpr)));
		fp = fp.append(new AssignmentStatement("B", new NotExpr(ConstantExpr.TrueExpr)));
		fp = fp.append(new AssignmentStatement("c", new AndExpr(new VarExpr("d"), ConstantExpr.FalseExpr)));
		fp = fp.append(new AssignmentStatement("Z", new AndExpr(ConstantExpr.FalseExpr, new VarExpr("f"))));
		fp = fp.append(new AssignmentStatement("g", new AndExpr(new VarExpr("h"), ConstantExpr.TrueExpr)));
		fp = fp.append(new AssignmentStatement("i", new AndExpr(ConstantExpr.TrueExpr, new VarExpr("j"))));
		fp = fp.append(new AssignmentStatement("k", new OrExpr(new VarExpr("l"), ConstantExpr.FalseExpr)));
		fp = fp.append(new AssignmentStatement("m", new OrExpr(ConstantExpr.FalseExpr, new VarExpr("n"))));
		fp = fp.append(new AssignmentStatement("o", new OrExpr(new VarExpr("p"), ConstantExpr.TrueExpr)));
		fp = fp.append(new AssignmentStatement("q", new OrExpr(ConstantExpr.TrueExpr, new VarExpr("r"))));
		fp = fp.append(new AssignmentStatement("s", new AndExpr(new VarExpr("t"), new VarExpr("t"))));
		fp = fp.append(new AssignmentStatement("u", new OrExpr(new VarExpr("v"), new VarExpr("v"))));
		fp = fp.append(new AssignmentStatement("w", new OrExpr(new VarExpr("x"), new NotExpr(new VarExpr("x")))));
		fp = fp.append(new AssignmentStatement("y", new OrExpr(new VarExpr("z"), new AndExpr(new VarExpr("z"), new VarExpr("a")))));
		fp = fp.append(new AssignmentStatement("b", new OrExpr(new AndExpr(new VarExpr("c"), new VarExpr("d")), new VarExpr("c"))));
		fp = fp.append(new AssignmentStatement("e", new AndExpr(new VarExpr("f"), new OrExpr(new VarExpr("f"), new VarExpr("g")))));
		fp = fp.append(new AssignmentStatement("h", new AndExpr(new OrExpr(new VarExpr("i"), new VarExpr("j")), new VarExpr("j"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void nary_or() {test("nary_or", FPROGRAMS.get("nary_or"));}
	protected static FProgram make_nary_or() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new OrExpr(new OrExpr(new OrExpr(new OrExpr(new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("a")), new VarExpr("a")), new VarExpr("a")), new VarExpr("a")), new VarExpr("a")), new VarExpr("a")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_and_nested_or() {test("opt0_and_nested_or", FPROGRAMS.get("opt0_and_nested_or"));}
	protected static FProgram make_opt0_and_nested_or() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c")), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_left_parens() {test("opt0_left_parens", FPROGRAMS.get("opt0_left_parens"));}
	protected static FProgram make_opt0_left_parens() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_nested_and() {test("opt0_nested_and", FPROGRAMS.get("opt0_nested_and"));}
	protected static FProgram make_opt0_nested_and() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new AndExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c")), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_nested_or() {test("opt0_nested_or", FPROGRAMS.get("opt0_nested_or"));}
	protected static FProgram make_opt0_nested_or() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new OrExpr(new VarExpr("a"), new OrExpr(new VarExpr("b"), new VarExpr("c"))), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_no_parens() {test("opt0_no_parens", FPROGRAMS.get("opt0_no_parens"));}
	protected static FProgram make_opt0_no_parens() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_not_or() {test("opt0_not_or", FPROGRAMS.get("opt0_not_or"));}
	protected static FProgram make_opt0_not_or() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new NotExpr(new AndExpr(new AndExpr(new VarExpr("c"), new VarExpr("b")), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt0_right_parens() {test("opt0_right_parens", FPROGRAMS.get("opt0_right_parens"));}
	protected static FProgram make_opt0_right_parens() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new OrExpr(new VarExpr("b"), new VarExpr("c")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_and_false1() {test("opt1_and_false1", FPROGRAMS.get("opt1_and_false1"));}
	protected static FProgram make_opt1_and_false1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_and_false2() {test("opt1_and_false2", FPROGRAMS.get("opt1_and_false2"));}
	protected static FProgram make_opt1_and_false2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.FalseExpr, new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_and_true1() {test("opt1_and_true1", FPROGRAMS.get("opt1_and_true1"));}
	protected static FProgram make_opt1_and_true1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_and_true2() {test("opt1_and_true2", FPROGRAMS.get("opt1_and_true2"));}
	protected static FProgram make_opt1_and_true2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.TrueExpr, new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_false_and_false() {test("opt1_false_and_false", FPROGRAMS.get("opt1_false_and_false"));}
	protected static FProgram make_opt1_false_and_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.FalseExpr, ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_false_and_true() {test("opt1_false_and_true", FPROGRAMS.get("opt1_false_and_true"));}
	protected static FProgram make_opt1_false_and_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.FalseExpr, ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_false_or_false() {test("opt1_false_or_false", FPROGRAMS.get("opt1_false_or_false"));}
	protected static FProgram make_opt1_false_or_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.FalseExpr, ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_false_or_true() {test("opt1_false_or_true", FPROGRAMS.get("opt1_false_or_true"));}
	protected static FProgram make_opt1_false_or_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.FalseExpr, ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_false() {test("opt1_not_false", FPROGRAMS.get("opt1_not_false"));}
	protected static FProgram make_opt1_not_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new NotExpr(ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_false_and_true() {test("opt1_not_false_and_true", FPROGRAMS.get("opt1_not_false_and_true"));}
	protected static FProgram make_opt1_not_false_and_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new NotExpr(ConstantExpr.FalseExpr), ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_false_or_false() {test("opt1_not_false_or_false", FPROGRAMS.get("opt1_not_false_or_false"));}
	protected static FProgram make_opt1_not_false_or_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new NotExpr(ConstantExpr.FalseExpr), ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_false_or_true() {test("opt1_not_false_or_true", FPROGRAMS.get("opt1_not_false_or_true"));}
	protected static FProgram make_opt1_not_false_or_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new NotExpr(ConstantExpr.FalseExpr), ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_true() {test("opt1_not_true", FPROGRAMS.get("opt1_not_true"));}
	protected static FProgram make_opt1_not_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new NotExpr(ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_true_and_false() {test("opt1_not_true_and_false", FPROGRAMS.get("opt1_not_true_and_false"));}
	protected static FProgram make_opt1_not_true_and_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new NotExpr(ConstantExpr.TrueExpr), ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_not_true_or_false() {test("opt1_not_true_or_false", FPROGRAMS.get("opt1_not_true_or_false"));}
	protected static FProgram make_opt1_not_true_or_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new NotExpr(ConstantExpr.TrueExpr), ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_or_false1() {test("opt1_or_false1", FPROGRAMS.get("opt1_or_false1"));}
	protected static FProgram make_opt1_or_false1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_or_false2() {test("opt1_or_false2", FPROGRAMS.get("opt1_or_false2"));}
	protected static FProgram make_opt1_or_false2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.FalseExpr, new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_or_true1() {test("opt1_or_true1", FPROGRAMS.get("opt1_or_true1"));}
	protected static FProgram make_opt1_or_true1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_or_true2() {test("opt1_or_true2", FPROGRAMS.get("opt1_or_true2"));}
	protected static FProgram make_opt1_or_true2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.TrueExpr, new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_true_and_false() {test("opt1_true_and_false", FPROGRAMS.get("opt1_true_and_false"));}
	protected static FProgram make_opt1_true_and_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.TrueExpr, ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_true_and_true() {test("opt1_true_and_true", FPROGRAMS.get("opt1_true_and_true"));}
	protected static FProgram make_opt1_true_and_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(ConstantExpr.TrueExpr, ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_true_or_false() {test("opt1_true_or_false", FPROGRAMS.get("opt1_true_or_false"));}
	protected static FProgram make_opt1_true_or_false() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.TrueExpr, ConstantExpr.FalseExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt1_true_or_true() {test("opt1_true_or_true", FPROGRAMS.get("opt1_true_or_true"));}
	protected static FProgram make_opt1_true_or_true() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(ConstantExpr.TrueExpr, ConstantExpr.TrueExpr)));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt2_and1() {test("opt2_and1", FPROGRAMS.get("opt2_and1"));}
	protected static FProgram make_opt2_and1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), new NotExpr(new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt2_and2() {test("opt2_and2", FPROGRAMS.get("opt2_and2"));}
	protected static FProgram make_opt2_and2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new NotExpr(new VarExpr("a")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt2_or1() {test("opt2_or1", FPROGRAMS.get("opt2_or1"));}
	protected static FProgram make_opt2_or1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new NotExpr(new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt2_or2() {test("opt2_or2", FPROGRAMS.get("opt2_or2"));}
	protected static FProgram make_opt2_or2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new NotExpr(new VarExpr("a")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt3_and_dup() {test("opt3_and_dup", FPROGRAMS.get("opt3_and_dup"));}
	protected static FProgram make_opt3_and_dup() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt3_or_dup() {test("opt3_or_dup", FPROGRAMS.get("opt3_or_dup"));}
	protected static FProgram make_opt3_or_dup() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_and_or() {test("opt4_and_or", FPROGRAMS.get("opt4_and_or"));}
	protected static FProgram make_opt4_and_or() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new VarExpr("a"), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_and_or2() {test("opt4_and_or2", FPROGRAMS.get("opt4_and_or2"));}
	protected static FProgram make_opt4_and_or2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_big1() {test("opt4_big1", FPROGRAMS.get("opt4_big1"));}
	protected static FProgram make_opt4_big1() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new OrExpr(new OrExpr(new AndExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("c")), new AndExpr(new AndExpr(new VarExpr("d"), new VarExpr("c")), new VarExpr("e"))), new AndExpr(new OrExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")), new AndExpr(new VarExpr("a"), new VarExpr("e"))), new OrExpr(new VarExpr("c"), new VarExpr("b")))), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_big2() {test("opt4_big2", FPROGRAMS.get("opt4_big2"));}
	protected static FProgram make_opt4_big2() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new OrExpr(new OrExpr(new VarExpr("a"), new AndExpr(new VarExpr("a"), new VarExpr("b"))), new VarExpr("b")), new OrExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")), new VarExpr("a"))), new AndExpr(new VarExpr("a"), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_or_and() {test("opt4_or_and", FPROGRAMS.get("opt4_or_and"));}
	protected static FProgram make_opt4_or_and() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new AndExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt4_or_no_paren() {test("opt4_or_no_paren", FPROGRAMS.get("opt4_or_no_paren"));}
	protected static FProgram make_opt4_or_no_paren() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new AndExpr(new VarExpr("b"), new VarExpr("a")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt5_fixed_point() {test("opt5_fixed_point", FPROGRAMS.get("opt5_fixed_point"));}
	protected static FProgram make_opt5_fixed_point() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new OrExpr(new VarExpr("a"), new NotExpr(new NotExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")))))));
		assert fp.repOk();
		return fp;
	}

	@Test public void opt5_not_and() {test("opt5_not_and", FPROGRAMS.get("opt5_not_and"));}
	protected static FProgram make_opt5_not_and() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new NotExpr(new AndExpr(new VarExpr("a"), ConstantExpr.TrueExpr))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z01() {test("z01", FPROGRAMS.get("z01"));}
	protected static FProgram make_z01() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("x", new AndExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z02() {test("z02", FPROGRAMS.get("z02"));}
	protected static FProgram make_z02() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")), new OrExpr(new VarExpr("b"), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z03() {test("z03", FPROGRAMS.get("z03"));}
	protected static FProgram make_z03() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("m", new OrExpr(new VarExpr("c"), new VarExpr("b"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z04() {test("z04", FPROGRAMS.get("z04"));}
	protected static FProgram make_z04() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("r", new OrExpr(new OrExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z05() {test("z05", FPROGRAMS.get("z05"));}
	protected static FProgram make_z05() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new VarExpr("d"))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z06() {test("z06", FPROGRAMS.get("z06"));}
	protected static FProgram make_z06() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new OrExpr(new VarExpr("b"), new VarExpr("c")), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z07() {test("z07", FPROGRAMS.get("z07"));}
	protected static FProgram make_z07() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new OrExpr(new VarExpr("c"), new VarExpr("b")), new OrExpr(new VarExpr("b"), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z08() {test("z08", FPROGRAMS.get("z08"));}
	protected static FProgram make_z08() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("y", new AndExpr(new OrExpr(new VarExpr("c"), new VarExpr("b")), new OrExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z09() {test("z09", FPROGRAMS.get("z09"));}
	protected static FProgram make_z09() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("e", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("d")), new AndExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z10() {test("z10", FPROGRAMS.get("z10"));}
	protected static FProgram make_z10() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("g", new OrExpr(new AndExpr(new VarExpr("a"), new VarExpr("b")), new AndExpr(new VarExpr("a"), new VarExpr("d")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z11() {test("z11", FPROGRAMS.get("z11"));}
	protected static FProgram make_z11() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("g", new OrExpr(new AndExpr(new VarExpr("d"), new VarExpr("a")), new AndExpr(new VarExpr("a"), new VarExpr("b")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z12() {test("z12", FPROGRAMS.get("z12"));}
	protected static FProgram make_z12() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("g", new OrExpr(new AndExpr(new VarExpr("d"), new VarExpr("a")), new AndExpr(new VarExpr("b"), new VarExpr("a")))));
		assert fp.repOk();
		return fp;
	}

	@Test public void z13() {test("z13", FPROGRAMS.get("z13"));}
	protected static FProgram make_z13() {
		FProgram fp = new FProgram();
		fp = fp.append(new AssignmentStatement("l", new AndExpr(new VarExpr("b"), new VarExpr("a"))));
		assert fp.repOk();
		return fp;
	}

}

