---
Course: DAT321 Quality Assurance and Testing
Outcomes: 
- Process / Internal / External Quality / Quality in use
- ISO 25010 Quality Attributes
- Fault, error, failure
- Levels of testing
- CI and test automation
- V&V (Verification vs Validation)
---

Quality Attributes, Quality Types, Quality Scenarios.
Black-box Testing: Equivalence Partitions, Boundaries.
Property-based Testing.
Coverage, Mutation Testing.
Regression Testing, Optimisation (Selection, Minimisation, Prioritisation), APFD.
Code-based testing.

### 1. Quality foundations

Start here, because Question 1 is usually built on this.

Know these very clearly:

* ISO 25010 and the 8 product quality attributes
* the 4 quality perspectives: **process, internal, external, quality in use**
* difference between **quality attribute** and **quality scenario**
* how to make a quality answer **measurable**, not vague

The lecture is very explicit that quality attributes are high-level descriptions, while quality scenarios are concrete and testable. It also clearly distinguishes the four quality perspectives.  

What you should be able to do:

* define each quality type in your own words
* choose a fitting attribute for a feature
* explain **why that attribute**, not another one
* suggest one metric

### 2. Quality scenarios

This is really its own topic, not just part of quality theory.

Memorize the 6 elements:

* source
* stimulus
* artefact
* environment
* response
* response measure

The external quality lecture explicitly gives these six elements and says a good scenario provides test cases and acceptance criteria. 

What you should be able to do:

* take one feature and turn it into a full scenario
* make the response measure concrete, like time, %, count, error rate

Big mistake to avoid:

* writing a nice sentence without measurable response

### 3. Technical debt, refactoring, and internal quality

This topic matters because exams like to connect maintainability, internal quality, and technical debt.

Know:

* what technical debt is
* why it is mainly about **internal quality**
* why refactoring improves structure without changing behaviour
* common internal metrics: LOC, code churn, fan-in, fan-out, cyclomatic complexity, cognitive complexity, block depth

The lectures define technical debt as the cost of reworking non-optimal design choices and explain refactoring as improving structure without changing external behaviour. They also list the key internal quality measures.  

What you should be able to do:

* explain why refactoring is not bug fixing
* connect one code smell or metric to maintainability risk
* explain internal vs external quality without mixing them

### 4. Specification-based testing: equivalence partitioning

This is one of the highest-yield black-box topics.

Know:

* what the input space is
* what equivalence partitioning is
* how to derive partitions from properties of the input
* that partitions should represent **behaviourally different cases**

The spec-based testing lecture says EP identifies sets of inputs that trigger the same SUT behaviour and that deriving them requires understanding parameters, their properties, and expected behaviour. 

What you should be able to do:

* find partitions from a short specification
* describe each partition by input description + expected behaviour
* avoid overlapping or redundant partitions

### 5. Boundary Value Analysis

Treat this as separate from partitions.

Know these three things almost word-for-word:

* **a boundary is a pair of inputs**
* validity groups are high-level boundary categories
* program derivative measures boundary quality

The BVA lecture literally highlights those as the key takeaways, and says a good boundary has inputs as close as possible and outputs as different as possible. 

What you should be able to do:

* move from partitions to boundaries
* label boundaries as VV / VE / EE
* explain why one boundary pair is better than another

Big mistake to avoid:

* giving one input only and calling it a boundary

### 6. Property-based testing

This topic is more conceptual than many students think.

Know:

* PBT defines generic properties, not specific examples
* properties should hold for sets of inputs
* generated data is used to search for counterexamples
* shrinking/minimising tries to find a small failing input

The PBT lecture states exactly that: define properties the system should adhere to, generate many inputs, and minimize failing cases. It also stresses “avoid thinking of specific input values; focus on sets of values.” 

What you should be able to do:

* write 2–3 good properties for a simple function
* tell the difference between a property and a test case
* explain what shrinking is and why it is useful

### 7. Structural testing and test adequacy

This is the core code-based testing topic.

Know:

* what test adequacy means
* statement / line coverage
* branch coverage
* condition coverage
* path coverage
* MC/DC
* subsumption intuition: some criteria are stronger than others

The code coverage lecture defines test adequacy as the extent of the test effort and presents the main structural coverage measures plus MC/DC as especially important for safety-critical contexts. 

What you should be able to do:

* explain the difference between branch and condition
* explain why high coverage does **not** guarantee good tests
* explain what MC/DC adds beyond plain condition coverage

### 8. Mutation testing

This is test-suite quality, not code quality.

Know:

* mutation testing checks the **quality of the tests**
* a mutant is a small syntactic fault-injected version of the program
* mutation score = killed mutants / total mutants
* equivalent mutants are a limitation

The mutation lecture is very explicit that mutation coverage is a test adequacy criterion and complements code coverage. 

What you should be able to do:

* explain what “killed” and “survived” mean
* explain why mutation score says more about tests than about code
* explain why equivalent mutants are a problem

### 9. Regression testing

This is another very exam-heavy topic.

Know:

* what regression faults are
* corrective vs progressive regression testing
* why retest-all is ideal but often infeasible
* test **selection**, **minimisation**, **prioritisation**

