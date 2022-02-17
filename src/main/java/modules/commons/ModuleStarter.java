package modules.commons;

import java.util.List;

public interface ModuleStarter {
	
	public List<String> getConfigurable();
	public String getUniqueCode();
	public void setUniqueCode(String uniqueCode);
	public void setModuleType(ModuleType moduleType);
	public ModuleType getModuleType();

}
