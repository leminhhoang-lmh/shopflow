using Microsoft.AspNetCore.Mvc;

namespace InventoryService.Controllers;

[ApiController]
[Route("api/v1/[controller]")]
public class HelloController : ControllerBase
{
    [HttpGet]
    public IActionResult Get([FromQuery] string name = "world")
        => Ok(new { message = $"Hello, {name}!", service = "inventory-service" });

    [HttpGet("{name}")]
    public IActionResult GetByPath(string name)
        => Ok(new { message = $"Hello, {name}!", service = "inventory-service" });
}