The regression lecture defines these clearly and emphasizes that cost-effective regression testing uses those three optimisation approaches. 

What you should be able to do:

* explain the difference between selection, minimisation, prioritisation
* know when each is useful
* explain why automation matters here

### 10. Diversity-based prioritisation and APFD

This is more specific, but very likely if regression comes up.

Know:

* Jaccard similarity / distance idea
* similarity-based vs distance-based prioritisation
* APFD measures how quickly faults are found

The regression part 2 lecture and the lab both explain diversity-based prioritisation and APFD as area under the fault-detection curve.  

What you should be able to do:

* explain the intuition without needing heavy math
* say that a better prioritisation reveals faults earlier

### 11. Continuous Integration

This is usually smaller, but it connects to testing and regression.

Know:

* what CI is
* how it differs from deployment/delivery
* why automated tests are central
* why frequent integration helps debugging

The CI lecture defines CI as building the whole application and running automated tests whenever changes are committed. 

### 12. Sustainability as a quality attribute

This is one of the lecturer’s explicitly prioritised topics.

Know:

* sustainability as a quality concern
* the five dimensions
* immediate, enabling, structural effects
* software can be both part of the problem and part of the solution

The sustainability lecture explicitly frames sustainability in software using dimensions plus immediate, enabling, and structural impacts. 

What you should be able to do:

* choose a feature
* describe immediate, enabling, structural effects
* attach a sustainability dimension

---

## How to review each topic

Use the same 4-step pattern every time:

**Step 1: one-sentence definition**
Write the concept in one sentence.

**Step 2: contrast it with a nearby concept**
Examples:

* internal vs external quality
* partition vs boundary
* property vs test case
* branch vs condition coverage
* minimisation vs prioritisation

**Step 3: tiny example**
Only one small example, not a full exam answer.

**Step 4: common mistake**
Ask: what do students usually confuse here?

That method fits this course well because the exam instructions repeatedly stress clear, motivated, non-vague answers using the unique aspects of each concept.   

---

## Best topic-study schedule

If you want the most efficient topic order:

**Round 1: core understanding**

1. Quality attributes + 4 quality perspectives
2. Quality scenarios
3. Technical debt + internal quality metrics
4. Equivalence partitioning
5. BVA
6. PBT
7. Coverage + adequacy + MC/DC
8. Mutation testing
9. Regression testing
10. Diversity + APFD
11. Sustainability
12. CI

**Round 2: comparison round**
Only review differences:

* attribute vs scenario
* internal vs external vs quality in use vs process
* partition vs boundary
* property vs example
* coverage vs mutation
* selection vs minimisation vs prioritisation

**Round 3: recall round**
Take a blank page and write:

* definitions
* 3 key differences
* 1 tiny example per topic

---

## What to memorize exactly

These are worth memorizing almost verbatim:

* **Quality scenario** = source, stimulus, artefact, environment, response, response measure. 
* **Equivalence partitioning** = grouping inputs that should behave the same.  
* **Boundary** = a pair of inputs from different partitions. 
* **PBT** = define generic properties and search for counterexamples using generated inputs. 
* **Mutation testing** = checks test-suite quality by running tests against faulty program versions. 
* **Regression optimisation**

  * selection = choose some tests
  * minimisation = remove redundancy
  * prioritisation = choose execution order. 

---

## What not to do in this branch

Do not start by solving many full exam questions yet.
That can make topics blur together.

In this branch, the goal is:

* “What is this concept?”
* “How is it different from the similar one?”
* “What does a good answer need to contain?”

Then in the other branch, you can apply that to questions.

Next, I can turn this into a **topic-by-topic revision sheet** starting with **Quality + Scenarios**.


# Software Quality Fundamentals

## Basics in Software Quality (ISO 25010)
Quality - The degree to which the system satisfies stated and implied needs of its stakeholders.
- A quality attrivbte must be **testable and measurable**.
- Not "it should be fast".
- Must be "response time < 500 ms for 95% of requests".

### Why quality is difficult?
- Quality is abstract
- Many attributes conflict (e.g., security bs usability)
- Context matters
- Must be measurable
Quality must always be connected to stakeholder needs.

###  Quality Types
1. Process Quality
- Quality of the development process.
- How good the development process is
- CI, testing levels, refactoring, release strategy.
- Referenced in many exams, especially maintainability justification.
2. Internal Quality -> affects maintainability
- Quality of static artefacts
- Code readability
- Code smells
- Cyclomatic complexity
- Dependencies
- Code-level structure.
- Metrics, smells, refactoring.
- Example exam references: maintainability, modularity, complexity.
3. External Quality
- Quality of the system during execution.
- Measured with logs, monitoring, profiling.
- Response time
- Uptime
- Crash rate
- Memory usage
- Runtime behabiour visible to users.
- Reliability, performance, usability.
- Examples tied to features like login, GPS response time, etc.
4. Quality in Use
- User experience in real context:
- efficiency
- effectiveness
- satisfaction
- safety
- User-perceived: effectiveness, efficiency, safety.
- E.g., "Divers must safety receive GPS updates"

