// Each VU (virtual user) runs a fixed number of iterations.
import http from "k6/http";
import { sleep } from "k6";

export const options = {
  scenarios: {
    default: {
      executor: "per-vu-iterations",
      vus: 100,
      iterations: 500, // per VU
      maxDuration: "30s",
    },
  },
};
export default function () {
  http.get("https://plant-server-v2-0.vercel.app/plant/getAllPlants");
  sleep(1);
}
