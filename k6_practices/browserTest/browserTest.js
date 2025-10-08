import { chromium } from "k6/browser";
import { check } from "k6";

export const options = {
  scenarios: {
    browser_test: {
      executor: "constant-vus",
      vus: 1,
      duration: "10s",
      options: {
        browser: {
          type: "chromium",
        },
      },
    },
  },
};

export default async function () {
  const browser = chromium.launch({ headless: true });
  const context = browser.newContext();
  const page = context.newPage();

  await page.goto("https://test.k6.io"); // ✅ Correct
  check(page, {
    "title is correct": (p) => p.title() === "Test site",
  });

  await page.close();
  await context.close();
  await browser.close();
}