### Quality Attributes
Quality attributes are abstract; quality scenarios are concrete, testable.

Attribute: High performance
Scenario: System responds to 95% of search requests within 0.3 seconds under 10000 active users.

### Quality Scenarios
Scenarios:
- Source
- Stimulus
- Environment
- Artifact
- Response
- Response Measure

### ISO 25010 - Software Product Quality Attributes
1. Functional Suitability
Whether the system provide correct functions.
2. Performance Efficiency 性能效率
Whether can run fast and efficiently under specific resources.
Latency 延迟 / response time 响应时间, throughput 吞吐量, resource (CPU/memory).
3. Compatibility
Whether the system works wihh other apps/services.
Inter-operability with other systems.
4. Usability
Whether the system is easy to use.
Ease of use; UI adaptation; accessibility.
5. Reliability 可靠性
Whether the service can be continuous and correctly used to provide functionality.
OFOD 失败概率 / ROCOF 失败发生率, MTBF / MTTR, availability 可用率, fault tolerance.
6. Security
Whether the system protects data and access.
Authentication, authorization, privacy.
7. Maintainability
Whether the system is tasy to change in the future.
Modifiability, reusability, testability.
8. Portability
Run on many devices; ease of installation.

### How to justify Quality Attributes in Exam Answers
Must:
1. Clearly define the attribute (no circular definitions).
2. Connect it directly to specific features (F1-F11, G1-G10).
3. Explain why it matters in the real system context.

### The Role of Requirements
- Functional requirements -> define responsibility
- Quality attribute requirements -> define "how well"
- Constraints -> fixed design decisions

### Architecture & Quality
Key ideas:
- Architecture exits because of quality attributes, not functionality.
- "Responsibilities" are a better concept than "functional requirement".
- Qualities (e.g., performance, availability) create architecturua constraints (threads, load balancing, caching, etc.).
- Quality attributes interact (trade-offs!)
- "Explain how qualities constrain architecture choices"

### Recurring Exam Patterns From This Lecture
Common tasks:
- Define two/three quality attributes.
- Explain internal vs external quality.
- Identify which qualities matter most for a system.
- Connect qualities to system features.
- Explain why architecture is structured to support qualities.

Common mistaks (explicitly warned in solutions):
- Circular definitions (e.g., "reliability is how reliable the system is")
- Not referring to system features.
- Too generic explanations
- Not linking to ISO 25010 terms

## Internal Quality (Code Metrics, Smile, Refractoring)
External Quality - Behaviour of the system at runtime, observed from outside the system.

- Response time
- Throughput
- Fault rate
- Availability
- Failures seen by users

Different from:
- Internal quality -> structure of the code
- Quality in use -> user experience in the real world
- Process quality -> development & CI process

### Metrics
1. Size / Volume 规模
   LOC (Lines of Code)
   Comment ratio
2. Change / Evolution 演化与变更
   Code churn
3. Complexity 复杂度
   Cyclomatic Complexity
   Cognitive Complexity
   Block depth / nesting depth
4. Coupling / Dependencies 耦合与依赖
   Fan-in / Fan-out
5. Maintainbality smells 可维护
   Duplicated code
   Magic numbers
   Long functions
   Large paraneter lists
   Blob
6. Technical debt indicators

### Quality Attribute Scenerios
- Source -> Stimulus -> Environment -> Artifact -> Response -> Response Measure

## Technical Debt (TD)

---

# Software Testing

## Basics in Softaare Testing
## Systematic Testing
## 

# Quality Assurance Processes

# Verification & Validation (V&V)

# Specification

## Lecture 7 - Automated BVA
### Motivation
Boundary Value Analysis (BVA) = **test near input boundaries**, because bugs often happen at borders.
But traditional BVA has **problems**:
- Boundaries are **not formally defined**.
- Hard to automate.
- Works mostly for **numeric** inputs.
The paper proposes a **general**, **black-box**, **automated BVA technique** using **information theory** and **program derivatives**.

### Relationship to Partition Analysis (PA)
Partition Analysis (划分分析) divides the input domain into sub-domains where behavior should be similar.

Boundary = border between partitions

Developers often create bugs at these boundaries -> BVA focuses on testing such points.

### Problem: Modern Inputs Are Complex
Inputs are not always numbers. They may be:
- strings
- objects
- graphs
- arrays
- nested structures
--> It's unclear how to define a "small change" in these domains.
--> Hard to define boundaries.

### Key Idea: Use Difference in Outputs to Detect Boundaries
Inspired by calculus:
Derivative mearsured how sensitive output is to a small change in input.
Program Derivative:
PD(a) = (distance between outputs of a & b) / (distance between inputs a & b)
Where b is the closest neighbor input io a,
If a samll input change --> Large output change --> near boundary

### Generalizing "distance"
Inputs & outputs are not always numeric.
So subtraction (a - b) doesn't work.
Solution: use general distance functions
Most general: Normalized Information Distance (NID)
~ difference measured through information content.

But NID uses Kolmogorov complexity -> not computable.

Practical version: Normalized Compression Distance (NCD)
--> Use compression algorithms to approximate complexity.
Why useful: any data type can be converted to a string --> compressed --> compared