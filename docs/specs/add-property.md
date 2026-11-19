# Add Real Estate Property

**As a seller, I want to add a real estate property to the system so that I can list it as available collateral and provide accurate details to support the buyer's loan application.**

## Rules and Examples

### Rule: Must reject a submission when any required field is missing

All AC-2 fields are required: address (street, city, state, ZIP, country), property type, usage, year built, asking price, ownership status, bedrooms, bathrooms, square footage, and description.

- **Example:** The one where a seller provides every field except asking price and the property is not saved.
- **Counter-example:** The one where every required field is present and the property saves.

---

### Rule: Must accept only a configured property type and usage

| Property Type | Usage | Outcome |
|---|---|---|
| Single Family | Primary Residence | accepted |
| Condo | Investment | accepted |
| Multi-Family | Primary Residence | accepted |
| Commercial | Investment | accepted |
| Houseboat | Primary Residence | rejected |

Houseboat row — a type outside the configured enum is rejected.

---

### Rule: Must reject an asking price that is not a positive amount

No upper bound applies; only zero and negative values are rejected.

| Asking Price | Outcome |
|---|---|
| $450,000.00 | accepted |
| $25,000,000.00 | accepted |
| $0.00 | rejected |
| -$10,000.00 | rejected |

$0.00 boundary — zero is not a valid asking price.

---

### Rule: Must reject a year built that is in the future

No minimum year applies; any past year through the current year is accepted.

| Year Built | Outcome |
|---|---|
| 1920 | accepted |
| 2026 | accepted |
| 2027 | rejected |

2027 boundary — a year beyond the current year (2026) is rejected.

---

### Rule: Must let a seller hold multiple properties

- **Example:** The one where a seller adds a second property and both remain in their listings.

---

## Resolved decisions (for implementation)

- **Required fields:** All AC-2 fields are required (address, type, usage, year built, asking price, ownership status, bedrooms, bathrooms, square footage, description).
- **Asking price upper bound:** No upper bound; only zero and negative values are rejected.
- **Year built minimum:** No minimum; any past year through the current year is accepted.
- **Removal while linked:** A property tied to an active loan application cannot be removed until that link is cleared.
- **Out of scope:** Property appraisal and valuation, document upload (title deeds, appraisal reports), lien and encumbrance tracking, automated property valuation (AVM), address validation (USPS lookup).
