---
Course: DAT321 Quality Assurance and Testing
Oucomes: 
- Internal / External / Process quality
- Quality in use
- ISO 25010 attributes
- Fault, error, failure
- Levels of testing
- CI and test automation
- V&V (verification vs validation)
---

# Software Quality Fundamentals

## Basics in Software Quality (ISO 25010)
Quality - The degree to which the system satisfies stated and implied needs of its stakeholders.
- A quality attrivbte must be **testable and measurable**.
- Not "it should be fast".
- Must be "response time < 500 ms for 95% of requests".

### ISO 25010 Product Quality Model (8 Attributes)
1. Functional Suitability - Does it do the right things?
2. Performance Efficiency - How fast, how resource-efficient?
3. Compatibility - Works with other apps/servies?
4. Usability - Easy to use?
5. Reliability - Works correctly over time?
6. Security - Protects data and access?
7. Maintainability - Easy to change in the future?
8. Portability - Runs on many devices?

### Different types of software quality
1. Process Quality
Quality of the development process.
2. Internal Quality -> affects maintainability
Quality of static artefacts
- Code readability
- Code smells
- Cyclomatic complexity
- Dependencies
3. External Quality
Quality of the system during execution.
Measured with logs, monitoring, profiling.
- Response time
- Uptime
- Crash rate
- Memory usage
4. Quality in Use
User experience in real context:
- efficiency
- effectiveness
- satisfaction
- safety

### Quality Attributes vs Quality Scenarios
Quality attributes are abstract; quality scenarios are concrete, testable.

Attribute: High performance
Scenario: System responds to 95% of search requests within 0.3 seconds under 10000 active users.

Scenarios:
- Source
- Stimulus
- Environment
- Artifact
- Response
- Response Measure

### Why quality is difficult?
- Quality is abstract
- Many attributes conflict (e.g., security bs usability)
- Context matters
- Must be measurable
Quality must always be connected to stakeholder needs.

## Scenarios & External Quality
Quality = how well the software meeets needs (not just how well it works).
1. Internal Quality
- Code-level structure.
- Metrics, smells, refactoring.
- Example exam references: maintainability, modularity, complexity.
2. External Quality
- Runtime behabiour visible to users.
- Reliability, performance, usability.
- Examples tied to features like login, GPS response time, etc.
3. Quality in Use
- User-perceived: effectiveness, efficiency, safety.
- E.g., "Divers must safety receive GPS updates"
4. Process Quality
- How good the development process is
- CI, testing levels, refactoring, release strategy
- Referenced in many exams, especially maintainability justification.

### ISO 25010 - Eight Software Product Quality Characteristics
1. Functional Suitability
Does the system provide correct functions?
2. Performance Efficiency
Speed, memory, throughput
3. Compatibility
Inter-operability with other systems.
4. Usability
Ease of use; UI adaptation; accessibility.
5. Reliability
Availability, fault tolerance.
6. Security
Authentication, authorization, privacy.
7. Maintainability
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