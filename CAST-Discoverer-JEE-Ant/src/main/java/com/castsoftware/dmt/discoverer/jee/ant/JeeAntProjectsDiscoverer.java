package com.castsoftware.dmt.discoverer.jee.ant;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.castsoftware.dmt.engine.discovery.BasicProjectsDiscovererAdapter;
import com.castsoftware.dmt.engine.discovery.IProjectsDiscovererUtilities;
import com.castsoftware.dmt.engine.discovery.ProjectsDiscovererWrapper.ProfileOrProjectTypeConfiguration.LanguageConfiguration;
import com.castsoftware.dmt.engine.project.IProfileReadOnly;
import com.castsoftware.dmt.engine.project.IResourceReadOnly;
import com.castsoftware.dmt.engine.project.Profile;
import com.castsoftware.dmt.engine.project.Project;
import com.castsoftware.dmt.engine.project.Profile.IReferencedContents;
import com.castsoftware.dmt.engine.project.Profile.ResourceReference;
import com.castsoftware.util.StringHelper;
import com.castsoftware.util.logger.Logging;

/**
 * Basic discoverer for NetBeans project
 */
public class JeeAntProjectsDiscoverer extends BasicProjectsDiscovererAdapter
{
    /**
     * Default constructor used by the discovery engine
     */
    public JeeAntProjectsDiscoverer()
    {
    }

    @Override
    public void buildProject(String relativeFilePath, String content, Project project,
        IProjectsDiscovererUtilities projectsDiscovererUtilities)
    {
    	Logging.info("cast.dmt.discover.jee.ant.buildProjectStart", "PATH", project.getPath());
    	Logging.info("cast.dmt.discover.jee.ant.buildProjectEnd", "PATH", project.getPath());
    }

    @Override
    public boolean reparseProject(Project project, String projectContent, IReferencedContents contents,
        IProjectsDiscovererUtilities projectsDiscovererUtilities)
    {
    	Logging.info("cast.dmt.discover.jee.ant.reparseProjectStart", "PATH", project.getPath());
    	Logging.info("cast.dmt.discover.jee.ant.reparseProjectEnd", "PATH", project.getPath());
    	return false;
    }
    
}
